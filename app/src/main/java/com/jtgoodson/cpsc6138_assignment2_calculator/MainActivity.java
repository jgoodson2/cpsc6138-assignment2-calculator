package com.jtgoodson.cpsc6138_assignment2_calculator;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    String operation = "initial";
    String displayValue = "";
    double val1 = 0.0;
    double val2 = 0.0;
    boolean val1entered;
//    int defaultBgColor;

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
        final Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        final Button buttonSubt = (Button) findViewById(R.id.buttonSubt);
        final Button buttonMult = (Button) findViewById(R.id.buttonMult);
        final Button buttonDiv = (Button) findViewById(R.id.buttonDiv);
        Button buttonDel = (Button) findViewById(R.id.buttonDel);
//        defaultBgColor = button0.getBackgr
//        final ColorDrawable defaultBgColor = (ColorDrawable) button0.getBackground();


        button1.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + "1");
                    }
                }
        );

        button2.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + "2");
                    }
                }
        );

        button3.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + "3");
                    }
                }
        );

        button4.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + "4");
                    }
                }
        );

        button5.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + "5");
                    }
                }
        );

        button6.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + "6");
                    }
                }
        );

        button7.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + "7");
                    }
                }
        );

        button8.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + "8");
                    }
                }
        );

        button9.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        display.setText(display.getText() + "9");
                    }
                }
        );

        button0.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (val1entered) {
                            display.setText("");
                            val1entered = false;
                        }
                        if (!display.getText().equals("0")) {
                            display.setText(display.getText() + "0");
                        }
                    }
                }
        );

        buttonDot.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (display.getText().toString().equals("")) {
                            display.setText(display.getText() + "0.");
                        } else if (!display.getText().toString().contains(".")) {
                            display.setText(display.getText() + ".");
                        }
                    }
                }
        );

        buttonAdd.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        operation = "add";
                        val1 = Double.valueOf(display.getText().toString());
                        buttonAdd.setBackgroundColor(getResources().getColor(R.color.colorButtonOpActive));
                        val1entered = true;
                    }
                }
        );

        buttonSubt.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        operation = "subtract";
                        val1 = Double.valueOf(display.getText().toString());
                        buttonSubt.setBackgroundColor(getResources().getColor(R.color.colorButtonOpActive));
                        val1entered = true;
                    }
                }
        );

        buttonMult.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        operation = "multiply";
                        val1 = Double.valueOf(display.getText().toString());
                        buttonMult.setBackgroundColor(getResources().getColor(R.color.colorButtonOpActive));
                        val1entered = true;
                    }
                }
        );

        buttonDiv.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        operation = "divide";
                        val1 = Double.valueOf(display.getText().toString());
                        buttonDiv.setBackgroundColor(getResources().getColor(R.color.colorButtonOpActive));
                        val1entered = true;
                    }
                }
        );

        buttonEq.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (operation.equals("add")) {
                            displayValue = String.valueOf(val1 + Double.valueOf(display.getText().toString()));
                        } else if (operation.equals("subtract")) {
                            displayValue = String.valueOf(val1 - Double.valueOf(display.getText().toString()));
                        } else if (operation.equals("multiply")) {
                            displayValue = String.valueOf(val1 * Double.valueOf(display.getText().toString()));
                        } else if (operation.equals("divide")) {
                            displayValue = String.valueOf(val1 / Double.valueOf(display.getText().toString()));
                        }
                        display.setText(displayValue);
                        operation = "equals";
                    }
                }
        );

        buttonDel.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        if (operation.equals("equals")) {
                            display.setText("");
                            operation = "new";
                            displayValue = "";
                            val1 = 0.0;
                            val2 = 0.0;
                            val1entered = false;
                            buttonAdd.setBackgroundColor(getResources().getColor(R.color.colorButton));
                            buttonSubt.setBackgroundColor(getResources().getColor(R.color.colorButton));
                            buttonMult.setBackgroundColor(getResources().getColor(R.color.colorButton));
                            buttonDiv.setBackgroundColor(getResources().getColor(R.color.colorButton));
                        } else if (!operation.equals("new") && display.getText().toString().length() > 0) {
                            display.setText(display.getText().toString().substring(0, display.getText().toString().length() - 1));
                        }
                    }
                }
        );
    }
}
