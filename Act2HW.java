package com.nibm.startApp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Act2HW extends AppCompatActivity {

    EditText edtName, edtEmail, edtMobile;
    Button btnSubmit, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2_hw);

        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtMobile = findViewById(R.id.edtMobile);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnClear = findViewById(R.id.btnClear);

        btnSubmit.setOnClickListener(v -> submitForm());

        btnClear.setOnClickListener(v -> {
            edtName.setText("");
            edtEmail.setText("");
            edtMobile.setText("");
            edtName.requestFocus();
        });
    }

    private void submitForm() {
        String name = edtName.getText().toString().trim();
        String email = edtEmail.getText().toString().trim();
        String mobile = edtMobile.getText().toString().trim();

        if (name.isEmpty()) {
            edtName.setError("Name is required");
            edtName.requestFocus();
            return;
        }

        if (email.isEmpty()) {
            edtEmail.setError("Email is required");
            edtEmail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            edtEmail.setError("Enter a valid email");
            edtEmail.requestFocus();
            return;
        }

        if (mobile.isEmpty()) {
            edtMobile.setError("Mobile number is required");
            edtMobile.requestFocus();
            return;
        }

        if (!mobile.matches("[0-9]{10}")) {
            edtMobile.setError("Enter a valid 10-digit mobile number");
            edtMobile.requestFocus();
            return;
        }

        Toast.makeText(this, "Form submitted successfully", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(Act2HW.this, DisplayDataHW.class);
        intent.putExtra("name", name);
        intent.putExtra("email", email);
        intent.putExtra("mobile", mobile);
        startActivity(intent);
    }
}