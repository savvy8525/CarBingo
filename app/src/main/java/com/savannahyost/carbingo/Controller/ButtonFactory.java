package com.savannahyost.carbingo.Controller;

import android.widget.Button;

import com.savannahyost.carbingo.R;

public class ButtonFactory {
    private static boolean[][] bingoCardMatrix = new boolean[5][5];
    private static int canBingoRow = 0;
    private static int canBingoColumn = 0;
    private static int canBingoDiagonalRight = 0;
    private static int canBingoDiagonalLeft = 0;



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
    public static boolean checkRowWin() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(bingoCardMatrix[i][j]) {
                    canBingoRow++;
//                    System.out.println(canBingoRow);
                }
                if(canBingoRow == 5) {
                    canBingoRow = 0;
                    return true;
                }
            }
            canBingoRow = 0;
        }

        return false;
    }

    //sets a column to bingo when there are five selected in a column
    //works
    public static boolean checkColumnWin() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(bingoCardMatrix[j][i]) {
                    canBingoColumn++;
//                    System.out.println(canBingoColumn);
                }
                if(canBingoColumn == 5) {
                    canBingoColumn = 0;
                    return true;
                }
            }
            canBingoColumn = 0;
        }

        return false;

    }

    //sets a diagonal to bingo when there are five selected from corner to corner
    //Try switching false/true
    public static boolean checkDiagonalWin() {

        for (int i = 0; i < 5; i++) {
            if(bingoCardMatrix[i][i]){

                canBingoDiagonalRight++;
            }else {
                canBingoDiagonalRight = 0;
            }
            if(canBingoDiagonalRight == 5) {
                canBingoDiagonalRight = 0;
                return true;
            }
        }

        int count = 0;
        for (int i = 4; i >= 0; i--) {

            if(bingoCardMatrix[count][i]){
                canBingoDiagonalLeft++;
            }else {
                canBingoDiagonalLeft = 0;
            }
            if(canBingoDiagonalLeft == 5) {
                canBingoDiagonalLeft = 0;
                return true;
            }
            count++;
//            System.out.println(count);
        }

        return false;

    }
}
