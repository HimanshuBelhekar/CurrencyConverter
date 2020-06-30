package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view){
        Log.i("Info","Button Clicked");

        EditText dollar = (EditText) findViewById(R.id.editTextNumber);
        double dollarVar = Double.parseDouble(dollar.getText().toString());
        double rupeeVar = dollarVar*75;

        Toast.makeText(this, "Rupee = " + Double.toString(rupeeVar), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}