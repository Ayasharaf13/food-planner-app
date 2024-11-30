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

public class MealCategoryFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private MealCategoryFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private MealCategoryFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static MealCategoryFragmentArgs fromBundle(@NonNull Bundle bundle) {
    MealCategoryFragmentArgs __result = new MealCategoryFragmentArgs();
    bundle.setClassLoader(MealCategoryFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("idCategory")) {
      String idCategory;
      idCategory = bundle.getString("idCategory");
      if (idCategory == null) {
        throw new IllegalArgumentException("Argument \"idCategory\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("idCategory", idCategory);
    } else {
      __result.arguments.put("idCategory", "Seafood");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static MealCategoryFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    MealCategoryFragmentArgs __result = new MealCategoryFragmentArgs();
    if (savedStateHandle.contains("idCategory")) {
      String idCategory;
      idCategory = savedStateHandle.get("idCategory");
      if (idCategory == null) {
        throw new IllegalArgumentException("Argument \"idCategory\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("idCategory", idCategory);
    } else {
      __result.arguments.put("idCategory", "Seafood");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getIdCategory() {
    return (String) arguments.get("idCategory");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("idCategory")) {
      String idCategory = (String) arguments.get("idCategory");
      __result.putString("idCategory", idCategory);
    } else {
      __result.putString("idCategory", "Seafood");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("idCategory")) {
      String idCategory = (String) arguments.get("idCategory");
      __result.set("idCategory", idCategory);
    } else {
      __result.set("idCategory", "Seafood");
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
    MealCategoryFragmentArgs that = (MealCategoryFragmentArgs) object;
    if (arguments.containsKey("idCategory") != that.arguments.containsKey("idCategory")) {
      return false;
    }
    if (getIdCategory() != null ? !getIdCategory().equals(that.getIdCategory()) : that.getIdCategory() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getIdCategory() != null ? getIdCategory().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "MealCategoryFragmentArgs{"
        + "idCategory=" + getIdCategory()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull MealCategoryFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public MealCategoryFragmentArgs build() {
      MealCategoryFragmentArgs result = new MealCategoryFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setIdCategory(@NonNull String idCategory) {
      if (idCategory == null) {
        throw new IllegalArgumentException("Argument \"idCategory\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("idCategory", idCategory);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getIdCategory() {
      return (String) arguments.get("idCategory");
    }
  }
}
