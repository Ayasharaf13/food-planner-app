package com.example.foodplanner.search.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.foodplanner.R;
import com.example.foodplanner.db.ConcreteLocalSource;
import com.example.foodplanner.models.RandomMeal;
import com.example.foodplanner.models.Repository;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.search.presenter.SearchResultPresenter;
import com.example.foodplanner.search.presenter.SearchResultPresenterInterface;

import java.util.List;

public class SearchResultFragment extends Fragment implements SearchResultView {

   RecyclerView recyclerViewSearchResult;
   EditText searchArea;
   SearchAdapter searchAdapter;
   SearchResultPresenterInterface searchResultPresenter;



    public SearchResultFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static SearchResultFragment newInstance(String param1, String param2) {
        SearchResultFragment fragment = new SearchResultFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        searchAdapter = new SearchAdapter("search");
        searchResultPresenter = new SearchResultPresenter(Repository.getInstance(FoodClient.getInstance(),
                ConcreteLocalSource.getInstance(requireContext())),this);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_result, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerViewSearchResult=view.findViewById(R.id.recyclerSearchResulr);
         searchArea = view.findViewById(R.id.searchText);


        GridLayoutManager layoutManager = new GridLayoutManager(requireContext(),2);

        recyclerViewSearchResult.setLayoutManager(layoutManager);


        searchArea.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                searchResultPresenter.getMealsBySearch(charSequence.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {
                searchResultPresenter.getMealsBySearch(editable.toString());

            }
        });






    }

    @Override
    public void showMealsBySearch(List<RandomMeal> meals) {

        searchAdapter.submitList(meals);
        recyclerViewSearchResult.setAdapter(searchAdapter);

    }
}