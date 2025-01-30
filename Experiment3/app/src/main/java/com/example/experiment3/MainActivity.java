package com.example.experiment3;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void btn_show_dialog(View v){
        Log.d("MicDialog", "btn_show_dialog:one");
        AlertDialog.Builder ad=new AlertDialog.Builder(this);
        Log.d("MicDialog", "btn_show_dialog:two");
        Toast.makeText(this, "Hii", Toast.LENGTH_SHORT).show();
        ad.setTitle("Welcome Here to MicDialog");
        ad.setMessage("Hi!! Buddy. How are you doing??");
        ad.setCancelable(true);
        ad.setPositiveButton("Its ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(MainActivity.this,"clicked on Its ok", Toast.LENGTH_SHORT).show();
            }
        });
        ad.setNegativeButton("I'm Sorry", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(MainActivity.this,"clicked on I'm Sorry", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog a=ad.create();
        Log.d("MicDialog","btn_show_dialog:three"+toString());
        a.show();
    }
    public void btn_show_time(View v){
        int dH,dMin;
        Calendar c= Calendar.getInstance();
        dH=c.get(Calendar.HOUR);
        dMin=c.get(Calendar.MINUTE);
        TimePickerDialog tpd=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener(){
            public void onTimeSet(TimePicker timePicker, int i, int i1){
                Toast.makeText(MainActivity.this, i+"H:"+i1+"m", Toast.LENGTH_SHORT).show();
            }
        },dH, dMin, false);
        tpd.show();
    }
    public void btn_show_date(View v){
        int dY,dM,dD;
        Calendar c=Calendar.getInstance();
        dY=c.get(Calendar.YEAR);
        dM=c.get(Calendar.MONTH);
        dD=c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dp= new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int i, int i1, int i2) {
                Toast.makeText(MainActivity.this,i+"Y"+(i1+1)+"m"+i2+"d",Toast.LENGTH_SHORT).show();
            }
        },dY,dM, dD);
        dp.setTitle("Pick a date: ");
        dp.setMessage("Hii my World!!");
        dp.show();
    }
}