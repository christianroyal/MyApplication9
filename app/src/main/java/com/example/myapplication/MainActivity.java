package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Declare our Variables

    Button btn0,btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnadd, btnsub, btndiv, btnmul, btneql, btn10,btnC;
    TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// intialize our button
        btnC=findViewById(R.id.buttonC);
        btn0=findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn10 = findViewById(R.id.button10);
        btnadd = findViewById(R.id.buttonadd);
        btnsub = findViewById(R.id.buttonsub);
        btndiv = findViewById(R.id.buttondiv);
        btnmul = findViewById(R.id.buttonmul);
        btneql = findViewById(R.id.buttoneql);
        display = findViewById(R.id.textview_display);
        btnC.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btneql.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnmul.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button0:
                display.append("0");
                break;
            case R.id.button1:
                display.append("1");
                break;
            case R.id.button2:
                display.append("2");
                break;
            case R.id.button3:
                display.append("3");
                break;
            case R.id.button4:
                display.append("4");
                break;
            case R.id.button5:
                display.append("5");
                break;
            case R.id.button6:
                display.append("6");
                break;
            case R.id.button7:
                display.append("7");
                break;
            case R.id.button8:
                display.append("8");
                break;
            case R.id.button9:
                display.append("9");
                break;
            case R.id.button10:
                display.append(".");
                break;
            case R.id.buttondiv:
                display.append("/");
                break;
            case R.id.buttoneql:
                display.append("=");
                break;
            case R.id.buttonsub:
                display.append("-");
                break;
            case R.id.buttonmul:
                display.append("*");
                break;
            case R.id.buttonadd:
                display.append("+");
                break;
            case R.id.buttonC:
                display.setText(" ");
                break;
        }

    }

}

