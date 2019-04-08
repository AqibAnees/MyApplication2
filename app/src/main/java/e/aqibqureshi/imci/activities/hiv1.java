package e.aqibqureshi.imci.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import e.aqibqureshi.imci.R;

public class hiv1 extends AppCompatActivity {
    LinearLayout linearhiv;
    private boolean flaghiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiv1);
        linearhiv = findViewById(R.id.layout_hiv);
    }
    public void expandlisthiv (View view){
        if (!flaghiv) {
            linearhiv.setVisibility(View.VISIBLE);
            flaghiv = true;
        } else {
            linearhiv.setVisibility(View.GONE);
            flaghiv = false;
        }


    }
}
