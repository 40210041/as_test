package com.example.mandyyip.test_animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class NewAnim extends AppCompatActivity{

    RadioGroup rad_group2;
    RadioButton rad_blue;
    RadioButton rad_pink;
    RadioButton rad_white;

    Bundle bundle_shirt;
    int colour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        msg("You are now on page: test");

        rad_blue = (RadioButton)findViewById(R.id.radio_blue);
        rad_pink = (RadioButton)findViewById(R.id.radio_pink);
        rad_white = (RadioButton)findViewById(R.id.radio_white);
        rad_group2 = (RadioGroup) findViewById(R.id.rad_grp);

        rad_group2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                change_shirt();
            }
        });
    }

    public void change_shirt()
    {
        if (rad_pink.isChecked() == true)
        {
            colour = 1;
            msg("Shirt is pink");
        }
        else if (rad_white.isChecked() == true)
        {
            colour = 2;
            msg("Shirt is white");
        }
        else
        {
            colour = 3;
            msg("Shirt is blue");
        }

//        Intent change_colour = new Intent(this, null);
//        change_colour.putExtra("shirt", colour);
    }

    public void go_back(View view)
    {
        Intent go_main = new Intent(NewAnim.this, MainActivity.class);
        go_main.putExtra("shirt", colour);
        startActivity(go_main);
    }

    public void msg(String s)
    {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT);
    }
}




//    @Override
//    protected void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.test);
//
//        //link to the relative layout
//        RelativeLayout rel_layout = (RelativeLayout)findViewById(R.id.RL_main_act);
//
//        //LayoutInflater inflater = getLayoutInflater();
//        //View main_layout = inflater.inflate(R.layout.test,rel_layout ,false);
//
//        final TextView txt;
//
//        Button change_txt;
//        Button go_back;
//        ImageView img_2;
//        TextView txt_2;
//
//        change_txt = (Button)findViewById(R.id.btn_2);
//        go_back = (Button)findViewById(R.id.btn_3);
//        img_2 = (ImageView)findViewById(R.id.img_2);
//        txt_2 = (TextView)findViewById(R.id.txt_2);
//        txt = (TextView)findViewById(R.id.txt);
//
//
//        go_back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent go_main = new Intent(NewAnim.this, MainActivity.class);
//
//                String change_txt = "I have changed lol";
//                go_main.putExtra("txt_change", change_txt);
//
//                startActivity(go_main);
//            }
//        });
//
//        change_txt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                txt.setText("h-hewwo? OwO");
//                msg("txt changed");
//            }
//        });
//
//        img_2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                msg("i have been clicked");
//            }
//        });
//
//
//    }