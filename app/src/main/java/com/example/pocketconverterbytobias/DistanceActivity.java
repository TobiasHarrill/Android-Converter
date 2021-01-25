package com.example.pocketconverterbytobias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class DistanceActivity extends AppCompatActivity {



    Float amountEntered;
    Float kilometers;
    Float miles;
    Float inches;
    Float meters;
    Float yards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText amount = (EditText)findViewById(R.id.txtDistEntered);
        final TextView kilofinal = (TextView)findViewById(R.id.poundBox);
        final TextView milefinal = (TextView)findViewById(R.id.kiloBox);
        final TextView inchfinal = (TextView)findViewById(R.id.meterBox);
        final TextView meterfinal = (TextView)findViewById(R.id.tonsBox);
        final TextView yardfinal = (TextView)findViewById(R.id.yardBox);
        

        Button convert = (Button)findViewById(R.id.btnConvert);
        RadioGroup g = (RadioGroup) findViewById(R.id.radioBtnGroup);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amountEntered = Float.parseFloat(amount.getText().toString());

                switch (g.getCheckedRadioButtonId())
                {
                    case R.id.poundBtn:
                        //kilometer
                        kilometers = amountEntered * 1.609f;
                        kilofinal.setText(kilometers + " kilometers");

                        //mile
                        miles = amountEntered;
                        milefinal.setText(miles + " miles");

                        //inch
                        inches = amountEntered * 63360f;
                        inchfinal.setText(inches + " inches");

                        //meter
                        meters = amountEntered * 1609.34f;
                        meterfinal.setText(meters + " meters");

                        //yard
                        yards = amountEntered * 1760f;
                        yardfinal.setText(yards + " yards");
                        break;

                    case R.id.kiloBtn:
                        //kilometer
                        kilometers = amountEntered;
                        kilofinal.setText(kilometers + " kilometers");

                        //mile
                        miles = amountEntered * .621f;
                        milefinal.setText(miles + " miles");

                        //inch
                        inches = amountEntered * 39370.1f;
                        inchfinal.setText(inches + " inches");

                        //meter
                        meters = amountEntered * 1000f;
                        meterfinal.setText(meters + " meters");

                        //yard
                        yards = amountEntered * 1093.61f;
                        yardfinal.setText(yards + " yards");
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