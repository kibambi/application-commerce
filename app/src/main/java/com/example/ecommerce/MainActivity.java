package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.evenemet();

    }
    public void evenemet(){
        ImageView im1 = (ImageView)findViewById(R.id.imageView3);
        Button b1 = (Button)findViewById(R.id.button2);
        Button b2 = (Button)findViewById(R.id.button3);
        Button b3 = (Button)findViewById(R.id.button4);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Chemise", Toast.LENGTH_SHORT);
                b3.setText("Achat effectué");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Chemise", Toast.LENGTH_SHORT);
                b2.setText("Achat effectué");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Chemise", Toast.LENGTH_SHORT);
                b1.setText("Achat effectué");
            }
        });


        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Chemise", Toast.LENGTH_LONG);
            }
        });
    }
}