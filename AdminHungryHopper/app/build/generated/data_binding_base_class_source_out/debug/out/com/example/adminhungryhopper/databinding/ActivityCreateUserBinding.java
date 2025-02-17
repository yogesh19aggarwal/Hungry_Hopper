// Generated by view binder compiler. Do not edit!
package com.example.adminhungryhopper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.adminhungryhopper.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCreateUserBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton backBtn;

  @NonNull
  public final AppCompatButton createUserBtn;

  @NonNull
  public final EditText email;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final EditText name;

  @NonNull
  public final TextInputEditText password;

  @NonNull
  public final TextInputLayout textInputLayoutPass;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  private ActivityCreateUserBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton backBtn, @NonNull AppCompatButton createUserBtn, @NonNull EditText email,
      @NonNull ImageView imageView, @NonNull ConstraintLayout main, @NonNull EditText name,
      @NonNull TextInputEditText password, @NonNull TextInputLayout textInputLayoutPass,
      @NonNull TextView textView4, @NonNull TextView textView5) {
    this.rootView = rootView;
    this.backBtn = backBtn;
    this.createUserBtn = createUserBtn;
    this.email = email;
    this.imageView = imageView;
    this.main = main;
    this.name = name;
    this.password = password;
    this.textInputLayoutPass = textInputLayoutPass;
    this.textView4 = textView4;
    this.textView5 = textView5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCreateUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCreateUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_create_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCreateUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backBtn;
      ImageButton backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.createUserBtn;
      AppCompatButton createUserBtn = ViewBindings.findChildViewById(rootView, id);
      if (createUserBtn == null) {
        break missingId;
      }

      id = R.id.email;
      EditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.name;
      EditText name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.password;
      TextInputEditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.textInputLayoutPass;
      TextInputLayout textInputLayoutPass = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayoutPass == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      return new ActivityCreateUserBinding((ConstraintLayout) rootView, backBtn, createUserBtn,
          email, imageView, main, name, password, textInputLayoutPass, textView4, textView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
