package com.example.foodplanner.search.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodplanner.R;
import com.example.foodplanner.db.ConcreteLocalSource;
import com.example.foodplanner.models.Category;
import com.example.foodplanner.models.Repository;
import com.example.foodplanner.network.FoodClient;
import com.example.foodplanner.search.presenter.SearchPresenter;
import com.example.foodplanner.search.presenter.SearchPresenterInterface;

import java.util.List;

public class SearchFragment extends Fragment  implements SearchViewInterface{


  CategoryAdapter categoryAdapter;
  RecyclerView recyclerViewCategory;
  SearchPresenterInterface searchPresenter;


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

        searchPresenter.getCategories();


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
        GridLayoutManager layoutManager=new GridLayoutManager(requireContext(),2);
        recyclerViewCategory.setLayoutManager(layoutManager);





    }

    @Override
    public void showCategory(List<Category> categoryList) {


        categoryAdapter.submitList(categoryList);
        recyclerViewCategory.setAdapter(categoryAdapter);

    }



}