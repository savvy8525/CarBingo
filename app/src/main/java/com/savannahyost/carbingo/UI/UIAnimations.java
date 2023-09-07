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

    //TODO: try to find a better way to do the gradient
    public void gradientFadeIn(TextView[] charText) {
        AlphaAnimation fadeInC = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeInA = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeInR = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeInB = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeInI = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeInN = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeInG = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeInO = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation fadeInExclamation = new AlphaAnimation(0.0f, 1.0f);

        charText[0].startAnimation(fadeInC);
        fadeInC.setDuration(2000);

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


    }

}
