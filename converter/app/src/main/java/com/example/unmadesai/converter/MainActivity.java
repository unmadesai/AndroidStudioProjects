package com.example.unmadesai.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void fun1(View v)
    {

        EditText e=(EditText)findViewById(R.id.editText1);
        TextView t=(TextView)findViewById(R.id.textView1);
        float no=Float.parseFloat(e.getText().toString());
        no=no/60;
        t.setText(no+" Dollars");

    }
    public void fun2(View v)

    {

        EditText e=(EditText)findViewById(R.id.editText1);
        TextView t=(TextView)findViewById(R.id.textView1);
        float no=Float.parseFloat(e.getText().toString());
        no=no*60;
        t.setText(no+" Rupees");

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

// Inflate the menu; this adds items to the action bar if it is present. // getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }

}

