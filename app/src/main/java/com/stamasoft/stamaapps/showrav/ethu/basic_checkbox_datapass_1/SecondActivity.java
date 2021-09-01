package com.stamasoft.stamaapps.showrav.ethu.basic_checkbox_datapass_1;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        EditText ex1 = (EditText)findViewById(R.id.et1);
        EditText ex2 = (EditText)findViewById(R.id.et2);

        // Bundle extras = getIntent().getExtras();
        //String value1 = extras.getString("sv1");
        //-------------or---


        String value1 = getIntent().getExtras().getString("grade1");

        ex1.setText(value1);



        String value2 = getIntent().getExtras().getString("grade2");

        ex2.setText(value2);









    }
}
