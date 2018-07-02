package com.example.pujakumari.lifecycle;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast  t= Toast.makeText(getApplicationContext(), "onCreate invoked", Toast.LENGTH_SHORT);
        t.show();
    }
    protected void  onStart()

    {
        super.onStart();
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(getApplicationContext(), "onStart invoked", Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
    }
    protected void onResume()
    {
        super.onResume();
        setContentView(R.layout.activity_main);
        Toast t=Toast.makeText(getApplicationContext(), "onResume invoked",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0,0);
        t.show();
    }

    protected void onPause()
    {
        super.onPause();
        setContentView(R.layout.activity_main);
        Toast t=Toast.makeText(getApplicationContext(),  "onPause invoked",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0,0);
        t.show();
    }
    protected void onStop()
    {
        super.onStop();
        setContentView(R.layout.activity_main);
        Toast t=Toast.makeText(getApplicationContext(), "onStop invokde",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();

    }
    protected void onDestroy()
    {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Toast t=Toast.makeText(getApplicationContext(), "onDestroy invoked",Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }

}
