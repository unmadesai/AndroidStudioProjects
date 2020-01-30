package com.example.unmadesai.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSubmit(View view){
        EditText id = (EditText) findViewById(R.id.id);
        EditText password = (EditText) findViewById(R.id.password);
        String users[][] = new String[5][2];
        for(int i = 0; i < 5; i++){
            users[i][0] = "user"+i;
            users[i][1] = "password"+i;
        }
        String uId = id.getText().toString();
        String pass = password.getText().toString();
        boolean valid = false;
        for(int i = 0; i < 5; i++){
            if(uId.equals(users[i][0]))
                if(pass.equals(users[i][1]))
                {
                    valid = true;
                    break;
                }
        }
        String res = "";
        if(valid)
            res += "Successful";
        else
            res = "Invalid";
        Toast.makeText(this, res, Toast.LENGTH_SHORT).show();
    }
}

