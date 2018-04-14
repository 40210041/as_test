package com.example.mandyyip.put_extra_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PageTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_two);

        //get the extras
        Bundle bundle = getIntent().getExtras();

        //pass data to string vars
        String data_1 = bundle.getString("first_data");
        String data_2 = bundle.getString("second_data");

        //assign xml obj for txtview into vars
        TextView txt_one = (TextView)findViewById(R.id.txt_one);
        TextView txt_two = (TextView)findViewById(R.id.txt_two);

        //set strings
        txt_one.setText(data_1);
        txt_two.setText(data_2);
    }

    public void go_back(View view)
    {
        Intent go_back = new Intent(this, MainActivity.class);
        startActivity(go_back);
    }

}