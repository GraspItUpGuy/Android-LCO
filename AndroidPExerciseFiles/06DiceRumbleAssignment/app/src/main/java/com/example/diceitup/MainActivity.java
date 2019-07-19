package com.example.diceitup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random randomNumber = new Random();
   private ImageView dice1;
   private ImageView dice2;
   private Button throwDice ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dice1 = findViewById(R.id.dice1);
        dice2 = findViewById(R.id.dice2);
        throwDice = findViewById(R.id.RumbleIt);
        throwDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RumbleItUp();
            }
        });
    }
    private void RumbleItUp(){
       int  diceNumber1 =randomNumber.nextInt(6) + 1;
       int  diceNumber2 =randomNumber.nextInt(6) + 1;
       switch (diceNumber1){
           case 1 : dice1.setImageResource(R.drawable.dice1);
           break;
           case 2 : dice1.setImageResource(R.drawable.dice2);
               break;
           case 3 : dice1.setImageResource(R.drawable.dice3);
               break;
           case 4 : dice1.setImageResource(R.drawable.dice4);
               break;
           case 5 : dice1.setImageResource(R.drawable.dice5);
               break;
           case 6 : dice1.setImageResource(R.drawable.dice6);
               break;

        }
        switch (diceNumber2){
            case 1 : dice2.setImageResource(R.drawable.dice1);
                break;
            case 2 : dice2.setImageResource(R.drawable.dice2);
                break;
            case 3 : dice2.setImageResource(R.drawable.dice3);
                break;
            case 4 : dice2.setImageResource(R.drawable.dice4);
                break;
            case 5 : dice2.setImageResource(R.drawable.dice5);
                break;
            case 6 : dice2.setImageResource(R.drawable.dice6);
                break;

        }
    }
}
