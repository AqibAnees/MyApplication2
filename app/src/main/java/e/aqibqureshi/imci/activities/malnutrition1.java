package e.aqibqureshi.imci.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import e.aqibqureshi.imci.R;

public class malnutrition1 extends AppCompatActivity {
LinearLayout linearnutrition;
private boolean flagnutrition;

LinearLayout linearmalnutrition;
private boolean flagmalnutrition;

    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malnutrition1);
        linearnutrition = findViewById(R.id.layout_nutrition);
        linearmalnutrition=findViewById(R.id.layout_nutrition1);


    }
        public void expandlistmal(View view){
            if (!flagnutrition) {
                linearnutrition.setVisibility(View.VISIBLE);
                flagnutrition = true;
            } else {
                linearnutrition.setVisibility(View.GONE);
                flagnutrition = false;
            }


        }

        public void expandlistmal2(View view){
            if (!flagmalnutrition) {
                linearmalnutrition.setVisibility(View.VISIBLE);
                flagmalnutrition = true;
            } else {
                linearmalnutrition.setVisibility(View.GONE);
                flagmalnutrition = false;
            }



        }




    }

