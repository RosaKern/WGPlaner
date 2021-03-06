package com.example.wgplaner;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public int access;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: Creating");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_menu);
        /**Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);**/

/**
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        **/


        setAccess(1);
        loginScreenButton_HomeMenu();
        registerScreenButton_HomeMenu();

    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int newAccess) {
        this.access = newAccess;
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void loginScreenButton_HomeMenu(){

        Button navToLoginScreen = (Button) findViewById(R.id.btn_logInHome);
        navToLoginScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAccess(1);
                startActivity(new Intent(MainActivity.this, LoginScreen.class));

            }
        });


    }

    public void registerScreenButton_HomeMenu(){

        Button navToRegisterScreen = (Button) findViewById(R.id.btn_register);
        navToRegisterScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAccess(1);
                startActivity(new Intent(MainActivity.this, CreateAccount.class));
            }
        });
    }


}
