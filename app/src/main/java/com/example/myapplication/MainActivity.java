package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button tambahButton = findViewById(R.id.tambah);
        Button kurangButton = findViewById(R.id.kurang);
        Button ResetButton = findViewById(R.id.Reset);

        TextView OutputText = findViewById(R.id.outputText);

        kurangButton.setEnabled(false);
        ResetButton.setEnabled(false);
        tambahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value= String.valueOf(OutputText.getText());
                int i =Integer.parseInt(value);
                ++i;
                if (i<=0){
                    ResetButton.setEnabled(false);
                    kurangButton.setEnabled(false);
                }else{
                    ResetButton.setEnabled(true);
                    kurangButton.setEnabled(true);

                }
                String s=String.valueOf(i);
                OutputText.setText(s);
            }
        });

        kurangButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value= String.valueOf(OutputText.getText());
                int i =Integer.parseInt(value);
                --i;
                if (i<=0){
                    ResetButton.setEnabled(false);
                    kurangButton.setEnabled(false);
                }else{
                    ResetButton.setEnabled(true);
                    kurangButton.setEnabled(true);


                }
                String s=String.valueOf(i);
                OutputText.setText(s);
            }
        });
        ResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResetButton.setEnabled(false);
                kurangButton.setEnabled(false);
                OutputText.setText("0");
            }
        });
    }
}