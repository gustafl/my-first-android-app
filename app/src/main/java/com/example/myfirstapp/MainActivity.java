package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        // Let the intent point to a specific activity
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        // Find the textbox
        EditText editText = findViewById(R.id.editText);
        // Get the text from the textbox
        String message = editText.getText().toString();
        // Insert the text as a MESSAGE extra into the intent
        intent.putExtra(EXTRA_MESSAGE, message);
        // Start the activity with the intent
        startActivity(intent);
    }
}
