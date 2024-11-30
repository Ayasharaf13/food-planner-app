package com.example.foodplanner.save.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SaveFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private SaveFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private SaveFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static SaveFragmentArgs fromBundle(@NonNull Bundle bundle) {
    SaveFragmentArgs __result = new SaveFragmentArgs();
    bundle.setClassLoader(SaveFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("idSavingFood")) {
      String idSavingFood;
      idSavingFood = bundle.getString("idSavingFood");
      __result.arguments.put("idSavingFood", idSavingFood);
    } else {
      __result.arguments.put("idSavingFood", null);
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static SaveFragmentArgs fromSavedStateHandle(@NonNull SavedStateHandle savedStateHandle) {
    SaveFragmentArgs __result = new SaveFragmentArgs();
    if (savedStateHandle.contains("idSavingFood")) {
      String idSavingFood;
      idSavingFood = savedStateHandle.get("idSavingFood");
      __result.arguments.put("idSavingFood", idSavingFood);
    } else {
      __result.arguments.put("idSavingFood", null);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public String getIdSavingFood() {
    return (String) arguments.get("idSavingFood");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("idSavingFood")) {
      String idSavingFood = (String) arguments.get("idSavingFood");
      __result.putString("idSavingFood", idSavingFood);
    } else {
      __result.putString("idSavingFood", null);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("idSavingFood")) {
      String idSavingFood = (String) arguments.get("idSavingFood");
      __result.set("idSavingFood", idSavingFood);
    } else {
      __result.set("idSavingFood", null);
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
    SaveFragmentArgs that = (SaveFragmentArgs) object;
    if (arguments.containsKey("idSavingFood") != that.arguments.containsKey("idSavingFood")) {
      return false;
    }
    if (getIdSavingFood() != null ? !getIdSavingFood().equals(that.getIdSavingFood()) : that.getIdSavingFood() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getIdSavingFood() != null ? getIdSavingFood().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "SaveFragmentArgs{"
        + "idSavingFood=" + getIdSavingFood()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull SaveFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public SaveFragmentArgs build() {
      SaveFragmentArgs result = new SaveFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setIdSavingFood(@Nullable String idSavingFood) {
      this.arguments.put("idSavingFood", idSavingFood);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @Nullable
    public String getIdSavingFood() {
      return (String) arguments.get("idSavingFood");
    }
  }
}
