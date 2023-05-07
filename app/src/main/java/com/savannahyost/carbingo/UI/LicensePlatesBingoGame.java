package com.savannahyost.carbingo.UI;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.savannahyost.carbingo.Controller.CardController;
import com.savannahyost.carbingo.Controller.ButtonFactory;
import com.savannahyost.carbingo.Model.LicensePlatesCard;
import com.savannahyost.carbingo.R;

public class LicensePlatesBingoGame extends AppCompatActivity {
    private Button[][] buttonRows = new Button[5][5];
    private BingoDialog bingoDialog = new BingoDialog();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license_plates_bingo_game);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        int[] buttonId = {R.id.plate_button1_1, R.id.plate_button1_2, R.id.plate_button1_3, R.id.plate_button1_4, R.id.plate_button1_5,
                R.id.plate_button2_1, R.id.plate_button2_2, R.id.plate_button2_3, R.id.plate_button2_4, R.id.plate_button2_5,
                R.id.plate_button3_1, R.id.plate_button3_2, R.id.plate_button3_3, R.id.plate_button3_4, R.id.plate_button3_5,
                R.id.plate_button4_1, R.id.plate_button4_2, R.id.plate_button4_3, R.id.plate_button4_4, R.id.plate_button4_5,
                R.id.plate_button5_1, R.id.plate_button5_2, R.id.plate_button5_3, R.id.plate_button5_4, R.id.plate_button5_5};
        int buttonNum = 0;
        CardController cardController = new CardController();
        LicensePlatesCard licensePlatesCard = new LicensePlatesCard();
        String[][] randomizeCard = cardController.randomCard(licensePlatesCard.getLicensePlates());


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
                        onClickView(v, savedInstanceState);
                    }
                });
            }
        }
    }

    private void onClickView(View v, Bundle instance) {

        for (int k = 0; k < buttonRows.length; k++) {
            for (int l = 0; l < buttonRows.length; l++) {
                //Changes button color state and sets a boolean matrix to make "bingo" pop up when there are 5 in a row
                ButtonFactory.handleColorChange(buttonRows[k][l]);
                ButtonFactory.updateGameMatrix(buttonRows[k][l], k, l);
                if(ButtonFactory.checkRowWin(k,l)) {
                    BingoDialog.onBingo(this);
                }
            }
        }
        if(ButtonFactory.checkColumnWin()){
            BingoDialog.onBingo(this);
        }
        if(ButtonFactory.checkDiagonalWin()) {
            BingoDialog.onBingo(this);
        }
    }
}