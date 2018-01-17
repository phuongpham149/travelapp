package com.example.phamthi.travel_app.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.phamthi.travel_app.R;

public class FormCustomView extends RelativeLayout {
    public FormCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.FormCustomView, 0, 0);
        String title = typedArray.getString(R.styleable.FormCustomView_title);
        String nameButton = typedArray.getString(R.styleable.FormCustomView_nameButton);
        boolean isShowRetypePassword = typedArray.getBoolean(R.styleable.FormCustomView_isShowRetypePassword, false);
        boolean isShowEmail = typedArray.getBoolean(R.styleable.FormCustomView_isShowEmail, false);
        typedArray.recycle();

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.form, this, true);

        TextView txtTitle = (TextView) getChildAt(0);
        EditText edtRetypePassword = (EditText) getChildAt(3);
        EditText edtEmail = (EditText) getChildAt(4);
        Button btnSubmit = (Button) getChildAt(5);

        txtTitle.setText(title);
        btnSubmit.setText(nameButton);
        edtRetypePassword.setVisibility(isShowRetypePassword ? VISIBLE : GONE);
        edtEmail.setVisibility(isShowEmail ? VISIBLE : GONE);
    }
}
