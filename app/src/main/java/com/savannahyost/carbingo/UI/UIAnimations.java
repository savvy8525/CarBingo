package com.savannahyost.carbingo.UI;

import android.view.animation.AlphaAnimation;
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
        AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);

        int i = 0;
//        charText[i].startAnimation(fadeIn);
//        fadeIn.setDuration(3000);
//        fadeIn.setFillAfter(true);
//        fadeIn.setStartOffset(2000);
//        fadeIn.setFillAfter(true);


        while(i < charText.length) {
        charText[i].startAnimation(fadeIn);
//        fadeIn.setStartOffset(8000);

        fadeIn.setDuration(3000);
        fadeIn.setFillAfter(true);

        


//            charText[i].startAnimation(fadeIn);
//            fadeIn.setDuration(3000);
//            fadeIn.setFillAfter(true);
//            fadeIn.setStartOffset(4000+fadeIn.getStartOffset());

            i++;

        }

    }

}
