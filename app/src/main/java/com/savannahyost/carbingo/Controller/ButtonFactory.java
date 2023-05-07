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
    public static boolean checkRowWin(int k, int l) {
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
            return true;
        }
        return false;
    }

    //sets a column to bingo when there are five selected in a column
    public static boolean checkColumnWin() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(bingoCardMatrix[j][i]) {
                    canBingoColumn++;
//                    System.out.println(canBingoColumn);
                }else {
                    canBingoColumn = 0;
                }
                if(canBingoColumn == 5) {
                    System.out.println("column bingo");
                    canBingoColumn = 0;
                    return true;
                }
            }
            
        }

        return false;

    }
    //sets a diagonal to bingo when there are five selected from corner to corner
    //Try switching false/true
    public static boolean checkDiagonalWin() {

        for (int i = 0; i < 5; i++) {
            if(bingoCardMatrix[i][i]){

                canBingoDiagonalRight++;
//                System.out.println(canBingoDiagonalRight);
            }else {
                canBingoDiagonalRight = 0;
            }
            if(canBingoDiagonalRight == 5) {
                System.out.println("bingo");
                canBingoDiagonalRight = 0;
                return true;
            }
        }

        int count = 0;
        for (int i = 4; i >= 0; i--) {

            if(bingoCardMatrix[count][i]){

                canBingoDiagonalLeft++;
//                System.out.println(canBingoDiagonalLeft);
            }else {
                canBingoDiagonalLeft = 0;
            }
            if(canBingoDiagonalLeft == 5) {
                System.out.println("bingo");
                canBingoDiagonalLeft = 0;
                return true;
            }
            count++;
        }

        return false;

    }
}
