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
    TextView preorderString;
    TextView postorderString;
    AATree aaTree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberBox = findViewById(R.id.boxNumbers);
        inorderString = findViewById(R.id.inorderText);
        preorderString = findViewById(R.id.preorderText);
        postorderString = findViewById(R.id.postorderText);
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

            aaTree.preorder();
            String preorder = aaTree.getPreorderString();
            preorderString.setText(preorder);
            aaTree.SetPreorderString("");

            aaTree.postorder();
            String postorder = aaTree.getPostorderString();
            postorderString.setText(postorder);
            aaTree.SetPostorderString("");
        }


    }

    public void ClearButton(View view){
        aaTree.clear();
        Toast.makeText(this, "AA Tree has been cleared", Toast.LENGTH_SHORT).show();
        inorderString.setText("");
        aaTree.setInorderString("");

        preorderString.setText("");
        aaTree.SetPreorderString("");

        postorderString.setText("");
        aaTree.SetPostorderString("");



    }

}