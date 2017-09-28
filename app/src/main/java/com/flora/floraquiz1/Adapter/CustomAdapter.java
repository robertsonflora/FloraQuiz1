package com.flora.floraquiz1.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.flora.floraquiz1.Model.AndroidVersion;
import com.flora.floraquiz1.R;

import java.util.List;

/**
 * Created by Robertson on 28/09/2017.
 */

public class CustomAdapter extends BaseAdapter {

    Context c;
    List<AndroidVersion> androidVersions;
    ImageView iv_Logo;
    TextView tv_Codename;


    @Override
    public int getCount() {
        return androidVersions.size();
    }

    @Override
    public Object getItem(int i) {
        return androidVersions.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public CustomAdapter(Context c, List<AndroidVersion> androidVersions){
        this.c = c;
        this.androidVersions = androidVersions;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        View v = View.inflate(c, R.layout.row_layout, null);
        iv_Logo = (ImageView) v.findViewById(R.id.iv_logo);
        tv_Codename = (TextView) v.findViewById(R.id.tv_codename);


        tv_Codename.setText(androidVersions.get(i).getCodename());
        iv_Logo.setImageResource(androidVersions.get(i).getLogo());

        return v;
    }
}
