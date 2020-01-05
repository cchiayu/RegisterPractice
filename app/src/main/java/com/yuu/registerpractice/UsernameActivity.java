package com.yuu.registerpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UsernameActivity extends AppCompatActivity {

    private EditText user;
    Button nexttopassword = findViewById(R.id.nexttopassword);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);
        user = findViewById(R.id.usname_fill);
        nexttopassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentpassword = new Intent(UsernameActivity.this, PasswordActivity.class);
                intentpassword.putExtra("user", user.getText().toString());
                startActivity(intentpassword);

            }
        });

     }

    }

