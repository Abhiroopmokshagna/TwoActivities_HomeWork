package com.example.mokshagna.TwoActivitiesHomeWork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int mCount;
    private TextView mShowCount;
    public final static String EXTRA_MESSAGE = "com.mokshagna.abhiroop.TwoActivitiesHomeWork.MainActivity.EXTRA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCount = 0;
        mShowCount = findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        mCount++;
        mShowCount.setText(Integer.toString(mCount));
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        String x = mShowCount.getText().toString();
        intent.putExtra("EXTRA_MESSAGE",x);
        startActivity(intent);
        Log.d("MainActivity","Here1");
    }
}
