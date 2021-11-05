package com.practicalcoding.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class login extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText edit_name = findViewById(R.id.edit_name);
        final EditText edit_position = findViewById(R.id.edit_position);
        Button btn = findViewById(R.id.btn_submit);
        DAOEmployee dao =new DAOEmployee();
        btn.setOnClickListener(v ->
        {
           /* Employee emp = new Employee(edit_name.getText().toString(),edit_position.getText().toString());
            dao.add(emp).addOnSuccessListener(suc->
            {
                Toast.makeText(this,"Record is inserted", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er->
            {
                Toast.makeText(this,""+er.getMessage(), Toast.LENGTH_SHORT).show();
            });*/
            HashMap<String,Object> hashmap =new HashMap<>();
            HashMap.put("name",edit_name.getText().toString());
            HashMap.put("Position",edit_position.getText().toString());
            dao.update("",hashmap).addOnSuccessListener(suc->
            {
                Toast.makeText(this,"Record is inserted", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er->
            {
                Toast.makeText(this,""+er.getMessage(), Toast.LENGTH_SHORT).show();
            });
        });
    }
}