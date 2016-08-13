package com.stmikjayanusa.mstmik;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Jurusan extends AppCompatActivity
{
    View section1, section2, section3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jurusan_detail);

        section1 = findViewById(R.id.section1);
        section2 = findViewById(R.id.section2);
        section3 = findViewById(R.id.section3);

        View header1 = findViewById(R.id.header1);
        header1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (section1.getVisibility() == View.GONE)
                {
                    section1.setVisibility(View.VISIBLE);
                }
                else
                {
                    section1.setVisibility(View.GONE);
                }
            }
        });

        View header2 = findViewById(R.id.header2);
        header2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (section2.getVisibility() == View.GONE)
                {
                    section2.setVisibility(View.VISIBLE);
                }
                else
                {
                    section2.setVisibility(View.GONE);
                }
            }
        });

        View header3 = findViewById(R.id.header3);
        header3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (section3.getVisibility() == View.GONE)
                {
                    section3.setVisibility(View.VISIBLE);
                }
                else
                {
                    section3.setVisibility(View.GONE);
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}