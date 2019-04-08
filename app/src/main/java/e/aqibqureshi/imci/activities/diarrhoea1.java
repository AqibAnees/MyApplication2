package e.aqibqureshi.imci.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import e.aqibqureshi.imci.R;

public class diarrhoea1 extends AppCompatActivity {

    LinearLayout dehydration;
    private boolean flaged=false;

    LinearLayout days14;
    private boolean flage14=false;

    LinearLayout blood;
    private boolean flageb=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diarrhoea1);
        dehydration=findViewById(R.id.ln_diarrhoea1);
        days14=findViewById(R.id.ln_diarrhoea2);
        blood=findViewById(R.id.ln_diarrhoea3);
    }
    public void expandlistd1(View View){
        if (!flaged) {
            dehydration.setVisibility(View.VISIBLE);
            flaged = true;
        } else {
            dehydration.setVisibility(View.GONE);
            flaged = false;
        }
    }


    public void expandlistd2 (View view) {
        if (!flage14) {
            days14.setVisibility(View.VISIBLE);
            flage14 = true;
        } else {
            days14.setVisibility(View.GONE);
            flage14 = false;
        }
    }

    public void expandlistd3(View view) {
        if (!flageb) {
            blood.setVisibility(View.VISIBLE);
            flageb = true;
        } else {
            blood.setVisibility(View.GONE);
            flageb = false;
        }
    }
}
