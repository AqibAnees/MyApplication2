package e.aqibqureshi.imci.activities._activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import e.aqibqureshi.imci.R;

public class DetailActivity extends AppCompatActivity {

    TextView titleView, detailView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        titleView = findViewById(R.id.lbl_title_detail);
        detailView = findViewById(R.id.lbl_desc_detail);

        Intent intent =  getIntent();
        String title = intent.getStringExtra("title");
        String desc = intent.getStringExtra("description");
        titleView.setText(title);
        detailView.setText(desc);

    }
}
