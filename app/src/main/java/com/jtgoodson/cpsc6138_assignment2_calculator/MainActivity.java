package com.jtgoodson.cpsc6138_assignment2_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView display = (TextView) findViewById(R.id.display);
        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button buttonDot = (Button) findViewById(R.id.buttonDot);
        Button buttonEq = (Button) findViewById(R.id.buttonEq);
        Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        Button buttonSubt = (Button) findViewById(R.id.buttonSubt);
        Button buttonMult = (Button) findViewById(R.id.buttonMult);
        Button buttonDiv = (Button) findViewById(R.id.buttonDiv);
        Button buttonDel = (Button) findViewById(R.id.buttonDel);

        button1.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        display.setText(display.getText() + "1");
                    }
                }
        );

        button2.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        display.setText(display.getText() + "2");
                    }
                }
        );

        button3.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        display.setText(display.getText() + "3");
                    }
                }
        );

        button4.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        display.setText(display.getText() + "4");
                    }
                }
        );

        button5.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        display.setText(display.getText() + "5");
                    }
                }
        );

        button6.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        display.setText(display.getText() + "6");
                    }
                }
        );

        button7.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        display.setText(display.getText() + "7");
                    }
                }
        );

        button8.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        display.setText(display.getText() + "8");
                    }
                }
        );

        button9.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        display.setText(display.getText() + "9");
                    }
                }
        );

    }
}
