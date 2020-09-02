package com.example.gorevyoneticisi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DayActivity extends AppCompatActivity {
     TextView titleTxt, note1Edt, note2Edt, note3Edt, note4Edt, note5Edt;
     Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        titleTxt = findViewById(R.id.title_txt);
        note1Edt = findViewById(R.id.note1_Edt);
        note2Edt = findViewById(R.id.note2_Edt);
        note3Edt = findViewById(R.id.note3_Edt);
        note4Edt = findViewById(R.id.note4_Edt);
        note5Edt = findViewById(R.id.note5_Edt);
        saveButton = findViewById(R.id.save_btn);


    }
}
