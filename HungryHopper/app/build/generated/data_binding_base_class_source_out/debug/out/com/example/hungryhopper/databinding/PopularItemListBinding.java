// Generated by view binder compiler. Do not edit!
package com.example.hungryhopper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.hungryhopper.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PopularItemListBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView menuAddCart;

  @NonNull
  public final TextView menuFoodName;

  @NonNull
  public final ImageView menuImage;

  @NonNull
  public final TextView menuPrice;

  private PopularItemListBinding(@NonNull CardView rootView, @NonNull TextView menuAddCart,
      @NonNull TextView menuFoodName, @NonNull ImageView menuImage, @NonNull TextView menuPrice) {
    this.rootView = rootView;
    this.menuAddCart = menuAddCart;
    this.menuFoodName = menuFoodName;
    this.menuImage = menuImage;
    this.menuPrice = menuPrice;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static PopularItemListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PopularItemListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.popular_item_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PopularItemListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.menuAddCart;
      TextView menuAddCart = ViewBindings.findChildViewById(rootView, id);
      if (menuAddCart == null) {
        break missingId;
      }

      id = R.id.menuFoodName;
      TextView menuFoodName = ViewBindings.findChildViewById(rootView, id);
      if (menuFoodName == null) {
        break missingId;
      }

      id = R.id.menuImage;
      ImageView menuImage = ViewBindings.findChildViewById(rootView, id);
      if (menuImage == null) {
        break missingId;
      }

      id = R.id.menuPrice;
      TextView menuPrice = ViewBindings.findChildViewById(rootView, id);
      if (menuPrice == null) {
        break missingId;
      }

      return new PopularItemListBinding((CardView) rootView, menuAddCart, menuFoodName, menuImage,
          menuPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
