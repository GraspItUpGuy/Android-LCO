package com.example.mybuttonapplication;// package declaration

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


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
                Context context = getApplicationContext();
                String text = "you just pressed blue button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,text,duration);
                toast.show();
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
        Context context = getApplicationContext();
        String text = "You just pressed Green button";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context,text,duration);
        toast.show();

    }
    public void DontTouch(View view){
      //  Log.d("test","Dont touch it : via method");
//        Context context = getApplicationContext();
//        CharSequence text = "Hello from the Android"; // string is also fine in here
//        int duration = Toast.LENGTH_SHORT;
//        Toast toast  = Toast.makeText(context, text,duration);
//        toast.show();
        Toast.makeText(getApplicationContext(),"Dont touch this !!!", Toast.LENGTH_SHORT).show();
    }
}
