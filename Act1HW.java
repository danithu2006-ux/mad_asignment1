package com.nibm.startApp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Act1HW extends AppCompatActivity {

    EditText edtMessage;
    Button btnShowToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1_hw);

        edtMessage = findViewById(R.id.edtMessage);
        btnShowToast = findViewById(R.id.btnShowToast);

        btnShowToast.setOnClickListener(v -> {
            String message = edtMessage.getText().toString().trim();

            if (message.isEmpty()) {
                Toast.makeText(this, "Please enter a message", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "You entered: " + message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}