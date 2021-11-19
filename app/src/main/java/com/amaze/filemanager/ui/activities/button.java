package com.amaze.filemanager.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amaze.filemanager.R;

public class button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }
    public void buttonTest(View view){
        Intent intent = new Intent(button.this,MainActivity.class);
        startActivity(intent);
    }
}