package e.aqibqureshi.imci.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import e.aqibqureshi.imci.R;

public class treatchild1 extends AppCompatActivity {
    public Button prednisone;
    public Button amoxycillin;
    public Button nalidixic;
    public Button trimoxazole;
    public Button iron;
    public Button paracetamol;
    public Button artemether;
    public Button earparacetamol;
    public Button teachmother;
    public Button clinic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatchild1);

        prednisone=(Button) findViewById(R.id.btprednisone);
        prednisone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prd= new Intent(treatchild1.this, prednisone1.class);
                startActivity(prd);
            }
        });

        amoxycillin=(Button) findViewById(R.id.btamoxycillin);
        amoxycillin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent amx= new Intent(treatchild1.this, Amoxycillin1.class);
                startActivity(amx);
            }
        });

        nalidixic=(Button) findViewById(R.id.btnalidixic);
        nalidixic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nal= new Intent(treatchild1.this, nalidixic1.class);
                startActivity(nal);
            }
        });

        trimoxazole=(Button) findViewById(R.id.btcotrimoxazole);
        trimoxazole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tri= new Intent(treatchild1.this, cotrimoxazole1.class);
                startActivity(tri);
            }
        });

        iron=(Button) findViewById(R.id.btiron);
        iron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irn= new Intent(treatchild1.this, iron1.class);
                startActivity(irn);
            }
        });

        paracetamol=(Button) findViewById(R.id.btparacetamol);
        paracetamol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prt= new Intent(treatchild1.this, paracetamol1.class);
                startActivity(prt);
            }
        });

        artemether=(Button) findViewById(R.id.btartemether);
        artemether.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent art= new Intent(treatchild1.this, artemether1.class);
                startActivity(art);
            }
        });

        earparacetamol=(Button) findViewById(R.id.btearparacetamol);
        earparacetamol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent erp= new Intent(treatchild1.this, earparacetamol1.class);
                startActivity(erp);
            }
        });

        teachmother=(Button) findViewById(R.id.btteachmother);
        teachmother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thm= new Intent(treatchild1.this, teachmother1.class);
                startActivity(thm);
            }
        });

        clinic=(Button) findViewById(R.id.btclinic);
        clinic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent clnc= new Intent(treatchild1.this, clinic1.class);
                startActivity(clnc);
            }
        });


    }
}
