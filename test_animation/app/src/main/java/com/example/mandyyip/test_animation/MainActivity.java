package com.example.mandyyip.test_animation;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //create vars
    int colours;

    TextView txt;
    ImageView img;
    Button btn;
    RadioGroup rad_group;
    RadioButton blue;
    RadioButton pink;
    RadioButton white;
    SeekBar skbar;
    AnimationDrawable anim;

    //initial value must be out of click
    //int clicked = 0;


    public void msg(String s)
    {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
    }


    public void get_colour()
    {
        if (pink.isChecked() == true) {
            colours = 1;
            get_img();
            msg("colour = pink");
        } else if (white.isChecked() == true) {
            colours = 2;
            get_img();
            msg("colour = white");
        } else {
            blue.isChecked();
            colours = 3;
            get_img();
            msg("colour = blue");}
    }

    public void get_img()
    {
        if (colours == 1) {
            img.setBackgroundResource(R.drawable.pink_happy);
        } else if (colours == 2) {
            img.setBackgroundResource(R.drawable.white_happy);
        } else if (colours == 3) {
            img.setBackgroundResource(R.drawable.blue_00);
        }
    }

    public void get_anim()
    {
        anim = (AnimationDrawable)img.getBackground();
        anim.start();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //txt = (TextView)findViewById(R.id.txt);
        img = (ImageView)findViewById(R.id.img_view);
        if (img == null) throw new AssertionError();

        btn = (Button)findViewById(R.id.btn);
        rad_group = (RadioGroup)findViewById(R.id.rad_group);
        blue = (RadioButton)findViewById(R.id.btn_blue);
        pink = (RadioButton)findViewById(R.id.btn_pink);
        white = (RadioButton)findViewById(R.id.btn_white);
        skbar = (SeekBar)findViewById(R.id.seek);

        //img.setBackgroundResource(R.drawable.blue_00);
        //anim = (AnimationDrawable)img.getBackground();
        //anim.start();

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, NewAnim.class);
                startActivity(i);
            }
        });

        rad_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                get_colour();
                get_img();
                msg("success");
                //get_anim();
            }
        });

        skbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
               // anim.stop();
                get_img();
                msg("changed seekbar");
                //get_anim();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

    }
}
