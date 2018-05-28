package org.beemarie.bhellermobileappdevelopment.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.beemarie.bhellermobileappdevelopment.R;

import java.util.Date;

public class TermDetailActivity extends AppCompatActivity {

    private static final String EXTRA_TERM_NAME = "EXTRA_TERM_NAME";
    private static final String EXTRA_TERM_START_DATE = "EXTRA_TERM_START_DATE";
    private static final String EXTRA_TERM_END_DATE = "EXTRA_TERM_END_DATE";
    private static final String term_id = "Term ID";


    private TextView termName;
    private EditText startDate;
    private EditText endDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_detail);

        Intent i = getIntent();
        String termIDExtra = i.getStringExtra(term_id);



        termName = (TextView) findViewById(R.id.term_detail_title);
        termName.setText(term_id);
//
//        startDate = (EditText) findViewById(R.id.start_date_edit);
//        startDate.setText(termStartExtra);
//
//        endDate = (EditText) findViewById(R.id.end_date_edit);
//        endDate.setText(termEndExtra);
    }
}
