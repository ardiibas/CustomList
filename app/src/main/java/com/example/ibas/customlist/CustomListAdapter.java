package com.example.ibas.customlist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ibas on 27/11/2016.
 */

public class CustomListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;

    public CustomListAdapter(Activity context, String[] itemname, Integer[] imgid) {
        super(context,R.layout.my_list,itemname);

        this.context = context;
        this.itemname = itemname;
        this.imgid = imgid;
    }

    @Override
    public View getView(int positon, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.my_list,null,true);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView imageText  = (TextView) rowView.findViewById(R.id.item);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        imageText.setText(itemname[positon]);
        imageView.setImageResource(imgid[positon]);
        extratxt.setText("Description " + itemname[positon]);

        return rowView;
    }
}
