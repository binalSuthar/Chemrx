package com.example.bini.chemrx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView ForgotPassword,textView;
    private EditText ET_UserName, ET_Password;
    private String UserName, Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ForgotPassword=(TextView)findViewById(R.id.tv_forgetpassword);
        ForgotPassword.setOnClickListener(this);
        textView=(TextView)findViewById(R.id.noaccount);
        textView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_forgetpassword:
                Intent intent=new Intent(LoginActivity.this,ForgotPassword.class);
                startActivity(intent);
                break;

            case R.id.noaccount:
                Intent intent1=new Intent(LoginActivity.this,RegistrationScreen.class);
                startActivity(intent1);

                break;
        }

    }
}
