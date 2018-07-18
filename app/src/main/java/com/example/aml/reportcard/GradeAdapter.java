package com.example.aml.reportcard;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Aml on 2017-11-23.
 */

public class GradeAdapter extends ArrayAdapter<ReportCard> {
    public GradeAdapter(Activity context, ArrayList<ReportCard> grades) {
        super(context, 0, grades);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        ReportCard currentGrade  = getItem(position);
        TextView wordTextView = (TextView) listItemView.findViewById(R.id.word_text_view);
        wordTextView.setText(currentGrade.getSubject());

        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.grade_text_view);
        gradeTextView.setText(currentGrade.getSubjectGrade());
        return listItemView;
    }
}