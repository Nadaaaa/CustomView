package com.nada.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nada.library.CustomTextView;
import com.nada.library.custom_size;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomTextView customTextView;
        customTextView = findViewById(R.id.customTextView);

        customTextView.setCustomSize(com.nada.library.custom_size.small);
    }
}
