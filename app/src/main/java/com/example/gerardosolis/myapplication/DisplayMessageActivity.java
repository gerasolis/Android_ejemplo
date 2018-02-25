package com.example.gerardosolis.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //Obtiene el intent que se manda desde la MainActivity y saca el string.
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Obtenemos el TextView por medio de su id, para ponerle el string message.
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
