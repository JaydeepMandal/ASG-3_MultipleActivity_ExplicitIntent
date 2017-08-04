package com.example.ee.asg_3_multipleactivity_explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setTitle(R.string.second_activity_name);

        disp = (TextView) findViewById(R.id.L2_messageDisp);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String msg = bundle.getString("MESSAGE");

        disp.setText(msg);
    }
}
