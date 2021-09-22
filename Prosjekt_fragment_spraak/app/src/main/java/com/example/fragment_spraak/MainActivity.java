package com.example.fragment_spraak;


import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.preference.PreferenceManager;
import android.view.View;

public class MainActivity extends AppCompatActivity implements MyDialog.DialogClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences shared = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        System.out.println(shared.getString("melding",","));
    }

    @Override
    public void onYesClick() {
        finish();
    }

    @Override
    public void onNoClick() {
        return;
    }

    public void visDialog(View v)
    {
        DialogFragment dialog = new MyDialog();
        dialog.show(getSupportFragmentManager(),"Avslutt");
    }

    public void visPreferences(View v){
        Intent i = new Intent(this, SetPreferencesActivity.class);
        startActivity(i);
    }
}