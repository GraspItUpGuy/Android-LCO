package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void RedPressed(View view){
        //Toast.makeText(this,"Okay !!!", Toast.LENGTH_SHORT).show();
        showCustomToast("Happy Birthday to you !!!");

    }
    public void showCustomToast(String string){
        // 2 lines always same for custom layouts
        LayoutInflater inflater  = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup)findViewById(R.id.toast_root));
        // get inflator and put an id on it
        TextView toastText = layout.findViewById(R.id.toast_text);
        toastText.setText(string);
        Toast toast = new Toast(this);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
    public void GreenPressed(View view){
           customToast2("how are you Android");
    }
    public void customToast2(String string){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.android_toast_layout, (ViewGroup) findViewById(R.id.android_toast_root));

        TextView toastText = layout.findViewById(R.id.android_toast_text);
        toastText.setText(string);

        Toast toast  = new Toast(this);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
    public void getDeveloper(View view){
        manCustomToast("A Puneet Kumar Product");
    }
    public void manCustomToast(String text){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.man_layout,(ViewGroup)findViewById(R.id.man_toast_root));

        TextView toastText =layout.findViewById(R.id.man_toast_text);
        toastText.setText(text);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}
