package com.example.foodplanner.search.view;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodplanner.R;
import com.example.foodplanner.db.ConcreteLocalSource;
import com.example.foodplanner.detailsmeals.view.GenericAdapter;
import com.example.foodplanner.models.Category;
import com.example.foodplanner.models.Country;
import com.example.foodplanner.models.CountryNames;
import com.example.foodplanner.models.Ingredients;
import com.example.foodplanner.models.Repository;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.search.presenter.SearchPresenter;
import com.example.foodplanner.search.presenter.SearchPresenterInterface;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment  implements SearchViewInterface {


  CategoryAdapter categoryAdapter;
  GenericAdapter<Ingredients> ingredientsAdapter;
  RecyclerView recyclerViewCategory;
  SearchPresenterInterface searchPresenter;
  RecyclerView recyclerViewIngredients;
  RecyclerView recyclerViewCountry;
    GenericAdapter<Country> countryAdapter;





    public SearchFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static SearchFragment newInstance(String param1, String param2) {
        SearchFragment fragment = new SearchFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        searchPresenter = new SearchPresenter(Repository.getInstance(FoodClient.getInstance(),
                ConcreteLocalSource.getInstance(requireContext())),this);

          categoryAdapter = new CategoryAdapter();
         countryAdapter =new GenericAdapter<>();
         ingredientsAdapter = new GenericAdapter<>();

        searchPresenter.getCategories();
        searchPresenter.getIngredients();
        searchPresenter.getCountries();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerViewCategory = view.findViewById(R.id.recyclerCategory);
        recyclerViewIngredients = view.findViewById(R.id.recyclerIngrediance);
        recyclerViewCountry = view.findViewById(R.id.recyclerCountry);


        GridLayoutManager layoutManager=new GridLayoutManager(requireContext(),2);
        LinearLayoutManager layoutManagerHorizontal = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManagerHorizontal2 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        recyclerViewCategory.setLayoutManager(layoutManager);
        recyclerViewIngredients.setLayoutManager(layoutManagerHorizontal);

        recyclerViewCountry.setLayoutManager(layoutManagerHorizontal2);


    }

    public List<Country>  getCountries(List<CountryNames> countriesName) {

        int count = 0;
       // Country country = new Country();
        List<Country> countries = new ArrayList<>(28);
        if (countriesName != null && !countriesName.isEmpty()) {
            while (count < countriesName.size()) {

                String nameCountry = countriesName.get(count).getStrArea();
                Log.i("count", String.valueOf(count));
                Drawable image = getItemImage(nameCountry);

               // country.setImage(image);
               // country.setNameCountry(nameCountry);

                countries.add(new Country(nameCountry,image));

                Log.i("sizeee", String.valueOf(countries.size()));

                count++;

            }
        }
        return countries;
    }

    @Override
    public void showCategory(List<Category> categoryList) {


        categoryAdapter.submitList(categoryList);
        recyclerViewCategory.setAdapter(categoryAdapter);

    }

    @Override
    public void showIngredients(List<Ingredients> meals) {


      ingredientsAdapter.submitList(meals);
      recyclerViewIngredients.setAdapter(ingredientsAdapter);

    }

    @Override
    public void showCountries(List<CountryNames> countryNames) {



         countryAdapter.submitList(getCountries(countryNames));
         recyclerViewCountry.setAdapter(countryAdapter);



           }








    Drawable getItemImage(String country) {

        if ("American".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.us);
        } else if ("British".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.uk);
        } else if ("Canadian".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.ca);

        } else if ("Chinese".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.cn);
        } else if ("Croatian".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.cr);
        } else if ("Dutch".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.nl);
        } else if ("Egyptian".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.eg);
        } else if ("Filipino".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.ph);
        } else if ("French".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.fr);
        } else if ("Greek".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.gr);
        } else if ("Indian".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.in);
        } else if ("Irish".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.ireland);
        } else if ("Italian".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.it);
        } else if ("Jamaican".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.jm);
        } else if ("Japanese".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.jp);
        } else if ("Kenyan".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.ke);
        } else if ("Malaysian".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.my);
        } else if ("Mexican".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.mx);
        } else if ("Moroccan".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.ma);
        } else if ("Polish".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.pl);
        } else if ("Portuguese".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.pt);
        } else if ("Russian".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.ru);
        } else if ("Spanish".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.es);
        } else if ("Thai".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.th);
        } else if ("Tunisian".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.tn);
        } else if ("Turkish".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.tr);
        } else if ("Ukrainian".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.ua);
        } else if ("Vietnamese".equals(country)) {
            return ContextCompat.getDrawable(requireContext(), R.drawable.vn);
        }
        return ContextCompat.getDrawable(requireContext(), R.drawable.ic_launcher_background); // Default fallback
    }





}