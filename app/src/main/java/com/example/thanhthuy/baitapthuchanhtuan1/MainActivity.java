package com.example.thanhthuy.baitapthuchanhtuan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button btnClick;
    EditText edInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text = (TextView) findViewById(R.id.tvDisplay);
        Button btbClick = (Button) findViewById(R.id.btnClick);
        final EditText edInput = (EditText) findViewById(R.id.editInput);
        edInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Toast.makeText(getApplicationContext(),"Input information please!",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String value = edInput.getText().toString();
                text.setText(value);
            }

            @Override
            public void afterTextChanged(Editable s) {
              
            }
        });
        btbClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Input information please!",Toast.LENGTH_LONG).show();
            }
        });

    }
}
