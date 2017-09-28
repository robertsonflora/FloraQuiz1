package com.flora.floraquiz1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.flora.floraquiz1.Adapter.CustomAdapter;
import com.flora.floraquiz1.Model.AndroidVersion;
import com.flora.floraquiz1.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] codename, version, api, date;
    int[] logo;
    ListView lv_AndroidVersion;
    ArrayList<AndroidVersion> listCodenames;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        codename = getResources().getStringArray(R.array.codename);
        version = getResources().getStringArray(R.array.version);
        api = getResources().getStringArray(R.array.api);
        date = getResources().getStringArray(R.array.date);


        lv_AndroidVersion = (ListView) findViewById(R.id.lvAndroid);
        listCodenames = new ArrayList<AndroidVersion>();

        logo = new int[]{R.drawable.kitkat, R.drawable.nougat, R.drawable.oreo};


        for(int i = 0; i < codename.length; i++){
            listCodenames.add(new AndroidVersion(logo[i], codename[i]));
        }

        adapter = new CustomAdapter(MainActivity.this, listCodenames);
        lv_AndroidVersion.setAdapter(adapter);

        lv_AndroidVersion.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (codename[i].equalsIgnoreCase("KitKat")){
                    Intent intent = new Intent(lv_AndroidVersion.getContext(), Display_KitKat.class);
                    lv_AndroidVersion.getContext().startActivity(intent);
                }
                if (codename[i].equalsIgnoreCase("Nougat")){
                    Intent intent = new Intent(lv_AndroidVersion.getContext(), Display_Nougat.class);
                    lv_AndroidVersion.getContext().startActivity(intent);
                }
                if (codename[i].equalsIgnoreCase("Oreo")){
                    Intent intent = new Intent(lv_AndroidVersion.getContext(), Display_Oreo.class);
                    lv_AndroidVersion.getContext().startActivity(intent);
                }
            }
        });
    }

    public void KitKat(View view){
        Intent intent = new Intent(this, Display_KitKat.class);
        startActivity(intent);
    }
    public void Nougat(View view){
        Intent intent = new Intent(this, Display_Nougat.class);
        startActivity(intent);
    }
    public void Oreo(View view){
        Intent intent = new Intent(this, Display_Oreo.class);
        startActivity(intent);
    }
    public void Home(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}

