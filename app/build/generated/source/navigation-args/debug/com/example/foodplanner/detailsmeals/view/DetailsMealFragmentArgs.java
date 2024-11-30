package com.example.foodplanner.detailsmeals.view;

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

public class DetailsMealFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailsMealFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private DetailsMealFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailsMealFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailsMealFragmentArgs __result = new DetailsMealFragmentArgs();
    bundle.setClassLoader(DetailsMealFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("idMeal")) {
      String idMeal;
      idMeal = bundle.getString("idMeal");
      if (idMeal == null) {
        throw new IllegalArgumentException("Argument \"idMeal\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("idMeal", idMeal);
    } else {
      throw new IllegalArgumentException("Required argument \"idMeal\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailsMealFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    DetailsMealFragmentArgs __result = new DetailsMealFragmentArgs();
    if (savedStateHandle.contains("idMeal")) {
      String idMeal;
      idMeal = savedStateHandle.get("idMeal");
      if (idMeal == null) {
        throw new IllegalArgumentException("Argument \"idMeal\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("idMeal", idMeal);
    } else {
      throw new IllegalArgumentException("Required argument \"idMeal\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getIdMeal() {
    return (String) arguments.get("idMeal");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("idMeal")) {
      String idMeal = (String) arguments.get("idMeal");
      __result.putString("idMeal", idMeal);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("idMeal")) {
      String idMeal = (String) arguments.get("idMeal");
      __result.set("idMeal", idMeal);
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
    DetailsMealFragmentArgs that = (DetailsMealFragmentArgs) object;
    if (arguments.containsKey("idMeal") != that.arguments.containsKey("idMeal")) {
      return false;
    }
    if (getIdMeal() != null ? !getIdMeal().equals(that.getIdMeal()) : that.getIdMeal() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getIdMeal() != null ? getIdMeal().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailsMealFragmentArgs{"
        + "idMeal=" + getIdMeal()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull DetailsMealFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String idMeal) {
      if (idMeal == null) {
        throw new IllegalArgumentException("Argument \"idMeal\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("idMeal", idMeal);
    }

    @NonNull
    public DetailsMealFragmentArgs build() {
      DetailsMealFragmentArgs result = new DetailsMealFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setIdMeal(@NonNull String idMeal) {
      if (idMeal == null) {
        throw new IllegalArgumentException("Argument \"idMeal\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("idMeal", idMeal);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getIdMeal() {
      return (String) arguments.get("idMeal");
    }
  }
}
