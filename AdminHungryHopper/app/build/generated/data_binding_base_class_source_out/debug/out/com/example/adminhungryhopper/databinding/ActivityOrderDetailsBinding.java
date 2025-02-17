// Generated by view binder compiler. Do not edit!
package com.example.adminhungryhopper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.adminhungryhopper.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOrderDetailsBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView address;

  @NonNull
  public final ImageButton backToCart;

  @NonNull
  public final FrameLayout main;

  @NonNull
  public final TextView name;

  @NonNull
  public final RecyclerView orderDetailRecyclerView;

  @NonNull
  public final TextView phoneNumber;

  @NonNull
  public final TextView textView23;

  @NonNull
  public final TextView totalPrice;

  private ActivityOrderDetailsBinding(@NonNull FrameLayout rootView, @NonNull TextView address,
      @NonNull ImageButton backToCart, @NonNull FrameLayout main, @NonNull TextView name,
      @NonNull RecyclerView orderDetailRecyclerView, @NonNull TextView phoneNumber,
      @NonNull TextView textView23, @NonNull TextView totalPrice) {
    this.rootView = rootView;
    this.address = address;
    this.backToCart = backToCart;
    this.main = main;
    this.name = name;
    this.orderDetailRecyclerView = orderDetailRecyclerView;
    this.phoneNumber = phoneNumber;
    this.textView23 = textView23;
    this.totalPrice = totalPrice;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOrderDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOrderDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_order_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOrderDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address;
      TextView address = ViewBindings.findChildViewById(rootView, id);
      if (address == null) {
        break missingId;
      }

      id = R.id.backToCart;
      ImageButton backToCart = ViewBindings.findChildViewById(rootView, id);
      if (backToCart == null) {
        break missingId;
      }

      FrameLayout main = (FrameLayout) rootView;

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.orderDetailRecyclerView;
      RecyclerView orderDetailRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (orderDetailRecyclerView == null) {
        break missingId;
      }

      id = R.id.phoneNumber;
      TextView phoneNumber = ViewBindings.findChildViewById(rootView, id);
      if (phoneNumber == null) {
        break missingId;
      }

      id = R.id.textView23;
      TextView textView23 = ViewBindings.findChildViewById(rootView, id);
      if (textView23 == null) {
        break missingId;
      }

      id = R.id.totalPrice;
      TextView totalPrice = ViewBindings.findChildViewById(rootView, id);
      if (totalPrice == null) {
        break missingId;
      }

      return new ActivityOrderDetailsBinding((FrameLayout) rootView, address, backToCart, main,
          name, orderDetailRecyclerView, phoneNumber, textView23, totalPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
