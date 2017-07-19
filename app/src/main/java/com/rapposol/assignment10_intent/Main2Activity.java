package com.rapposol.assignment10_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt =(TextView) findViewById(R.id.textView);
        String msg = getIntent().getExtras().getString("Value");
        txt.setText(msg);

    }

}
