package com.example.calculo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnLimpiar,btnConvertir,btnMX,btnpunto,btncero,btnEuro,btntres,btndos,btnuno,btnUS,btnseis,btncinco,btncuatro,btnRD,btnNueve,btnOcho,BtnSiete, Guardar;
    TextView TxtOperacion, Operation, Convertir, TxtNombre;
    String Operador;
    double numero1, numero2, resultado;
    EditText Nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLimpiar= (Button)findViewById(R.id.btnLimpiar);
        btnConvertir=(Button)findViewById(R.id.btnConvertir);
        btnMX= (Button)findViewById(R.id.btnMX);
        btnpunto= (Button)findViewById(R.id.btnpunto);
        btncero= (Button)findViewById(R.id.btncero);
        btnEuro=(Button)findViewById(R.id.btnEuro);
        btntres=(Button)findViewById(R.id.btntres);
        btndos=(Button)findViewById(R.id.btndos);
        btnuno=(Button)findViewById(R.id.btnuno);
        btnUS=(Button)findViewById(R.id.btnUS);
        btnseis=(Button)findViewById(R.id.btnseis);
        btncinco=(Button)findViewById(R.id.btncinco);
        btncuatro=(Button)findViewById(R.id.btncuatro);
        btnRD=(Button)findViewById(R.id.btnRD);
        btnNueve=(Button)findViewById(R.id.btnNueve);
        btnOcho=(Button)findViewById(R.id.btnOcho);
        BtnSiete=(Button)findViewById(R.id.BtnSiete);
        TxtOperacion=(TextView)findViewById(R.id.TxtOperacion);
        Convertir = (TextView)findViewById(R.id.Convertir);



        btncero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation = (TextView) findViewById(R.id.TxtOperacion);
                TxtOperacion.setText(Operation.getText().toString() + "0");
            }
        });
        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation = (TextView) findViewById(R.id.TxtOperacion);
                TxtOperacion.setText(Operation.getText().toString() + "1");
            }
        });
        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation = (TextView)findViewById(R.id.TxtOperacion);
                TxtOperacion.setText(Operation.getText().toString() + "2");
            }
        });
        btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation = (TextView)findViewById(R.id.TxtOperacion);
                TxtOperacion.setText(Operation.getText().toString() + "3");
            }
        });
        btncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation = (TextView)findViewById(R.id.TxtOperacion);
                TxtOperacion.setText(Operation.getText().toString() + "4");
            }
        });
        btncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation = (TextView)findViewById(R.id.TxtOperacion);
                TxtOperacion.setText(Operation.getText().toString() + "5");
            }
        });
        btnseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation = (TextView)findViewById(R.id.TxtOperacion);
                TxtOperacion.setText(Operation.getText().toString() + "6");
            }
        });
        BtnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation = (TextView)findViewById(R.id.TxtOperacion);
                TxtOperacion.setText(Operation.getText().toString() + "7");
            }
        });
        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation = (TextView)findViewById(R.id.TxtOperacion);
                TxtOperacion.setText(Operation.getText().toString() + "8");
            }
        });
        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operation = (TextView)findViewById(R.id.TxtOperacion);
                TxtOperacion.setText(Operation.getText().toString() + "9");
            }
        });
        btnpunto.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Operation= (TextView)findViewById(R.id.TxtOperacion);
                TxtOperacion.setText(Operation.getText().toString() + ".");
            }
        });
        btnRD.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Operador="$RD";
                Operation= (TextView)findViewById(R.id.TxtOperacion);
                numero1= Float.parseFloat(Operation.getText().toString());
                TxtOperacion.setText("Preciones a Convertir");
            }
        });
        btnUS.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Operador="$US";
                Operation= (TextView)findViewById(R.id.TxtOperacion);
                numero1= Float.parseFloat(Operation.getText().toString());
                TxtOperacion.setText("Preciones a Convertir");
            }
        });
        btnEuro.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Operador="$EUR";
                Operation= (TextView)findViewById(R.id.TxtOperacion);
                numero1= Float.parseFloat(Operation.getText().toString());
                TxtOperacion.setText("Preciones a Convertir");
            }
        });
        btnMX.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Operador="$MX";
                Operation= (TextView)findViewById(R.id.TxtOperacion);
                numero1= Float.parseFloat(Operation.getText().toString());
                TxtOperacion.setText("Preciones a Convertir");
            }
        });
        btnConvertir.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Operation= (TextView)findViewById(R.id.TxtOperacion);
                if(Operador.equals("$RD")){
                    TxtOperacion.setText("");
                    resultado= numero1/53.59;
                    TxtOperacion.setText(String.valueOf(resultado));
                    Convertir.setText("$RD --> $USD");
                }
                if(Operador.equals("$US")){
                    TxtOperacion.setText("");
                    resultado= numero1*53.59;
                    TxtOperacion.setText(String.valueOf(resultado));
                    Convertir.setText("$USD --> $RD");
                }
                if(Operador.equals("$EUR")){
                    TxtOperacion.setText("");
                    resultado= numero1*51.93;
                    TxtOperacion.setText(String.valueOf(resultado));
                    Convertir.setText("$EUR --> $RD");
                }
                if(Operador.equals("$MX")){
                    TxtOperacion.setText("");
                    resultado= numero1*2.65;
                    TxtOperacion.setText(String.valueOf(resultado));
                    Convertir.setText("$MX --> $RD");
                }
                //
            }
        });
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = 0;
                Convertir.setText("");

                TxtOperacion.setText("");
            }
        });
    }
}