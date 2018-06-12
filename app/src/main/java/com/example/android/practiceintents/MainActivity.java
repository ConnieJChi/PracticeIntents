package com.example.android.practiceintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicked(View v){
        Intent i = new Intent(Intent.ACTION_SENDTO, Uri.parse(("mailto:")));
//        i.setData(Uri.parse("mailto:"));
        i.putExtra(i.EXTRA_SUBJECT, "Happiness!");
        i.putExtra(i.EXTRA_TEXT, "Happiness is a virtue!");
        if (i.resolveActivity(getPackageManager()) != null) {
            startActivity(i);
        }
    }
}
