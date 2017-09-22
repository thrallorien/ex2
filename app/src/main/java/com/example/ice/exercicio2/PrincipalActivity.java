package com.example.ice.exercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {

     private Button btn1;
     private int contador=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btn1 = (Button) findViewById(R.id.btn1);
        Ouvinte ouvinteInstancia = new Ouvinte();
        btn1.setOnClickListener(ouvinteInstancia);
    }

    private class Ouvinte implements View.OnClickListener{
    @Override
        public void onClick(View view){
        contador=contador+1;
        String str=Integer.toString(contador);
        btn1.setText(str);
    }
    }
}
