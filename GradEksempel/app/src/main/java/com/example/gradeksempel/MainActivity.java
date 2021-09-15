package com.example.gradeksempel;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText tekst; //var for å endre tekst

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState); //Startet app
    setContentView(R.layout.activity_main);


    tekst=(EditText)findViewById(R.id.temp);
    //Henter ID fra begge knappene til activity_main.xml
    final Button gradknapp=(Button)findViewById(R.id.tilgrader);
    final Button fahrenheitknapp=(Button)findViewById(R.id.tilfahrenheit);

    //Konverter til gader
    gradknapp.setOnClickListener(new View.OnClickListener() {
    public void onClick(View v) {
        float innverdi = Float.parseFloat(tekst.getText().toString());
        tekst.setText(String.valueOf(convertFahrenheitToCelsius(innverdi)));
            }
        });

    //Konverter til fahrheit
    fahrenheitknapp.setOnClickListener(new View.OnClickListener() {
    public void onClick(View v) {
        float innverdi = Float.parseFloat(tekst.getText().toString());
        tekst.setText(String.valueOf(convertCelsiusToFahrenheit(innverdi)));
            }
        });
    }

    //Operasjoner
    float convertFahrenheitToCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }
    float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }
}

