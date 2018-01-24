package net.androidbootcamp.theater;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Theater2 extends AppCompatActivity {

    private Button search_button;
    private Button mglass;
    private Button film;
    private Button theater;
    private Button newrelease;
    private Button globe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theater2);

        search_button=(Button)findViewById(R.id.search_button);
        search_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                search_button();
            }
        });
        mglass=(Button)findViewById(R.id.mglass);
        mglass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mglass();
            }
        });

        film=(Button)findViewById(R.id.film);
        film.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                film();
            }
        });

        theater=(Button)findViewById(R.id.theater);
        theater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                theater();
            }
        });

        newrelease=(Button)findViewById(R.id.newrelease);
        newrelease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newrelease();
            }
        });

        globe=(Button)findViewById(R.id.globe);
        globe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                globe();
            }
        });

    }
    private void search_button(){
        Intent intent=new Intent(this, Theater3.class);
        startActivity(intent);
    }
    private void mglass(){
        Intent intent=new Intent(this, ContactUs.class);
        startActivity(intent);
    }
    private void film(){
        Intent intent = new Intent(this, Theater2.class);
        startActivity(intent);
    }
    private void theater(){
        Intent intent=new Intent(this, Theater3.class);
        startActivity(intent);
    }
    private void newrelease(){
        Intent intent= new Intent(this, Theater2.class);
        startActivity(intent);
    }
    private void globe(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }



}
