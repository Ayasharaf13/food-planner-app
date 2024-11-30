package com.example.foodplanner;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.example.foodplanner.search.view.SearchFragmentDirections;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;



import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

public class SplashFragment extends Fragment {

    Button btnSignUpEmail;
    Button btnSignUpGoogle;
    NavController navController;
    GoogleSignInClient googleSignInClient;
    FirebaseAuth auth;


    public SplashFragment() {
        // Required empty public constructor
    }


    public static SplashFragment newInstance(String param1, String param2) {
        SplashFragment fragment = new SplashFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        auth = FirebaseAuth.getInstance();
           auth.signOut();

        // Initialize sign in options the client-id is copied form google-services.json file
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
               .requestIdToken("1058875992434-iopc57o4c3df2aa7b4qrgvk5ku27glfv.apps.googleusercontent.com")
              //  .requestIdToken("1058875992434-o949kc1g154lirh5nmdvvsfvf3f70a6f.apps.googleusercontent.com")
                .requestEmail()
                .build();
        // Initialize sign in client
        googleSignInClient = GoogleSignIn.getClient(requireActivity(), googleSignInOptions);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        googleSignInClient.revokeAccess();
        btnSignUpEmail = view.findViewById(R.id.buttonSignWithEmail);
        btnSignUpGoogle = view.findViewById(R.id.buttonSignWithGoogle);


        // Find the NavController
        btnSignUpGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Initialize sign in intent
               Intent intent = googleSignInClient.getSignInIntent();
                // Start activity for result
               startActivityForResult(intent, 100);
            }
        });



        // Initialize firebase user
        FirebaseUser firebaseUser = auth.getCurrentUser();
        // Check condition
      /*  if (firebaseUser != null) {
           startActivity(new Intent(requireContext(), MainActivity.class)
                   .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
          //  NavDirections action = SplashFragmentDirections.actionSplashFragmentToHomeFragment();
           // Navigation.findNavController(view).navigate(action);

        }

       */

        
        btnSignUpEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavDirections action = SplashFragmentDirections.actionSplashFragmentToRegisterFragment();
                Navigation.findNavController(view).navigate(action);


            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Check condition
        if (requestCode == 100) {
            // When request code is equal to 100, initialize task
            Task<GoogleSignInAccount> signInAccountTask = GoogleSignIn.getSignedInAccountFromIntent(data);

            // Check condition
            if (signInAccountTask.isSuccessful()) {
                // When Google sign in is successful, initialize string
                String s = "Google sign in successful";
                // Display Toast
                Toast.makeText(requireContext(), s, Toast.LENGTH_LONG).show();

                // Initialize sign in account
                try {
                    GoogleSignInAccount googleSignInAccount = signInAccountTask.getResult(ApiException.class);

                    // Check condition
                    if (googleSignInAccount != null) {
                        // When sign in account is not null, initialize auth credential
                        AuthCredential authCredential = GoogleAuthProvider.getCredential(googleSignInAccount.getIdToken(), null);

                        // Check credential
                        auth.signInWithCredential(authCredential).addOnCompleteListener(requireActivity(), new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                // Check condition
                                if (task.isSuccessful()) {
                                    // When task is successful, redirect to MainActivity and display Toast
                                    Log.i("ERROR", " success  : " );
                                    // When task is successful redirect to profile activity display Toast


                                    Intent intent = new Intent(getActivity(), MainActivity.class);
                                    startActivity(intent);
                                  //  NavDirections action = SplashFragmentDirections.actionSplashFragmentToHomeFragment();
                                  //  Navigation.findNavController(requireView()).navigate(action);

                                    Toast.makeText(requireContext(), "Firebase authentication successful", Toast.LENGTH_LONG).show();
                                } else {
                                    // When task is unsuccessful, display Toast
                                    Toast.makeText(requireContext(), "Authentication Failed", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                    }
                } catch (ApiException e) {
                    e.printStackTrace();
                    Log.i("ERROR", "Google Sign-In failed: " + e.getMessage());
                }
            } else {
                // If sign-in fails, display a Toast
                Toast.makeText(requireContext(), "Google sign in failed ", Toast.LENGTH_LONG).show();
            }
        }
    }
}

