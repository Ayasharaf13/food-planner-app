package com.example.foodplanner.home.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavDirections;
import com.example.foodplanner.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static ActionHomeFragmentToDetailsMealFragment actionHomeFragmentToDetailsMealFragment(
      @NonNull String idMeal) {
    return new ActionHomeFragmentToDetailsMealFragment(idMeal);
  }

  @NonNull
  public static ActionHomeFragmentToSaveFragment actionHomeFragmentToSaveFragment() {
    return new ActionHomeFragmentToSaveFragment();
  }

  @NonNull
  public static ActionHomeFragmentToWatchVideoFragment actionHomeFragmentToWatchVideoFragment() {
    return new ActionHomeFragmentToWatchVideoFragment();
  }

  public static class ActionHomeFragmentToDetailsMealFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionHomeFragmentToDetailsMealFragment(@NonNull String idMeal) {
      if (idMeal == null) {
        throw new IllegalArgumentException("Argument \"idMeal\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("idMeal", idMeal);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeFragmentToDetailsMealFragment setIdMeal(@NonNull String idMeal) {
      if (idMeal == null) {
        throw new IllegalArgumentException("Argument \"idMeal\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("idMeal", idMeal);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("idMeal")) {
        String idMeal = (String) arguments.get("idMeal");
        __result.putString("idMeal", idMeal);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_homeFragment_to_detailsMealFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getIdMeal() {
      return (String) arguments.get("idMeal");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToDetailsMealFragment that = (ActionHomeFragmentToDetailsMealFragment) object;
      if (arguments.containsKey("idMeal") != that.arguments.containsKey("idMeal")) {
        return false;
      }
      if (getIdMeal() != null ? !getIdMeal().equals(that.getIdMeal()) : that.getIdMeal() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getIdMeal() != null ? getIdMeal().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToDetailsMealFragment(actionId=" + getActionId() + "){"
          + "idMeal=" + getIdMeal()
          + "}";
    }
  }

  public static class ActionHomeFragmentToSaveFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHomeFragmentToSaveFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeFragmentToSaveFragment setIdSavingFood(@Nullable String idSavingFood) {
      this.arguments.put("idSavingFood", idSavingFood);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("idSavingFood")) {
        String idSavingFood = (String) arguments.get("idSavingFood");
        __result.putString("idSavingFood", idSavingFood);
      } else {
        __result.putString("idSavingFood", null);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_homeFragment_to_saveFragment;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getIdSavingFood() {
      return (String) arguments.get("idSavingFood");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToSaveFragment that = (ActionHomeFragmentToSaveFragment) object;
      if (arguments.containsKey("idSavingFood") != that.arguments.containsKey("idSavingFood")) {
        return false;
      }
      if (getIdSavingFood() != null ? !getIdSavingFood().equals(that.getIdSavingFood()) : that.getIdSavingFood() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getIdSavingFood() != null ? getIdSavingFood().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToSaveFragment(actionId=" + getActionId() + "){"
          + "idSavingFood=" + getIdSavingFood()
          + "}";
    }
  }

  public static class ActionHomeFragmentToWatchVideoFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHomeFragmentToWatchVideoFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeFragmentToWatchVideoFragment setVideoId(@Nullable String videoId) {
      this.arguments.put("videoId", videoId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("videoId")) {
        String videoId = (String) arguments.get("videoId");
        __result.putString("videoId", videoId);
      } else {
        __result.putString("videoId", null);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_homeFragment_to_watchVideoFragment;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getVideoId() {
      return (String) arguments.get("videoId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToWatchVideoFragment that = (ActionHomeFragmentToWatchVideoFragment) object;
      if (arguments.containsKey("videoId") != that.arguments.containsKey("videoId")) {
        return false;
      }
      if (getVideoId() != null ? !getVideoId().equals(that.getVideoId()) : that.getVideoId() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getVideoId() != null ? getVideoId().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToWatchVideoFragment(actionId=" + getActionId() + "){"
          + "videoId=" + getVideoId()
          + "}";
    }
  }
}
