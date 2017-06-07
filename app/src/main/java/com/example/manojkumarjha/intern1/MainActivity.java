package com.example.manojkumarjha.intern1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addition);
    }

    public void findSum(View v){
        int a,b,c;
        EditText t1 =(EditText)findViewById(R.id.num1);
        EditText t2 = (EditText)findViewById(R.id.num2);
        Button button=(Button)findViewById(R.id.sum);
        TextView result=(TextView)findViewById(R.id.result);

        a=Integer.parseInt(t1.getText().toString());
        b=Integer.parseInt(t2.getText().toString());
        c=a+b;
        result.setText("sum of "+a+" and "+b+" is "+c);
    }


}
