package com.chris.parkingandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button bSign=(Button) findViewById(R.id.bSign);
        final TextView registerLink=(TextView) findViewById(R.id.tRegister);

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent=new Intent(LoginActivity.this,RegisterActivity.class);
               LoginActivity.this.startActivity(registerIntent);
            }
        });

        bSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignIntent=new Intent(LoginActivity.this,MainActivity1stpage.class);
                LoginActivity.this.startActivity(SignIntent);

            }
        });

    }
}

