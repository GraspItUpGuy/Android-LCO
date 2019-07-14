package com.example.mybuttonapplication;// package declaration

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

   // Button button; // declareing the button
    Button Btn1;
   //Button Btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // we write our code here
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        button = findViewById(R.id.mybtn); // found the button by ID
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Log.d("test", "Clicked");
//            }
//        });  // event listener on button
        Btn1 = findViewById(R.id.myBtn1);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("test1", "Blue Button clicked");
            }
        });

//        Btn2 = findViewById(R.id.myBtn2);
//        Btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("test 3", "Green Button clicked");
//            }
//        });
    }
    public void GreenPressed(View view){
        Log.d("test","Green going strong via method");

    }
    public void DontTouch(View view){
        Log.d("test","Dont touch it : via method");
    }
}
