package com.example.pr_18_makarow_pr_22106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button b48, b49, b50, b51, b52, b53;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b48 = (Button) findViewById(R.id.button);
        b48.setOnClickListener(this);
        b49 = (Button) findViewById(R.id.button3);
        b49.setOnClickListener(this);
        b50 = (Button) findViewById(R.id.button4);
        b50.setOnClickListener(this);
        b51 = (Button) findViewById(R.id.button5);
        b51.setOnClickListener(this);
        b52 = (Button) findViewById(R.id.button6);
        b52.setOnClickListener(this);
        b53 = (Button) findViewById(R.id.button7);
        b53.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button:
                startActivity(new Intent(this,simpleadapter.class));
                break;
            case R.id.button3:
                startActivity(new Intent(this,ex49.class));
                break;
            case R.id.button4:
                startActivity(new Intent(this,ex50.class));
                break;
            case R.id.button5:
                startActivity(new Intent(this,ex51.class));
                break;
            case R.id.button6:
                startActivity(new Intent(this,ex52.class));
                break;
            case R.id.button7:
                startActivity(new Intent(this,ex53.class));
                break;
        }
    }
}