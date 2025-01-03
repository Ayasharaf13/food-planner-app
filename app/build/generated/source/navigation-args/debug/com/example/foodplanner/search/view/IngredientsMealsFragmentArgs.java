package com.example.foodplanner.search.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class IngredientsMealsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private IngredientsMealsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private IngredientsMealsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static IngredientsMealsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    IngredientsMealsFragmentArgs __result = new IngredientsMealsFragmentArgs();
    bundle.setClassLoader(IngredientsMealsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("nameIngredients")) {
      String nameIngredients;
      nameIngredients = bundle.getString("nameIngredients");
      if (nameIngredients == null) {
        throw new IllegalArgumentException("Argument \"nameIngredients\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("nameIngredients", nameIngredients);
    } else {
      __result.arguments.put("nameIngredients", "chicken_breast");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static IngredientsMealsFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    IngredientsMealsFragmentArgs __result = new IngredientsMealsFragmentArgs();
    if (savedStateHandle.contains("nameIngredients")) {
      String nameIngredients;
      nameIngredients = savedStateHandle.get("nameIngredients");
      if (nameIngredients == null) {
        throw new IllegalArgumentException("Argument \"nameIngredients\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("nameIngredients", nameIngredients);
    } else {
      __result.arguments.put("nameIngredients", "chicken_breast");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getNameIngredients() {
    return (String) arguments.get("nameIngredients");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("nameIngredients")) {
      String nameIngredients = (String) arguments.get("nameIngredients");
      __result.putString("nameIngredients", nameIngredients);
    } else {
      __result.putString("nameIngredients", "chicken_breast");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("nameIngredients")) {
      String nameIngredients = (String) arguments.get("nameIngredients");
      __result.set("nameIngredients", nameIngredients);
    } else {
      __result.set("nameIngredients", "chicken_breast");
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    IngredientsMealsFragmentArgs that = (IngredientsMealsFragmentArgs) object;
    if (arguments.containsKey("nameIngredients") != that.arguments.containsKey("nameIngredients")) {
      return false;
    }
    if (getNameIngredients() != null ? !getNameIngredients().equals(that.getNameIngredients()) : that.getNameIngredients() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getNameIngredients() != null ? getNameIngredients().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "IngredientsMealsFragmentArgs{"
        + "nameIngredients=" + getNameIngredients()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull IngredientsMealsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public IngredientsMealsFragmentArgs build() {
      IngredientsMealsFragmentArgs result = new IngredientsMealsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setNameIngredients(@NonNull String nameIngredients) {
      if (nameIngredients == null) {
        throw new IllegalArgumentException("Argument \"nameIngredients\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("nameIngredients", nameIngredients);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getNameIngredients() {
      return (String) arguments.get("nameIngredients");
    }
  }
}
