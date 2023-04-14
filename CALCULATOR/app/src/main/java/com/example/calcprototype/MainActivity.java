package com.example.calcprototype;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;import android.view.MotionEvent;import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button one, two, three, four, five, six, seven, eight, nine, zero, dot, equal, mod, brackets, add, sub, mul, div, clear, allClear;
    private TextView view, result;
    private int num1;
    private final char subtraction= '-';
    private final char divide='/';
    private final char multiplication='*';
    private final char Addition= '=';
    private final char modulus = '%';
    private final char equ='0';
    private double val1;
    private double val2;
    private char Action;
    private double modu, divo;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView view = findViewById(R.id.textView2);
        final TextView result = findViewById(R.id.result);
        final Button zero = findViewById(R.id.button17);
        final Button one = findViewById(R.id.button13);
        final Button two = findViewById(R.id.button14);
        final Button three = findViewById(R.id.button15);
        final Button four = findViewById(R.id.button9);
        final Button five = findViewById(R.id.button10);
        final Button six = findViewById(R.id.button11);
        final Button seven = findViewById(R.id.button5);
        final Button eight = findViewById(R.id.button6);
        final Button nine = findViewById(R.id.button7);
        final Button clear = findViewById(R.id.button);
        final Button add = findViewById(R.id.button16);
        final Button sub = findViewById(R.id.button12);
        final Button mul = findViewById(R.id.button8);
        final Button div = findViewById(R.id.button4);
        final Button mod = findViewById(R.id.button3);
//        final Button dot = findViewById(R.id.button2);
        final Button equal = findViewById(R.id.button19);
        @SuppressLint("MissingInflatedID") final Button allClear = findViewById(R.id.allclear);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString()+"0");
            }
        });

        zero.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    // Change the color back to the original color when the button is released
                    zero.setBackground(getDrawable(R.drawable.roundbutton2));
                    zero.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    // Change the color back to the original color when the button is released
                    zero.setBackground(getDrawable(R.drawable.roundbutton));
                    zero.setTextColor(getResources().getColor(R.color.white));
                }
                return false;
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString()+"1");
            }
        });

        one.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    // Change the color back to the original color when the button is released
                    one.setBackground(getDrawable(R.drawable.roundbutton2));
                    one.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    // Change the color back to the original color when the button is released
                    one.setBackground(getDrawable(R.drawable.roundbutton));
                    one.setTextColor(getResources().getColor(R.color.white));
                }
                return false;
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString()+"2");
            }
        });

        two.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    // Change the color back to the original color when the button is released
                    two.setBackground(getDrawable(R.drawable.roundbutton2));
                    two.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    // Change the color back to the original color when the button is released
                    two.setBackground(getDrawable(R.drawable.roundbutton));
                    two.setTextColor(getResources().getColor(R.color.white));
                }
                return false;
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString()+"3");
            }
        });

        three.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    // Change the color back to the original color when the button is released
                    three.setBackground(getDrawable(R.drawable.roundbutton2));
                    three.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    // Change the color back to the original color when the button is released
                    three.setBackground(getDrawable(R.drawable.roundbutton));
                    three.setTextColor(getResources().getColor(R.color.white));
                }
                return false;
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString()+"4");
            }
        });

        four.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    // Change the color back to the original color when the button is released
                    four.setBackground(getDrawable(R.drawable.roundbutton2));
                    four.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    // Change the color back to the original color when the button is released
                    four.setBackground(getDrawable(R.drawable.roundbutton));
                    four.setTextColor(getResources().getColor(R.color.white));
                }
                return false;
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString()+"5");
            }
        });

        five.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    // Change the color back to the original color when the button is released
                    five.setBackground(getDrawable(R.drawable.roundbutton2));
                    five.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    // Change the color back to the original color when the button is released
                    five.setBackground(getDrawable(R.drawable.roundbutton));
                    five.setTextColor(getResources().getColor(R.color.white));
                }
                return false;
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString()+"6");
            }
        });

        six.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    // Change the color back to the original color when the button is released
                    six.setBackground(getDrawable(R.drawable.roundbutton2));
                    six.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    // Change the color back to the original color when the button is released
                    six.setBackground(getDrawable(R.drawable.roundbutton));
                    six.setTextColor(getResources().getColor(R.color.white));
                }
                return false;
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString()+"7");
            }
        });

        seven.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    // Change the color back to the original color when the button is released
                    seven.setBackground(getDrawable(R.drawable.roundbutton2));
                    seven.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    // Change the color back to the original color when the button is released
                    seven.setBackground(getDrawable(R.drawable.roundbutton));
                    seven.setTextColor(getResources().getColor(R.color.white));
                }
                return false;
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString()+"8");
            }
        });

        eight.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    // Change the color back to the original color when the button is released
                    eight.setBackground(getDrawable(R.drawable.roundbutton2));
                    eight.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    // Change the color back to the original color when the button is released
                    eight.setBackground(getDrawable(R.drawable.roundbutton));
                    eight.setTextColor(getResources().getColor(R.color.white));
                }
                return false;
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(view.getText().toString()+"9");
            }
        });

        nine.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    // Change the color back to the original color when the button is released
                    nine.setBackground(getDrawable(R.drawable.roundbutton2));
                    nine.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    // Change the color back to the original color when the button is released
                    nine.setBackground(getDrawable(R.drawable.roundbutton));
                    nine.setTextColor(getResources().getColor(R.color.white));
                }
                return false;
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
//                view.setText(view.getText().toString()+"+");
                val1 = Integer.parseInt(view.getText().toString());
                Action=Addition;
                result.setText(String.valueOf(Math.round(val1))+" +");
                view.setText(null);
            }
        });

        add.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    add.setBackground(getDrawable(R.drawable.roundbutton2));
                    add.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    add.setBackground(getDrawable(R.drawable.roundbutton));
                    add.setTextColor(getResources().getColor(R.color.white));
                }
                return false;
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                view.setText(view.getText().toString()+"–");
                val1 = Integer.parseInt(view.getText().toString());
                Action=subtraction;
                result.setText(String.valueOf(Math.round(val1))+" –");
                view.setText(null);
            }
        });

        sub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    // Change the color back to the original color when the button is released
                    sub.setBackground(getDrawable(R.drawable.roundbutton2));
                    sub.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    // Change the color back to the original color when the button is released
                    sub.setBackground(getDrawable(R.drawable.roundbutton));
                    sub.setTextColor(getResources().getColor(R.color.white));
                }
                return false;
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                view.setText(view.getText().toString()+"×");
                val1 = Integer.parseInt(view.getText().toString());
                Action=multiplication;
                result.setText(String.valueOf(Math.round(val1))+" ×");
                view.setText(null);
            }
        });

        mul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    // Change the color back to the original color when the button is released
                    mul.setBackground(getDrawable(R.drawable.roundbutton2));
                    mul.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    // Change the color back to the original color when the button is released
                    mul.setBackground(getDrawable(R.drawable.roundbutton));
                    mul.setTextColor(getResources().getColor(R.color.white));
                }
                return false;
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                view.setText(view.getText().toString()+"÷");
                val1 = Integer.parseInt(view.getText().toString());
                Action=divide;
                result.setText(String.valueOf(Math.round(val1))+" ÷");
                view.setText(null);
            }
        });

        div.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    // Change the color back to the original color when the button is released
                    div.setBackground(getDrawable(R.drawable.roundbutton2));
                    div.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    // Change the color back to the original color when the button is released
                    div.setBackground(getDrawable(R.drawable.roundbutton));
                    div.setTextColor(getResources().getColor(R.color.white));
                }
                return false;
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                view.setText(view.getText().toString()+"%");
                val1 = Integer.parseInt(view.getText().toString());
                Action=modulus;
                result.setText(String.valueOf(Math.round(val1))+"%");
                view.setText(null);
            }
        });

        mod.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    // Change the color back to the original color when the button is released
                    mod.setBackground(getDrawable(R.drawable.roundbutton2));
                    mod.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    // Change the color back to the original color when the button is released
                    mod.setBackground(getDrawable(R.drawable.roundbutton));
                    mod.setTextColor(getResources().getColor(R.color.white));
                }
                return false;
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2=Double.parseDouble(view.getText().toString());
                switch(Action){
                    case Addition:
                        val1=Math.round(val1+val2);
                        break;
                    case subtraction:
                        val1=Math.round(val1-val2);
                        break;
                    case multiplication:
                        val1=Math.round(val1*val2);
                        break;
                    case divide:
                        val1=Math.round(Double.parseDouble(String.valueOf(val1/val2)));
                        break;
                    case modulus:
                        val1=Math.round(Double.parseDouble(String.valueOf(val1/100)));
                        break;
                }
                result.setText(result.getText().toString()+" "+Math.round(Double.parseDouble(view.getText().toString()))+" = "+Math.round(val1));
                view.setText(null);
            }
        });

        equal.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    // Change the color back to the original color when the button is released
                    equal.setBackground(getDrawable(R.drawable.roundbutton2));
                    equal.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    // Change the color back to the original color when the button is released
                    equal.setBackground(getDrawable(R.drawable.roundbutton));
                    equal.setTextColor(getResources().getColor(R.color.white));
                }
                return false;
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(null);
            }
        });

        clear.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    // Change the color back to the original color when the button is released
                    clear.setBackground(getDrawable(R.drawable.roundbutton2));
                    clear.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    // Change the color back to the original color when the button is released
                    clear.setBackground(getDrawable(R.drawable.roundbutton));
                    clear.setTextColor(getResources().getColor(R.color.red));
                }
                return false;
            }
        });

        allClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setText(null);
                result.setText(null);
            }
        });

        allClear.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    // Change the color back to the original color when the button is released
                    allClear.setBackground(getDrawable(R.drawable.roundbutton2));
                    allClear.setTextColor(getResources().getColor(R.color.black));
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    // Change the color back to the original color when the button is released
                    allClear.setBackground(getDrawable(R.drawable.roundbutton));
                    allClear.setTextColor(getResources().getColor(R.color.red));
                }
                return false;
            }
        });
    }

    private void compute() {

    }

}