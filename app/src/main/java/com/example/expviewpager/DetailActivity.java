package com.example.expviewpager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent itt=getIntent();
        String aa = itt.getStringExtra("nomPro");
        Toast.makeText(this, aa, Toast.LENGTH_SHORT).show();
    }
}