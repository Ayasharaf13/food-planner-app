package com.example.foodplanner;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.foodplanner.search.view.SearchFragmentDirections;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LogInFragment extends Fragment {

  EditText edEmail;
  EditText edPassword;
  Button btnLogin;
  FirebaseAuth auth;


    public LogInFragment() {
        // Required empty public constructor
    }


    public static LogInFragment newInstance(String param1, String param2) {
        LogInFragment fragment = new LogInFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         auth = FirebaseAuth.getInstance();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_log_in, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

         edEmail = view.findViewById(R.id.editEmailAddressLogIn);
         edPassword = view.findViewById(R.id.editPasswordLogIn);
         btnLogin = view.findViewById(R.id.buttonLogIn);

         btnLogin.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 loginUserAccount();


             }
         });



    }


      private void  loginUserAccount (){

          // Take the value of two edit texts in Strings
          String email, password;
          email = edEmail.getText().toString();
          password = edPassword.getText().toString();

          // validations for input email and password
          if (TextUtils.isEmpty(email)) {
              Toast.makeText(requireContext(),
                              "Please enter email!!",
                              Toast.LENGTH_LONG)
                      .show();
              return;
          }

          if (TextUtils.isEmpty(password)) {
              Toast.makeText(requireContext(),
                              "Please enter password!!",
                              Toast.LENGTH_LONG)
                      .show();
              return;
          }

          auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
              @Override
              public void onComplete(@NonNull Task<AuthResult> task) {

                  if (task.isSuccessful()) {
                      Toast.makeText(requireContext(),
                                      "Login successful!!",
                                      Toast.LENGTH_LONG)
                              .show();
                  /*    NavDirections action = LogInFragmentDirections.actionLogInFragmentToHomeFragment();
                      Navigation.findNavController(requireView()).navigate(action);

                   */


                  }
                  else {

                      // sign-in failed
                      Toast.makeText(requireContext(),
                                      "Login failed!!",
                                      Toast.LENGTH_LONG)
                              .show();
                  }
                  }
          });
          }

}