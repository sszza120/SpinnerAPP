package com.sszza120.spinnerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner sp_main, sp_vice;
    private TextView txvshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp_main = findViewById(R.id.sp_main);
        sp_vice = findViewById(R.id.sp_vice);
        txvshow = findViewById(R.id.txvshow);

        String[] vice_meal_array = {"紅茶", "汽水", "果汁"};
        ArrayAdapter<String> ad = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,vice_meal_array);

        sp_vice.setAdapter(ad);
    }

    public void btnOK(View view) {
        String main = sp_main.getSelectedItem().toString();
        String vice = sp_vice.getSelectedItem().toString();

        txvshow.setText("主餐:" + main + "\n" + "附餐:" + vice);
    }
}
