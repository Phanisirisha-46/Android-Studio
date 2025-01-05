package com.example.exp1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this, "Hello, Welcome", Toast.LENGTH_LONG).show();
    }
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this, "Hello, resume Welcome", Toast.LENGTH_LONG).show();
    }
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this, "Hello, pause Welcome", Toast.LENGTH_LONG).show();
    }

//    public void showToast(View x) {
//        Toast.makeText(this, "Hello, Welcome", Toast.LENGTH_LONG).show();
//    }

    public void showCustomToast(View v){
        LayoutInflater lf = getLayoutInflater();
        ViewGroup vg = findViewById(R.id.frame);
        View cv = lf.inflate(R.layout.customlayout,vg);
        ImageView imgv = cv.findViewById(R.id.imageView);
        imgv.setImageResource(R.drawable.img);
        Toast  t = new Toast(this);
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(cv);
        t.show();
    }
}