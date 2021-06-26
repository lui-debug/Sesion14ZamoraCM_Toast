package com.example.sesion14zamoracm_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {//inicia clase

    Button btnPrimero,btnSegundo,btnTercero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//inicia mettodo oncreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrimero=findViewById(R.id.btnPrimero);
        btnSegundo=findViewById(R.id.btnSegundo);
        btnTercero=findViewById(R.id.btnTercero);
    }//termina metodo oncreate

    public void primerToats(View view){//inicia metodo
        Context context = getApplicationContext();
        CharSequence mensaje="Mensaje TOAST \nZamora \n CM";
        int duration= Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,mensaje,duration);

        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();

        Toast.makeText(this,"Ventana Emergente 2",Toast.LENGTH_LONG).show();
    }//termina metodo

    public void segundoToats(View view){//inicia metodo
        Context context = getApplicationContext();
        CharSequence mensaje="Mensaje TOAST \nZamora \n CM";
        int duration= Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,mensaje,duration);

        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();

        Toast.makeText(this,"Ventana Emergente 2",Toast.LENGTH_LONG).show();
    }//termina metodo

    public void tecerToats(View view){//inicia metodo
        Context context = getApplicationContext();
        CharSequence mensaje="Mensaje TOAST \nZamora \n CM";
        int duration= Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,mensaje,duration);

        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();

        Toast.makeText(this,"Ventana Emergente 2",Toast.LENGTH_LONG).show();
    }//termina metodo

    //toast personalizado con xml
    public void toastPersonalizadoXML1(View view){
        //Inflater=Ejecucion, visualizacion, desplegado de una vista
        LayoutInflater inflater =getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast2,null);

        Toast toastXML =new Toast(getApplicationContext());
        toastXML.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toastXML.setDuration(Toast.LENGTH_LONG);
        //integracion de los elementos
        toastXML.setView(layout);
        toastXML.show();

    }//termina metodo



}//termina clase