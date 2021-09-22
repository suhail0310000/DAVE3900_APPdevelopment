package com.example.fragment_spraak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SetPreferencesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setpref);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.settings_container,new preferansefragment())
                .commit();
    }

}
