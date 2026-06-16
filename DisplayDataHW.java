package com.nibm.startApp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayDataHW extends AppCompatActivity {

    TextView txtName, txtEmail, txtMobile;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data_hw);

        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtMobile = findViewById(R.id.txtMobile);
        btnBack = findViewById(R.id.btnBack);

        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String mobile = getIntent().getStringExtra("mobile");

        txtName.setText("Name: " + name);
        txtEmail.setText("Email: " + email);
        txtMobile.setText("Mobile: " + mobile);

        btnBack.setOnClickListener(v -> finish());
    }
}