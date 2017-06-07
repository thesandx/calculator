package com.example.manojkumarjha.intern1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addition);
    }

    double a,b,c;
    EditText t1 =(EditText)findViewById(R.id.num1);
    EditText t2 = (EditText)findViewById(R.id.num2);
    TextView result=(TextView)findViewById(R.id.result);

    String quantity1= t1.getText().toString();
    String quantity2= t2.getText().toString();


    public void findSum(View v){
            try {
                if (quantity1 != null && quantity1.length() >=0 && quantity2 != null && quantity2.length() >=0) {
                    a = Double.parseDouble(t1.getText().toString());
                    b = Double.parseDouble(t2.getText().toString());
                    c = a + b;
                    result.setText("sum of " + a + " and " + b + " is " + c);
                }
            } catch (NumberFormatException nfe) {
                Log.e("sum button clicked", "Edittext is blank");
                Toast.makeText(MainActivity.this, R.string.error, Toast.LENGTH_SHORT).show();
            }
        }


    public void finddiff(View v){
            try {
                if (quantity1 != null && quantity1.length() >=0 && quantity2 != null && quantity2.length() >=0) {
                    a = Double.parseDouble(t1.getText().toString());
                    b = Double.parseDouble(t2.getText().toString());
                    c = a - b;
                    result.setText("difference of " + a + " and " + b + " is " + c);
                }
            } catch (NumberFormatException nfe) {
                Log.e("diff button clicked", "Edittext is blank");
                Toast.makeText(MainActivity.this, R.string.error, Toast.LENGTH_SHORT).show();
            }
        }


    public void findmul(View v){
            try {
                if (quantity1 != null && quantity1.length() >=0 && quantity2 != null && quantity2.length() >=0) {
                    a = Double.parseDouble(t1.getText().toString());
                    b = Double.parseDouble(t2.getText().toString());
                    c = a * b;
                    result.setText("multiplication of " + a + " and " + b + " is " + c);
                }
            } catch (NumberFormatException nfe) {
                Log.e("mul button clicked", "Edittext is blank");
                Toast.makeText(MainActivity.this, R.string.error, Toast.LENGTH_SHORT).show();
            }
        }

    public void finddiv(View v){
            try {
                if (quantity1 != null && quantity1.length() >=0 && quantity2 != null && quantity2.length() >=0) {
                    a = Double.parseDouble(t1.getText().toString());
                    b = Double.parseDouble(t2.getText().toString());
                    c = a / b;
                    result.setText("division of " + a + " and " + b + " is " + c);
                }

            } catch (NumberFormatException nfe) {
                Log.e("div button clicked", "Edittext is blank");
                Toast.makeText(MainActivity.this, R.string.error, Toast.LENGTH_SHORT).show();
            }
        }
    public void clearall(View v){
             t1.getText().clear();
             t2.getText().clear();
             result.setText("");
            }

}
