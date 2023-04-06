package com.savannahyost.carbingo.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.savannahyost.carbingo.Controller.CardController;
import com.savannahyost.carbingo.R;

public class CityBingoCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        CardController cardController = new CardController();
        String[][] randomItems = cardController.randomCityCard();;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_bingo_card);

        Button button1_1 = findViewById(R.id.button1_1);
        Button button1_2 = findViewById(R.id.button1_2);
        Button button1_3 = findViewById(R.id.button1_3);
        Button button1_4 = findViewById(R.id.button1_4);
        Button button1_5 = findViewById(R.id.button1_5);
        Button button2_1 = findViewById(R.id.button2_1);
        Button button2_2 = findViewById(R.id.button2_2);
        Button button2_3 = findViewById(R.id.button2_3);
        Button button2_4 = findViewById(R.id.button2_4);
        Button button2_5 = findViewById(R.id.button2_5);
        Button button3_1 = findViewById(R.id.button3_1);
        Button button3_2 = findViewById(R.id.button3_2);
        Button button3_3 = findViewById(R.id.button3_3);
        Button button3_4 = findViewById(R.id.button3_4);
        Button button3_5 = findViewById(R.id.button3_5);
        Button button4_1 = findViewById(R.id.button4_1);
        Button button4_2 = findViewById(R.id.button4_2);
        Button button4_3 = findViewById(R.id.button4_3);
        Button button4_4 = findViewById(R.id.button4_4);
        Button button4_5 = findViewById(R.id.button4_5);
        Button button5_1 = findViewById(R.id.button5_1);
        Button button5_2 = findViewById(R.id.button5_2);
        Button button5_3 = findViewById(R.id.button5_3);
        Button button5_4 = findViewById(R.id.button5_4);
        Button button5_5 = findViewById(R.id.button5_5);



//        button1_1.setBackgroundColor(Color.GREEN);
        button1_1.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
//                click = 1;
                if(click == 1) {
                    button1_1.setBackgroundColor(R.drawable.button_background);
                    click = 2;
                    System.out.println(click);
                } else if(click == 2) {
                    button1_1.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
                    System.out.println(click);
                }

            }
        });

//        button1_1.set



        button1_1.setText(randomItems[0][0]);

//        Button button = findViewById(R.id.button);
//        button.setBackgroundColor(Color.RED);
//        button.setBackground(Color.MAGENTA);

    }
}