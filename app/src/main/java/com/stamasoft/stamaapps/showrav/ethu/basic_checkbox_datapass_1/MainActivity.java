package com.stamasoft.stamaapps.showrav.ethu.basic_checkbox_datapass_1;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CheckBox ch1,ch2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1=(CheckBox)findViewById(R.id.checkBox1);
        ch2=(CheckBox)findViewById(R.id.checkBox2);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);


        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                /*//way one to show by Toast status--
                StringBuffer result = new StringBuffer();
                result.append("Thanks : ").append(ch1.isChecked());
                result.append("\nThanks: ").append(ch2.isChecked());

                Toast.makeText(MainActivity.this, result.toString(),Toast.LENGTH_LONG).show();
            */



                CheckBox ch1 = (CheckBox)findViewById(R.id.checkBox1);
                CheckBox ch2 = (CheckBox)findViewById(R.id.checkBox2);


                Intent intent = new Intent(MainActivity.this, SecondActivity.class);


                if(ch1.isChecked()){
                    String result = "Rigth Answer You win $10000 usd";
                    intent.putExtra("grade1", result);

                }
                 if(ch2.isChecked()){
                    String result2 = "Wrong Answer you can't merry in our life";

                    //if want to show same place
                   // intent.putExtra("grade1", result2);
                     //if want to show another view
                     intent.putExtra("grade2", result2);
                }


              //  intent.putExtra("grade1", ch1.isChecked());
              //  intent.putExtra("grade2", ch2.isChecked());













                //--------------------------------------
                startActivity(intent);












            }
        });


        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });




    }
}
