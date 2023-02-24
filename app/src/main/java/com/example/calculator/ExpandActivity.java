package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ExpandActivity extends MainActivity {
    TextView Calculator;
    TextView Result;
    Button brac;
    Button Deg;
    String res = "";
    TextView Radian;
//    private Object MainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expand_layout);
//        ExpandActivity my = new ExpandActivity();
//        Button Add = (Button) findViewById(R.id.add);
//        Button Sub = (Button) findViewById(R.id.sub);
//        Button Mul = (Button) findViewById(R.id.multiply);
//        Button div = (Button) findViewById(R.id.divide);
//        Button mod = (Button) findViewById(R.id.mod);
//
//        my.AddOnClick(Add);
//        my.MultiOnClick(Mul);
//        my.DivideOnClick(div);
//        my.SubOnClick(Sub);
//        my.ModOnClick(mod);
//        Calculator = findViewById(R.id.Calculator);
//        Result = findViewById(R.id.Result);
//        brac = findViewById(R.id.brac);
//        Deg = findViewById(R.id.Deg);
        Toast.makeText(this, "Working!", Toast.LENGTH_SHORT).show();
//        Radian = findViewById(R.id.Radian);
    }

//    public void result(String gv) {
//        TextView Cal = (TextView) findViewById(R.id.Calculator);
//        res = res + gv;
//        Cal.setText(res);
//    }
}

