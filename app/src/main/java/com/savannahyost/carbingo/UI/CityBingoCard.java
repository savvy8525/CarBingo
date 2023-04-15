package com.savannahyost.carbingo.UI;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.savannahyost.carbingo.Controller.CardController;
import com.savannahyost.carbingo.R;

import java.util.Arrays;


public class CityBingoCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_bingo_card);

        CardController cardController = new CardController();
        String[][] randomItems = cardController.randomCityCard();
        boolean[][] isPressed = new boolean[5][5];
        int[] buttonId = {R.id.button1_1, R.id.button1_2, R.id.button1_3, R.id.button1_4, R.id.button1_5,
                R.id.button2_1, R.id.button2_2, R.id.button2_3, R.id.button2_4, R.id.button2_5,
                R.id.button3_1, R.id.button3_2, R.id.button3_3, R.id.button3_4, R.id.button3_5,
                R.id.button4_1, R.id.button4_2, R.id.button4_3, R.id.button4_4, R.id.button4_5,
                R.id.button5_1, R.id.button5_2, R.id.button5_3, R.id.button5_4, R.id.button5_5};
        int buttonNum = 0;

//        int canBingo = 0;

        Button[][] buttonRows = new Button[5][5];
        for (int i = 0; i < buttonRows.length; i++) {
            for (int j = 0; j < buttonRows.length; j++) {
                buttonRows[i][j] = findViewById(buttonId[buttonNum]);
                buttonRows[i][j].setText(randomItems[i][j]);
                buttonNum++;
            }
        }



        for (int i = 0; i < buttonRows.length; i++) {
            for (int j = 0; j < buttonRows.length; j++) {
                buttonRows[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        for (int k = 0; k < buttonRows.length; k++) {
                            int canBingoRow = 0;
                            int canBingoColumn = 0;
                            for (int l = 0; l < buttonRows.length; l++) {
                                if(buttonRows[k][l].isPressed() && isPressed[k][l]) {
                                    buttonRows[k][l].setBackgroundResource(R.drawable.button_not_pressed);
                                    isPressed[k][l] = false;
                                } else if (buttonRows[k][l].isPressed()) {
                                    buttonRows[k][l].setBackgroundResource(R.drawable.button_pressed);
                                    isPressed[k][l] = true;
                                }
                                if(isPressed[k][l]) {
                                    canBingoRow++;
                                    System.out.println("row: " + canBingoRow);
                                }else {
                                    canBingoRow = 0;
                                }
//                                if (isPressed[l][k]) {
//                                    canBingoColumn++;
//                                    System.out.println("column: " + canBingoColumn);
//                                } else {
//                                    canBingoColumn = 0;
//                                }
                                if(canBingoRow == 5 || canBingoColumn == 5) {
                                    System.out.println("bingo");
                                }
                            }

                        }

                    }
                });

//                for (int k = 0; k < isPressed.length; k++) {
//                    for (int l = 0; l < isPressed.length; l++) {
//                        System.out.println(isPressed[k][l]);
//
//                    }
//
//                }
            }
        }



//        for (int i = 0; i < isPressed.length; i++) {
//            for (int j = 0; j < isPressed.length; j++) {
//                System.out.println(isPressed[i][j]);
////                if(isPressed[i][j]) {
////                    canBingo++;
////                    System.out.println(canBingo);
////                } else {
////                    canBingo = 0;
////                }
//            }
//
//        }



    }


}