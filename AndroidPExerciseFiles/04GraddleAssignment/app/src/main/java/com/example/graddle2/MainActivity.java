package com.example.graddle2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast(View view){
        switch (view.getId()){
            case R.id.errBtn :
                Toast.makeText(getApplicationContext(), "this is error button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.succbtn :
                Toast.makeText(getApplicationContext(), "this is success button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.infoBtn:
                Toast.makeText(getApplicationContext(), "this is info button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.warnBtn:
                Toast.makeText(getApplicationContext(), "this is warn button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.idiotBtn :
                Toast.makeText(getApplicationContext(), "this is idiot button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.getOutBtn :
                Toast.makeText(getApplicationContext(), "this is get out button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.stillBtn :
                Toast.makeText(getApplicationContext(), "this is stull here button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.stayBtn :
                Toast.makeText(getApplicationContext(), "this is stay button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fuckOffBtn :
                Toast.makeText(getApplicationContext(), "this is fuck off button", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
