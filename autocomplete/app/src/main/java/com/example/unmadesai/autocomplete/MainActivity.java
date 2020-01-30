package com.example.unmadesai.autocomplete;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String s[]={"Ab","ABC","Ba","BAC"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.support.v7.appcompat.R.layout.select_dialog_item_material,s);
        AutoCompleteTextView a=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        a.setAdapter(adapter);
        a.setThreshold(1);

        a.setTextColor(Color.GREEN);
    }

    public void onClick(View view) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    public void onClick3(View view) {
        Intent i = new Intent(this, Main4Activity.class);
        startActivity(i);
    }

    public void onClick2(View view) {
        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);
    }

        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }



}

