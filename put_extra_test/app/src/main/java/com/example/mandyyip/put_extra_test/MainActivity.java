package com.example.mandyyip.put_extra_test;

import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void passData(View view)
    {
        //set the extras
        String data_1 = "This is data 1";
        String data_2 = "This is data 2";

        //create a new intent
        Intent go_next = new Intent(this, PageTwo.class);

        //create extras to be used in other activities – can do this another way
        //go_next.putExtra("first_data", data_1);
        //go_next.putExtra("second_data", data_2);

        //create new bundle – same as above but less to do
        Bundle bundle = new Bundle();
        bundle.putString("first_data", data_1);
        bundle.putString("second_data", data_2);

        //gathers all extras and sends them togther
        go_next.putExtras(bundle);

        //show the next activity
        startActivity(go_next);
    }
}
