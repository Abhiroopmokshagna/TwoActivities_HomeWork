package com.example.mokshagna.TwoActivitiesHomeWork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public TextView textdisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textdisplay = (TextView)findViewById(R.id.display);
        Intent intent = getIntent();
        String count = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        count = "Hello!\n"+count;
        textdisplay.setText(count);
        Log.d("SecondActivity","Here2");
    }
}
