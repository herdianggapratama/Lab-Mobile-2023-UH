// Generated by view binder compiler. Do not edit!
package com.praktikumpmb043.mycalculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.praktikumpmb043.mycalculator.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ButtonLayoutBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btn0;

  @NonNull
  public final Button btn1;

  @NonNull
  public final Button btn2;

  @NonNull
  public final Button btn3;

  @NonNull
  public final Button btn4;

  @NonNull
  public final Button btn5;

  @NonNull
  public final Button btn6;

  @NonNull
  public final Button btn7;

  @NonNull
  public final Button btn8;

  @NonNull
  public final Button btn9;

  @NonNull
  public final Button btnAC;

  @NonNull
  public final Button btnC;

  @NonNull
  public final Button btnDvd;

  @NonNull
  public final Button btnEqls;

  @NonNull
  public final LinearLayout btnLayout;

  @NonNull
  public final Button btnMns;

  @NonNull
  public final Button btnPls;

  @NonNull
  public final Button btnTms;

  private ButtonLayoutBinding(@NonNull RelativeLayout rootView, @NonNull Button btn0,
      @NonNull Button btn1, @NonNull Button btn2, @NonNull Button btn3, @NonNull Button btn4,
      @NonNull Button btn5, @NonNull Button btn6, @NonNull Button btn7, @NonNull Button btn8,
      @NonNull Button btn9, @NonNull Button btnAC, @NonNull Button btnC, @NonNull Button btnDvd,
      @NonNull Button btnEqls, @NonNull LinearLayout btnLayout, @NonNull Button btnMns,
      @NonNull Button btnPls, @NonNull Button btnTms) {
    this.rootView = rootView;
    this.btn0 = btn0;
    this.btn1 = btn1;
    this.btn2 = btn2;
    this.btn3 = btn3;
    this.btn4 = btn4;
    this.btn5 = btn5;
    this.btn6 = btn6;
    this.btn7 = btn7;
    this.btn8 = btn8;
    this.btn9 = btn9;
    this.btnAC = btnAC;
    this.btnC = btnC;
    this.btnDvd = btnDvd;
    this.btnEqls = btnEqls;
    this.btnLayout = btnLayout;
    this.btnMns = btnMns;
    this.btnPls = btnPls;
    this.btnTms = btnTms;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ButtonLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ButtonLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.button_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ButtonLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn0;
      Button btn0 = ViewBindings.findChildViewById(rootView, id);
      if (btn0 == null) {
        break missingId;
      }

      id = R.id.btn1;
      Button btn1 = ViewBindings.findChildViewById(rootView, id);
      if (btn1 == null) {
        break missingId;
      }

      id = R.id.btn2;
      Button btn2 = ViewBindings.findChildViewById(rootView, id);
      if (btn2 == null) {
        break missingId;
      }

      id = R.id.btn3;
      Button btn3 = ViewBindings.findChildViewById(rootView, id);
      if (btn3 == null) {
        break missingId;
      }

      id = R.id.btn4;
      Button btn4 = ViewBindings.findChildViewById(rootView, id);
      if (btn4 == null) {
        break missingId;
      }

      id = R.id.btn5;
      Button btn5 = ViewBindings.findChildViewById(rootView, id);
      if (btn5 == null) {
        break missingId;
      }

      id = R.id.btn6;
      Button btn6 = ViewBindings.findChildViewById(rootView, id);
      if (btn6 == null) {
        break missingId;
      }

      id = R.id.btn7;
      Button btn7 = ViewBindings.findChildViewById(rootView, id);
      if (btn7 == null) {
        break missingId;
      }

      id = R.id.btn8;
      Button btn8 = ViewBindings.findChildViewById(rootView, id);
      if (btn8 == null) {
        break missingId;
      }

      id = R.id.btn9;
      Button btn9 = ViewBindings.findChildViewById(rootView, id);
      if (btn9 == null) {
        break missingId;
      }

      id = R.id.btnAC;
      Button btnAC = ViewBindings.findChildViewById(rootView, id);
      if (btnAC == null) {
        break missingId;
      }

      id = R.id.btnC;
      Button btnC = ViewBindings.findChildViewById(rootView, id);
      if (btnC == null) {
        break missingId;
      }

      id = R.id.btnDvd;
      Button btnDvd = ViewBindings.findChildViewById(rootView, id);
      if (btnDvd == null) {
        break missingId;
      }

      id = R.id.btnEqls;
      Button btnEqls = ViewBindings.findChildViewById(rootView, id);
      if (btnEqls == null) {
        break missingId;
      }

      id = R.id.btnLayout;
      LinearLayout btnLayout = ViewBindings.findChildViewById(rootView, id);
      if (btnLayout == null) {
        break missingId;
      }

      id = R.id.btnMns;
      Button btnMns = ViewBindings.findChildViewById(rootView, id);
      if (btnMns == null) {
        break missingId;
      }

      id = R.id.btnPls;
      Button btnPls = ViewBindings.findChildViewById(rootView, id);
      if (btnPls == null) {
        break missingId;
      }

      id = R.id.btnTms;
      Button btnTms = ViewBindings.findChildViewById(rootView, id);
      if (btnTms == null) {
        break missingId;
      }

      return new ButtonLayoutBinding((RelativeLayout) rootView, btn0, btn1, btn2, btn3, btn4, btn5,
          btn6, btn7, btn8, btn9, btnAC, btnC, btnDvd, btnEqls, btnLayout, btnMns, btnPls, btnTms);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}