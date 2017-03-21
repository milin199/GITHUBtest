package com.example.user.b10430331_hw2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity2 extends AppCompatActivity {
    Button button_2;
   /*@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button=(Button) findViewById(R.id.button2);

        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent();
                intent.setClass(MainActivity2.this,MainActivity.class);
                startActivity(intent);
                MainActivity2.this.finish();
            }
        });
    }*/

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);}
   @Override
   public boolean onCreateOptionsMenu(Menu menu)
   {
       getMenuInflater().inflate(R.menu.menu2, menu);
       return true;
   }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemThatWasClickedId = item.getItemId();
        if (itemThatWasClickedId == R.id.ReturnToActivity)
        {
            Context context = MainActivity2.this;
            Intent intent=new Intent();
            intent.setClass(MainActivity2.this,MainActivity.class);
            startActivity(intent);
            MainActivity2.this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item); }

}