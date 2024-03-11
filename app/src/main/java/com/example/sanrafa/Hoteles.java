package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hoteles extends AppCompatActivity {

    Button botonVerHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        botonVerHoteles=findViewById(R.id.botonhomehoteles);

        botonVerHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Hoteles.this,ListaHoteles.class);
                startActivity(intent);
            }
        });
    }
}