package com.example.foodplanner.detailsmeals.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.foodplanner.R;
import com.example.foodplanner.db.ConcreteLocalSource;
import com.example.foodplanner.detailsmeals.presenter.DetailsPresenter;
import com.example.foodplanner.detailsmeals.presenter.DetailsPresenterInterface;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.Repository;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.search.view.MealCategoryFragmentDirections;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DetailsMealFragment extends Fragment implements DetailsViewInterface {
    Intent sharingIntent;
    private ImageView mealImageView;
    private TextView titleMeal;
    private WebView webView;
    private ImageView back;
    private Button btnAddToPlanner;
    private TextView titleTextView, caloriesTextView, ratingTextView, instructionsTextView;
    private ImageView backImg;
    private ImageView calenderImage;
    private ImageView shareImage;
    private ImageView saveDetails;
    private String idMeal;
    private DetailsPresenterInterface detailsPresenter;
    private List <String>listOfIngredients =  new ArrayList<>();
    private GenericAdapter<String> ingredientsAdapter;
    private RecyclerView recyclerIngredients;






    public DetailsMealFragment() {
        // Required empty public constructor
    }


    public static DetailsMealFragment newInstance(String param1, String param2) {
        DetailsMealFragment fragment = new DetailsMealFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        detailsPresenter =new DetailsPresenter(Repository.getInstance(FoodClient.getInstance(), ConcreteLocalSource.getInstance(requireContext())),this);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_details_meal, container, false);
    }

    @SuppressLint("SuspiciousIndentation")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // getting the data from our intent in our uri.

          sharingIntent= new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");

        // Bind views
        mealImageView = view.findViewById(R.id.meal_image);
        // titleTextView = view.findViewById(R.id.meal_title);

        instructionsTextView = view.findViewById(R.id.meal_instructions);
        recyclerIngredients = view.findViewById(R.id.recyclerIngred);


        //   backImg = view.findViewById(R.id.backicon);
        calenderImage = view.findViewById(R.id.calenderIcon);
        shareImage = view.findViewById(R.id.shareicon);
        titleMeal = view.findViewById(R.id.meal_title);
        webView = view.findViewById(R.id.webview);
        btnAddToPlanner = view.findViewById(R.id.btnadd);
        back = view.findViewById(R.id.backicon);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               NavDirections action = DetailsMealFragmentDirections.actionDetailsMealFragmentToHomeFragment();
                Navigation.findNavController(view).navigate(action);
            }
        });


        //  saveDetails = view.findViewById(R.id.savedetails);

       /* OnBindData bindData = (holder,currentObj)->{
            String currentItem = (String) currentObj;
            Log.i("testadapter",currentItem );
            Glide.with(holder.itemView.getContext())
                    .load("https://www.themealdb.com/images/ingredients/"+currentObj+".png")
                    .override(300, 200)
                    .error(R.drawable.ic_launcher_background)
                    .into(holder.imageMeal);


            holder.titleMeal.setText(currentItem );

        };

        */

        ingredientsAdapter = new GenericAdapter();


        // Toolbar setup
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        setHasOptionsMenu(true);
        // toolbar.setTitle("MyToolBar");
        // calling the action bar
        ActionBar actionBar = ((AppCompatActivity) Objects.requireNonNull(getActivity())).getSupportActionBar();

        // Customize the back button
        // assert actionBar != null;
        // actionBar.setHomeAsUpIndicator(R.drawable.backicon);

        toolbar.setNavigationIcon(null);
        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(false);

        //setSupportActionBar(toolbar);
        // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);



     // Retrieve the argument using Safe Args
        if (getArguments() != null) {

            String myArg = getArguments().getString("myArg");

            if(myArg !=null) {
                if(!(myArg.isEmpty()))
                detailsPresenter.getMealsByID(myArg);
            }else {
                DetailsMealFragmentArgs args = DetailsMealFragmentArgs.fromBundle(getArguments());
                idMeal = args.getIdMeal();
                detailsPresenter.getMealsByID(idMeal);

            }
            btnAddToPlanner.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    NavDirections action = DetailsMealFragmentDirections.actionDetailsMealFragmentToPlannerFragment().setIdMealPlanner(idMeal);
                    Navigation.findNavController(view).navigate(action);

                }
            });
        }


    }


    @Override
    public void showMealsById(List<RandomMeal> randomMeals) {


        RandomMeal mealDetails = randomMeals.get(0);
        String  mealName = mealDetails.getStrMeal();
        String imgMeal = mealDetails.getStrMealThumb();

        String myUrl = mealDetails.getStrYoutube();
        Log.i("whereyout",myUrl);
        Glide.with(getContext())
                .load(mealDetails.getStrMealThumb())
                .override(300, 200)
                .error(R.drawable.ic_launcher_background)
                .into(mealImageView);


        titleMeal.setText(mealDetails.strMeal);
        instructionsTextView.setText(mealDetails.strInstructions);

        //listOfIngredients.add("Lime");
        listOfIngredients.add(mealDetails.getStrIngredient2());
        listOfIngredients.add(mealDetails.getStrIngredient3());

        listOfIngredients.add(mealDetails.getStrIngredient4());
        listOfIngredients.add(mealDetails.getStrIngredient5());
        listOfIngredients.add(mealDetails.getStrIngredient6());


        listOfIngredients.add(mealDetails.getStrIngredient7());

        listOfIngredients.add(mealDetails.getStrIngredient8());
        listOfIngredients.add(mealDetails.getStrIngredient9());
        listOfIngredients.add(mealDetails.getStrIngredient10());

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        //recyclerIngredients.setLayoutManager(new LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false));
        recyclerIngredients.setLayoutManager(layoutManager);
        ingredientsAdapter.submitList(listOfIngredients);
        recyclerIngredients.setAdapter(ingredientsAdapter);

        webView.getSettings().setJavaScriptEnabled(true);
        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        webView.setWebViewClient(new WebViewClient());
        String videoId = null;
        try {
            videoId = youTubeVideoIdFromUrl(myUrl);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

// YouTube embed URL format
        String embedUrl = "https://www.youtube.com/embed/" + videoId;
        webView.loadUrl(embedUrl);

        Log.i("TestById",randomMeals.toString());
        shareImage.setOnClickListener(new View.OnClickListener() {
            // checking if the uri is null or not.


            @Override
            public void onClick(View view) {
              String meal=  randomMeals.get(0).getIdMeal();
               String shareBody = "https://www.mealdetail.com/"+meal;

                    sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Check out this meal!");
                    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);

                    startActivity(Intent.createChooser(sharingIntent, "Share via"));
                }

        });
    }

    public String youTubeVideoIdFromUrl(String url) throws URISyntaxException {
        Uri uri = Uri.parse(url); // Use Android Uri class to parse the URL
        String videoId = uri.getQueryParameter("v"); // Get 'v' parameter from the query

        if (videoId != null) {
            return videoId; // Return the video ID if found
        } else {
            // If the video ID is not in the query, return the last segment of the path
            String path = uri.getPath();
            return path.substring(path.lastIndexOf('/') + 1);
        }
    }
}