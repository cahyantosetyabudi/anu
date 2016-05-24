package com.example.zmartd3vil.mockupquotimefix;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TimePicker;
import android.widget.Toast;

public class Reminder extends AppCompatActivity {

    RelativeLayout relativeLayout_stpd;
    int jam;
    int menit;
    static final int DIALOG_ID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        showTimePickerDialog();
    }

    public void showTimePickerDialog(){
        relativeLayout_stpd = (RelativeLayout)findViewById(R.id.switch_reminder_kuota_harian);
        relativeLayout_stpd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showDialog(DIALOG_ID);
                    }
                }
        );
    }

    @Override
    protected Dialog onCreateDialog(int id){
        if (id == DIALOG_ID)
            return new TimePickerDialog(this, kTimePickerListener, jam, menit, false);
        return null;
    }

    protected TimePickerDialog.OnTimeSetListener kTimePickerListener = new TimePickerDialog.OnTimeSetListener(){
        @Override
        public void onTimeSet (TimePicker v, int hourOfDay, int minute){
            jam = hourOfDay;
            menit = minute;
            Toast.makeText(Reminder.this, jam + ":" + menit, Toast.LENGTH_LONG).show();
        }
    };
}
