package com.example.foodplanner;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class RegisterFragmentDirections {
  private RegisterFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionRegisterFragmentToLogInFragment() {
    return new ActionOnlyNavDirections(R.id.action_registerFragment_to_logInFragment);
  }
}
