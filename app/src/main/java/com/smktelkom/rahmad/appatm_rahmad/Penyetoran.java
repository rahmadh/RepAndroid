package com.smktelkom.rahmad.appatm_rahmad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

import android.widget.EditText;
public class Penyetoran extends AppCompatActivity {
    Button btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnok,btndel;
    EditText editsetor,editsaldo;
    String setor = "";

    int temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyetoran);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn0 = (Button)findViewById(R.id.btn0);
        btndel = (Button)findViewById(R.id.btndel);
        btnok = (Button)findViewById(R.id.btnok);
        editsetor = (EditText)findViewById(R.id.edittarik);
        editsaldo = (EditText)findViewById(R.id.editsaldo);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "0";
                editsetor.setText(setor);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "1";
                editsetor.setText(setor);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "2";
                editsetor.setText(setor);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "3";
                editsetor.setText(setor);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "4";
                editsetor.setText(setor);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "5";
                editsetor.setText(setor);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "6";
                editsetor.setText(setor);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "7";
                editsetor.setText(setor);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "8";
                editsetor.setText(setor);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor += "9";
                editsetor.setText(setor);
            }
        });

        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setor = "";
                editsetor.setText(setor);
            }
        });

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            doProcess();


            }

        });

    }

    public void isi(int uang) {

        int tab =100000;

        int h1 = Integer.parseInt(String.valueOf(editsetor.getText()));

        int x = h1+tab;

        editsaldo.setText(String.valueOf(x));

    }

    private void doProcess() {
        if (isValid()) {
            editsaldo.setText("Anda Berhasil Melakukan Penyetoran");
        }
    }

    public boolean isValid() {
        boolean valid = true;
        int e = Integer.parseInt(setor);
        if (editsetor.equals("")) {
            editsetor.setError("Masukkan Saldo Dengan Benar!");
            valid =(false);
        } else if(e < 50000){
                editsetor.setError("Isi Saldo Minimal Rp 50.000!");
                valid =(false);
            } else {
                isi(e);
                editsetor.setError(null);
            }
        return valid;
    }

    }

