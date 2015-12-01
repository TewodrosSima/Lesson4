package com.example.tewodros_2.lesson4;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    private EditText input1;
    private TextView output1;
    private Button button1;
    private TextView bannerText;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        LinearLayout myLayout = new LinearLayout(this);
        myLayout.setOrientation(LinearLayout.VERTICAL);

        input1 = new EditText(this);
        output1 = new TextView(this);
        button1 = new Button(this);
        bannerText = new TextView(this);

        myLayout.setOrientation(LinearLayout.VERTICAL);
        myLayout.setGravity(Gravity.CENTER_HORIZONTAL);
        myLayout.setBackgroundColor(Color.GRAY);

        bannerText.setWidth(300);
        bannerText.setGravity(Gravity.CENTER_HORIZONTAL);
        bannerText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        bannerText.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
        bannerText.setText("Teddy Currency Converter");
        bannerText.setTextColor(Color.YELLOW);
        bannerText.setPadding(0, 0, 0, 10);

        input1.setHint("Enter Euro amount");
        button1.setText("Convert to Dollar!");

        output1.setText("0");
        output1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        output1.setPadding(0, 20, 0, 20);
        output1.setWidth(50);
        output1.setGravity(Gravity.CENTER_HORIZONTAL);
        output1.setTextColor(Color.WHITE);

        button1.setOnClickListener(this);

        myLayout.addView(bannerText);
        myLayout.addView(input1);
        myLayout.addView(output1);
        myLayout.addView(button1);

        LinearLayout.LayoutParams lparams = new RadioGroup.LayoutParams(300,100);

        input1.setLayoutParams(lparams);
        output1.setLayoutParams(lparams);
        button1.setLayoutParams(lparams);

        setContentView(myLayout);

        input1.setLayoutParams(new LinearLayout.LayoutParams(225, 100));
        button1.setLayoutParams(new LinearLayout.LayoutParams(270, 100));
    }

    @Override
    public void onClick(View v) {
        String firstString = input1.getText().toString();
        double firstNumber = Double.parseDouble(firstString);

        double result = firstNumber * 1.06;
        String resultString = String.valueOf(result);
        output1.setText(resultString);
    }
}