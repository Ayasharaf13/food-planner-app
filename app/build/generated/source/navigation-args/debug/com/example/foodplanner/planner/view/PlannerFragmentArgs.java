package com.example.foodplanner.planner.view;

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

public class PlannerFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private PlannerFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private PlannerFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static PlannerFragmentArgs fromBundle(@NonNull Bundle bundle) {
    PlannerFragmentArgs __result = new PlannerFragmentArgs();
    bundle.setClassLoader(PlannerFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("idMealPlanner")) {
      String idMealPlanner;
      idMealPlanner = bundle.getString("idMealPlanner");
      __result.arguments.put("idMealPlanner", idMealPlanner);
    } else {
      __result.arguments.put("idMealPlanner", null);
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static PlannerFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    PlannerFragmentArgs __result = new PlannerFragmentArgs();
    if (savedStateHandle.contains("idMealPlanner")) {
      String idMealPlanner;
      idMealPlanner = savedStateHandle.get("idMealPlanner");
      __result.arguments.put("idMealPlanner", idMealPlanner);
    } else {
      __result.arguments.put("idMealPlanner", null);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public String getIdMealPlanner() {
    return (String) arguments.get("idMealPlanner");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("idMealPlanner")) {
      String idMealPlanner = (String) arguments.get("idMealPlanner");
      __result.putString("idMealPlanner", idMealPlanner);
    } else {
      __result.putString("idMealPlanner", null);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("idMealPlanner")) {
      String idMealPlanner = (String) arguments.get("idMealPlanner");
      __result.set("idMealPlanner", idMealPlanner);
    } else {
      __result.set("idMealPlanner", null);
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
    PlannerFragmentArgs that = (PlannerFragmentArgs) object;
    if (arguments.containsKey("idMealPlanner") != that.arguments.containsKey("idMealPlanner")) {
      return false;
    }
    if (getIdMealPlanner() != null ? !getIdMealPlanner().equals(that.getIdMealPlanner()) : that.getIdMealPlanner() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getIdMealPlanner() != null ? getIdMealPlanner().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "PlannerFragmentArgs{"
        + "idMealPlanner=" + getIdMealPlanner()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull PlannerFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public PlannerFragmentArgs build() {
      PlannerFragmentArgs result = new PlannerFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setIdMealPlanner(@Nullable String idMealPlanner) {
      this.arguments.put("idMealPlanner", idMealPlanner);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @Nullable
    public String getIdMealPlanner() {
      return (String) arguments.get("idMealPlanner");
    }
  }
}
