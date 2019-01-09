package com.zyt.www.mytools;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zyt.www.utils.component.ZButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ZButton zButton = findViewById(R.id.zbutton);
    }
}
