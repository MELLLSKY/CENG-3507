package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import java.util.List;

import java.util.ArrayList;

public class CustomAdapterActivity extends AppCompatActivity {
    final  List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);
        animals.add(new Animal("ant", R.drawable.ant_foreground));
        animals.add(new Animal("bear", R.mipmap.bear));
        animals.add(new Animal("bird", R.mipmap.bird));
        animals.add(new Animal("cat", R.mipmap.kedi));
        animals.add(new Animal("dog", R.mipmap.dog));

        final ListView listView =(ListView) findViewById(R.id.listview);
        AnimalAdapter adapter= new AnimalAdapter(this,animals);
        listView.setAdapter(adapter);




    }
}