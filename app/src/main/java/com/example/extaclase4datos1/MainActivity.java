package com.example.extaclase4datos1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText numberBox;
    TextView inorderString;
    AATree aaTree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberBox = findViewById(R.id.boxNumbers);
        inorderString = findViewById(R.id.inorderText);

        aaTree = new AATree();
    }

    public void SaveButton(View view){
        String content = numberBox.getText().toString();
        if(content.isEmpty()){
            Toast.makeText(this, "You have to enter a number...", Toast.LENGTH_SHORT).show();
            numberBox.getText().clear();
        }else{
            int numFinal = Integer.parseInt(content);
            aaTree.insert(numFinal);
            Toast.makeText(this, "Number " + content + " saved correctly", Toast.LENGTH_SHORT).show();
            numberBox.getText().clear();
            aaTree.inorder();
            String inorder = aaTree.getInorderString();
            inorderString.setText(inorder);
            aaTree.setInorderString("");






        }
    }
}