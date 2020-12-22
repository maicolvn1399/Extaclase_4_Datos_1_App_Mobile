package com.example.extaclase4datos1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText numberBox;
    AATree aaTree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberBox = findViewById(R.id.boxNumbers);
        aaTree = new AATree();
        aaTree.insert(5);
    }

    public void SaveButton(View view){
        Toast.makeText(this, "Number saved correctly...", Toast.LENGTH_SHORT).show();

    }
}