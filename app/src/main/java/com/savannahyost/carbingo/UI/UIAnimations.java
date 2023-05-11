package com.savannahyost.carbingo.UI;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class UIAnimations {
//    Handler handler1 = new StreamHandler();

//    private TextView textView = null;
//    private AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);


    //TODO: fix to make the gradient
    public void gradientFadeIn(TextView[] charText) {
        AlphaAnimation fadeIn1 = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeIn2 = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);




        int i = 0;

//        charText[0].startAnimation(fadeIn1);
//        fadeIn1.setDuration(3000);
//
//        charText[1].startAnimation(fadeIn2);
//        fadeIn2.setStartOffset(2000);
//        fadeIn2.setDuration(3000);
//
//        charText[3].startAnimation(fadeIn2);
//        fadeIn2.setStartOffset(2000);
//        fadeIn2.setDuration(3000);

//        charText[i].startAnimation(fadeIn);
//        fadeIn.setDuration(3000);
//        fadeIn.setFillAfter(true);
//        fadeIn.setStartOffset(2000);
//        fadeIn.setFillAfter(true);

        int time = 3000;
        while(i < charText.length) {
//            charText[i].startAnimation(fadeIn);
//    //        fadeIn.setStartOffset(8000);
//
//            fadeIn.setDuration(time);
//    //        fadeIn.setFillAfter(true);
//
//            time+=1000;



//            charText[i].startAnimation(fadeIn);
//            fadeIn.setDuration(3000);
//            fadeIn.setFillAfter(true);
//            fadeIn.setStartOffset(4000+fadeIn.getStartOffset());

            i++;

        }

    }

}
