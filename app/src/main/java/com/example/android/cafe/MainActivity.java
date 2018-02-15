package com.example.android.cafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantityCoffee = 0;
    int quantityDessert = 0;
    int quantityWater = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementCoffee(View view) {
        quantityCoffee += 1;
        displayQuantityCoffee(quantityCoffee);
        displayPriceCoffee(quantityCoffee);
    }

    public void decrementCoffee(View view) {
        quantityCoffee -= 1;
        displayQuantityCoffee(quantityCoffee);
        displayPriceCoffee(quantityCoffee);
    }

    public void incrementDessert(View view) {
        quantityDessert += 1;
        displayQuantityDessert(quantityDessert);
        displayPriceDessert(quantityDessert);
    }

    public void decrementDessert(View view) {
        quantityDessert -= 1;
        displayQuantityDessert(quantityDessert);
        displayPriceDessert(quantityDessert);
    }

    public void incrementWater(View view) {
        quantityWater += 1;
        displayQuantityWater(quantityWater);
        displayPriceWater(quantityWater);
    }

    public void decrementWater(View view) {
        quantityWater -= 1;
        displayQuantityWater(quantityWater);
        displayPriceWater(quantityWater);
    }

    public void submitOrder(View view) {
        int priceCoffee = quantityCoffee * 5;
        int priceDessert = quantityDessert * 3;
        int priceWater = quantityWater * 1;
        int totalPrice = priceCoffee + priceDessert + priceWater;
        displayTotalPrice(totalPrice);
    }

    private void displayQuantityCoffee(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_coffee);
        quantityTextView.setText("" + number);
    }

    private void displayQuantityDessert(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_dessert);
        quantityTextView.setText("" + number);
    }

    private void displayQuantityWater(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_water);
        quantityTextView.setText("" + number);
    }

    private void displayPriceCoffee(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_coffee);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number * 5));
    }

    private void displayPriceDessert(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_dessert);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number * 3));
    }

    private void displayPriceWater(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_water);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number * 1));
    }

    private void displayTotalPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.total_price);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}
