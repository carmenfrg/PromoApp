package com.example.carmen.promoapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button bOp1 = (Button)findViewById(R.id.bOp1);
        final Button bOp2 = (Button)findViewById(R.id.bOp2);
        final TextView tvInfo = (TextView)findViewById(R.id.tvInfo);
        final ImageView iView= (ImageView) findViewById(R.id.iView);
        final TextView tvNom = (TextView)findViewById(R.id.tvNom);

        bOp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iView.setImageResource(R.drawable.nike);
                tvNom.setText("Nike");
                tvInfo.setText("Nike Air Force 1 Low iD, $140 dlls");

            }
        });

        bOp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iView.setImageResource(R.drawable.puma);
                tvNom.setText("Puma");
                tvInfo.setText("Suede platform women's sneakers, $100 dlls");

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            System.exit(0);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
