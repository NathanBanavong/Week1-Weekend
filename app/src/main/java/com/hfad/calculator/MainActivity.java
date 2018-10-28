package com.hfad.calculator;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity implements View.OnClickListener {

    //create variable
    TextView DisplayHeader;
    TextView DisplayAnswer;
    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    Button btn_clear, btn_add, btn_sub, btn_div, btn_mult, btn_equal;

    double num1, result = 0;
    boolean newValue;       //decide if input number is new value

    //container for newValue
    ArrayList<String> numArray = new ArrayList<>();      //hold the numbers inputted
    char[] opArray;         //hold operation signs

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        //hold previous input into variable

        String inputDisplay = (String) DisplayHeader.getText();

        switch (v.getId()) {
            case R.id.btn_0:
                //DisplayHeader.setText(btn_0.getText());
                //DisplayHeader.setText((String)DisplayHeader.getText() + btn_0.getText());
                //newNumber = inputNewNumber((String) btn_0.getText(), newValue);
                //DisplayHeader.setText();

                DisplayHeader.setText(inputDisplay + btn_0.getText());
                newValue = false;
                break;
            case R.id.btn_1:
                //DisplayHeader.setText((String)DisplayHeader.getText() + btn_1.getText());
                //inputNewNumber((String) btn_1.getText(), newValue);

                DisplayHeader.setText(inputDisplay + btn_1.getText());
                newValue = false;
                break;
            case R.id.btn_2:


                singleString((String) btn_2.getText());     //READS THIS
                newValue = false;

                //DisplayHeader.setText(inputDisplay + btn_2.getText());
                //newValue = false;
                break;
            case R.id.btn_3:
//                DisplayHeader.setText((String)DisplayHeader.getText() + btn_3.getText());
                //inputNewNumber((String) btn_3.getText(), newValue);

                DisplayHeader.setText(inputDisplay + btn_3.getText());
                newValue = false;
                break;
            case R.id.btn_4:
//                DisplayHeader.setText((String)DisplayHeader.getText() + btn_4.getText());
                //numArray[counter] = Integer.parseInt(btn_4.toString());
                //inputNewNumber((String) btn_4.getText(), newValue);

                DisplayHeader.setText(inputDisplay + btn_4.getText());
                newValue = false;
                break;
            case R.id.btn_5:
//                DisplayHeader.setText((String)DisplayHeader.getText() + btn_5.getText());
                //numArray[counter] = Integer.parseInt(btn_5.toString());
                //inputNewNumber((String) btn_5.getText(), newValue);


                DisplayHeader.setText(inputDisplay + btn_5.getText());
                newValue = false;
                break;
            case R.id.btn_6:
//                DisplayHeader.setText((String)DisplayHeader.getText() + btn_6.getText());
                //numArray[counter] = Integer.parseInt(btn_6.toString());
                //inputNewNumber((String)btn_6.getText(), newValue);

                DisplayHeader.setText(inputDisplay + btn_6.getText());
                newValue = false;
                break;
            case R.id.btn_7:
//                DisplayHeader.setText((String)DisplayHeader.getText() + btn_7.getText());
                //inputNewNumber((String) btn_7.getText(), newValue);

                DisplayHeader.setText(inputDisplay + btn_7.getText());
                newValue = false;
                break;
            case R.id.btn_8:
//                DisplayHeader.setText((String)DisplayHeader.getText() + btn_8.getText());
                //numArray[counter] = Integer.parseInt(btn_8.toString());
                //inputNewNumber((String) btn_8.getText(), newValue);


                DisplayHeader.setText(inputDisplay + btn_8.getText());
                newValue = false;
                break;
            case R.id.btn_9:
//                DisplayHeader.setText((String)DisplayHeader.getText() + btn_9.getText());
                //numArray[counter] = Integer.parseInt(btn_9.toString());
                //inputNewNumber((String) btn_9.getText(), newValue);

                DisplayHeader.setText(inputDisplay + btn_9.getText());
                newValue = false;
                break;

            //operations
            case R.id.btn_clear:
                DisplayHeader.setText("");
                DisplayAnswer.setText("");
                numArray.removeAll(numArray);   //clear the array
                result = 0; //reset the input
                break;
            case R.id.btn_Addition:
//                DisplayHeader.setText((String)DisplayHeader.getText() + btn_0.getText());

                //try this
                //if(newValue == false){
//                    num1 = Double.parseDouble((String)DisplayHeader.getText() + btn_add.getText());

                //Test
                //num1 = convertToInt(numArray);

                DisplayHeader.setText(inputDisplay + btn_add.getText());
                //num1 = Double.parseDouble(numString);    //Problem -> 1 + 1 becomes input => crash

                DisplayAnswer.setText("");
                //result += num1;
                num1 = ListToDouble(numArray);
                result += num1;
                DisplayAnswer.setText(Double.toString(result));
                newValue = true;    //trigger array to end inputs
                break;
            case R.id.btn_Subtract:
//                DisplayHeader.setText((String)DisplayHeader.getText()+btn_sub.getText());
                DisplayHeader.setText(inputDisplay + btn_sub.getText());

                newValue = true;
                break;
            case R.id.btn_Division:
//                DisplayHeader.setText((String)DisplayHeader.getText()+btn_sub.getText());
                DisplayHeader.setText(inputDisplay + btn_div.getText());

                newValue = true;
                break;
            case R.id.btn_Multiply:
//                DisplayHeader.setText((String)DisplayHeader.getText()+btn_sub.getText());
                DisplayHeader.setText(inputDisplay + btn_mult.getText());

                newValue = true;
                break;
            case R.id.btn_Equals:

//                if(newValue == true) {
//                    DisplayHeader.setText(inputDisplay + btn_equal.getText());
//                    DisplayAnswer.setText(Double.toString(result));
//                    break;
//                }
//                DisplayHeader.setText((String)DisplayHeader.getText()+btn_sub.getText());
                DisplayHeader.setText(inputDisplay + btn_equal.getText());
                DisplayAnswer.setText(Double.toString(result));
                newValue = false;
                break;

        }
    }

//    //TEST
//    //output the input back into a single variable
    @SuppressLint("NewApi")
    public void singleString(String inputValue) {
        //puts number display
        DisplayHeader.setText(DisplayHeader.getText() + inputValue);

        String returnValue;
//        numArray.add(inputValue);  //puts input value into array

        if(newValue == false) {
            //returnValue = String.join("",numArray);
            numArray.add(inputValue);  //puts input value into array;
            returnValue = String.join("",numArray);
        }
        //if newValue == True -> do operation
        else {
            //string now has all numbers into 1 string
            returnValue = String.join("", numArray);
            num1 = Double.parseDouble(returnValue);
            StringToDouble(returnValue);    //saves number into num1
            numArray.removeAll(numArray);
            //numArray = null;   //reset the numArray
        }
    }

    public double StringToDouble(String value){
        num1 = Double.parseDouble(value);
        return num1;
    }

    @SuppressLint("NewApi")
    public double ListToDouble(ArrayList<String> value){
        //double convertString;
        String tempValue;

        tempValue = String.join("", value);
        num1 = Double.parseDouble(tempValue);
        return num1;
    }

}

