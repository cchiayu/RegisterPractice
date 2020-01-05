package com.yuu.registerpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class PasswordActivity extends AppCompatActivity {

    private EditText pw;
    private Button nexttoemail;
    private int REQUEST_CODE_EMAILACTIVITY = 11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        pw = findViewById(R.id.pw_fill);//password的填入方塊
        final Intent intentpassword = getIntent();//得到姓名資料

        nexttoemail = findViewById(R.id.nexttoemail);
        nexttoemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentemail = new Intent(PasswordActivity.this, EmailActivity.class);
                intentemail
                        .putExtra("user", intentpassword.getStringExtra("user"))
                        .putExtra("password", pw.getText().toString());

                startActivity(intentemail);
            }
        });
    }
}



