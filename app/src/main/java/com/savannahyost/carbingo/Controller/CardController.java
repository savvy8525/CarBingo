package com.savannahyost.carbingo.Controller;

import com.savannahyost.carbingo.Model.CityCard;
import com.savannahyost.carbingo.R;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class CardController {


    public String[][] randomCard(String[] card) {

        Collections.shuffle(Arrays.asList(card), new Random());
        String[][] randomCard = new String[5][5];
        int cardCount = 0;

        for (int i = 0; i < randomCard.length; i++) {
            for (int j = 0; j < randomCard[i].length; j++) {

                randomCard[i][j] = card[cardCount];
                cardCount++;

            }
        }
        return randomCard;
    }

    /*moved to the above to only shuffle a 1d array and put it in a 2d array so that there can be more options*/
//    public String[][] randomCard(String[][] card) {
//        for (int i = 0; i < card.length; i++) {
//            for (int j = 0; j < card[i].length; j++) {
//                int i1 = (int) (Math.random() * card.length);
//                int j1 = (int) (Math.random() * card[i].length);
//
//                String temp = card[i][j];
//                card[i][j] = card[i1][j1];
//                card[i1][j1] = temp;
//            }
//        }
//        return card;
//    }

}
