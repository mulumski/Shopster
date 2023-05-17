// Generated by view binder compiler. Do not edit!
package com.example.projectmulumbatwo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projectmulumbatwo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView cardviewpic1;

  @NonNull
  public final CardView cardviewpic2;

  @NonNull
  public final CardView cardviewpic3;

  @NonNull
  public final CardView cdvw1;

  @NonNull
  public final HorizontalScrollView horiview1;

  @NonNull
  public final ImageView img1;

  @NonNull
  public final ImageView imgviewpic1;

  @NonNull
  public final ImageView imgviewpic2;

  @NonNull
  public final ImageView imgviewpic3;

  @NonNull
  public final ImageButton mbtnCart;

  @NonNull
  public final ImageButton mbtnCheckout;

  @NonNull
  public final ImageButton mbtnProfile;

  @NonNull
  public final ImageButton mbtnScan;

  @NonNull
  public final ImageButton mbtnScandata;

  @NonNull
  public final TextView tvcart;

  @NonNull
  public final TextView tvcheckout;

  @NonNull
  public final TextView tvscan;

  @NonNull
  public final TextView tvscandata;

  @NonNull
  public final TextView tvtitlemain;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull CardView cardviewpic1,
      @NonNull CardView cardviewpic2, @NonNull CardView cardviewpic3, @NonNull CardView cdvw1,
      @NonNull HorizontalScrollView horiview1, @NonNull ImageView img1,
      @NonNull ImageView imgviewpic1, @NonNull ImageView imgviewpic2,
      @NonNull ImageView imgviewpic3, @NonNull ImageButton mbtnCart,
      @NonNull ImageButton mbtnCheckout, @NonNull ImageButton mbtnProfile,
      @NonNull ImageButton mbtnScan, @NonNull ImageButton mbtnScandata, @NonNull TextView tvcart,
      @NonNull TextView tvcheckout, @NonNull TextView tvscan, @NonNull TextView tvscandata,
      @NonNull TextView tvtitlemain) {
    this.rootView = rootView;
    this.cardviewpic1 = cardviewpic1;
    this.cardviewpic2 = cardviewpic2;
    this.cardviewpic3 = cardviewpic3;
    this.cdvw1 = cdvw1;
    this.horiview1 = horiview1;
    this.img1 = img1;
    this.imgviewpic1 = imgviewpic1;
    this.imgviewpic2 = imgviewpic2;
    this.imgviewpic3 = imgviewpic3;
    this.mbtnCart = mbtnCart;
    this.mbtnCheckout = mbtnCheckout;
    this.mbtnProfile = mbtnProfile;
    this.mbtnScan = mbtnScan;
    this.mbtnScandata = mbtnScandata;
    this.tvcart = tvcart;
    this.tvcheckout = tvcheckout;
    this.tvscan = tvscan;
    this.tvscandata = tvscandata;
    this.tvtitlemain = tvtitlemain;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardviewpic1;
      CardView cardviewpic1 = ViewBindings.findChildViewById(rootView, id);
      if (cardviewpic1 == null) {
        break missingId;
      }

      id = R.id.cardviewpic2;
      CardView cardviewpic2 = ViewBindings.findChildViewById(rootView, id);
      if (cardviewpic2 == null) {
        break missingId;
      }

      id = R.id.cardviewpic3;
      CardView cardviewpic3 = ViewBindings.findChildViewById(rootView, id);
      if (cardviewpic3 == null) {
        break missingId;
      }

      id = R.id.cdvw1;
      CardView cdvw1 = ViewBindings.findChildViewById(rootView, id);
      if (cdvw1 == null) {
        break missingId;
      }

      id = R.id.horiview1;
      HorizontalScrollView horiview1 = ViewBindings.findChildViewById(rootView, id);
      if (horiview1 == null) {
        break missingId;
      }

      id = R.id.img1;
      ImageView img1 = ViewBindings.findChildViewById(rootView, id);
      if (img1 == null) {
        break missingId;
      }

      id = R.id.imgviewpic1;
      ImageView imgviewpic1 = ViewBindings.findChildViewById(rootView, id);
      if (imgviewpic1 == null) {
        break missingId;
      }

      id = R.id.imgviewpic2;
      ImageView imgviewpic2 = ViewBindings.findChildViewById(rootView, id);
      if (imgviewpic2 == null) {
        break missingId;
      }

      id = R.id.imgviewpic3;
      ImageView imgviewpic3 = ViewBindings.findChildViewById(rootView, id);
      if (imgviewpic3 == null) {
        break missingId;
      }

      id = R.id.mbtn_cart;
      ImageButton mbtnCart = ViewBindings.findChildViewById(rootView, id);
      if (mbtnCart == null) {
        break missingId;
      }

      id = R.id.mbtn_checkout;
      ImageButton mbtnCheckout = ViewBindings.findChildViewById(rootView, id);
      if (mbtnCheckout == null) {
        break missingId;
      }

      id = R.id.mbtn_profile;
      ImageButton mbtnProfile = ViewBindings.findChildViewById(rootView, id);
      if (mbtnProfile == null) {
        break missingId;
      }

      id = R.id.mbtn_scan;
      ImageButton mbtnScan = ViewBindings.findChildViewById(rootView, id);
      if (mbtnScan == null) {
        break missingId;
      }

      id = R.id.mbtn_Scandata;
      ImageButton mbtnScandata = ViewBindings.findChildViewById(rootView, id);
      if (mbtnScandata == null) {
        break missingId;
      }

      id = R.id.tvcart;
      TextView tvcart = ViewBindings.findChildViewById(rootView, id);
      if (tvcart == null) {
        break missingId;
      }

      id = R.id.tvcheckout;
      TextView tvcheckout = ViewBindings.findChildViewById(rootView, id);
      if (tvcheckout == null) {
        break missingId;
      }

      id = R.id.tvscan;
      TextView tvscan = ViewBindings.findChildViewById(rootView, id);
      if (tvscan == null) {
        break missingId;
      }

      id = R.id.tvscandata;
      TextView tvscandata = ViewBindings.findChildViewById(rootView, id);
      if (tvscandata == null) {
        break missingId;
      }

      id = R.id.tvtitlemain;
      TextView tvtitlemain = ViewBindings.findChildViewById(rootView, id);
      if (tvtitlemain == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, cardviewpic1, cardviewpic2,
          cardviewpic3, cdvw1, horiview1, img1, imgviewpic1, imgviewpic2, imgviewpic3, mbtnCart,
          mbtnCheckout, mbtnProfile, mbtnScan, mbtnScandata, tvcart, tvcheckout, tvscan, tvscandata,
          tvtitlemain);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
