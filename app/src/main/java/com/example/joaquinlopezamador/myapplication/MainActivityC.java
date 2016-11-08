package com.example.joaquinlopezamador.myapplication;

import android.content.Intent;
import android.util.Log;
import android.view.View;

/**
 * Created by joaquinlopezamador on 08/11/2016.
 */

public class MainActivityC implements View.OnClickListener{
    MainActivity mainActivity;

    public MainActivityC(MainActivity mainActivity)  {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(mainActivity,Data2.class);
        intent.putExtra("Nombre",mainActivity.ETnombre.getText().toString());
        intent.putExtra("Pwd",mainActivity.ETpassword.getText().toString());
        System.out.println("----------" + mainActivity.ETpassword.getText().toString());
        mainActivity.startActivity(intent);
    }
}
