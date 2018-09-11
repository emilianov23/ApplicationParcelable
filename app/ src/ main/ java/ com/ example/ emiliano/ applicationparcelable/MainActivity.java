package com.example.emiliano.applicationparcelable;

import android.support.v7.app.AppCompatActivity;le;
import android.content.Intent;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.EditText;
import android.os.Parcel;
import android.view.View;
import mipp.com.example.emiliano.applicationparcelable;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        Button Boton=(Button) findViewById(R.id.Boton);
    }
    public void Sendinf(View view){
        EditText Nombre = (EditText)findViewById(R.id.Nombre);
        String text = Nombre.getText().toString();

        EditText Apellido = (EditText)findViewById(R.id.Apellido);
        String text2 = Apellido.getText().toString();

        EditText edad = (EditText)findViewById(R.id.Edad);
        int number = Integer.parseInt(edad.getText().toString());

        Usuario user = new Usuario(text,text2,number);

        Intent intent = new intent(this, Main2Activity.class);
        intent.putExtra("user",user);
        startActivity(intent);

    }
}
