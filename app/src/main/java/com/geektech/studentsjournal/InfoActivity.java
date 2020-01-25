package com.geektech.studentsjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        compariseInfo();
    }

    public void compariseInfo() {
        if (getIntent().hasExtra("key")) {

            String names = getIntent().getStringExtra("key");
            if (names.equals("Aigerim")) {
                addInfo(names + "Last name: smbdydaughter");

            }
            if (names.equals("Joodar")) {
                addInfo(names + "Last name: smbdyson");
            }
            if (names.equals("Kubat")) {
                addInfo(names + "Last name: Abdullaev");
            }
            if (!(names.equals("Aigerim") || !names.equals("Joodar") || !names.equals("Kubat"))) {
                addInfo("No data");
            }
        }
    }

        public void addInfo (String info){
            TextView textView = findViewById(R.id.activity_info);
            textView.setText(info);

        }

}