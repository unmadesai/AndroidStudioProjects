package com.example.unmadesai.autocomplete;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    DatePicker d;
    Button b;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t = (TextView) findViewById(R.id.textView3);
        b = (Button) findViewById(R.id.button);
        d = (DatePicker) findViewById(R.id.datePicker);

        t.setText(getCurrentDate());
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setText(getCurrentDate());
            }
        });
    }
    public String getCurrentDate()
    {
        StringBuffer sb=new StringBuffer();
        sb.append("Current Date");
        sb.append((d.getMonth()+1)+"/");
        sb.append(d.getDayOfMonth()+"/");
        sb.append(d.getYear());

        return sb.toString();
    }


}
