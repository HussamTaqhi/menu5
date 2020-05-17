package com.example.menu5;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OrderDetails extends AppCompatActivity {

    TextView listView, priceView;
    String list_choices;
    Double price_a, price_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details2);
        listView=(TextView) findViewById(R.id.listView);
        priceView=(TextView) findViewById(R.id.priceView);

        Bundle bundle=getIntent().getExtras();
        list_choices=bundle.getString("choice");
        price_a=bundle.getDouble("price");

        listView.setText(list_choices);
        priceView.setText(price_a.toString());

    }
}
