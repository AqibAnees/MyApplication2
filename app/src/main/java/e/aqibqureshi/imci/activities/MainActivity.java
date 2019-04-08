package e.aqibqureshi.imci.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import e.aqibqureshi.imci.R;

public class MainActivity extends AppCompatActivity {
    public Button intro1;
    public Button button;
    public Button treat;
    public Button followup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intro1=(Button) findViewById(R.id.buttonintro);
        intro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent into= new Intent(MainActivity.this, Introduction.class);
                startActivity(into);
            }
        });

        button=(Button) findViewById(R.id.buttonage5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy= new Intent(MainActivity.this, age51.class);
                startActivity(toy);
            }
        });

        treat=(Button) findViewById(R.id.bttreat);
        treat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trt= new Intent(MainActivity.this, treatchild1.class);
                startActivity(trt);
            }
        });

        followup=(Button) findViewById(R.id.btfollowup);
        followup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent flp= new Intent(MainActivity.this, followupcare1.class);
                startActivity(flp);
            }
        });




    }
}
