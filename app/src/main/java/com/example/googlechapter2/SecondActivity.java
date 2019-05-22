package com.example.googlechapter2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView Viewer = findViewById(R.id.View_Text);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        Viewer.setText(str);
    }

    public void Send(View view) {
        EditText TextToSend = findViewById(R.id.TextToSend);
        Intent Send = new Intent(getApplicationContext(),MainActivity.class);
        Send.putExtra("message",TextToSend.getText().toString());
        startActivity(Send);
    }
}
