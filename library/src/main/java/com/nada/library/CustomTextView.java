package com.nada.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class CustomTextView extends TextView {

    String custom_size;



    public CustomTextView(Context context) {
        super(context);
        init(context, null);
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }

    public void init(Context context, @Nullable AttributeSet attrs) {
        int fontFlag;
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.TextViewCustomFont,
                0, 0);

        try {

            fontFlag = a.getInteger(R.styleable.TextViewCustomFont_custom_size, 0);
        } finally {
            a.recycle();
        }

        if (fontFlag == 0)
            custom_size="small";
        else if (fontFlag == 1)
            custom_size="medium";
        else if (fontFlag == 2)
            custom_size="large";

        setText(custom_size);
    }

    public void setCustomSize(custom_size customSize) {
        if (customSize == com.nada.library.custom_size.small)
            custom_size="small";
        else if (customSize == com.nada.library.custom_size.medium)
            custom_size="medium";
        else if (customSize == com.nada.library.custom_size.large)
            custom_size="large";
        setText(custom_size);
    }
}
