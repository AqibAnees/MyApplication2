package e.aqibqureshi.imci.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.List;

import e.aqibqureshi.imci.R;
import e.aqibqureshi.imci.activities._activity.DetailActivity;
import e.aqibqureshi.imci.activities.data.FakeData;
import e.aqibqureshi.imci.activities.data.SickChild2To5;

public class cough1 extends AppCompatActivity {


    LinearLayout linear;
    private boolean Flag = false;

    LinearLayout wheez;
    private boolean flag1= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cough1);
        linear = findViewById(R.id.lin_layout_classifi);
        wheez= findViewById(R.id.linwheez);
    }

    public void Expandlist(View view) {
        if (!Flag) {
            linear.setVisibility(View.VISIBLE);
            Flag = true;
        } else {
            linear.setVisibility(View.GONE);
            Flag = false;
        }
    }


    public void ExplandList2(View view) {
        if (!flag1) {
            wheez.setVisibility(View.VISIBLE);
            flag1 = true;
        } else {
            wheez.setVisibility(View.GONE);
            flag1 = false;
        }


    }

    public void showDetailActivity(View view) {
        Intent intent = new Intent(cough1.this, DetailActivity.class);
        List<SickChild2To5> list = FakeData.getFakeData();

        intent.putExtra("title", list.get(0).getTitle());
        intent.putExtra("description", list.get(0).getDescription());
        startActivity(intent);

    }

    public void show(View view) {
        Intent intent = new Intent(cough1.this, DetailActivity.class);
        List<SickChild2To5> list = FakeData.getFakeData();

        intent.putExtra("title", list.get(1).getTitle());
        intent.putExtra("description", list.get(0).getDescription());
        startActivity(intent);

    }
}
