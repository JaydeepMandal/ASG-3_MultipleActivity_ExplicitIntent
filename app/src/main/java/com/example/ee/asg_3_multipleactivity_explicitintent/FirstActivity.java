package com.example.ee.asg_3_multipleactivity_explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    Button sendButton;
    EditText sendText;
    TextView disp,subHeading;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        setTitle(R.string.first_activity_name);

        sendButton = (Button) findViewById(R.id.sendButton);
        sendText = (EditText) findViewById(R.id.L1_editText);
        disp = (TextView) findViewById(R.id.reply);
        subHeading = (TextView) findViewById(R.id.heading);

    }

    public  void sendMessage(View v){

        Intent intent = new Intent(this,SecondActivity.class);
        Bundle bundle = new Bundle();

        bundle.putString("MESSAGE",String.valueOf(sendText.getText()));

        intent.putExtras(bundle);
        startActivityForResult(intent,2);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==2){
            if(resultCode==RESULT_OK){
                Bundle bundle = data.getExtras();
                String msg = bundle.getString("REPLY");
                disp.setText(msg);
                subHeading.setText("Reply Recieved :");
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        sendText.getText().clear();
    }
}
