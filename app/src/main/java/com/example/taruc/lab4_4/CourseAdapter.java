package com.example.taruc.lab4_4;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by TARC on 8/6/2015.
 */
public class CourseAdapter extends ArrayAdapter<Course> {

    public CourseAdapter(Activity context, int resource, List<Course> list) {
        super(context, resource, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Retrieve an instance of inflater
        Course course = getItem(position);

        //create an instance of inflater
        LayoutInflater inflater  = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //show a layout to display a record
        View rowView = inflater.inflate(R.layout.course_record, parent, false);

        TextView textViewCode, textViewTitle, textViewCredit;

        textViewCode = (TextView)rowView.findViewById(R.id.textViewCode);
        textViewTitle = (TextView)rowView.findViewById(R.id.textViewTitle);
        textViewCredit = (TextView)rowView.findViewById(R.id.textViewCredit);

        textViewCode.setText(textViewCode.getText() + ":" +course.getCode());
        textViewTitle.setText(textViewTitle.getText() + ":" + course.getTitle());
        textViewCredit.setText(textViewCredit.getText() + ":" + course.getCredit());
        return rowView;
    }
}