// Generated by view binder compiler. Do not edit!
package com.example.adminhungryhopper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.adminhungryhopper.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdminProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText address;

  @NonNull
  public final ImageButton backBtn;

  @NonNull
  public final TextView clickToEdit;

  @NonNull
  public final TextView editProfile;

  @NonNull
  public final EditText email;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final EditText name;

  @NonNull
  public final EditText password;

  @NonNull
  public final EditText phoneNumber;

  @NonNull
  public final EditText restaurantName;

  @NonNull
  public final AppCompatButton saveInfoButton;

  @NonNull
  public final TextView textView11;

  private ActivityAdminProfileBinding(@NonNull ConstraintLayout rootView, @NonNull EditText address,
      @NonNull ImageButton backBtn, @NonNull TextView clickToEdit, @NonNull TextView editProfile,
      @NonNull EditText email, @NonNull ConstraintLayout main, @NonNull EditText name,
      @NonNull EditText password, @NonNull EditText phoneNumber, @NonNull EditText restaurantName,
      @NonNull AppCompatButton saveInfoButton, @NonNull TextView textView11) {
    this.rootView = rootView;
    this.address = address;
    this.backBtn = backBtn;
    this.clickToEdit = clickToEdit;
    this.editProfile = editProfile;
    this.email = email;
    this.main = main;
    this.name = name;
    this.password = password;
    this.phoneNumber = phoneNumber;
    this.restaurantName = restaurantName;
    this.saveInfoButton = saveInfoButton;
    this.textView11 = textView11;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdminProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdminProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_admin_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdminProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address;
      EditText address = ViewBindings.findChildViewById(rootView, id);
      if (address == null) {
        break missingId;
      }

      id = R.id.backBtn;
      ImageButton backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.clickToEdit;
      TextView clickToEdit = ViewBindings.findChildViewById(rootView, id);
      if (clickToEdit == null) {
        break missingId;
      }

      id = R.id.editProfile;
      TextView editProfile = ViewBindings.findChildViewById(rootView, id);
      if (editProfile == null) {
        break missingId;
      }

      id = R.id.email;
      EditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.name;
      EditText name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.phoneNumber;
      EditText phoneNumber = ViewBindings.findChildViewById(rootView, id);
      if (phoneNumber == null) {
        break missingId;
      }

      id = R.id.restaurantName;
      EditText restaurantName = ViewBindings.findChildViewById(rootView, id);
      if (restaurantName == null) {
        break missingId;
      }

      id = R.id.saveInfoButton;
      AppCompatButton saveInfoButton = ViewBindings.findChildViewById(rootView, id);
      if (saveInfoButton == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      return new ActivityAdminProfileBinding((ConstraintLayout) rootView, address, backBtn,
          clickToEdit, editProfile, email, main, name, password, phoneNumber, restaurantName,
          saveInfoButton, textView11);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
