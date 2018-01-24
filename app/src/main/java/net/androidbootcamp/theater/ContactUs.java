package net.androidbootcamp.theater;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

    }
    public void facebook(View view){
        Intent browswerIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
        startActivity(browswerIntent);
    }
    public void instagram(View view){
        Intent browswerIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com"));
        startActivity(browswerIntent);
    }
    public void twitter(View view){
        Intent browswerIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com"));
        startActivity(browswerIntent);
    }
    public void googleplus(View view){
        Intent browswerIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(browswerIntent);
    }

}
