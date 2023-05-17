package com.savannahyost.carbingo.UI;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class UIAnimations {
//    Handler handler1 = new StreamHandler();

//    private TextView textView = null;
//    private AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);


    //TODO: try to find a better way to do the gradient
    public void gradientFadeIn(TextView[] charText) {
        AlphaAnimation fadeInStyle = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation[] fadeIn = new AlphaAnimation[10];

        Arrays.fill(fadeIn, fadeInStyle);
        int offset= 0;

        for (int i = 0; i < 10; i++) {

            System.out.println(fadeIn[i]);
//            charText[i].startAnimation(fadeIn[i]);
//            fadeIn[i].setStartOffset(offset);
//            fadeIn[i].setDuration(3000);
//            fadeIn[i].setFillAfter(true);
//
//            offset += 1000;


        }

        AlphaAnimation fadeInC = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeInA = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeInR = new AlphaAnimation(0.0f, 1.0f);
//        AlphaAnimation fadeInSpace = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeInB = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeInI = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeInN = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeInG = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeInO = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeInExclamation = new AlphaAnimation(0.0f, 1.0f);

        charText[0].startAnimation(fadeInC);
        fadeInC.setDuration(3000);

        charText[1].startAnimation(fadeInA);
        fadeInA.setStartOffset(250);
        fadeInA.setDuration(2000);

        charText[2].startAnimation(fadeInR);
        fadeInR.setStartOffset(500);
        fadeInR.setDuration(2000);

        charText[4].startAnimation(fadeInB);
        fadeInB.setStartOffset(750);
        fadeInB.setDuration(2000);

        charText[5].startAnimation(fadeInI);
        fadeInI.setStartOffset(1000);
        fadeInI.setDuration(2000);

        charText[6].startAnimation(fadeInN);
        fadeInN.setStartOffset(1250);
        fadeInN.setDuration(2000);

        charText[7].startAnimation(fadeInG);
        fadeInG.setStartOffset(1500);
        fadeInG.setDuration(2000);

        charText[8].startAnimation(fadeInO);
        fadeInO.setStartOffset(1750);
        fadeInO.setDuration(2000);

        charText[9].startAnimation(fadeInExclamation);
        fadeInExclamation.setStartOffset(2000);
        fadeInExclamation.setDuration(2000);

//        int i = 0;

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
//
//        int time = 3000;
//        while(i < charText.length) {
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

//            i++;

//        }

    }

}
