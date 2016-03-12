package com.example.zmartd3vil.mockupquotimefix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void startReminder(View view){
        startActivity(new Intent(this, Reminder.class));
    }

    public  void  startProfilling(View view){
        startActivity(new Intent(this, Profilling.class));
    }

    public void startStatistik(View view){
        startActivity(new Intent(this, Statistik.class));
    }

    public  void startKuota(View view){
        startActivity(new Intent(this, Kuota.class));
    }

}
