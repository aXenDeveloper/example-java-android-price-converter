package com.example.priceconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeMoney(View view) {
        EditText plnEditText = findViewById(R.id.plnEditText);
        String plnString = plnEditText.getText().toString();

        int plnInt = Integer.parseInt(plnString);
        double usdFloat = plnInt * 0.20;
        String convertConvertToString = Double.toString(usdFloat);

        Toast.makeText(this, convertConvertToString + "$", Toast.LENGTH_LONG).show();
    }
}