package com.savannahyost.carbingo.Controller;

import com.savannahyost.carbingo.Model.CityCard;

public class CardController {
    public String[][] randomCard(String[][] card) {
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[i].length; j++) {
                int i1 = (int) (Math.random() * card.length);
                int j1 = (int) (Math.random() * card[i].length);

                String temp = card[i][j];
                card[i][j] = card[i1][j1];
                card[i1][j1] = temp;
            }
        }
        return card;
    }

}
