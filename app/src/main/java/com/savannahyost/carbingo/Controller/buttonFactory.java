package com.savannahyost.carbingo.Controller;

import android.widget.Button;

import com.savannahyost.carbingo.R;

public class buttonFactory {
    private static boolean[][] bingoCardMatrix = new boolean[5][5];
    private static int canBingoRow = 0;
    private static int canBingoColumn = 0;

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
    }

    //sets a row to bingo when there are five in a row
    public static void checkRowWin(int k, int l) {
        //Row Bingo - works
        if(bingoCardMatrix[k][l]) {
            canBingoRow++;
        }else {
            canBingoRow = 0;
        }

        if(canBingoRow == 5) {
            System.out.println("bingo");
            canBingoRow = 0;
        }

    }

    //TODO: fix the column bingo, it keeps doubling the zero on the first two clicks
    public static void checkColumnWin(Button button, int l, int k) {
        //add for loop


//        for (int i = 0; i < l; i++) {
//            for (int j = 0; j < bingoCardMatrix.length; j++) {
//                if(bingoCardMatrix[j][i]){
//                    canBingoColumn++;
//                    System.out.println(canBingoColumn);
////                    System.out.println(bingoCardMatrix);
//                } else {
//                    canBingoColumn = 0;
//                }
//            }
//            if (canBingoColumn == 5) {
//                System.out.println("bingo");
//                canBingoColumn = 0;
//            }
//        }

        //Column bingo - doesn't work well and needs fixed
        if(bingoCardMatrix[l][k]) {

            System.out.println(button.getId());
            canBingoColumn++;
            System.out.println(canBingoColumn);
            System.out.println("l: " + l + " k: " + k);
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
