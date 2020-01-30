package com.example.unmadesai.autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class Main3Activity extends AppCompatActivity {

    TextView t;
    TimePicker tp;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        t=(TextView)findViewById(R.id.textView);
        tp=(TimePicker)findViewById(R.id.timePicker);
        b=(Button)findViewById(R.id.button);

        t.setText(gettime());

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setText(gettime());
            }
        });

    }

    public String gettime()
    {
        String time="Current Time: "+tp.getCurrentHour()+":"+tp.getCurrentMinute();
        return  time;
    }
}

