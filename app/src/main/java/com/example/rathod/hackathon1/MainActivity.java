package com.example.rathod.hackathon1;

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
    public void openbrowser(View view){
        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wcd.nic.in/bbbp-schemes"));
        startActivity(browse);
    }
}
