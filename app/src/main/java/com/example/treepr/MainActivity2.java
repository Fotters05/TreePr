package com.example.treepr;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView listViewGroups = findViewById(R.id.listViewGroups);

        ArrayList<String> groups = getIntent().getStringArrayListExtra("GROUP_LIST");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, groups);
        listViewGroups.setAdapter(adapter);
    }
}
