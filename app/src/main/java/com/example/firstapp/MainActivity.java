package com.example.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private TextView mTextView;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.mButton);
        mButton.setText(R.string.do_not_press);
        mTextView = findViewById(R.id.mTextView);
        mEditText = findViewById(R.id.editText);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String enteredText;

                enteredText = mEditText.getText().toString();

                mTextView.setVisibility(View.VISIBLE);
                mTextView.setText(enteredText);
            }
        });

    }
}
