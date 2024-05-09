package com.example.treepr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonGroupT = findViewById(R.id.buttonGroupT);
        Button buttonGroupP = findViewById(R.id.buttonGroupP);
        Button buttonGroupCA = findViewById(R.id.buttonGroupCA);

        buttonGroupT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGroupActivity("T");
            }
        });

        buttonGroupP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGroupActivity("P");
            }
        });

        buttonGroupCA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGroupActivity("CA");
            }
        });
    }

    private void openGroupActivity(String groupType) {
        ArrayList<String> groups = new ArrayList<>();
        switch (groupType) {
            case "T":
                groups.add("Т50-1-20");
                groups.add("Т50-1-21");
                groups.add("Т50-1-22");
                groups.add("Т50-11/1-23");
                groups.add("Т50-11/1-22");
                groups.add("Т50-11-22");
                groups.add("Т50-11-23");
                break;
            case "P":
                groups.add("П50-1-20");
                groups.add("П50-1-21");
                groups.add("П50-1-22");
                groups.add("П50-2-20");
                groups.add("П50-2-21");
                groups.add("П50-2-22");
                break;
            case "CA":
                groups.add("СА50-1-20");
                groups.add("СА50-1-21");
                groups.add("СА50-1-22");
                groups.add("СА50-2-20");
                groups.add("СА50-2-21");
                groups.add("СА50-2-22");
                break;
        }

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putStringArrayListExtra("GROUP_LIST", groups);
        startActivity(intent);
    }
}
