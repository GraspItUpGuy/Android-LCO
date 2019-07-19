package com.example.dicerumble;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDicey;
    private Random myRandomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDicey = findViewById(R.id.imageView);
        imageViewDicey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rumbleDice();
            }
        });

    }
    private void rumbleDice(){
        int diceNumber = myRandomNumber.nextInt(6) + 1;
        switch(diceNumber){
            case 1 : imageViewDicey.setImageResource(R.drawable.dice1);
                     break;
            case 2 : imageViewDicey.setImageResource(R.drawable.dice2);
                break;
            case 3 : imageViewDicey.setImageResource(R.drawable.dice3);
                break;
            case 4 : imageViewDicey.setImageResource(R.drawable.dice4);
                break;
            case 5 : imageViewDicey.setImageResource(R.drawable.dice5);
                break;
            case 6 : imageViewDicey.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
