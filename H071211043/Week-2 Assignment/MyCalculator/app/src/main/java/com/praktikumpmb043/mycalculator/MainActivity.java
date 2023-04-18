package com.praktikumpmb043.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    TextView resultText;
    Button btnDvd, btnTms, btnMns,
            btnPls, btnEqls;
    Button btn0, btn1, btn2, btn3, btn4,
            btn5, btn6, btn7, btn8, btn9;
    Button btnAC, btnC;
    double finalResult = 0;
    Boolean isOperator = false;
    String operator, num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultText = findViewById(R.id.resultText);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnPls = findViewById(R.id.btnPls);
        btnMns = findViewById(R.id.btnMns);
        btnTms = findViewById(R.id.btnTms);
        btnDvd = findViewById(R.id.btnDvd);
        btnEqls = findViewById(R.id.btnEqls);

        btnAC = findViewById(R.id.btnAC);
        btnC = findViewById(R.id.btnC);

//        Operator Section
        btnPls.setOnClickListener(view -> onClick(view));
        btnMns.setOnClickListener(view -> onClick(view));
        btnTms.setOnClickListener(view -> onClick(view));
        btnDvd.setOnClickListener(view -> onClick(view));

//        Number Section
        btn0.setOnClickListener(view -> numClick(view));
        btn1.setOnClickListener(view -> numClick(view));
        btn2.setOnClickListener(view -> numClick(view));
        btn3.setOnClickListener(view -> numClick(view));
        btn4.setOnClickListener(view -> numClick(view));
        btn5.setOnClickListener(view -> numClick(view));
        btn6.setOnClickListener(view -> numClick(view));
        btn7.setOnClickListener(view -> numClick(view));
        btn8.setOnClickListener(view -> numClick(view));
        btn9.setOnClickListener(view -> numClick(view));


//        Clear Section
        btnAC.setOnClickListener(view -> cClick(view));
        btnC.setOnClickListener(view -> cClick(view));

//        Equal Click
        btnEqls.setOnClickListener(view -> equalClick(view));
    }

    void onClick(View view){
        Button btn = (Button) view;
        String result = resultText.getText().toString();

        if (!isOperator){
            String text = result + " " + btn.getText().toString() + " ";
            resultText.setText(text);
            operator = btn.getText().toString();
            isOperator = true;
        }else if(lastChar(result, 1, operator)){
            operator = btn.getText().toString();
            resultText.setText(result.substring(0, result.length()-1) + btn.getText().toString());
        }
    }

    void numClick(View view) {
        Button btn = (Button) view;
        String result = resultText.getText().toString();
        String text = result + btn.getText().toString();

        if (result.equals("0")) {
            resultText.setText(btn.getText().toString());
        } else {
            resultText.setText(text);
        }
    }

    void cClick(View view){
        Button btn = (Button) view;
        String result = resultText.getText().toString();
        if (btn.getText().toString().equals("AC")){
            resultText.setText("0");
            isOperator = false;
        }else if(btn.getText().toString().equals("C")){
            if (result.length() > 1){
                if (lastChar(result, 1, " ")){
                    if (result.length() <= 2){
                        resultText.setText("0");
                    }else{
                        resultText.setText(result.substring(0,result.length()-2));
                    }
                }else{
                    resultText.setText(result.substring(0,result.length()-1));
                }
            }else{
                resultText.setText("0");
            }

        }
    }
    void equalClick (View view){
        try {
            calculate(resultText.getText().toString());
            if (finalResult % 1 == 0) {
                resultText.setText(String.valueOf((int) finalResult));
            } else {
                resultText.setText(String.valueOf(finalResult));
            }
            isOperator = false;
        } catch (Exception e) {
            Toast.makeText(this, "Masukkan Angka Dulu", Toast.LENGTH_SHORT).show();
        }
    }

    void calculate(String calculate){
        String result = resultText.getText().toString();

        if (result.substring(0, 2).equals("-")) {
            String[] value = result.substring(2).split("[+÷×-]");
            num1 = "-" + value[0];
            num2 = value[1];
        }else{
            String[] value = result.split("[+÷×-]");
            num1 = value[0];
            num2 = value[1];
        }

        char operator = result.charAt(num1.length());
        switch (String.valueOf(operator)){
            case "+":
                finalResult = Double.parseDouble(num1) + Double.parseDouble(num2);
                break;
            case "-":
                finalResult = Double.parseDouble(num1) - Double.parseDouble(num2);
                break;
            case "×":
                finalResult = Double.parseDouble(num1) * Double.parseDouble(num2);
                break;
            case "÷":
                finalResult = Double.parseDouble(num1) / Double.parseDouble(num2);
                break;
        }
    }

    boolean lastChar(String string, Integer whatCharIndex, String equal){
        if (string.substring(string.length()-whatCharIndex).equals(equal)){
            return true;
        }else{
            return false;
        }
    }


}