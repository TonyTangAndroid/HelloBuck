package com.example.hellobuck;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.lib.Config;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_hello = findViewById(R.id.tv_hello);
        tv_hello.append("FORCE_DISABLE_LEAK_CANARY:" + BuildConfig.FORCE_DISABLE_LEAK_CANARY);
        tv_hello.append("MAVEN_URL:" + Config.URL);
    }
}
