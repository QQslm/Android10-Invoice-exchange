package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    int month;
    int p1;
    int p2;
    int p3;
    int p4;
    int p5;
    int BTEXT;
    TextView display3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        display3= findViewById(R.id.textView3);// 取得目標物件
        month = intent.getIntExtra("month",0);
        BTEXT = intent.getIntExtra("BTEXT",0);
        if(month!=0){
            switch (month){
                case 1:
                    p1=21735266;p2=91874254;p3=56065209;p4=5739340;p5=69001612;
                    if(BTEXT==p1){
                        display3.setText("中獎金額:1000w");
                    break;}
                    if(BTEXT==p2) {
                        display3.setText("中獎金額:200w");
                    break;}

                    if(BTEXT==p3||BTEXT==p4||BTEXT==p5){
                        display3.setText("中獎金額:20w");
                    break;}
                    if(BTEXT%10000000==p3%10000000||BTEXT%10000000==p4%10000000||BTEXT%10000000==p5%10000000){
                        display3.setText("中獎金額:4w");
                    break;}
                    if(BTEXT%1000000==p3%1000000||BTEXT%1000000==p4%1000000||BTEXT%1000000==p5%1000000){
                        display3.setText("中獎金額:1w");
                    break;}
                    if(BTEXT%100000==p3%100000||BTEXT%100000==p4%100000||BTEXT%100000==p5%100000){
                        display3.setText("中獎金額:4k");
                    break;}
                    if(BTEXT%10000==p3%10000||BTEXT%10000==p4%10000||BTEXT%10000==p5%10000){
                        display3.setText("中獎金額:1k");
                    break;}
                    if(BTEXT%1000==p3||BTEXT%1000==p4%1000||BTEXT%1000==p5%1000||BTEXT==591||BTEXT==342){
                        display3.setText("中獎金額:200");
                    break;}
                    if(BTEXT%1000!=p3%1000||BTEXT%1000!=p4%1000||BTEXT%1000!=p5%1000){
                        display3.setText("中獎金額:再接再厲");
                    break;}
                case 2:
                    p1=12342126;p2=80740977;p3=36822639;p4=38786238;p5=87204837;
                    if(BTEXT==p1){
                        display3.setText("中獎金額:1000w");
                    break;}
                    if(BTEXT==p2){
                        display3.setText("中獎金額:200w");
                    break;}
                    if(BTEXT==p3||BTEXT==p4||BTEXT==p5){
                        display3.setText("中獎金額:20w");
                    break;}
                    if(BTEXT%10000000==p3%10000000||BTEXT%10000000==p4%10000000||BTEXT%10000000==p5%10000000){
                        display3.setText("中獎金額:4w");
                    break;}
                    if(BTEXT%1000000==p3%1000000||BTEXT%1000000==p4%1000000||BTEXT%1000000==p5%1000000){
                        display3.setText("中獎金額:1w");
                    break;}
                    if(BTEXT%100000==p3%100000||BTEXT%100000==p4%100000||BTEXT%100000==p5%100000){
                        display3.setText("中獎金額:4k");
                    break;}
                    if(BTEXT%10000==p3%10000||BTEXT%10000==p4%10000||BTEXT%10000==p5%10000){
                        display3.setText("中獎金額:1k");
                    break;}
                    if(BTEXT%1000==p3||BTEXT%1000==p4%1000||BTEXT%1000==p5%1000||BTEXT==991||BTEXT==715){
                        display3.setText("中獎金額:200");
                    break;}
                    if(BTEXT%1000!=p3%1000||BTEXT%1000!=p4%1000||BTEXT%1000!=p5%1000){
                        display3.setText("中獎金額:再接再厲");
                    break;}

                case 3:
                    p1=20048019;p2=02142605;p3=21240109;p4=78323535;p5=18549847;
                    if(BTEXT==p1){
                        display3.setText("中獎金額:1000w");
                    break;}
                    if(BTEXT==p2){
                        display3.setText("中獎金額:200w");
                    break;}
                    if(BTEXT==p3||BTEXT==p4||BTEXT==p5){
                        display3.setText("中獎金額:20w");
                    break;}
                    if(BTEXT%10000000==p3%10000000||BTEXT%10000000==p4%10000000||BTEXT%10000000==p5%10000000){
                        display3.setText("中獎金額:4w");
                    break;}
                    if(BTEXT%1000000==p3%1000000||BTEXT%1000000==p4%1000000||BTEXT%1000000==p5%1000000){
                        display3.setText("中獎金額:1w");
                    break;}
                    if(BTEXT%100000==p3%100000||BTEXT%100000==p4%100000||BTEXT%100000==p5%100000){
                        display3.setText("中獎金額:4k");
                    break;}
                    if(BTEXT%10000==p3%10000||BTEXT%10000==p4%10000||BTEXT%10000==p5%10000){
                        display3.setText("中獎金額:1k");
                    break;}
                    if(BTEXT%1000==p3||BTEXT%1000==p4%1000||BTEXT%1000==p5%1000||BTEXT==706||BTEXT==574){
                        display3.setText("中獎金額:200");
                    break;}
                    if(BTEXT%1000!=p3%1000||BTEXT%1000!=p4%1000||BTEXT%1000!=p5%1000){
                        display3.setText("中獎金額:再接再厲");
                    break;}

                case 4:

                    p1=73372972;p2=22315462;p3=91903003;p4=16228722;p5=3270598;
                    if(BTEXT==p1){
                        display3.setText("中獎金額:1000w");
                    break;}
                    if(BTEXT==p2){
                        display3.setText("中獎金額:200w");
                    break;}
                    if(BTEXT==p3||BTEXT==p4||BTEXT==p5){
                        display3.setText("中獎金額:20w");
                    break;}
                    if(BTEXT%10000000==p3%10000000||BTEXT%10000000==p4%10000000||BTEXT%10000000==p5%10000000){
                        display3.setText("中獎金額:4w");
                    break;}
                    if(BTEXT%1000000==p3%1000000||BTEXT%1000000==p4%1000000||BTEXT%1000000==p5%1000000){
                       display3.setText("中獎金額:1w");
                    break;}
                    if(BTEXT%100000==p3%100000||BTEXT%100000==p4%100000||BTEXT%100000==p5%100000){
                       display3.setText("中獎金額:4k");
                    break;}
                    if(BTEXT%10000==p3%10000||BTEXT%10000==p4%10000||BTEXT%10000==p5%10000){
                        display3.setText("中獎金額:1k");
                    break;}
                    if(BTEXT%1000==p3||BTEXT%1000==p4%1000||BTEXT%1000==p5%1000||BTEXT==163||BTEXT==983||BTEXT==814){
                        display3.setText("中獎金額:200");
                    break;}
                    if(BTEXT%1000!=p3%1000||BTEXT%1000!=p4%1000||BTEXT%1000!=p5%1000){
                        display3.setText("中獎金額:再接再厲");
                    break;}

                case 5:
                    p1=96363025;p2=69095110;p3=96745865;p4=98829035;p5=45984442;
                    if(BTEXT==p1){
                        display3.setText("中獎金額:1000w");
                    break;}
                    if(BTEXT==p2){
                        display3.setText("中獎金額:200w");
                    break;}
                    if(BTEXT==p3||BTEXT==p4||BTEXT==p5){
                        display3.setText("中獎金額:20w");
                    break;}
                    if(BTEXT%10000000==p3%10000000||BTEXT%10000000==p4%10000000||BTEXT%10000000==p5%10000000){
                        display3.setText("中獎金額:4w");
                    break;}
                    if(BTEXT%1000000==p3%1000000||BTEXT%1000000==p4%1000000||BTEXT%1000000==p5%1000000){
                        display3.setText("中獎金額:1w");
                    break;}
                    if(BTEXT%100000==p3%100000||BTEXT%100000==p4%100000||BTEXT%100000==p5%100000){
                        display3.setText("中獎金額:4k");
                    break;}
                    if(BTEXT%10000==p3%10000||BTEXT%10000==p4%10000||BTEXT%10000==p5%10000){
                        display3.setText("中獎金額:1k");
                    break;}
                    if(BTEXT%1000==p3||BTEXT%1000==p4%1000||BTEXT%1000==p5%1000||BTEXT==292||BTEXT==650||BTEXT==230){
                        display3.setText("中獎金額:200");
                    break;}
                    if(BTEXT%1000!=p3%1000||BTEXT%1000!=p4%1000||BTEXT%1000!=p5%1000){
                        display3.setText("中獎金額:再接再厲");
                break;}
                case 6:
                    p1=88515559;p2=47551146;p3=83513656;p4=85250862;p5=61472404;
                    if(BTEXT==p1){
                        display3.setText("中獎金額:1000w");
                    break;}
                    if(BTEXT==p2){
                        display3.setText("中獎金額:200w");
                    break;}
                    if(BTEXT==p3||BTEXT==p4||BTEXT==p5){
                        display3.setText("中獎金額:20w");
                    break;}
                    if(BTEXT%10000000==p3%10000000||BTEXT%10000000==p4%10000000||BTEXT%10000000==p5%10000000){
                        display3.setText("中獎金額:4w");
                    break;}
                    if(BTEXT%1000000==p3%1000000||BTEXT%1000000==p4%1000000||BTEXT%1000000==p5%1000000){
                        display3.setText("中獎金額:1w");
                    break;}
                    if(BTEXT%100000==p3%100000||BTEXT%100000==p4%100000||BTEXT%100000==p5%100000){
                        display3.setText("中獎金額:4k");
                    break;}
                    if(BTEXT%10000==p3%10000||BTEXT%10000==p4%10000||BTEXT%10000==p5%10000){
                        display3.setText("中獎金額:1k");
                    break;}
                    if(BTEXT%1000==p3||BTEXT%1000==p4%1000||BTEXT%1000==p5%1000||BTEXT==185||BTEXT==79||BTEXT==442){
                        display3.setText("中獎金額:200");
                    break;}
                    if(BTEXT%1000!=p3%1000||BTEXT%1000!=p4%1000||BTEXT%1000!=p5%1000){
                        display3.setText("中獎金額:再接再厲");
                    break;}
            }
        }
    }
    public void backtoA  (View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity3.this, MainActivity.class);
        startActivity(intent);
    }
    public void backtoB  (View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity3.this, MainActivity2.class);
        intent.putExtra("month", month);
        startActivity(intent);
    }

}