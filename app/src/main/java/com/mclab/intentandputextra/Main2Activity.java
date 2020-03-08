package com.mclab.intentandputextra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
Intent intentData;
TextView textView;
String payload;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView);
        intentData=getIntent();
        payload=intentData.getStringExtra("data");
        if (payload!=null){
            textView.setText(payload);
        }else {
            Toast.makeText(this, "Empty Intent", Toast.LENGTH_SHORT).show();
        }
    }
}
