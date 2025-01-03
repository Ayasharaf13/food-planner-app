// Generated by view binder compiler. Do not edit!
package com.example.foodplanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.foodplanner.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentIngredientsMealsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final RecyclerView recyclerFilterByIngred;

  @NonNull
  public final ImageView searchIconIngred;

  @NonNull
  public final EditText searchTextIngred;

  private FragmentIngredientsMealsBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerFilterByIngred,
      @NonNull ImageView searchIconIngred, @NonNull EditText searchTextIngred) {
    this.rootView = rootView;
    this.linearLayout = linearLayout;
    this.recyclerFilterByIngred = recyclerFilterByIngred;
    this.searchIconIngred = searchIconIngred;
    this.searchTextIngred = searchTextIngred;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentIngredientsMealsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentIngredientsMealsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_ingredients_meals, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentIngredientsMealsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.recyclerFilterByIngred;
      RecyclerView recyclerFilterByIngred = ViewBindings.findChildViewById(rootView, id);
      if (recyclerFilterByIngred == null) {
        break missingId;
      }

      id = R.id.searchIconIngred;
      ImageView searchIconIngred = ViewBindings.findChildViewById(rootView, id);
      if (searchIconIngred == null) {
        break missingId;
      }

      id = R.id.searchTextIngred;
      EditText searchTextIngred = ViewBindings.findChildViewById(rootView, id);
      if (searchTextIngred == null) {
        break missingId;
      }

      return new FragmentIngredientsMealsBinding((ConstraintLayout) rootView, linearLayout,
          recyclerFilterByIngred, searchIconIngred, searchTextIngred);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
