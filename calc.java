package com.example.calculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle; import android.view.View; import android.widget.Button; import android.widget.EditText; import android.widget.TextView;

import java.text.DecimalFormat; import java.util.Locale;

public class MainActivity extends AppCompatActivity { private TextView textView, textView2;

DecimalFormat format = new DecimalFormat("0.#");

@Override
protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main); initViews();
}

private void initViews() {
//Button btn0 = findViewById(R.id.btn0); findViewById(R.id.btn0); findViewById(R.id.btn1); findViewById(R.id.btn2); findViewById(R.id.btn3); findViewById(R.id.btn4); findViewById(R.id.btn5); findViewById(R.id.btn6); findViewById(R.id.btn7); findViewById(R.id.btn8); findViewById(R.id.btn9); findViewById(R.id.btnAC); findViewById(R.id.btnReverse);


2 

findViewById(R.id.btnDivide); findViewById(R.id.btnMult); findViewById(R.id.btnMinus); findViewById(R.id.btnPlus); findViewById(R.id.btnEqual); findViewById(R.id.btnComma); findViewById(R.id.btnPercentage);

textView = findViewById(R.id.textView); textView2 = findViewById(R.id.textView2); textView.setText("0");
}

double first = 0; double second = 0; double result = 0; String oper = "";

public void onClickBtn1(View v) { if (textView.getText() == "0") {
textView.setText("1"); } else {

textView.setText(textView.getText().toString().concat("1")); }
}
public void onClickBtn2(View v) {
if (textView.getText() == "0") { textView.setText("2");
} else {

textView.setText(textView.getText().toString().concat("2")); }
}
public void onClickBtn3(View v) { if (textView.getText() == "0") {
textView.setText("3"); } else {

textView.setText(textView.getText().toString().concat("3")); }
}
public void onClickBtn4(View v) { if (textView.getText() == "0") {
textView.setText("4"); } else {

textView.setText(textView.getText().toString().concat("4")); }
}
public void onClickBtn5(View v) {


3 

if (textView.getText() == "0") { textView.setText("5");
} else {

textView.setText(textView.getText().toString().concat("5")); }
}
public void onClickBtn6(View v) { if (textView.getText() == "0") {
textView.setText("6"); } else {

textView.setText(textView.getText().toString().concat("6")); }
}
public void onClickBtn7(View v) { if (textView.getText() == "0") {
textView.setText("7"); } else {

textView.setText(textView.getText().toString().concat("7")); }
}
public void onClickBtn8(View v) { if (textView.getText() == "0") {
textView.setText("8"); } else {

textView.setText(textView.getText().toString().concat("8")); }
}
public void onClickBtn9(View v) { if (textView.getText() == "0") {
textView.setText("9"); } else {

textView.setText(textView.getText().toString().concat("9")); }
}
public void onClickBtn0(View v) { if (textView.getText() != "0") {

textView.setText(textView.getText().toString().concat("0")); }
}
public void onClickBtnEqual(View v) { second =
Double.parseDouble(textView.getText().toString()); switch (oper) {
case "×":
result = first * second;


4 

break; case "+":
result = first + second; break;
case "/":
result = first / second; break;
case "-":
result = first - second; break;
}
if ((result % 1) == 0){ textView.setText(String.format(Locale.US, "%.0f",
result));
} else { textView.setText(format.format(result));
}

textView2.setText(""); oper = "";
}
public void onClickBtnAC(View v){ textView.setText("0"); textView2.setText(""); oper = "";
}
public void onClickBtnMult(View v){ if (oper.equals("×")){
first = Double.parseDouble(textView2.getText().toString().replace("×", ""));
second = Double.parseDouble(textView.getText().toString());
result = first * second; textView2.setText(String.format(Locale.US, "%f",
result).concat("x")); }
if (oper.equals("")) { first =
Double.parseDouble(textView.getText().toString());

textView2.setText(textView.getText().toString().concat("x")); }
textView.setText("0"); oper = "×";
}
public void onClickBtnDivide(View v){ if (oper.equals("/")){
first = Double.parseDouble(textView2.getText().toString().replace("/", ""));


5 

second = Double.parseDouble(textView.getText().toString());
result = first / second; textView2.setText(String.format(Locale.US, "%f",
result).concat("/")); }
if (oper.equals("")) { first =
Double.parseDouble(textView.getText().toString());

textView2.setText(textView.getText().toString().concat("/")); }
textView.setText("0"); oper = "/";
}
public void onClickBtnReverse(View v){
if (textView.getText().toString().contains("-")){

textView.setText(textView.getText().toString().replace("-", ""));
} else { textView.setText("-
".concat(textView.getText().toString())); }
}
public void onClickBtnComma(View v){

textView.setText(textView.getText().toString().concat(".")); }
public void onClickBtnPercentage(View v){
if (!textView2.getText().toString().isEmpty()){ first =
Double.parseDouble(textView2.getText().toString().replace(oper , ""));
second = Double.parseDouble(textView.getText().toString());
result = (first /100) * second; textView2.setText(String.format(Locale.US, "%f",
result)); } }
public void onClickBtnPlus(View v){ if (oper.equals("+")){
first = Double.parseDouble(textView2.getText().toString().replace("+", ""));
second = Double.parseDouble(textView.getText().toString());
result = first + second; textView2.setText(String.format(Locale.US, "%f",
result).concat("+"));


6 

}
if (oper.equals("")) { first =
Double.parseDouble(textView.getText().toString());

textView2.setText(textView.getText().toString().concat("+")); }
textView.setText("0"); oper = "+";
}
public void onClickBtnMinus(View v){ if (oper.equals("-")){
first = Double.parseDouble(textView2.getText().toString().replace("-", ""));
second = Double.parseDouble(textView.getText().toString());
result = first - second; textView2.setText(String.format(Locale.US, "%f",
result).concat("-")); }
if (oper.equals("")) { first =
Double.parseDouble(textView.getText().toString());

textView2.setText(textView.getText().toString().concat("-")); }
textView.setText("0"); oper = "-";
} }
