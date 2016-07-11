package com.rsadow.unisearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    ListView list;
    ArrayList<IFinder> finders_ = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate() Restoring previous state");

        String [] items = new String [] { "Kore", "Ustawienia"};
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);

        itemsAdapter.add("Kore");
        itemsAdapter.add("Ustawienia");

        list = (ListView) findViewById(R.id.listView);
        if (list != null) {
            list.setAdapter(itemsAdapter);
        }

        finders_ = new ArrayList<>(Arrays.asList(
                FinderFactory.createContactFinder(),
                FinderFactory.createProgramFinder(this)
        ));




    }
}
