package com.example.clark.calendar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Intent intent = this.getIntent();
        Bundle b = intent.getExtras();
        long date = b.getLong("date");
        Date day = new Date(date);
        TextView dayText = findViewById(R.id.textDate);
        dayText.setText(day.toString());
    }
}
