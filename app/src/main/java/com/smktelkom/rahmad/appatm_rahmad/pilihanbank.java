package com.smktelkom.rahmad.appatm_rahmad;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
public class pilihanbank extends AppCompatActivity {
    Button btnceksaldo, btntarik, btnsetor,btntransfer, btnexit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihanbank);
        btnceksaldo = (Button)findViewById(R.id.btnceksaldo);

        btnsetor = (Button)findViewById(R.id.btnsetor);

        btntarik = (Button)findViewById(R.id.btntarik);

        btntransfer = (Button)findViewById(R.id.btntransfer);

        btnexit = (Button)findViewById(R.id.btnexit);

        btntarik.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i = new Intent (pilihanbank.this, Penarikan.class);

                startActivity(i);

            }

        });

        btnsetor.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent i = new Intent(pilihanbank.this, Penyetoran.class);

                startActivity(i);

            }

        });

        btnceksaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pilihanbank.this, CekSaldo.class);
                startActivity(i);
            }
        });

        btntransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pilihanbank.this, Transfer.class);
                startActivity(i);
            }
        });

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exit();
            }
        });
    }

    private void exit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah anda yakin ingin keluar ?").setCancelable(false).setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                moveTaskToBack(true);
                finish();
                System.exit(0);
            }
        }).setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }).show();
    }
}
