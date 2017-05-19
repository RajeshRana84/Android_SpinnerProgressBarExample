package com.example.rajeshrana.myprogressbarspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar2);
        toolbar.setTitle(R.string.app_name);

       final  ProgressBar progressBar = (ProgressBar)findViewById(R.id.progressBar);

        final Button btn_show = (Button)findViewById(R.id.button_show);
        final Button btn_hide = (Button)findViewById(R.id.button_hide);

        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                progressBar.setVisibility(View.VISIBLE);
                btn_show.setEnabled(false);
                btn_hide.setEnabled(true);

            }
        });


        btn_hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.GONE);
                btn_show.setEnabled(true);
                btn_hide.setEnabled(false);

            }
        });


    }
}
