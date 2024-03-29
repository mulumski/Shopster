// Generated by view binder compiler. Do not edit!
package com.example.projectmulumbatwo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projectmulumbatwo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignUpBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button mBtnSignUp;

  @NonNull
  public final Button mBtnsignin;

  @NonNull
  public final EditText mEdtEmail;

  @NonNull
  public final EditText mEdtName;

  @NonNull
  public final EditText mEdtPasssword;

  @NonNull
  public final EditText mEdtPhone;

  @NonNull
  public final TextView mTvalracc;

  @NonNull
  public final TextView mtvttlone;

  private ActivitySignUpBinding(@NonNull ConstraintLayout rootView, @NonNull Button mBtnSignUp,
      @NonNull Button mBtnsignin, @NonNull EditText mEdtEmail, @NonNull EditText mEdtName,
      @NonNull EditText mEdtPasssword, @NonNull EditText mEdtPhone, @NonNull TextView mTvalracc,
      @NonNull TextView mtvttlone) {
    this.rootView = rootView;
    this.mBtnSignUp = mBtnSignUp;
    this.mBtnsignin = mBtnsignin;
    this.mEdtEmail = mEdtEmail;
    this.mEdtName = mEdtName;
    this.mEdtPasssword = mEdtPasssword;
    this.mEdtPhone = mEdtPhone;
    this.mTvalracc = mTvalracc;
    this.mtvttlone = mtvttlone;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mBtnSignUp;
      Button mBtnSignUp = ViewBindings.findChildViewById(rootView, id);
      if (mBtnSignUp == null) {
        break missingId;
      }

      id = R.id.mBtnsignin;
      Button mBtnsignin = ViewBindings.findChildViewById(rootView, id);
      if (mBtnsignin == null) {
        break missingId;
      }

      id = R.id.mEdtEmail;
      EditText mEdtEmail = ViewBindings.findChildViewById(rootView, id);
      if (mEdtEmail == null) {
        break missingId;
      }

      id = R.id.mEdtName;
      EditText mEdtName = ViewBindings.findChildViewById(rootView, id);
      if (mEdtName == null) {
        break missingId;
      }

      id = R.id.mEdtPasssword;
      EditText mEdtPasssword = ViewBindings.findChildViewById(rootView, id);
      if (mEdtPasssword == null) {
        break missingId;
      }

      id = R.id.mEdtPhone;
      EditText mEdtPhone = ViewBindings.findChildViewById(rootView, id);
      if (mEdtPhone == null) {
        break missingId;
      }

      id = R.id.mTvalracc;
      TextView mTvalracc = ViewBindings.findChildViewById(rootView, id);
      if (mTvalracc == null) {
        break missingId;
      }

      id = R.id.mtvttlone;
      TextView mtvttlone = ViewBindings.findChildViewById(rootView, id);
      if (mtvttlone == null) {
        break missingId;
      }

      return new ActivitySignUpBinding((ConstraintLayout) rootView, mBtnSignUp, mBtnsignin,
          mEdtEmail, mEdtName, mEdtPasssword, mEdtPhone, mTvalracc, mtvttlone);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
