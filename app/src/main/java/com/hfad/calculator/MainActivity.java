package com.hfad.calculator;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    //create variable
    TextView DisplayHeader;
    TextView DisplayAnswer;
    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    Button btn_clear, btn_add, btn_sub, btn_div, btn_mult, btn_equal;

    double num1, num2;
    boolean op_add, op_sub, op_div, op_mult;       //decide if input number is new value

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //decimalFormat = new DecimalFormat("#.########");
        //DataBindingUtil.setContentView(this, R.layout.activity_main);

        //display
        DisplayHeader = findViewById(R.id.DisplayHeader);
        DisplayAnswer = findViewById(R.id.DisplayAnswer);

        //buttons
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

        btn_clear = findViewById(R.id.btn_clear);
        btn_add = findViewById(R.id.btn_Addition);
        btn_sub = findViewById(R.id.btn_Subtract);
        btn_div = findViewById(R.id.btn_Division);
        btn_mult = findViewById(R.id.btn_Multiply);
        btn_equal = findViewById(R.id.btn_Equals);

        //bind buttons to track press
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);

        btn_clear.setOnClickListener(this);
        btn_add.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_mult.setOnClickListener(this);
        btn_equal.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String inputDisplay = (String) DisplayHeader.getText();

        switch (v.getId()) {
            case R.id.btn_0:
                DisplayHeader.setText(inputDisplay + btn_0.getText());
                //binding.DisplayHeader.setText(inputDisplay + btn_0.getText());
                break;
            case R.id.btn_1:
                DisplayHeader.setText(inputDisplay + btn_1.getText());
                //binding.DisplayHeader.setText(inputDisplay + btn_1.getText());
                break;
            case R.id.btn_2:
                DisplayHeader.setText(inputDisplay + btn_2.getText());
                //binding.DisplayHeader.setText(inputDisplay + btn_2.getText());

                break;
            case R.id.btn_3:
                DisplayHeader.setText(inputDisplay + btn_3.getText());
                //binding.DisplayHeader.setText(inputDisplay + btn_3.getText());

                break;
            case R.id.btn_4:
                DisplayHeader.setText(inputDisplay + btn_4.getText());
                //binding.DisplayHeader.setText(inputDisplay + btn_4.getText());

                break;
            case R.id.btn_5:
                DisplayHeader.setText(inputDisplay + btn_5.getText());
                //binding.DisplayHeader.setText(inputDisplay + btn_5.getText());

                break;
            case R.id.btn_6:
                DisplayHeader.setText(inputDisplay + btn_6.getText());
                //binding.DisplayHeader.setText(inputDisplay + btn_6.getText());

                break;
            case R.id.btn_7:
                DisplayHeader.setText(inputDisplay + btn_7.getText());
                //binding.DisplayHeader.setText(inputDisplay + btn_7.getText());

                break;
            case R.id.btn_8:
                DisplayHeader.setText(inputDisplay + btn_8.getText());
                //binding.DisplayHeader.setText(inputDisplay + btn_8.getText());

                break;
            case R.id.btn_9:
                DisplayHeader.setText(inputDisplay + btn_9.getText());
                //binding.DisplayHeader.setText(inputDisplay + btn_9.getText());

                break;

            //operations
            case R.id.btn_clear:
                DisplayHeader.setText("");
                DisplayAnswer.setText("");

                break;
            case R.id.btn_Addition:
                DisplayHeader.setText(inputDisplay + btn_add.getText());
                op_add = true;
                break;

            case R.id.btn_Subtract:
//                DisplayHeader.setText((String)DisplayHeader.getText()+btn_sub.getText());
                DisplayHeader.setText(inputDisplay + btn_sub.getText());
                op_sub = true;
                break;
            case R.id.btn_Division:
//                DisplayHeader.setText((String)DisplayHeader.getText()+btn_sub.getText());
                DisplayHeader.setText(inputDisplay + btn_div.getText());
                op_div = true;
                break;
            case R.id.btn_Multiply:
//                DisplayHeader.setText((String)DisplayHeader.getText()+btn_sub.getText());
                DisplayHeader.setText(inputDisplay + btn_mult.getText());
                op_mult = true;
                break;
            case R.id.btn_Equals:
                clickCalculation((String) DisplayHeader.getText());
                break;

        }
    }

    @SuppressLint("NewApi")
    private void clickCalculation(String text) {
        double result;

        if (op_add == true) {
            //DisplayHeader.setText(num1 + num2 + "");
            String[] SplitParts = text.split("\\+");
            num1 = Double.parseDouble(SplitParts[0]);
            num2 = Double.parseDouble(SplitParts[1]);
            result = num1 + num2;
            DisplayHeader.setText(text);
            DisplayAnswer.setText(Double.toString(result));
            op_add = false;
        } else if (op_sub == true) {
            DisplayHeader.setText(num1 - num2 + "");
            String[] SplitParts = text.split("-");
            num1 = Double.parseDouble(SplitParts[0]);
            num2 = Double.parseDouble(SplitParts[1]);
            result = num1 - num2;
            DisplayHeader.setText(text);
            DisplayAnswer.setText(Double.toString(result));
            op_sub = false;
        } else if (op_div == true) {
            DisplayHeader.setText(num1 / num2 + "");
            String[] SplitParts = text.split("\\/");
            num1 = Double.parseDouble(SplitParts[0]);
            num2 = Double.parseDouble(SplitParts[1]);
            result = num1 / num2;
            DisplayHeader.setText(text);
            DisplayAnswer.setText(Double.toString(result));
            op_div = false;
        } else if (op_mult == true) {
            DisplayHeader.setText(num1 * num2 + "");
            String[] SplitParts = text.split("\\*");
            num1 = Double.parseDouble(SplitParts[0]);
            num2 = Double.parseDouble(SplitParts[1]);
            result = num1 * num2;
            DisplayHeader.setText(text);
            DisplayAnswer.setText(Double.toString(result));
            op_mult = false;
        }

    }

}

