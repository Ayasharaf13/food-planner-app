package com.example.foodplanner.search.view;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.foodplanner.R;

public class SearchResultFragmentDirections {
  private SearchResultFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSearchResultFragmentToSearchFragment() {
    return new ActionOnlyNavDirections(R.id.action_searchResultFragment_to_searchFragment);
  }
}
