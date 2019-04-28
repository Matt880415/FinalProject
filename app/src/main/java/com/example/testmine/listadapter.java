package com.example.testmine;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class listadapter extends ArrayAdapter {

        //to reference the Activity
        private final Activity context;

        //to store the animal images
        private final String[] timearray;

        //to store the list of countries
        private final String[] eventArray;

        public listadapter(Activity context, String[] timearraygiven, String[] eventArray) {

            super(context,R.layout.rowdesign , timearraygiven);
            this.context = context;
            timearray = timearraygiven;
            this.eventArray = eventArray;
        }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowview = inflater.inflate(R.layout.rowdesign, null, true);

        TextView hourtextfield = (TextView) rowview.findViewById(R.id.hourview);
        TextView eventtextfield = (TextView) rowview.findViewById(R.id.editview);

        hourtextfield.setText(timearray[position]);
        eventtextfield.setText(eventArray[position]);

        return rowview;
    }
}
