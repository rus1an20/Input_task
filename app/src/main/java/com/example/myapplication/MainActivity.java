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
        getSupportActionBar().hide();
        Button plusButtonBurg = findViewById(R.id.plus_button_burg);
        Button minusButtonBurg = findViewById(R.id.minus_button_burg);
        Button plusButtonChick = findViewById(R.id.plus_button_chick);
        Button minusButtonChick = findViewById(R.id.minus_button_chick);
        Button plusButtonCola = findViewById(R.id.plus_button_cola);
        Button minusButtonCola = findViewById(R.id.minus_button_cola);
        Button plusButtonSous = findViewById(R.id.plus_button_sous);
        Button minusButtonSous = findViewById(R.id.minus_button_sous);
        Button go = findViewById(R.id.go);

        plusButtonBurg.setOnClickListener(this::PlusBurg);
        minusButtonBurg.setOnClickListener(this::MinusBurg);
        plusButtonChick.setOnClickListener(this::PlusChick);
        minusButtonChick.setOnClickListener(this::MinusChick);
        plusButtonCola.setOnClickListener(this::PlusCola);
        minusButtonCola.setOnClickListener(this::MinusCola);
        plusButtonSous.setOnClickListener(this::PlusSous);
        minusButtonSous.setOnClickListener(this::MinusSous);
        go.setOnClickListener(this::Go);
    }

    public void PlusBurg(View view) {
        TextView plusI = findViewById(R.id.burg_num);
        plus(plusI);
        TextView sum = findViewById(R.id.sum);
        for (int i = 0; i < 3; i++) {
            plus(sum);
        }
    }

    public void MinusBurg(View view) {
        TextView minusI = findViewById(R.id.burg_num);
        minus(minusI);
        TextView sum = findViewById(R.id.sum);
        for (int i = 0; i < 3; i++) {
            minus(sum);
        }
    }

    public void PlusChick(View view) {
        TextView plusI = findViewById(R.id.chick_num);
        plus(plusI);
        TextView sum = findViewById(R.id.sum);
        for (int i = 0; i < 5; i++) {
            plus(sum);
        }
    }

    public void MinusChick(View view) {
        TextView minusI = findViewById(R.id.chick_num);
        minus(minusI);
        TextView sum = findViewById(R.id.sum);
        for (int i = 0; i < 5; i++) {
            minus(sum);
        }
    }

    public void PlusCola(View view) {
        TextView plusI = findViewById(R.id.cola_num);
        plus(plusI);
        TextView sum = findViewById(R.id.sum);
        for (int i = 0; i < 2; i++) {
            plus(sum);
        }
    }

    public void MinusCola(View view) {
        TextView minusI = findViewById(R.id.cola_num);
        minus(minusI);
        TextView sum = findViewById(R.id.sum);
        for (int i = 0; i < 2; i++) {
            minus(sum);
        }
    }

    public void PlusSous(View view) {
        TextView plusI = findViewById(R.id.sous_num);
        plus(plusI);
        TextView sum = findViewById(R.id.sum);
        plus(sum);
    }

    public void MinusSous(View view) {
        TextView minusI = findViewById(R.id.sous_num);
        minus(minusI);
        TextView sum = findViewById(R.id.sum);
        minus(sum);
    }

    public static void plus(TextView textView) {
        String num = (String) textView.getText();
        int plusOne = Integer.parseInt(num);
        plusOne++;
        String res = String.valueOf(plusOne);
        textView.setText(res);
    }

    public static void minus(TextView textView) {
        String num = (String) textView.getText();
        int plusOne = Integer.parseInt(num);
        if (plusOne > 1) {
            plusOne--;
        }
        String res = String.valueOf(plusOne);
        textView.setText(res);
    }

    public void Go(View view) {
        TextView ogo = findViewById(R.id.ogo);
        TextView tView = findViewById(R.id.sum);
        if (tView.getText().equals("0")) {
            ogo.setText(R.string.err);
        } else {
            ogo.setText(R.string.desc);
        }
    }
}