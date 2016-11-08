package com.example.joaquinlopezamador.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.storage.StorageReference;

public class MainActivity extends AppCompatActivity {
    private StorageReference storageReference;
    Button SVButton;
    EditText ETnombre;
    EditText ETpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivityC mainActivity= new MainActivityC(this);
        SVButton = (Button)findViewById(R.id.SaveDataButton);
        ETnombre = (EditText)findViewById(R.id.Nombre);
        ETpassword = (EditText)findViewById(R.id.Password);
        SVButton.setOnClickListener(mainActivity);


    }

}
