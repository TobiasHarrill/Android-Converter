package com.example.pocketconverterbytobias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class WeightActivity extends AppCompatActivity {



    Float amountEntered;
    Float pounds;
    Float kilograms;
    Float tons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText amount = (EditText)findViewById(R.id.txtDistEntered);
        final TextView poundsfinal = (TextView)findViewById(R.id.poundBox);
        final TextView kilofinal = (TextView)findViewById(R.id.kiloBox);
        final TextView tonfinal = (TextView)findViewById(R.id.tonsBox);


        Button convert = (Button)findViewById(R.id.btnConvert);
        RadioGroup g = (RadioGroup) findViewById(R.id.radioBtnGroup);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amountEntered = Float.parseFloat(amount.getText().toString());

                switch (g.getCheckedRadioButtonId())
                {
                    case R.id.poundBtn:
                        //pounds
                        pounds = amountEntered;
                        poundsfinal.setText(pounds + " pounds");

                        //kilograms
                        kilograms = amountEntered * .453592f ;
                        kilofinal.setText(kilograms + " kilograms");

                        //tons
                        tons = amountEntered *.0005f;
                        tonfinal.setText(tons + " tons");

                        break;

                    case R.id.kiloBtn:
                        //pounds
                        pounds = amountEntered * 2.204f;
                        poundsfinal.setText(pounds + " pounds");

                        //kilograms
                        kilograms = amountEntered;
                        kilofinal.setText(kilograms + " kilograms");

                        //tons
                        tons = amountEntered *.0011f;
                        tonfinal.setText(tons + " tons");
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