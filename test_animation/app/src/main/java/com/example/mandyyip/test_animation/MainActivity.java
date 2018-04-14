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
import java.lang.NullPointerException;

public class MainActivity extends AppCompatActivity {

    //create vars
    int colours;
    int clicked;

    TextView txt;
    ImageView img;

    Button btn;
    RadioGroup rad_group;
    RadioButton blue;
    RadioButton pink;
    RadioButton white;

    SeekBar sk_bar;
    AnimationDrawable anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView)findViewById(R.id.img_view);
        if (img == null) throw new AssertionError();

        btn = (Button)findViewById(R.id.btn);
        rad_group = (RadioGroup)findViewById(R.id.rad_group);
        blue = (RadioButton)findViewById(R.id.btn_blue);
        pink = (RadioButton)findViewById(R.id.btn_pink);
        white = (RadioButton)findViewById(R.id.btn_white);
        sk_bar = (SeekBar)findViewById(R.id.seek);

//
        Bundle bundle = getIntent().getExtras();
//        if (bundle != null)
//        {
            colours = bundle.getInt("shirt");
//        }
//        else
//        {
//            colours = bundle.getInt("login_colour");
//        }

//        rad_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                get_colour();
//                get_image(colours);
//            }
//        });

        sk_bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //get colour + img after seekbar has chsanged
                get_colour();
                get_image(colours);
            }
        });

    }

    public void msg(String s) {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
    }

    public void go_next(View view) {
        //create intent to go to new anim class
        Intent go_to_NewAnim = new Intent(this, NewAnim.class);
        startActivity(go_to_NewAnim);
    }

    public void get_image(int c)
    {
        if (sk_bar.getProgress() < 35) {
            switch(c){
                case 1: img.setImageResource(R.drawable.pink_happy);
                msg("Seekbar < 35%, pink");
                break;

                case 2: img.setImageResource(R.drawable.white_happy);
                    msg("Seekbar < 35%, white");
                break;

                case 3: img.setImageResource(R.drawable.blue_happy);
                    msg("Seekbar < 35%, blue");
                break;
            }
        }
        else if (sk_bar.getProgress() > 35 && sk_bar.getProgress() < 75) {
            switch(c){
                case 1: img.setImageResource(R.drawable.pink_08);
                msg("35% < Seekbar < 75%, pink");
                break;

                case 2: img.setImageResource(R.drawable.white_08);
                    msg("35% < Seekbar < 75%, white");
                    break;

                case 3: img.setImageResource(R.drawable.blue_08);
                    msg("35% < Seekbar < 75%, blue");
                    break;
            }
        }
        else {
            switch(c){
                case 1: img.setImageResource(R.drawable.pink_00);
                    msg("Seekbar > 75%, pink");
                break;

                case 2: img.setImageResource(R.drawable.white_00);
                    msg("Seekbar > 75%, white");
                break;

                case 3: img.setImageResource(R.drawable.blue_00);
                    msg("Seekbar > 75%, blue");
            }
        }
    }

    public void get_colour()
    {
//        if (pink.isChecked())
//        {
//            colours = 1;
//            msg("Colour is: Pink");
//        }
//        else if (white.isChecked())
//        {
//            colours = 2;
//            msg("Colour is: White");
//        }
//        else
//        {
//            colours = 3;
//            msg("Colour is: Blue");
//        }
        Bundle bundle = getIntent().getExtras();
        colours = bundle.getInt("shirt");
    }
}
















//    public void get_colour()
//    {
//        if (pink.isChecked() == true) {
//            colours = 1;
//            get_img();
//            msg("colour = pink");
//        } else if (white.isChecked() == true) {
//            colours = 2;
//            get_img();
//            msg("colour = white");
//        } else {
//            blue.isChecked();
//            colours = 3;
//            get_img();
//            msg("colour = blue");}
//    }
//
//    public void get_img()
//    {
////        Bundle bundle = getIntent().getExtras();
////        if (bundle != null) {
////            colours = bundle.getInt("shirt");
////        }
////        else {
////            colours = 3;
////        }
//
//        if (skbar.getProgress() < 35)
//        {
//            if (colours == 1) {
//                img.setImageResource(R.drawable.pink_00);
//            }
//            else if (colours == 2) {
//                img.setImageResource(R.drawable.white_00);
//            }
//            else if (colours == 3) {
//                img.setImageResource(R.drawable.blue_00);
//            }
//        }
//        else
//        {
//            if (colours == 1) {
//                img.setImageResource(R.drawable.pink_happy);
//            } else if (colours == 2) {
//                img.setImageResource(R.drawable.white_happy);
//            } else if (colours == 3) {
//                img.setImageResource(R.drawable.blue_happy);
//            }
//        }
//    }
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Bundle bundle = getIntent().getExtras();
//        if (colours != 1 && colours != 2 && colours!= 3)
//        {
//            colours = 3;
//            //get_img();
//        }
//        else
//        {
//            colours = bundle.getInt("shirt");
//            get_img();
//            img = (ImageView)findViewById(R.id.img_view);
//            if (img == null) throw new AssertionError();
//        }
//
////        if (bundle != null)
////        {
////            colours = bundle.getInt("shirt");
////            get_img();
////        }
////        else
////        {
////            colours = 3;
////            get_img();
////        }
//
//        img = (ImageView)findViewById(R.id.img_view);
//        if (img == null) throw new AssertionError();
//
//        btn = (Button)findViewById(R.id.btn);
//        rad_group = (RadioGroup)findViewById(R.id.rad_group);
//        blue = (RadioButton)findViewById(R.id.btn_blue);
//        pink = (RadioButton)findViewById(R.id.btn_pink);
//        white = (RadioButton)findViewById(R.id.btn_white);
//        skbar = (SeekBar)findViewById(R.id.seek);
//
//        //set the image
//        //img.setBackgroundResource(R.drawable.blue_00);
//
//
//        //set button
//        btn.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, NewAnim.class);
//                startActivity(i);
//            }
//        });
//
////        //set radio buttons
////        rad_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
////            @Override
////            public void onCheckedChanged(RadioGroup radioGroup, int i) {
////                get_colour();
////                get_img();
////                msg("success");
////            }
////        });
//
//        //set seekbar
//        skbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
//                get_img();
//                //msg("changed seekbar");
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//            }
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//            }
//        });
//
//    }
//}
