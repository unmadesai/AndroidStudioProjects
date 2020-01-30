package com.example.unmadesai.autocomplete;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main4Activity extends AppCompatActivity {

    private ToggleButton tb1,tb2;
    private Button b,b2;
    RatingBar rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        tb1=(ToggleButton)findViewById(R.id.toggleButton);
        tb2=(ToggleButton)findViewById(R.id.toggleButton2);
        b=(Button)findViewById(R.id.button);
        rb=(RatingBar)findViewById(R.id.ratingBar);
        b2=(Button) findViewById(R.id.button2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result=new StringBuffer();
                result.append("Togglebutton1:").append(tb1.getText());
                result.append("Togglebutton2:").append(tb2.getText());

                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


            String rating=String.valueOf(rb.getRating());
            Toast.makeText(getApplicationContext(),rating,Toast.LENGTH_LONG).show();
        }
    });
}


    }


