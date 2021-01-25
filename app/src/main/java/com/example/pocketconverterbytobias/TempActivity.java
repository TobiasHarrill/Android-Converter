package com.example.pocketconverterbytobias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TempActivity extends AppCompatActivity {



    Float amountEntered;
    Float fahrenheit;
    Float celsius;
    Float kelvin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText amount = (EditText)findViewById(R.id.txtDistEntered);
        final TextView fahrfinal = (TextView)findViewById(R.id.poundBox);
        final TextView celsfinal = (TextView)findViewById(R.id.kiloBox);
        final TextView kelvfinal = (TextView)findViewById(R.id.tonsBox);


        Button convert = (Button)findViewById(R.id.btnConvert);
        RadioGroup g = (RadioGroup) findViewById(R.id.radioBtnGroup);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amountEntered = Float.parseFloat(amount.getText().toString());

                switch (g.getCheckedRadioButtonId())
                {
                    case R.id.poundBtn:
                        //fahrenheit
                        fahrenheit = amountEntered;
                        fahrfinal.setText(fahrenheit + " fahrenheit");

                        //celsius
                        celsius = (amountEntered - 32f) * (5f/9f);
                        celsfinal.setText(celsius + " celsius");

                        //kelvin
                        kelvin = (amountEntered - 32f) * (5f/9f) + 273.15f;
                        kelvfinal.setText(kelvin + " kelvin");

                        break;

                    case R.id.kiloBtn:
                        //fahrenheit
                        fahrenheit = (amountEntered + (9f/5f)) + 32f;
                        fahrfinal.setText(fahrenheit + " fahrenheit");

                        //celsius
                        celsius = amountEntered;
                        celsfinal.setText(celsius + " celsius");

                        //kelvin
                        kelvin = amountEntered + 273.15f;
                        kelvfinal.setText(kelvin + " kelvin");
                        break;


                    default:
                        Toast.makeText(getBaseContext(),
                                "Click a radio Button",
                                Toast.LENGTH_SHORT).show();
                        break;


                }


            }
        });
    }
}