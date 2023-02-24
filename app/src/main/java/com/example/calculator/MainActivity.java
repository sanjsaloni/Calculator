package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class MainActivity extends AppCompatActivity {
    TextView Calculator;
    TextView Result;
    Button brac;
    Button Deg;
    String res = "";
    TextView Radian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calculator = findViewById(R.id.Calculator);
        Result = findViewById(R.id.Result);
        brac = findViewById(R.id.brac);
        Deg = findViewById(R.id.Deg);
        Radian = findViewById(R.id.Radian);
    }
    public void result(String gv) {
        res = res + gv;
        Calculator.setText(res);
    }

    public void BracOnClick(View view) {
        Button brac = new Button(this);
        brac.setTag(0);
        if (res.contains("("))
            brac.setTag(1);
        final int s = (Integer) brac.getTag();
        switch (s) {
            case 0:
                result("(");
                brac.setTag(1);
                break;
            case 1:
                result(")");
                brac.setTag(0);
                break;
        }
    }

    public void ClearOnClick(View view) {
        Calculator.setText("CALCULATOR");
        res = "";
        Result.setText("");
    }

    public void ExpandOnClick(View view) {
        setContentView(R.layout.expand_layout);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }


    public void ModOnClick(View view) {
        result("%");
    }
    public void DivideOnClick(View view) {
        result("/");
    }

    public void OneOnClick(View view) {
        result("1");
    }

    public void SevenOnClick(View view) {
        result("7");
    }

    public void SixOnClick(View view) {
        result("6");
    }

    public void FiveOnClick(View view) {
        result("5");
    }

    public void FourOnClick(View view) {
        result("4");
    }

    public void ThreeOnClick(View view) {
        result("3");
    }

    public void TwoOnClick(View view) {
        result("2");
    }

    public void MultiOnClick(View view) {
        result("*");
    }

    public void AddOnClick(View view) {
        result("+");
    }

    public void SubOnClick(View view) {
        result("-");
    }

    public void equalsOnClick(View view) {
        Double result = null;
        ScriptEngine en = new ScriptEngineManager().getEngineByName("rhino");
        try {
            result = (double) en.eval(res);
        } catch (ScriptException e) {
            Toast.makeText(this, "Invalid Expression", Toast.LENGTH_SHORT).show();
        }
        String R = String.valueOf(result.doubleValue());
        if (R != null && !R.contains(".0")) {
            Result.setText(R);
        } else {
            int n = (int) Math.round(result);
            Result.setText(String.valueOf(n));

        }
    }

    public void DecOnClick(View view) {
        result(".");
    }

    public void EightOnClick(View view) {
        result("8");
    }

    public void NineOnClick(View view) {
        result("9");
    }

    public void ZeroOnClick(View view) {
        result("0");
    }

    public void BackOnClick(View view) {
//        brac =findViewById(R.id.brac);
        Button brac = new Button(this);
        String ss = Calculator.getText().toString();
        if (ss.length() > 0) {
            Calculator.setText(ss.substring(0, ss.length() - 1));
            res = res.substring(0, res.length() - 1);
            brac.setTag(0);
        }
    }

        public void FactOnClick(View view) {
    }
    public void PowerOnClick(View view) {
    }
    public void DerOnClick(View view) {
    }
    public void ExpoOnClick(View view) {
    }
    public void LnOnClick(View view) {
    }
    public void LimOnClick(View view) {
    }
    public void RootOnClick(View view) {
    }
    public void TanOnClick(View view) {
    }
    public void SinOnClick(View view) {
    }
    public void CosOnClick(View view) {
        Toast.makeText(this, "This is working", Toast.LENGTH_SHORT).show();
        result("Cos(");
    }

    public void DegOnClick(View view) {
        Button b = (Button) view;
        TextView radian;
        radian = findViewById(R.id.Radian);
//        TextView Radian =new TextView(this);
        b.setTag(0);
        final String t = (String) b.getText();
        if (t == "DEG") {
            b.setText("RAD");
            radian.setText("Rad");
        } else {
            b.setText("DEG");
            radian.setText("Deg");
        }
    }

    public void LogOnClick(View view) {
    }

    public void InverseOnClick(View view) {
        Button b=(Button) view;
        b.setTag(0);
        final int i=(Integer) b.getTag();
        if(i==0){
            setContentView(R.layout.activity_main2);
            b.setTag(1);
        }
        if(i==1){
            setContentView(R.layout.expand_layout);
            b.setTag(0);
        }

    }

    public void PiOnClick(View view) {
    }
}