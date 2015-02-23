package com.example.alberto.practica_01;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity_2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = getIntent();

        String Name = i.getStringExtra(MainActivity.NOMBRE);
        String Surname = i.getStringExtra(MainActivity.APELLIDO);
        String Sex = i.getStringExtra(MainActivity.SEXO);
        String Job = i.getStringExtra(MainActivity.TRAB);
        String Stu = i.getStringExtra(MainActivity.EST);
        String Uni = i.getStringExtra(MainActivity.UNI);
        int Weight = i.getIntExtra(MainActivity.PESO, 76);
        String Date = i.getStringExtra(MainActivity.FECHA);


        TextView t= new TextView(this);
        t.setTextSize(40.0f);
        t.setText(Name + "" + Surname + "\n" + Sex + "\n" + Job + " y " + Stu + "\n" + Uni + "\n" + Weight + "\n" + Date);

        setContentView(R.layout.activity_main_activity_2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_2, menu);
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
}
