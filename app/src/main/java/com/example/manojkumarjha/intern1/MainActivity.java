package com.example.manojkumarjha.intern1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
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

    public void findResult(View v){
        double a,b,c,d,e,f;
        EditText t1 =(EditText)findViewById(R.id.num1);
        EditText t2 = (EditText)findViewById(R.id.num2);
        TextView result=(TextView)findViewById(R.id.result);

        String quantity1= t1.getText().toString();
        String quantity2= t2.getText().toString();

        try {
            if (quantity1 != null && quantity1.length() >=0 && quantity2 != null && quantity2.length() >=0) {
                a = Double.parseDouble(t1.getText().toString());
                b = Double.parseDouble(t2.getText().toString());
                c = a + b;
                d = a - b;
                e = a * b;
                f = a/b;

              if (v.getId() == R.id.sum) {
                  result.setText("sum of " + a + " and " + b + " is " + c);
              }
              else  if (v.getId() == R.id.diff) {
                  result.setText("sum of " + a + " and " + b + " is " + d);
              }
              else  if (v.getId() == R.id.mul) {
                    result.setText("sum of " + a + " and " + b + " is " + e);
                }
              else  if (v.getId() == R.id.div) {
                    result.setText("sum of " + a + " and " + b + " is " + f);
                }
                else {
                  t1.getText().clear();
                  t2.getText().clear();
                  result.setText("");

              }

            }
        } catch (NumberFormatException nfe) {
            Log.e("tag", "msg");
            Toast.makeText(MainActivity.this, R.string.error, Toast.LENGTH_SHORT).show();
        }
    }
}
