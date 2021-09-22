package com.example.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class VisScriptActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = this.getIntent();
        String bnavn = i.getExtras().getString("scriptnavn");
        VisScriptFragment visscript = new VisScriptFragment();
        visscript.init(bnavn);
        FragmentManager fragmentManager;
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(android.R.id.content, visscript).commit();
    }
}
