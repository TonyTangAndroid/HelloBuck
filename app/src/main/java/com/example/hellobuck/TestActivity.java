package com.example.hellobuck;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        TextView textView = (TextView) findViewById(R.id.test_text_view);

        TestDataModel.getInstance().setRetainedTextView(textView);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //TestDataModel.getInstance().setRetainedTextView(null);
    }
}