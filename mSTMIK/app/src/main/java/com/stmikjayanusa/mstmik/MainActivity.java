package com.stmikjayanusa.mstmik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    Button btnVisi, btnJurusan, btnFasilitas, btnLokasi, btnBerita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVisi = (Button)findViewById(R.id.button);
        btnJurusan = (Button)findViewById(R.id.button2);
        btnFasilitas = (Button)findViewById(R.id.button4);
        btnBerita =(Button)findViewById(R.id.button5);
        btnLokasi = (Button)findViewById(R.id.button6);

    }

    public void visi (View v){
        Intent i = new Intent(this,Visi.class);
        startActivity(i);
    }
    public void jurusan (View v){
        Intent i = new Intent(this,Jurusan.class);
        startActivity(i);
    }
    public void fasilitas (View v){
        Intent i = new Intent(this,Fasilitas.class);
        startActivity(i);
    }
    public void berita (View v){
        Intent i = new Intent(this,ListBerita.class);
        startActivity(i);
    }
    public void lokasi (View v){
        Intent i = new Intent(this,Lokasi.class);
        startActivity(i);
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
}
