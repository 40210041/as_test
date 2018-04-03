package com.example.mandyyip.test_animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewAnimator;

public class NewAnim extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        //link to the relative layout
        RelativeLayout rel_layout = (RelativeLayout)findViewById(R.id.RL_main_act);

        //LayoutInflater inflater = getLayoutInflater();
        //View main_layout = inflater.inflate(R.layout.test,rel_layout ,false);

        final TextView txt;

        Button change_txt;
        Button go_back;
        ImageView img_2;
        TextView txt_2;

        change_txt = (Button)findViewById(R.id.btn_2);
        go_back = (Button)findViewById(R.id.btn_3);
        img_2 = (ImageView)findViewById(R.id.img_2);
        txt_2 = (TextView)findViewById(R.id.txt_2);
        txt = (TextView)findViewById(R.id.txt);


        go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_main = new Intent(NewAnim.this, MainActivity.class);

                String change_txt = "I have changed lol";
                go_main.putExtra("txt_change", change_txt);

                startActivity(go_main);
            }
        });

        change_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("h-hewwo? OwO");
                msg("txt changed");
            }
        });

        img_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg("i have been clicked");
            }
        });


    }

    public void msg(String s)
    {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT);
    }
}

