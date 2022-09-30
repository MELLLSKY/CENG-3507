package com.example.myapplication2;

import android.app.ListActivity;
import android.support.v4.app.RemoteActionCompatParcelizer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ArrayAdapterActivity extends ListActivity {
    static final String[] ANIMALS= new String[]{"ant", "bear","bird","cat","dog","donkey","elephant","giraffe","goat","monkey","pig","rat","snake","spider"};
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_array_adapter,ANIMALS));
        ListView listView= getListView();
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),((TextView)view).getText(),Toast.LENGTH_SHORT).show();

            }
        });
    }

}
