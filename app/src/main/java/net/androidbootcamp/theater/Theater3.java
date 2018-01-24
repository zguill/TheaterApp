package net.androidbootcamp.theater;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Theater3 extends AppCompatActivity {
    private Button theater1;
    private Button theater2;
    private Button theater3;
    private Button theater4;
    private Button mglass;
    private Button film;
    private Button theater;
    private Button newrelease;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theater3);

        theater1=(Button)findViewById(R.id.theater1);
        theater1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                theater1();
            }
        });

        theater2=(Button)findViewById(R.id.theater2);
        theater2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                theater2();
            }
        });

        theater3=(Button)findViewById(R.id.theater3);
        theater3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                theater3();
            }
        });

        theater4=(Button)findViewById(R.id.theater4);
        theater4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                theater4();
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


    }
    private void theater1(){
        Intent intent =new Intent(this, Theater4.class);
        startActivity(intent);
    }
    private void theater2(){
        Intent intent= new Intent(this, Theater5.class);
        startActivity(intent);
    }
    private void theater3(){
        Intent intent=new Intent(this,Theater6.class);
        startActivity(intent);
    }
    private void theater4(){
        Intent intent=new Intent(this, Theater7.class);
        startActivity(intent);
    }
    private void mglass(){
        Intent intent = new Intent(this, ContactUs.class);
        startActivity(intent);
    }
    private void film(){
        Intent intent=new Intent(this, Theater2.class);
        startActivity(intent);
    }
    private void theater(){
        Intent intent = new Intent(this, Theater3.class);
        startActivity(intent);
    }
    private void newrelease(){
        Intent intent=new Intent(this, Theater2.class);
        startActivity(intent);
    }
}
