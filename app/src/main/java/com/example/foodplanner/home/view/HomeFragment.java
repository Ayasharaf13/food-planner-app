package com.example.foodplanner.home.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.foodplanner.R;
import com.example.foodplanner.db.ConcreteLocalSource;
import com.example.foodplanner.home.presenter.HomePresenter;
import com.example.foodplanner.home.presenter.HomePresenterInterface;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.Repository;
import com.example.foodplanner.network.FoodClient;

import java.util.List;

public class HomeFragment extends Fragment implements HomeViewInterface {

    ImageView imageRandomMeal ;
    TextView nameOfRandomMeal;
    HomePresenterInterface homePresenterInterface;
    RecyclerView recyclerView;
    HomeAdapter homeAdapter;
    TextView txtTitleCard;
    TextView txtNewCard;
    Button btnregister;



    public HomeFragment() {
        // Required empty public constructor
    }


  /*  public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

   */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        homePresenterInterface = new HomePresenter(Repository.getInstance
                (FoodClient.getInstance(), ConcreteLocalSource.getInstance(requireContext() ))
                ,this);
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
        homePresenterInterface.getRandomMeals();
        homePresenterInterface.getSuggestionMeals();
>>>>>>> b48bd45d26781cdb878e9e8b47ee3307893594f3
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);


        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageRandomMeal = view.findViewById(R.id.imageRandomMeal);
        // nameOfRandomMeal = view.findViewById(R.id.textNameRandomMeal);

        recyclerView = view.findViewById(R.id.recyclerView);
        GridLayoutManager layoutManager=new GridLayoutManager(requireContext(),2);
        //LinearLayoutManager layoutManager
        // = new LinearLayoutManager(requireContext(), GridLayoutManager.VERTICAL, false);
        // layoutManager = new LinearLayoutManager(requireActivity());
        recyclerView.setLayoutManager(layoutManager);
        homeAdapter = new HomeAdapter("home");

        txtTitleCard = view.findViewById(R.id.nameCardRandom);
        txtNewCard = view.findViewById(R.id.newTextCard);
        btnregister= view.findViewById(R.id.btn_registration);

        homePresenterInterface.getRandomMeals();
        homePresenterInterface.getSuggestionMeals();

    }

    @Override
    public void showData(List<RandomMeal> randomMeals) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
        //  imageRandomMeal.setImageResource(randomMeals.indexOf(0));
        //  nameOfRandomMeal.setText(randomMeals.indexOf(0));
        // Log.i("show",randomMeals.toString());
        // imageRandomMeal.setImageResource(R.drawable.ic_launcher_background);
        Glide.with(requireContext())
>>>>>>> b48bd45d26781cdb878e9e8b47ee3307893594f3
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9


            //  imageRandomMeal.setImageResource(randomMeals.indexOf(0));
            //  nameOfRandomMeal.setText(randomMeals.indexOf(0));
            // Log.i("show",randomMeals.toString());
            // imageRandomMeal.setImageResource(R.drawable.ic_launcher_background);
            Glide.with(requireContext())

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9
                    .load(randomMeals.get(0).strMealThumb)
                    .error(R.drawable.ic_launcher_background)
                    .into(imageRandomMeal);

            txtTitleCard.setText(randomMeals.get(0).strMeal);
<<<<<<< HEAD
=======
=======
        txtTitleCard.setText(randomMeals.get(0).strMeal);
>>>>>>> b48bd45d26781cdb878e9e8b47ee3307893594f3
>>>>>>> 0d9ef6d7aa17e8c1afc0e5627dc28cab6e65f3b9


    }

    @Override
    public void showSuggestionMeals(List<RandomMeal> randomMeals) {

        // .error(R.drawable.ic_launcher_background);
        homeAdapter.submitList(randomMeals);
        recyclerView.setAdapter(homeAdapter);


    }
}