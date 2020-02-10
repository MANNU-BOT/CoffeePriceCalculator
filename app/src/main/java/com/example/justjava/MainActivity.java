package com.example.justjava;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
int c=1,v=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitOrder(View view) {
        c=5*v;
        display(v);
        displayPrice(c);
        v++;
    }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}