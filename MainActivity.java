package com.example.a3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    Button saveID;
    EditText textID;
    LinearLayout list;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textID = findViewById(R.id.textID);
        saveID = findViewById(R.id.saveID);
        list = findViewById(R.id.list);
        saveID.setOnClickListener(onClick());
    }

    private OnClickListener onClick() {
        return new OnClickListener() {

            @Override
            public void onClick(View v) {
                list.addView(saveNewText(textID.getText().toString()));
            }
        };
    }

    private EditText saveNewText(String text) {
        final EditText savedNote = new EditText(this);
        savedNote.setText(text);
        return savedNote;
    }
}