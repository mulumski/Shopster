// Generated by view binder compiler. Do not edit!
package com.example.projectmulumbatwo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
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

public final class ActivityFirstBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnGetStarted;

  @NonNull
  public final ImageView imgvwintro;

  @NonNull
  public final TextView tvintottl;

  @NonNull
  public final TextView tvintroexp;

  private ActivityFirstBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnGetStarted,
      @NonNull ImageView imgvwintro, @NonNull TextView tvintottl, @NonNull TextView tvintroexp) {
    this.rootView = rootView;
    this.btnGetStarted = btnGetStarted;
    this.imgvwintro = imgvwintro;
    this.tvintottl = tvintottl;
    this.tvintroexp = tvintroexp;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFirstBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFirstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_first, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFirstBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnGetStarted;
      Button btnGetStarted = ViewBindings.findChildViewById(rootView, id);
      if (btnGetStarted == null) {
        break missingId;
      }

      id = R.id.imgvwintro;
      ImageView imgvwintro = ViewBindings.findChildViewById(rootView, id);
      if (imgvwintro == null) {
        break missingId;
      }

      id = R.id.tvintottl;
      TextView tvintottl = ViewBindings.findChildViewById(rootView, id);
      if (tvintottl == null) {
        break missingId;
      }

      id = R.id.tvintroexp;
      TextView tvintroexp = ViewBindings.findChildViewById(rootView, id);
      if (tvintroexp == null) {
        break missingId;
      }

      return new ActivityFirstBinding((ConstraintLayout) rootView, btnGetStarted, imgvwintro,
          tvintottl, tvintroexp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
