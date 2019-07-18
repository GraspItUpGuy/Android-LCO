package com.example.customgraddle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

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
                Toast.makeText(this,"Login failed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.succBtn :
                Toast.makeText(this,"Login Successful", Toast.LENGTH_SHORT).show();
                break;
            case R.id.infoBtn :
                Toast.makeText(this,"Not a lot of info to show", Toast.LENGTH_SHORT).show();
                break;
            case R.id.warnBtn :
                Toast.makeText(this,"OopsS  : this should not have happened", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imgBtn :
                Toast.makeText(this,"Upload your ugly image", Toast.LENGTH_SHORT ).show();
                break;
        }
    }
}
