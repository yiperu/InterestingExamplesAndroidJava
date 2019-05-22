package com.example.spinerwithidandname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    HashMap<Integer, String> mStudents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mStudents = new HashMap<Integer, String>() {{
            put(0, "Bob");
            put(1, "Christine");
            put(2, "Jhon");
            put(3, "Charles");
            put(4, "Fernando");
            put(5, "Jaime");
        }};
        
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        /* Create your ArrayList collection using StringWithTag instead of String. */
        List<ClassStringWithId> itemList = new ArrayList<ClassStringWithId>();

        /* Iterate through your original collection, in this case defined with an Integer key and String value. */
        for (Map.Entry<Integer, String> entry : mStudents.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            /* Build the StringWithTag List using these keys and values. */
            itemList.add(new ClassStringWithId(value, key));
        }

        /* Set your ArrayAdapter with the StringWithTag, and when each entry is shown in the Spinner, .toString() is called. */
        ArrayAdapter<ClassStringWithId> spinnerAdapter = new ArrayAdapter<ClassStringWithId>(this, android.R.layout.simple_spinner_item, itemList);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                ClassStringWithId swt = (ClassStringWithId) parent.getItemAtPosition(position);
                Integer key = (Integer) swt.theId;

                Toast.makeText(MainActivity.this, "ID: " + key + ", Nombre: " + mStudents.get(key), Toast.LENGTH_SHORT).show();
                Log.i("TAG", mStudents.get(key));

            } // to close the onItemSelected
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });
    }
}
