package com.geektech.studentsjournal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener{
RecyclerView recyclerView;
MainAdapter mainAdapter;
EditText editTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.students_recycler);
        mainAdapter =new MainAdapter();
        recyclerView.setAdapter(mainAdapter);
        mainAdapter.listener=this;
        editTxt = findViewById(R.id.edit_text);
    }

    public void enter_Text(View view) {
        String a = editTxt.getText().toString();
        mainAdapter.addInfo(a);

    }
    public void openInfo(String str){
        Intent intent = new Intent(this, InfoActivity.class);
        intent.putExtra("key", str);
        startActivity(intent);
    }

    @Override
    public void onClick(String s) {
        openInfo(s);
    }

}
