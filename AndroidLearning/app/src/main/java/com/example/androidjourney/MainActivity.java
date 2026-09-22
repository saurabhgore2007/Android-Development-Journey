package com.example.androidjourney;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText input;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_greeting);

        text = findViewById(R.id.result);
        input = findViewById(R.id.input);
        submit = findViewById(R.id.submit);


        submit.setOnClickListener(v ->
        {
            String str = input.getText().toString();
            text.setText(str);
        });

    }
}