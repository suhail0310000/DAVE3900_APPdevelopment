package com.example.fragment_spraak;


import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements MyDialog.DialogClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}