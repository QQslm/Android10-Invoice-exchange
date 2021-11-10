package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int month;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void verify  (View view){
        try{
            if (month!=0){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);
                intent.putExtra("month", month);
                startActivity(intent);
            }
        }
        catch(Exception e){
            Toast.makeText(this, "PLEASE CHOICE A MONTH FIRST", Toast.LENGTH_SHORT).show();
        }
    }

    public void Select_month1  (View view){
        month=1;
    }
    public void Select_month2  (View view){
        month=2;
    }
    public void Select_month3  (View view){
        month=3;
    }
    public void Select_month4  (View view){
        month=4;
    }
    public void Select_month5  (View view){
        month=5;
    }
    public void Select_month6  (View view){
        month=6;
    }
}