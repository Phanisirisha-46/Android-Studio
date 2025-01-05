package com.example.experiment2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
    public void onClick_btn_ll(View v){
        Intent i = new Intent(this,linear_layout.class);
        this.startActivity(i);
    }
    public void onClick_btn_l(View v){
        Intent i = new Intent(this,table_layout.class);
        this.startActivity(i);
    }
    public void onClick_btn(View v){
        Intent i = new Intent(this,frame_layout.class);
        this.startActivity(i);
    }
    public void onClick_bt(View v){
        Intent i = new Intent(this,relative_layout.class);
        this.startActivity(i);
    }
    public void onClick_b(View v){
        Intent i = new Intent(this, Tab_layout.class);
        this.startActivity(i);
    }
}