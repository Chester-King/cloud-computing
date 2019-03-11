package com.example.amazonians.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.amazonians.R;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        (findViewById(R.id.btn_login)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etUser = findViewById(R.id.ET_userLogin);
                String user = etUser.getText().toString();
                EditText etPass = findViewById(R.id.ET_passLogin);
                String pass = etPass.getText().toString();

                if (user.equals("admin") && pass.equals("qwert")) {
                    startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                } else {
                    Toast.makeText(LoginActivity.this, "Check Email and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        (findViewById(R.id.textView4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SignupActivity.class));
            }
        });

    }
}
