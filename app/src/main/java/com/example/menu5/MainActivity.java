package com.example.menu5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button noodles,biryani,naan,butterChicken,iceCream,gheeRice,friedRice;
    String choice = "";
    int num_choice_noodles=0,num_choice_naan=0,num_choice_biryani=0,num_choice_butterChicken=0,num_choice_iceCream=0,num_choice_gheeRice=0,num_choice_friedRice=0;
    Double price=0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noodles=(Button) findViewById(R.id.noodles);
        biryani=(Button) findViewById(R.id.biryani);
        naan=(Button) findViewById(R.id.naan);
        butterChicken=(Button) findViewById(R.id.butterChicken);
        iceCream=(Button) findViewById(R.id.iceCream);
        gheeRice=(Button) findViewById(R.id.gheeRice);
        friedRice=(Button) findViewById(R.id.friedRice);
    }

    public void add_to_list(View view) {
        if (view == findViewById(R.id.noodles)) {
            Toast.makeText(this, "Noodles Added", Toast.LENGTH_SHORT).show();
            num_choice_noodles=num_choice_noodles+1;
            choice = choice + "Noodles " + "(" + num_choice_noodles + ")" + "\n";
            price = price + 100;
        }
        if (view == findViewById(R.id.naan)) {
            Toast.makeText(this, "Naan Added", Toast.LENGTH_SHORT).show();
            num_choice_naan=num_choice_naan+1;
            choice = choice + "Naan " + "(" + num_choice_naan + ")" + "\n";
            price = price + 50;
        }
        if (view == findViewById(R.id.biryani)) {
            Toast.makeText(this, "Some Biryani Added", Toast.LENGTH_SHORT).show();
            num_choice_biryani=num_choice_biryani+1;
            choice = choice + "Biryani " + "(" + num_choice_biryani + ")" + "\n";
            price = price + 300;
        }
        if (view == findViewById(R.id.butterChicken)) {
            Toast.makeText(this, "Butter Chickaaan Added", Toast.LENGTH_SHORT).show();
            num_choice_butterChicken=num_choice_butterChicken+1;
            choice = choice + "Butter Chicken " + "(" + num_choice_butterChicken + ")" + "\n";
            price = price + 400;
        }
        if (view == findViewById(R.id.iceCream)) {
            Toast.makeText(this, "Ice Cream Added", Toast.LENGTH_SHORT).show();
            num_choice_iceCream=num_choice_iceCream+1;
            choice = choice + "Ice Cream " + "(" + num_choice_iceCream + ")" + "\n";
            price = price + 50;
        }
        if (view == findViewById(R.id.gheeRice)) {
            Toast.makeText(this, "Ghee Rice Added", Toast.LENGTH_SHORT).show();
            num_choice_gheeRice=num_choice_gheeRice+1;
            choice = choice + "Ghee Rice " + "(" + num_choice_gheeRice + ")" + "\n";
            price = price + 70;
        }
        if (view == findViewById(R.id.friedRice)) {
            Toast.makeText(this, "Fried Rice Added", Toast.LENGTH_SHORT).show();
            num_choice_friedRice=num_choice_friedRice+1;
            choice = choice + "Fried Rice " + "(" + num_choice_friedRice + ")" + "\n";
            price = price + 100;
        }
    }

    public void placeOrder(View view)
    {
        Intent i= new Intent(MainActivity.this,OrderDetails.class);
        Bundle bundle=new Bundle();
        bundle.putString("choice",choice);
        bundle.putDouble("price",price);
        i.putExtras(bundle);
        startActivity(i);


    }

}
