package com.savannahyost.carbingo.UI;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.savannahyost.carbingo.Controller.CardController;
import com.savannahyost.carbingo.Controller.CardInterface;
import com.savannahyost.carbingo.R;


public class CityBingoCard extends AppCompatActivity {
//    private CardInterface cardInterface;

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
            buttons[i] = findViewById(buttonId[i]);

        }

        for (int i = 0; i < randomItems.length; i++) {
            for (int j = 0; j < randomItems.length; j++) {
                buttons[buttonNum].setText(randomItems[i][j]);
                buttonNum++;
            }
        }

        boolean[] clicked = new boolean[25];

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setOnClickListener(new View.OnClickListener() {
                int backgroundOff = R.drawable.button_background_off;
//                Drawable buttonOff = getResources().getDrawable()
                @Override
                public void onClick(View v) {
                    for (int j = 0; j < buttons.length; j++) {
                         if(buttons[j].isPressed() && clicked[j]) {
                            buttons[j].setBackgroundResource(R.drawable.button_background_off);
                            clicked[j] = false;
                             System.out.println(clicked[j]);
                        } else if(buttons[j].isPressed()) {
                            buttons[j].setBackgroundColor(R.drawable.button_background);
                            clicked[j] = true;
                        }
                    }
                }
            });
        }
    }

}