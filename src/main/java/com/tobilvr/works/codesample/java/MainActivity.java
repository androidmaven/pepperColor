package com.tobilvr.works.codesample.java;

import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tobilvr.works.codesample.R;
import com.tobilvr.works.peppercolor.PepperBlend;
import com.tobilvr.works.peppercolor.PepperColors;
import com.tobilvr.works.peppercolor.PepperGradient;
import com.tobilvr.works.peppercolor.PepperSingleColor;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view1 = findViewById(R.id.view1);
        View view2 = findViewById(R.id.view2);
        View view3 = findViewById(R.id.view3);

        //Using PEPPER SINGLE COLOR IN TWO METHODS (READ DOCUMENTATIONS github.com/tobilvr/peppercolor).
        //ONE OF THE METHODS.
        view1.setBackgroundColor(new PepperSingleColor.Builder().setColor(PepperColors.PINK100).setTransparency(40).build());

        //Using PEPPER GRADIENT
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            view2.setBackground(

                    new PepperGradient().start(PepperColors.ORANGE100
                            ,PepperColors.GREEN400,
                            GradientDrawable.Orientation.TR_BL
                            ,GradientDrawable.LINEAR_GRADIENT
                            ));
        }
        //Using PEPPER BLEND
        view3.setBackgroundColor(new PepperBlend().start(PepperColors.GREEN200,PepperColors.AMBER600, 0.8f));


    }
}
