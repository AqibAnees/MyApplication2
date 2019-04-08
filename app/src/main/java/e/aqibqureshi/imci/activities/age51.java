package e.aqibqureshi.imci.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import e.aqibqureshi.imci.R;

public class age51 extends AppCompatActivity {
    public Button cough;
    public Button diarrhoea;
    public Button fever;
    public Button ear;
    public Button malnutrition;
    public Button hiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age51);

        cough=(Button)findViewById(R.id.buttoncough);
        cough.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cou=new Intent(age51.this, cough1.class);
                startActivity(cou);
            }
        });

        diarrhoea=(Button)findViewById(R.id.btdiarrhoea);
        diarrhoea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dia=new Intent(age51.this, diarrhoea1.class);
                startActivity(dia);
            }
        });

        fever=(Button)findViewById(R.id.btfever);
        fever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fev=new Intent(age51.this, fever1.class);
                startActivity(fev);
            }
        });

        ear=(Button)findViewById(R.id.btearproblem);
        ear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent earp=new Intent(age51.this, earproblem1.class);
                startActivity(earp);
            }
        });


        malnutrition=(Button)findViewById(R.id.btmalnutrition);
        malnutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mal=new Intent(age51.this, malnutrition1.class);
                startActivity(mal);
            }
        });


        hiv=(Button)findViewById(R.id.bthiv);
        hiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hv=new Intent(age51.this, hiv1.class);
                startActivity(hv);
            }
        });


    }
}
