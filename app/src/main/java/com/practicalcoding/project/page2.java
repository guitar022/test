package com.practicalcoding.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
    EditText getmEditText1;
    EditText getmEditText2;
    private EditText mEditText1;
    private EditText mEditText2;
    private TextView mTextViewResult;
    private TextView mTextView1Result;
    private Button mButtonAdd;
    private Button mButtonClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        mEditText1 = findViewById(R.id.edittext_number_1);
        mEditText2 = findViewById(R.id.edittext_number_2);
        mTextViewResult = findViewById(R.id.textview_result);
        mTextView1Result = findViewById(R.id.textview1_result);
        mButtonAdd = findViewById(R.id.button_add);
        mButtonClear = findViewById(R.id.button_clear);
        getmEditText1 = findViewById(R.id.edittext_number_1);
        getmEditText2 = findViewById(R.id.edittext_number_2);

        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText1.getText().toString().length() == 0){
                    mEditText1.setText("0");
                }
                if (mEditText2.getText().toString().length() == 0){
                    mEditText2.setText("0");
                }
                int num1 = Integer.parseInt(mEditText1.getText().toString());
                int num2 = Integer.parseInt(mEditText2.getText().toString());

                int sum = (num1 - num2)/30;
                int sum1 = (num1 - num2)/7;

                mTextViewResult.setText(String.valueOf(sum));
                mTextView1Result.setText(String.valueOf(sum1));
            }
        });

        mButtonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getmEditText1.getText().clear();
                getmEditText2.getText().clear();

            }
        });

        Button page2 = (Button) findViewById(R.id.page2);
        page2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(page2.this ,page2.class);
                startActivity(i);
            }
        });
        Button page3 = (Button) findViewById(R.id.page3);
        page3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(page2.this ,page3.class);
                startActivity(i);
            }
        });
        Button page4 = (Button) findViewById(R.id.page4);
        page4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(page2.this ,page4.class);
                startActivity(i);
            }
        });
        Button page1 = (Button) findViewById(R.id.page1);
        page1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(page2.this ,MainActivity.class);
                startActivity(i);
            }
        });
    }
}