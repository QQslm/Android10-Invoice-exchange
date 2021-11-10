package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    int month;
    EditText B_Input_Text;
    int BTEXT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        month = intent.getIntExtra("month",0);
        TextView display1= findViewById(R.id.textView);// 取得目標物件

        if(month!=0){
            switch (month){
                case 1:
                    display1.setText("特別獎:21735266\r\n特獎    :91874254\r\n頭獎    :56065209\r\n             05739340\r\n             69001612\r\n增開六獎:  591 342");
                    break;
                case 2:
                    display1.setText("特別獎:12342126\r\n特獎    :80740977\r\n頭獎    :36822639\r\n             38786238\r\n             87204837\r\n增開六獎:  991 715");

                    break;
                case 3:
                    display1.setText("特別獎:20048019\r\n特獎    :02142605\r\n頭獎    :21240109\r\n             78323535\r\n             18549847\r\n增開六獎:  706 574");

                    break;
                case 4:
                    display1.setText("特別獎:73372972\r\n特獎    :22315462\r\n頭獎    :91903003\r\n             16228722\r\n             03270598\r\n增開六獎:  163 983 814");

                    break;
                case 5:
                    display1.setText("特別獎:96363025\r\n特獎    :69095110\r\n頭獎    :96745865\r\n             98829035\r\n             45984442\r\n增開六獎:  292 650 230");

                    break;
                case 6:
                    display1.setText("特別獎:88515559\r\n特獎    :47551146\r\n頭獎    :83513656\r\n             85250862\r\n             61472404\r\n增開六獎:  185 079 442");

                    break;
            }
        }
    }
    public void backtoA  (View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
    public void gotoC  (View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity2.this, MainActivity3.class);
        B_Input_Text = findViewById(R.id.editTextTextPersonName);// 取得目標物件
        if (!("".equals(B_Input_Text.getText().toString()))) {
            //BTEXT=B_Input_Text.getText().toString();//獲取B_Input_Text的字串資料
            BTEXT = Integer.parseInt(B_Input_Text.getText().toString());
            intent.putExtra("BTEXT", BTEXT);
            intent.putExtra("month", month);
        }
        startActivity(intent);
    }
}