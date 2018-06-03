package com.aj.uss.collectionwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        textView = findViewById(R.id.textView);
        String text = getIntent().getStringExtra(CollectionWidget.EXTRA_LABEL);

        textView.setText(text);

    }
}
