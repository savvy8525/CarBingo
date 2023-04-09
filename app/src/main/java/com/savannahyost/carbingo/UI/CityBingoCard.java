package com.savannahyost.carbingo.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.savannahyost.carbingo.Controller.CardController;
import com.savannahyost.carbingo.R;

public class CityBingoCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_bingo_card);

        CardController cardController = new CardController();
        String[][] randomItems = cardController.randomCityCard();

        int[] buttonId = {R.id.button1_1, R.id.button1_2, R.id.button1_3, R.id.button1_4, R.id.button1_5,
                R.id.button2_1, R.id.button2_2, R.id.button2_3, R.id.button2_4, R.id.button2_5,
                R.id.button3_1, R.id.button3_2, R.id.button3_3, R.id.button3_4, R.id.button3_5,
                R.id.button4_1, R.id.button4_2, R.id.button4_3, R.id.button4_4, R.id.button4_5,
                R.id.button5_1, R.id.button5_2, R.id.button5_3, R.id.button5_4, R.id.button5_5};

        Button[] buttons = new Button[buttonId.length];
        int buttonNum = 0;
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = (Button)findViewById(buttonId[i]);

        }

        for (int i = 0; i < randomItems.length; i++) {
            for (int j = 0; j < randomItems.length; j++) {
                buttons[buttonNum].setText(randomItems[i][j]);
                buttonNum++;
//                System.out.println(buttonNum);
            }
        }

        boolean[][] isClicked = new boolean[5][5];
        for (int i = 0; i < isClicked.length; i++) {
            for (int j = 0; j < isClicked.length; j++) {
                isClicked[i][j] = false;
            }
        }

        


        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setOnClickListener(new View.OnClickListener() {
                
                @Override
                public void onClick(View v) {
                    int buttonPress = getColor(R.color.button_press_1);
                    boolean clicked = true;
                    for (int j = 0; j < buttons.length; j++) {
                        if(buttons[j].isPressed()) {
                            buttons[j].setBackgroundColor(R.drawable.button_background);
                            clicked = false;
                        }
//                        if(!clicked) {
//                            buttons[j].setBackgroundColor(Color.TRANSPARENT);
//                        }

                    }


                }
            });
        }




//button1_1.is
//        button1_1.setBackgroundColor(Color.GREEN);
//        button1_1.setOnClickListener(new View.OnClickListener() {
////            int click = 1;
//boolean notClicked = true;
//            int count = 0;
//            @Override
//            public void onClick(View v) {
//                if(notClicked) {
//                    button1_1.setBackgroundColor(R.drawable.button_background);
////                    click = 2;
//                    notClicked = false;
//                    isClicked[0][0] = true;
////                    System.out.println(click);
//                } else {
//                    button1_1.setBackgroundColor(Color.TRANSPARENT);
////                    click = 1;
//                    notClicked = true;
//                    isClicked[0][0] = false;
//                    count = 0;
////                    System.out.println(click);
//                }
//
//                for (int i = 0; i < isClicked.length; i++) {
//                    if(isClicked[0][i]) {
////                        hasBingo = true;
//                        count++;
//                    } else {
//                        count = 0;
//                    }
//                }
//
//                if(count == 5) {
//                    Toast.makeText(CityBingoCard.this, "BINGO!", Toast.LENGTH_LONG).show();
//                    System.out.println("bingo!");
//                }
//
//            }
//        });


    }

}