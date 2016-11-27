package com.example.ibas.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;

    String[] itemname = {
            "Antonio",
            "Budi",
            "Agus",
            "Joko",
            "Cia",
            "Febri",
            "Astuti",
            "Andre",
            "Andri",
            "Anju"
    };

    Integer[] imgid = {
            R.drawable.gb1,
            R.drawable.gb2,
            R.drawable.gb3,
            R.drawable.gb4,
            R.drawable.gb5,
            R.drawable.gb6,
            R.drawable.gb7,
            R.drawable.gb8,
            R.drawable.gb9,
            R.drawable.gb10
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Contact");

        CustomListAdapter adapter = new CustomListAdapter(this,itemname,imgid);

        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = itemname[+position];
                Toast.makeText(getApplicationContext(),selectedItem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
