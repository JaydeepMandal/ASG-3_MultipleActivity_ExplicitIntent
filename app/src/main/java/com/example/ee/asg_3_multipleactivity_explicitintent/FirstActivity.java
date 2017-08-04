package com.example.ee.asg_3_multipleactivity_explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    Button sendButton;
    EditText sendText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        setTitle(R.string.first_activity_name);

        sendButton = (Button) findViewById(R.id.sendButton);
        sendText = (EditText) findViewById(R.id.L1_editText);

    }

    public  void sendMessage(View v){

        Intent intent = new Intent(this,SecondActivity.class);
        Bundle bundle = new Bundle();

        bundle.putString("MESSAGE",String.valueOf(sendText.getText()));

        intent.putExtras(bundle);
        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();
        sendText.getText().clear();
    }
}
