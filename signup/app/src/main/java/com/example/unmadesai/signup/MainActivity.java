package com.example.unmadesai.signup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.*;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        EditText name = (EditText) findViewById(R.id.name);
        EditText email = (EditText) findViewById(R.id.email);
        EditText pswd = (EditText) findViewById(R.id.pswd);
        EditText phone = (EditText) findViewById(R.id.phone);
        String name1=name.getText().toString();
        String email1=email.getText().toString();
        String phone1=phone.getText().toString();
        String pswd1=pswd.getText().toString();
        String res = "Sign up sucessful\n"+"Username = "+name1+"\nEmail id = "+email1+"\nPassword = "+pswd1+"\n Phone = "+phone1;
        Toast.makeText(this, res, Toast.LENGTH_SHORT).show();
    }


}



