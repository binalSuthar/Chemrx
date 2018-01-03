package com.example.bini.chemrx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView textView ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        textView=(TextView)findViewById(R.id.tv);
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(SplashScreen.this,LoginActivity.class);
        startActivity(intent);
    }
}
