package com.example.foodplanner.home.view;

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

public class WatchVideoFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private WatchVideoFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private WatchVideoFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static WatchVideoFragmentArgs fromBundle(@NonNull Bundle bundle) {
    WatchVideoFragmentArgs __result = new WatchVideoFragmentArgs();
    bundle.setClassLoader(WatchVideoFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("videoId")) {
      String videoId;
      videoId = bundle.getString("videoId");
      __result.arguments.put("videoId", videoId);
    } else {
      __result.arguments.put("videoId", null);
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static WatchVideoFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    WatchVideoFragmentArgs __result = new WatchVideoFragmentArgs();
    if (savedStateHandle.contains("videoId")) {
      String videoId;
      videoId = savedStateHandle.get("videoId");
      __result.arguments.put("videoId", videoId);
    } else {
      __result.arguments.put("videoId", null);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public String getVideoId() {
    return (String) arguments.get("videoId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("videoId")) {
      String videoId = (String) arguments.get("videoId");
      __result.putString("videoId", videoId);
    } else {
      __result.putString("videoId", null);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("videoId")) {
      String videoId = (String) arguments.get("videoId");
      __result.set("videoId", videoId);
    } else {
      __result.set("videoId", null);
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
    WatchVideoFragmentArgs that = (WatchVideoFragmentArgs) object;
    if (arguments.containsKey("videoId") != that.arguments.containsKey("videoId")) {
      return false;
    }
    if (getVideoId() != null ? !getVideoId().equals(that.getVideoId()) : that.getVideoId() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getVideoId() != null ? getVideoId().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "WatchVideoFragmentArgs{"
        + "videoId=" + getVideoId()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull WatchVideoFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public WatchVideoFragmentArgs build() {
      WatchVideoFragmentArgs result = new WatchVideoFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setVideoId(@Nullable String videoId) {
      this.arguments.put("videoId", videoId);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @Nullable
    public String getVideoId() {
      return (String) arguments.get("videoId");
    }
  }
}
