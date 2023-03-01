package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText costOfService;
    private Button calcButton;
    private Switch roundUpSwitch;
    private RadioGroup radioGroup;
    private TextView tipAmountText;
    private double tipAmount;
    private double tipPercent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        costOfService = findViewById(R.id.costOfService);
        calcButton = findViewById(R.id.calculate);
        radioGroup = findViewById(R.id.radioGroup);
        roundUpSwitch = findViewById(R.id.switch1);
        tipAmountText = findViewById(R.id.tipAmount);


        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cost = costOfService.getText();
                int costAmount = Integer.parseInt()
            }
        });

    }
}