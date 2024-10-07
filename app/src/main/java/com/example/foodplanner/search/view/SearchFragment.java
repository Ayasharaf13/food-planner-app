package com.example.foodplanner.search.view;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
<<<<<<< HEAD
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
<<<<<<< HEAD
=======
=======
import androidx.fragment.app.Fragment;
<<<<<<< HEAD
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
<<<<<<< HEAD
=======
=======
import androidx.recyclerview.widget.GridLayoutManager;
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.foodplanner.R;
import com.example.foodplanner.db.ConcreteLocalSource;
<<<<<<< HEAD
import com.example.foodplanner.detailsmeals.view.GenericAdapter;
import com.example.foodplanner.home.view.HomeAdapter;
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
import com.example.foodplanner.detailsmeals.view.GenericAdapter;
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
import com.example.foodplanner.models.Category;
import com.example.foodplanner.models.Country;
import com.example.foodplanner.models.CountryNames;
import com.example.foodplanner.models.Ingredients;
<<<<<<< HEAD
import com.example.foodplanner.models.RandomMeal;
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
import com.example.foodplanner.detailsmeals.view.IngredientsAdapter;
import com.example.foodplanner.detailsmeals.view.OnBindData;
import com.example.foodplanner.models.Category;
import com.example.foodplanner.models.Ingredients;
import com.example.foodplanner.models.RandomMeal;
=======
import com.example.foodplanner.models.Category;
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
import com.example.foodplanner.models.Repository;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.search.presenter.SearchPresenter;
import com.example.foodplanner.search.presenter.SearchPresenterInterface;
<<<<<<< HEAD

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment  implements SearchViewInterface {


  CategoryAdapter categoryAdapter;
  GenericAdapter<Ingredients> ingredientsAdapter;
  RecyclerView recyclerViewCategory;
  SearchPresenterInterface searchPresenter;
  RecyclerView recyclerViewIngredients;
  RecyclerView recyclerViewCountry;


  SearchAdapter searchAdapter;
    GenericAdapter<Country> countryAdapter;

   androidx.appcompat.widget.SearchView searchView;



=======
<<<<<<< HEAD

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



=======
<<<<<<< HEAD

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



=======

<<<<<<< HEAD
import java.util.Collections;
import java.util.List;

public class SearchFragment extends Fragment  implements SearchViewInterface {


  CategoryAdapter categoryAdapter;
  IngredientsAdapter ingredientsAdapter;
  RecyclerView recyclerViewCategory;
  SearchPresenterInterface searchPresenter;
  RecyclerView recyclerViewIngredients;

  Category category;
=======
import java.util.List;

public class SearchFragment extends Fragment  implements SearchViewInterface{


  CategoryAdapter categoryAdapter;
  RecyclerView recyclerViewCategory;
  SearchPresenterInterface searchPresenter;
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e


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
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e

          categoryAdapter = new CategoryAdapter();
         countryAdapter =new GenericAdapter<>();
         ingredientsAdapter = new GenericAdapter<>();
<<<<<<< HEAD
         searchAdapter = new SearchAdapter("search");
=======
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e

        searchPresenter.getCategories();
        searchPresenter.getIngredients();
        searchPresenter.getCountries();
<<<<<<< HEAD
      //  searchPresenter.getMealsBySearch(searchAdapter.getFilter().toString());


=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD

        /*   BindDataAdapter bindDataAdapter = (holder,currentObj )-> {
           Ingredients currentObj1 = (Ingredients) currentObj;
               Glide.with(holder.itemView.getContext())
                    .load("https://www.themealdb.com/images/ingredients/"+currentObj1+".png")
                    .override(300, 200)
                    .error(R.drawable.ic_launcher_background)
                    .into(holder.imageCategory);

            holder.titleCategory.setText(currentObj1.strIngredient);
            holder.imageCategory.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                   String id = currentObj1.strCategory;
                    Log.i("mealcategorysend", id);

                    NavDirections action = SearchFragmentDirections.actionSearchFragmentToMealCategoryFragment().setIdCategory(id);
                    Navigation.findNavController(view).navigate(action);

                }
            });


        };

         */
        OnBindData bindData = (holder, currentObj)->{
            Ingredients currentItem = (Ingredients) currentObj;

          //  Log.i("testadapter",currentItem );
            Glide.with(holder.itemView.getContext())
                    .load("https://www.themealdb.com/images/ingredients/"+((Ingredients) currentObj).strIngredient+".png")
                    .override(300, 200)
                    .error(R.drawable.ic_launcher_background)
                    .into(holder.imageMeal);
                holder.titleMeal.setText(currentItem.strIngredient);

        };

         categoryAdapter = new CategoryAdapter();
        ingredientsAdapter  = new IngredientsAdapter(bindData);

        searchPresenter.getCategories();
        searchPresenter.getIngredients();
=======
        categoryAdapter = new CategoryAdapter();

        searchPresenter.getCategories();
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e


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
<<<<<<< HEAD
        recyclerViewIngredients = view.findViewById(R.id.recyclerIngrediance);
        recyclerViewCountry = view.findViewById(R.id.recyclerCountry);

        searchView = view.findViewById(R.id.simpleSearchView);

        GridLayoutManager layoutManager3=new GridLayoutManager(requireContext(),2);

=======
<<<<<<< HEAD
        recyclerViewIngredients = view.findViewById(R.id.recyclerIngrediance);
        recyclerViewCountry = view.findViewById(R.id.recyclerCountry);


=======
<<<<<<< HEAD
        recyclerViewIngredients = view.findViewById(R.id.recyclerIngrediance);
        recyclerViewCountry = view.findViewById(R.id.recyclerCountry);

>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
        GridLayoutManager layoutManager=new GridLayoutManager(requireContext(),2);
        LinearLayoutManager layoutManagerHorizontal = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManagerHorizontal2 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        recyclerViewCategory.setLayoutManager(layoutManager);
        recyclerViewIngredients.setLayoutManager(layoutManagerHorizontal);
<<<<<<< HEAD
        recyclerViewCountry.setLayoutManager(layoutManagerHorizontal2);


             searchView.setOnSearchClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Toast.makeText(requireContext(), "click : search ",Toast.LENGTH_LONG).show();
                     NavDirections action = SearchFragmentDirections.actionSearchFragmentToSearchResultFragment();
                     Navigation.findNavController(view).navigate(action);


                 }
             });




=======

        recyclerViewCountry.setLayoutManager(layoutManagerHorizontal2);


>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
        recyclerViewIngredients = view.findViewById(R.id.recyclerIngrediance);

        GridLayoutManager layoutManager=new GridLayoutManager(requireContext(),2);
        LinearLayoutManager layoutManagerHorizontal = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        recyclerViewCategory.setLayoutManager(layoutManager);
        recyclerViewIngredients.setLayoutManager(layoutManagerHorizontal);
=======
        GridLayoutManager layoutManager=new GridLayoutManager(requireContext(),2);
        recyclerViewCategory.setLayoutManager(layoutManager);
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61





>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
    }

    @Override
    public void showCategory(List<Category> categoryList) {

<<<<<<< HEAD
=======

>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
        categoryAdapter.submitList(categoryList);
        recyclerViewCategory.setAdapter(categoryAdapter);

    }

<<<<<<< HEAD
    @Override
    public void showIngredients(List<Ingredients> meals) {

=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
    @Override
    public void showIngredients(List<Ingredients> meals) {


>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
      ingredientsAdapter.submitList(meals);
      recyclerViewIngredients.setAdapter(ingredientsAdapter);

    }

    @Override
    public void showCountries(List<CountryNames> countryNames) {

<<<<<<< HEAD
         countryAdapter.submitList(getCountries(countryNames));
         recyclerViewCountry.setAdapter(countryAdapter);

=======


         countryAdapter.submitList(getCountries(countryNames));
         recyclerViewCountry.setAdapter(countryAdapter);



>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
           }




<<<<<<< HEAD
=======




>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e
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



<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
    @Override
    public void showIngredients(List<Ingredients> meals) {

      String mealslist=    meals.toString();
      ingredientsAdapter.submitList(meals);
       // ingredientsAdapter.submitList(Collections.singletonList(mealslist));
      //   categoryAdapter.submitList(meals);
       recyclerViewIngredients.setAdapter(ingredientsAdapter);

    }

=======
>>>>>>> 6a649b922502be4cfefb51b572fb24b32b545c61
>>>>>>> 45173ce209f9e252426806759263499c2fadfdf6
>>>>>>> e84489f2e58bad0845127d6e28428cb42689c00b
>>>>>>> 1067dff3e2392aff76b3eb20357678676d1ad41e


}