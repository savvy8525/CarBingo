package com.savannahyost.carbingo.Controller;

import android.widget.Button;

import com.savannahyost.carbingo.R;

import java.util.Arrays;

public class buttonFactory {
    private static boolean[][] bingoCardMatrix = new boolean[5][5];
    private static int canBingoRow = 0;
    private static int canBingoColumn = 0;
    private static int canBingoDiagonal = 0;
    private static int diagonalCount = 0;

//    private static Button[][] buttonRows = new Button[5][5];


//    public static void makeBingoCard(int id, int i, int j) {
//        buttonRows[i][j] = findViewById(id);
//
//    }

    //Changes the button color between transparent and orange depending on selection state
    public static void handleColorChange(Button button) {
        if(button.isPressed() && button.isSelected()) {
            button.setBackgroundResource(R.drawable.button_not_pressed);
            button.setSelected(false);
        }else if(button.isPressed()) {
            button.setBackgroundResource(R.drawable.button_pressed);
            button.setSelected(true);

        }
    }

    //Updates game matrix to true or false if the button is selected
    public static void updateGameMatrix(Button button, int k, int l) {
        bingoCardMatrix[k][l] = button.isSelected();
//        bingoCardMatrix[l][k] = button.isSelected();

    }


    //sets a row to bingo when there are five in a row
    public static void checkRowWin(int k, int l) {
        //Row Bingo - works
        if(bingoCardMatrix[k][l]) {
//            System.out.println(" k: " + k + "l: " + l );
            canBingoRow++;
        }else {
            canBingoRow = 0;
        }

        if(canBingoRow == 5) {
            System.out.println("bingo");
            canBingoRow = 0;
        }

    }

    //sets a column to bingo when there are five selected in a column
    public static void checkColumnWin() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(bingoCardMatrix[j][i]) {
                    canBingoColumn++;
                    System.out.println(canBingoColumn);
                }else {
                    canBingoColumn = 0;
                }
                if(canBingoColumn == 5) {
                    System.out.println("bingo");
                    canBingoColumn = 0;
                }
            }
            
        }

    }
    //sets a diagonal to bingo when there are five selected from corner to corner
    //TODO: fix the right to left diagonal bingo. left to right works
    public static void checkDiagonalWin() {


        for (int i = 0; i < 5; i++) {
            if(bingoCardMatrix[i][i]){

                canBingoDiagonal++;
//                System.out.println(canBingoDiagonal);
            }else {
                canBingoDiagonal = 0;
            }
            if(canBingoDiagonal == 5) {
                System.out.println("bingo");
                canBingoDiagonal = 0;
            }
        }

    }
}
