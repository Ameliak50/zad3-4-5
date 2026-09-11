package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void napiszCos (View view) {
        TextView tekst = findViewById(R.id.napis1);
        tekst.setText("kliknieto przycisk 1");
    }
    public void zmienTresc (View view) {
        TextView tekst = findViewById(R.id.napis1);
        tekst.setText("kliknieto przycisk 2");
    }
    public void przywroc (View view) {
        TextView tekst = findViewById(R.id.napis1);
        tekst.setText("Witaj programisto");
    }

    int liczba = 0;
    public void dodaj (View view) {
        liczba++;
        TextView tekst = findViewById(R.id.napis2);
        tekst.setText(String.valueOf(liczba));
    }
    public void odejmij (View view) {
        liczba--;
        TextView tekst = findViewById(R.id.napis2);
        tekst.setText(String.valueOf(liczba));
    }
    public void zeruj (View view) {
        liczba = 0;
        TextView tekst = findViewById(R.id.napis2);
        tekst.setText(String.valueOf(liczba));
    }
}