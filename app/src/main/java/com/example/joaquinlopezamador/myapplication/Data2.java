package com.example.joaquinlopezamador.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Array;

public class Data2 extends AppCompatActivity {

    TextView textViewNombre;
    TextView textViewPassword;
    String strNombre;
    String strPwd;
    String[] anArray = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data2);
        Intent intent = getIntent();
        strNombre = intent.getStringExtra("Nombre");
        strPwd = intent.getStringExtra("Pwd");
        textViewNombre = (TextView) findViewById(R.id.nombre);
        textViewPassword = (TextView) findViewById(R.id.password);
        //textViewNombre.setText(strNombre);
        //textViewPassword.setText(strPwd);
        pushStories();


    }
    public void pushStories(){
        anArray[0] = "Hoy sabremos si eres hijo mío o del pastor alemán";
        // initialize second element
        anArray[1] = "Tal vez la rata de cloaca sepa a caviar pero no lo sabré nunca porque no como animales asquerosos. Los cerdos duermen y buscan su comida entre la mierda. Si no saben distinguir sus excrementos como voy a comerlos.\".\n" +
                "Samuel L. Jackson (Pulp Fiction)"  ;
        // and so forth
        anArray[2] = "Tocarle los pies a su mujer o darle lengüetazos en su sagrado agujero. No es el mismo juego, ¿comprendes?. No es la misma liga, ni si quiera es el mismo deporte";
        anArray[3] = "Es normal tener miedo. Porque esto ya no será como en los comics. La vida real no cabe en las viñetas que se dibujaron para ella";
        anArray[4] = "\"Sábes lo que más miedo da? No saber cuál es tu misión en este mundo, no saber por qué estas aquí. Es una sensación horrible\".\n" +
                "Samuel L. Jackson (El protegido)";
        anArray[5] = "\"¡Tranquila Yolanda!. Cuando me gritas me pongo nervioso, cuando me pongo nervioso me asusto, y cuando un hombre está asustado es cuando mata a otros hombres por accidente\".\n" +
                "Samuel L. Jackson (Pulp Fiction)";

    }
}
