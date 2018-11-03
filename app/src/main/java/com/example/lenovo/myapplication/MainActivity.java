package com.example.lenovo.myapplication;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    int op = 0;
    int op2 = 0;
    double a;
    double in;
    double out;
    String input = "0";
    String output = "";
    String output2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BtnRooting = (Button) findViewById(R.id.BtnRooting);
        Button BtnSquare = (Button) findViewById(R.id.BtnSquare);
        Button BtnEqual = (Button) findViewById(R.id.BtnEqual);
        Button BtnReciprocal = (Button) findViewById(R.id.BtnReciprocal);
        Button BtnCE = (Button) findViewById(R.id.BtnCE);
        Button BtnC = (Button) findViewById(R.id.BtnC);
        Button BtnBack = (Button) findViewById(R.id.BtnBack);
        Button BtnDivide = (Button) findViewById(R.id.BtnDivide);
        Button Btn7 = (Button) findViewById(R.id.Btn7);
        Button Btn8 = (Button) findViewById(R.id.Btn8);
        Button Btn9 = (Button) findViewById(R.id.Btn9);
        Button BtnMultiply = (Button) findViewById(R.id.BtnMultiply);
        Button Btn4 = (Button) findViewById(R.id.Btn4);
        Button Btn5 = (Button) findViewById(R.id.Btn5);
        Button Btn6 = (Button) findViewById(R.id.Btn6);
        Button BtnMinus = (Button) findViewById(R.id.BtnMinus);
        Button Btn1 = (Button) findViewById(R.id.Btn1);
        Button Btn2 = (Button) findViewById(R.id.Btn2);
        Button Btn3 = (Button) findViewById(R.id.Btn3);
        Button BtnPlus = (Button) findViewById(R.id.BtnPlus);
        Button BtnSign = (Button) findViewById(R.id.BtnSign);
        Button Btn0 = (Button) findViewById(R.id.Btn0);
        Button BtnPoint = (Button) findViewById(R.id.BtnPoint);
        final TextView textView = (TextView) findViewById(R.id.text1);

        BtnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output = "";
                input = "0";
                op = 0;
                op2 = 0;
                textView.setText("0");
            }
        });
        BtnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == 0||op == 5){
                    input = "0";
                    textView.setText(input);
                }
                else
                    output = "0";
                textView.setText(output);
            }
        });
        BtnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == 0){
                    if (op2 == 1||op2 == 0){}
                    else {
                        in = Double.parseDouble(output2);
                        out = Double.parseDouble(input);
                        if (op2 == 2) {
                            a = in + out;
                        }
                        if (op2 == 3) {
                            a = in - out;
                        }
                        if (op2 == 4) {
                            a = in * out;
                        }
                        if (op2 == 5) {
                            a = in / out;
                        }
                        input = "" + doubleTran(a);
                    }
                }
                else {
                    if (output.equals("")) {
                        in=Double.parseDouble(input);
                        if (op != 5){
                            output = input;
                            if (op == 1) {
                                a = in * 2;
                                input = "" + doubleTran(a);
                            }
                            if (op == 2) {
                                input = "0";
                            }
                            if (op == 3) {
                                a = in * in;
                                input = "" + doubleTran(a);
                            }
                            if (op == 4) {
                                if (in == 0){input="结果未定义";}
                                else{ input = "1";}
                            }
                        }
                        else {
                            if (op2 == 0||op2 == 1){
                                a = Double.parseDouble(input);
                                input = "" + doubleTran(a);
                            }
                            else {
                                out = Double.parseDouble(output2);
                                if (op2 == 2) {
                                    a = in + out;
                                }
                                if (op2 == 3) {
                                    a = in - out;
                                }
                                if (op2 == 4) {
                                    a = in * out;
                                }
                                if (op2 == 5) {
                                    a = in / out;
                                }
                                input = "" + doubleTran(a);
                            }
                        }
                    }
                    else {
                        in=Double.parseDouble(input);
                        out=Double.parseDouble(output);
                        if (op == 1) {
                            a = in + out;
                            input = "" + doubleTran(a);
                        }
                        if (op == 2) {
                            a = in - out;
                            input = "" + doubleTran(a);
                        }
                        if (op == 3) {
                            a = in * out;
                            input = "" + doubleTran(a);
                        }
                        if (op == 4) {
                            if (in == 0&&out == 0){input = "结果未定义";}
                            if (in != 0&&out == 0){input = "除数不能为零";}
                            else {
                                a = in / out;
                                input = "" + doubleTran(a);}
                        }
                    }
                }
                textView.setText(input);
                if (output.equals("")){}
                else {output2 = output;}
                output = "";
                op=5;
            }
        });
        BtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == 0||output.equals("")||op == 5){
                    op = 1;
                }
                else {
                    in = Double.parseDouble(input);
                    out = Double.parseDouble(output);
                    if (op == 1) {
                        a = in + out;
                        input = "" + doubleTran(a);
                    }
                    if (op == 2) {
                        a = in - out;
                        input = "" + doubleTran(a);
                    }
                    if (op == 3) {
                        a = in * out;
                        input = "" + doubleTran(a);
                    }
                    if (op == 4) {
                        if (in == 0&&out == 0){input = "结果未定义";}
                        if (in != 0&&out == 0){input = "除数不能为零";}
                        else {
                            a = in / out;
                            input = "" + doubleTran(a);}
                    }
                }
                output = "";
                op = 1;
                op2 = 2;
            }
        });
        BtnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == 0||output.equals("")||op == 5){ op = 2;}
                else {
                    in = Double.parseDouble(input);
                    out = Double.parseDouble(output);
                    if (op == 1) {
                        a = in + out;
                        input = "" + doubleTran(a);
                    }
                    if (op == 2) {
                        a = in - out;
                        input = "" + doubleTran(a);
                    }
                    if (op == 3) {
                        a = in * out;
                        input = "" + doubleTran(a);
                    }
                    if (op == 4) {
                        if (in == 0&&out == 0){input = "结果未定义";}
                        if (in != 0&&out == 0){input = "除数不能为零";}
                        else {
                            a = in / out;
                            input = "" + doubleTran(a);}
                    }
                }
                op = 2;
                op2 = 3;
                output = "";
            }
        });
        BtnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == 0||output.equals("")||op == 5){op = 3;}
                else {
                    in = Double.parseDouble(input);
                    out = Double.parseDouble(output);
                    if (op == 1) {
                        a = in + out;
                        input = "" + doubleTran(a);
                    }
                    if (op == 2) {
                        a = in - out;
                        input = "" + doubleTran(a);
                    }
                    if (op == 3) {
                        a = in * out;
                        input = "" + doubleTran(a);
                    }
                    if (op == 4) {
                        if (in == 0&&out == 0){input = "结果未定义";}
                        if (in != 0&&out == 0){input = "除数不能为零";}
                        else {
                            a = in / out;
                            input = "" + doubleTran(a);}
                    }
                    output = "";
                    op = 3;
                }
                op2 = 4;
            }
        });
        BtnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op==0||output.equals("")||op == 5){
                    op = 4;}
                else {
                    in = Double.parseDouble(input);
                    out = Double.parseDouble(output);
                    if (op == 1) {
                        a = in + out;
                        input = "" + doubleTran(a);
                    }
                    if (op == 2) {
                        a = in - out;
                        input = "" + doubleTran(a);
                    }
                    if (op == 3) {
                        a = in * out;
                        input = "" + doubleTran(a);
                    }
                    if (op == 4) {
                        if (in == 0&&out == 0){input = "结果未定义";}
                        if (in != 0&&out == 0){input = "除数不能为零";}
                        else {
                            a = in / out;
                            input = "" + doubleTran(a);}
                    }
                    output = "";
                    op = 4;
                }
                op2 = 5;
            }
        });
        BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == 0) {
                    if (op2 == 1) {
                    } else {
                        if (input.length() == 1) {
                            input = "0";
                        } else {
                            if (input.length() == 2&&input.contains("-")){
                                input = "0";
                            }else {
                                input = input.substring(0,input.length() - 1);
                            }
                        }
                        textView.setText(input);
                    }
                } else {
                    if (op2 == 1||op == 5){
                        if (input.contains("未")||input.contains("除")||input.contains("无")){
                            input = "0";
                            textView.setText(input);
                            op = 0;
                        }
                    }
                    else {
                        if (output.length() == 1){
                            output = "0";
                            textView.setText(output);
                        }
                        else {
                            if (output.equals("")){}
                            else {
                                output = output.substring(0,output.length() - 1);
                                textView.setText(output);
                            }
                        }
                    }
                }
            }
        });
        BtnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a;double b;
                if(op == 0||op == 5) {
                    if (input.equals("")) {
                        input = "0";
                    } else {
                        a = Double.parseDouble(input);
                        a = a*(-1);
                        input = "" + doubleTran(a);
                        textView.setText(input);
                    }
                }
                else {
                    if (output.equals("")) { output = "-" + input; }
                    else {
                        b = Double.parseDouble(output);
                        b = b * (-1);
                        output = "" + doubleTran(b);
                    }
                    textView.setText(output);
                }
            }
        });
        BtnRooting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a;double b;double c;double d;
                if (op == 0||op == 5) {
                    if (input.equals("")){input = "0";}
                    else {
                        a = Double.parseDouble(input);
                        if (a >= 0) {
                            b = Math.sqrt(a);
                            input = "" + doubleTran(b);
                        }
                        else {
                            input = "无效输入";
                        }
                        textView.setText(input);
                    }
                }
                else {
                    if (output.equals("")){
                        c = Double.parseDouble(input);
                        d = Math.sqrt(c);
                        output = ""+doubleTran(d);
                    }
                    else {
                        c = Double.parseDouble(output);
                        if (c >= 0) {
                            d = Math.sqrt(c);
                            output = "" + doubleTran(d);
                        } else {
                            input = "无效输入";
                        }
                        textView.setText(output);
                    }
                }
                op2 = 1;
            }
        });
        BtnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a;double b;double c;double d;
                if (op == 0||op == 5){
                    a = Double.parseDouble(input);
                    b = a * a;
                    input = "" + doubleTran(b);
                    textView.setText(input);
                }
                else {
                    if (output.equals("")){
                        c = Double.parseDouble(input);
                    }
                    else {
                        c = Double.parseDouble(output);
                    }
                    d = c * c;
                    output = "" + doubleTran(d);
                    textView.setText(output);
                }
                op2 = 1;
            }
        });
        BtnReciprocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a;double b;double c;double d;
                if(op == 0||op == 5){
                    if (input.equals("0")){input = "除数不能为零";}
                    else {
                        a = Double.parseDouble(input);
                        b = 1 / a;
                        input = "" + doubleTran(b);
                    }
                    textView.setText(input);
                }
                else {
                    if (output.equals("")){
                        c = Double.parseDouble(input);
                        if (c == 0){output="除数不能为0";}
                        else {
                            d = 1 / c;
                            output = "" + d;
                        }
                    }
                    else {
                        c = Double.parseDouble(output);
                        d = 1/c;
                        output = "" + d;
                    }
                    textView.setText(output);
                }
                op2 = 1;
            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == 0||op == 5) {
                    if (op == 5) {
                        textView.setText(input = "7");
                        op = 0;
                    } else {
                        if (input.equals("0")) {
                            textView.setText(input = "7");
                        } else
                            textView.setText(input += "7");
                    }
                }
                else
                if (output.equals("0")){textView.setText(output = "7");}
                else
                    textView.setText(output+="7");
            }
        });
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == 0||op == 5) {
                    if (op == 5) {
                        textView.setText(input = "8");
                        op = 0;
                    } else {
                        if (input.equals("0")) {
                            textView.setText(input = "8");
                        } else
                            textView.setText(input += "8");
                    }
                }
                else
                if (output.equals("0")){textView.setText(output = "8");}
                else
                    textView.setText(output+="8");
            }
        });
        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == 0||op == 5) {
                    if (op == 5) {
                        textView.setText(input = "9");
                        op = 0;
                    } else {
                        if (input.equals("0")) {
                            textView.setText(input = "9");
                        } else
                            textView.setText(input += "9");
                    }
                }
                else
                if (output.equals("0")){textView.setText(output = "9");}
                else
                    textView.setText(output+="9");
            }
        });
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == 0||op == 5) {
                    if (op == 5) {
                        textView.setText(input = "1");
                        op = 0;
                    } else {
                        if (input.equals("0")) {
                            textView.setText(input = "1");
                        } else
                            textView.setText(input += "1");
                    }
                }
                else
                if (output.equals("0")){textView.setText(output = "1");}
                else
                    textView.setText(output+="1");
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == 0||op == 5) {
                    if (op == 5) {
                        textView.setText(input = "2");
                        op = 0;
                    } else {
                        if (input.equals("0")) {
                            textView.setText(input = "2");
                        } else
                            textView.setText(input += "2");
                    }
                }
                else
                if (output.equals("0")){textView.setText(output = "2");}
                else
                    textView.setText(output+="2");
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == 0||op == 5) {
                    if (op == 5) {
                        textView.setText(input = "3");
                        op = 0;
                    } else {
                        if (input.equals("0")) {
                            textView.setText(input = "3");
                        } else
                            textView.setText(input += "3");
                    }
                }
                else
                if (output.equals("0")){textView.setText(output = "3");}
                else
                    textView.setText(output+="3");
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == 0||op == 5) {
                    if (op == 5) {
                        textView.setText(input = "4");
                        op = 0;
                    } else {
                        if (input.equals("0")) {
                            textView.setText(input = "4");
                        } else
                            textView.setText(input += "4");
                    }
                }
                else
                if (output.equals("0")){textView.setText(output = "4");}
                else
                    textView.setText(output+="4");
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == 0||op == 5) {
                    if (op == 5) {
                        textView.setText(input = "5");
                        op = 0;
                    } else {
                        if (input.equals("0")) {
                            textView.setText(input = "5");
                        } else
                            textView.setText(input += "5");
                    }
                }
                else
                if (output.equals("0")){textView.setText(output = "5");}
                else
                    textView.setText(output+="5");
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == 0||op == 5) {
                    if (op == 5) {
                        textView.setText(input = "6");
                        op = 0;
                    } else {
                        if (input.equals("0")) {
                            textView.setText(input = "6");
                        } else
                            textView.setText(input += "6");
                    }
                }
                else
                if (output.equals("0")){textView.setText(output = "6");}
                else
                    textView.setText(output+="6");
            }
        });
        Btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == 0) {
                    if (input.equals("0")){
                        textView.setText(input = "0");
                    }
                    else {
                        textView.setText(input += "0");
                    }
                    op = 0;
                }
                else {
                    if (output.equals("0")){
                        textView.setText("0");
                    }
                    else {
                        textView.setText(output += "0");
                    }
                }
            }
        });
        BtnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op==0) {
                    if (input.contains(".")) {}
                    else if (input.equals("")) {
                        textView.setText(input="0."); }
                    else
                        textView.setText(input += ".");
                }
                if (op != 0){
                    if (op == 5){
                        textView.setText(input = "0.");
                        op = 0;
                    }
                    else {
                        if (output.contains(".")) {
                        } else if (output.equals("")) {
                            textView.setText(output = "0.");
                        } else
                            textView.setText(output += ".");
                    }
                }
            }
        });
    }
    public static String doubleTran(double num) {
        BigDecimal b = new BigDecimal(num);
        num = b.setScale(16,BigDecimal.ROUND_HALF_UP).doubleValue();
        if (Math.round(num) - num == 0) {
            return String.valueOf((long) num);
                }
         return String.valueOf(num);
    }
}

