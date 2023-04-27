package com.savannahyost.carbingo.UI;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.savannahyost.carbingo.Controller.CardController;
import com.savannahyost.carbingo.Model.CityCard;
import com.savannahyost.carbingo.R;
import com.savannahyost.carbingo.Controller.buttonFactory;


public class CityBingoCard extends AppCompatActivity {
    private int testColumn = 0;
//    private boolean[][] bingoCardMatrix = new boolean[5][5];
    private Button[][] buttonRows = new Button[5][5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_bingo_card);

        int[] buttonId = {R.id.button1_1, R.id.button1_2, R.id.button1_3, R.id.button1_4, R.id.button1_5,
                R.id.button2_1, R.id.button2_2, R.id.button2_3, R.id.button2_4, R.id.button2_5,
                R.id.button3_1, R.id.button3_2, R.id.button3_3, R.id.button3_4, R.id.button3_5,
                R.id.button4_1, R.id.button4_2, R.id.button4_3, R.id.button4_4, R.id.button4_5,
                R.id.button5_1, R.id.button5_2, R.id.button5_3, R.id.button5_4, R.id.button5_5};
        int buttonNum = 0;
        CardController cardController = new CardController();
        CityCard cityCard = new CityCard();
        String[][] randomizeCard = cardController.randomCard(cityCard.getCityCard());


        for (int i = 0; i < buttonRows.length; i++) {
            for (int j = 0; j < buttonRows.length; j++) {
                buttonRows[i][j] = findViewById(buttonId[buttonNum]);
                buttonRows[i][j].setText(randomizeCard[i][j]);
                buttonNum++;
            }
        }

        for (int i = 0; i < buttonRows.length; i++) {
            for (int j = 0; j < buttonRows.length; j++) {
                buttonRows[i][j].setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        onClickView(v);

                    }
                });

            }
        }




    }

    //TODO: make this work
    private void onClickView(View v) {

            for (int k = 0; k < buttonRows.length; k++) {
                for (int l = 0; l < buttonRows.length; l++) {
                    //Changes button color state and sets a boolean matrix to make "bingo" pop up when there are 5 in a row
                    buttonFactory.handleColorChange(buttonRows[k][l]);
                    buttonFactory.updateGameMatrix(buttonRows[k][l], k, l);
                    buttonFactory.checkRowWin(k,l);
                }
            }

        buttonFactory.checkColumnWin();
        buttonFactory.checkDiagonalWin();
    }

}