package com.example.foodplanner;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class SplashFragmentDirections {
  private SplashFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSplashFragmentToRegisterFragment() {
    return new ActionOnlyNavDirections(R.id.action_splashFragment_to_registerFragment);
  }
}
