// Generated by view binder compiler. Do not edit!
package com.example.foodplanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.foodplanner.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnRegistration;

  @NonNull
  public final CardView cardViewRandomMeal;

  @NonNull
  public final ConstraintLayout frameLayout2;

  @NonNull
  public final ImageView imageRandomMeal;

  @NonNull
  public final ConstraintLayout layoutHome;

  @NonNull
  public final TextView nameCardRandom;

  @NonNull
  public final TextView newTextCard;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnRegistration,
      @NonNull CardView cardViewRandomMeal, @NonNull ConstraintLayout frameLayout2,
      @NonNull ImageView imageRandomMeal, @NonNull ConstraintLayout layoutHome,
      @NonNull TextView nameCardRandom, @NonNull TextView newTextCard,
      @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2) {
    this.rootView = rootView;
    this.btnRegistration = btnRegistration;
    this.cardViewRandomMeal = cardViewRandomMeal;
    this.frameLayout2 = frameLayout2;
    this.imageRandomMeal = imageRandomMeal;
    this.layoutHome = layoutHome;
    this.nameCardRandom = nameCardRandom;
    this.newTextCard = newTextCard;
    this.recyclerView = recyclerView;
    this.textView = textView;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_registration;
      Button btnRegistration = ViewBindings.findChildViewById(rootView, id);
      if (btnRegistration == null) {
        break missingId;
      }

      id = R.id.cardViewRandomMeal;
      CardView cardViewRandomMeal = ViewBindings.findChildViewById(rootView, id);
      if (cardViewRandomMeal == null) {
        break missingId;
      }

      ConstraintLayout frameLayout2 = (ConstraintLayout) rootView;

      id = R.id.imageRandomMeal;
      ImageView imageRandomMeal = ViewBindings.findChildViewById(rootView, id);
      if (imageRandomMeal == null) {
        break missingId;
      }

      id = R.id.layout_home;
      ConstraintLayout layoutHome = ViewBindings.findChildViewById(rootView, id);
      if (layoutHome == null) {
        break missingId;
      }

      id = R.id.nameCardRandom;
      TextView nameCardRandom = ViewBindings.findChildViewById(rootView, id);
      if (nameCardRandom == null) {
        break missingId;
      }

      id = R.id.newTextCard;
      TextView newTextCard = ViewBindings.findChildViewById(rootView, id);
      if (newTextCard == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, btnRegistration,
          cardViewRandomMeal, frameLayout2, imageRandomMeal, layoutHome, nameCardRandom,
          newTextCard, recyclerView, textView, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}