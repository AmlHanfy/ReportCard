package com.example.aml.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ReportCard> grades = new ArrayList<ReportCard>();
        grades.add(new ReportCard("English Grade","A"));
        grades.add(new ReportCard("Math Grade","A-"));
        grades.add(new ReportCard("History Grade","B"));
        grades.add(new ReportCard("Biology Grade","A"));
        grades.add(new ReportCard("Chemisrty Grade","C"));

        GradeAdapter adapter = new GradeAdapter(this, grades);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}
