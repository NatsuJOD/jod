package com.example.myproject_jod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView ipu,mgu,davv,iit,iim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ipu = (TextView) findViewById(R.id.ipu);
        mgu = (TextView) findViewById(R.id.mgu);
        davv = (TextView) findViewById(R.id.davv);
        iit = (TextView) findViewById(R.id.iit);
        iim = (TextView) findViewById(R.id.iim);

        ipu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, WebActivity.class);
                intent.putExtra("value_one","https://mait.ac.in/");
                startActivity(intent);

            }
        });
        mgu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, WebActivity.class);
                intent.putExtra("value_one","https://www.mgu.ac.in/");
                startActivity(intent);

            }
        });
        davv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this , WebActivity.class);
                intent.putExtra("value_one","https://www.dauniv.ac.in/");
                startActivity(intent);

            }
        });
        iit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, WebActivity.class);
                intent.putExtra("value_one","https://www.iitb.ac.in/");
                startActivity(intent);

            }
        });
        iim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, WebActivity.class);
                intent.putExtra("value_one","https://www.iima.ac.in/");
                startActivity(intent);

            }
        });

    }
}