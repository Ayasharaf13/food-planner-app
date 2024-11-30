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

public class MealCountryFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private MealCountryFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private MealCountryFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static MealCountryFragmentArgs fromBundle(@NonNull Bundle bundle) {
    MealCountryFragmentArgs __result = new MealCountryFragmentArgs();
    bundle.setClassLoader(MealCountryFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("countryName")) {
      String countryName;
      countryName = bundle.getString("countryName");
      if (countryName == null) {
        throw new IllegalArgumentException("Argument \"countryName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("countryName", countryName);
    } else {
      __result.arguments.put("countryName", "Canadian");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static MealCountryFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    MealCountryFragmentArgs __result = new MealCountryFragmentArgs();
    if (savedStateHandle.contains("countryName")) {
      String countryName;
      countryName = savedStateHandle.get("countryName");
      if (countryName == null) {
        throw new IllegalArgumentException("Argument \"countryName\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("countryName", countryName);
    } else {
      __result.arguments.put("countryName", "Canadian");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getCountryName() {
    return (String) arguments.get("countryName");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("countryName")) {
      String countryName = (String) arguments.get("countryName");
      __result.putString("countryName", countryName);
    } else {
      __result.putString("countryName", "Canadian");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("countryName")) {
      String countryName = (String) arguments.get("countryName");
      __result.set("countryName", countryName);
    } else {
      __result.set("countryName", "Canadian");
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
    MealCountryFragmentArgs that = (MealCountryFragmentArgs) object;
    if (arguments.containsKey("countryName") != that.arguments.containsKey("countryName")) {
      return false;
    }
    if (getCountryName() != null ? !getCountryName().equals(that.getCountryName()) : that.getCountryName() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getCountryName() != null ? getCountryName().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "MealCountryFragmentArgs{"
        + "countryName=" + getCountryName()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull MealCountryFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public MealCountryFragmentArgs build() {
      MealCountryFragmentArgs result = new MealCountryFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setCountryName(@NonNull String countryName) {
      if (countryName == null) {
        throw new IllegalArgumentException("Argument \"countryName\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("countryName", countryName);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getCountryName() {
      return (String) arguments.get("countryName");
    }
  }
}
