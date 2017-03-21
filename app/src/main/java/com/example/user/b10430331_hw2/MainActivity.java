package com.example.user.b10430331_hw2;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.user.b10430331_hw2.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemThatWasClickedId = item.getItemId();
        if (itemThatWasClickedId == R.id.GoToActivity2)
        {
            Context context = MainActivity.this;
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,MainActivity2.class);
            startActivity(intent);
            MainActivity.this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item); }


}
