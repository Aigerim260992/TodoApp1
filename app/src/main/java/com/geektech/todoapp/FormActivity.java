package com.geektech.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {


    private EditText editTitle;
    private EditText editDecs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        editTitle = findViewById(R.id.editTitle);
    }

    public void onClick(View view) {
        String title = editTitle.getText().toString().trim();
        Intent intent = new Intent();
        intent.putExtra("title", title);
        setResult(RESULT_OK, intent);
        finish();
    }
}
