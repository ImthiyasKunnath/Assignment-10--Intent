package com.rapposol.assignment10_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v)
    {
        Intent i = new Intent(this,Main2Activity.class);
        EditText ed = (EditText)findViewById(R.id.editText);
        String ms = ed.getText().toString();
        i.putExtra("Value",ms);
        startActivity(i);
    }
}
