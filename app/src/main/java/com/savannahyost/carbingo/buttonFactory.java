package com.savannahyost.carbingo;

import android.widget.Button;

public class buttonFactory {
    private static boolean[][] bingoCardMatrix = new boolean[5][5];
//    private static Button[][] buttonRows = new Button[5][5];

//    public static void makeBingoCard(int id, int i, int j) {
//        buttonRows[i][j] = findViewById(id);
//
//    }

    //TODO: research ways to keep button from releasing state
    public static void handleColorChange(Button button) {
        if(button.isPressed()) {
            button.setBackgroundResource(R.drawable.button_pressed);
        }else {
            button.setBackgroundResource(R.drawable.button_not_pressed);
        }
    }

    public static void updateGameMatrix(Button button, int k, int l) {
        if(button.isPressed()) {
            if(bingoCardMatrix[k][l]) {
                bingoCardMatrix[k][l] = false;
            } else {
                bingoCardMatrix[k][l] = true;
            }

        }
    }
    //TODO: fix this and confirm functionality
    public static void checkRowWin(int k, int l) {
        int canBingoRow = 0;
        //Row Bingo - works
        if(bingoCardMatrix[k][l]) {
//                                    System.out.println("l: " + l + " k: " + k);
            canBingoRow++;
//                                    System.out.println("row: " + canBingoRow);
        }else {
            canBingoRow = 0;
        }

        if(canBingoRow == 5) {
            System.out.println("bingo");
        }

    }
    //TODO: fix the column bingo, it keeps doubling the zero on the first two clicks

    public static void checkColumnWin(int l, int k) {
        //add for loop
        int canBingoColumn = 0;
        //Column bingo - doesn't work well and needs fixed
        if(bingoCardMatrix[l][k]) {

            System.out.println("l: " + l + " k: " + k);
            canBingoColumn++;

        }else {
            canBingoColumn = 0;
        }
        if(canBingoColumn == 5) {
            System.out.println("bingo");
            canBingoColumn = 0;
        }

    }
    //TODO: add in the diagonal bingo
    public static void checkDiagonalWin(int k, int l) {

    }
}
