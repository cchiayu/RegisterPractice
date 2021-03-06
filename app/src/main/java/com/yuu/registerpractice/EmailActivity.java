package com.yuu.registerpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmailActivity extends AppCompatActivity {

    private EditText mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        mail = findViewById(R.id.mail_fill);
        final Intent emailintent = getIntent();//能得到密碼資料

        final Button endbutton = findViewById(R.id.backtomain);
        endbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivityintent = new Intent(EmailActivity.this,MainActivity.class);
                MainActivityintent
                        .putExtra("user",emailintent.getStringExtra("user"))
                        .putExtra("password",emailintent.getStringExtra("password"))
                        .putExtra("email", mail.getText().toString());

                MainActivityintent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
//                setResult(RESULT_OK,emailintent);
                startActivity(MainActivityintent);

                Log.d("emailActivity","d:"+emailintent.getStringExtra("user"));
                Log.d("emailActivity","d:"+emailintent.getStringExtra("password"));
                Log.d("emailActivity","d:"+ mail.getText().toString());
            }
        });

    }
}
