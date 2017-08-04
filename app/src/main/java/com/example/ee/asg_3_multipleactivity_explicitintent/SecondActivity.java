package com.example.ee.asg_3_multipleactivity_explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView disp;
    Button replyButton;
    EditText sendText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setTitle(R.string.second_activity_name);

        disp = (TextView) findViewById(R.id.L2_messageDisp);
        replyButton = (Button) findViewById(R.id.replyButton);
        sendText = (EditText) findViewById(R.id.L2_editText);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String msg = bundle.getString("MESSAGE");

        disp.setText(msg);
    }

    public void replyMessage(View v){

        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("REPLY",String.valueOf(sendText.getText()));
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);
        finish();

    }
}
