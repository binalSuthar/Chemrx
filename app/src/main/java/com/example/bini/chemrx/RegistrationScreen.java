package com.example.bini.chemrx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegistrationScreen extends AppCompatActivity implements View.OnClickListener {
    TextView Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_screen);
        Login=(TextView)findViewById(R.id.tv_login);
        Login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_login:
                Intent intent=new Intent(RegistrationScreen.this,LoginActivity.class);
                startActivity(intent);

                break;
        }
    }
}
