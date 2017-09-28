package com.flora.floraquiz1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.flora.floraquiz1.R;

public class Display_Oreo extends AppCompatActivity {

    ImageView iv_logo;
    TextView Codename, Version, Api, Date;
    String[] codename, version, api, date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        codename = getResources().getStringArray(R.array.codename);
        version = getResources().getStringArray(R.array.version);
        api = getResources().getStringArray(R.array.api);
        date = getResources().getStringArray(R.array.date);

        iv_logo = (ImageView) findViewById(R.id.iv_logo);
        iv_logo.setImageResource(R.drawable.oreo);

        Codename = (TextView) findViewById(R.id.tv_codename);
        Codename.setText("\nCodename: " + codename[2]);

        Version = (TextView) findViewById(R.id.tv_version);
        Version.setText("\nVersion:" + version[2]);

        Api = (TextView) findViewById(R.id.tv_api);
        Api.setText("\nAPI: " + api[2]);

        Date = (TextView) findViewById(R.id.tv_date);
        Date.setText("\nRelease Date: " + date[2]);
    }

    public void KitKat(View view){
        Intent intent = new Intent(this, Display_KitKat.class);
        startActivity(intent);
        finish();
    }

    public void Nougat(View view){
        Intent intent = new Intent(this, Display_Nougat.class);
        startActivity(intent);
        finish();
    }

    public void Home(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}