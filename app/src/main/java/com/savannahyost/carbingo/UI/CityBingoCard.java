package com.savannahyost.carbingo.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.savannahyost.carbingo.Controller.CardController;
import com.savannahyost.carbingo.R;

public class CityBingoCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        CardController cardController = new CardController();
        String[][] randomItems = cardController.randomCityCard();;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_bingo_card);

        boolean[][] isClicked = new boolean[5][5];
        for (int i = 0; i < isClicked.length; i++) {
            for (int j = 0; j < isClicked.length; j++) {
                isClicked[i][j] = false;
            }
        }

//        final boolean hasBingo = false;

        //refactor into array
        Button button1_1 = findViewById(R.id.button1_1);
        Button button1_2 = findViewById(R.id.button1_2);
        Button button1_3 = findViewById(R.id.button1_3);
        Button button1_4 = findViewById(R.id.button1_4);
        Button button1_5 = findViewById(R.id.button1_5);
        Button button2_1 = findViewById(R.id.button2_1);
        Button button2_2 = findViewById(R.id.button2_2);
        Button button2_3 = findViewById(R.id.button2_3);
        Button button2_4 = findViewById(R.id.button2_4);
        Button button2_5 = findViewById(R.id.button2_5);
        Button button3_1 = findViewById(R.id.button3_1);
        Button button3_2 = findViewById(R.id.button3_2);
        Button button3_3 = findViewById(R.id.button3_3);
        Button button3_4 = findViewById(R.id.button3_4);
        Button button3_5 = findViewById(R.id.button3_5);
        Button button4_1 = findViewById(R.id.button4_1);
        Button button4_2 = findViewById(R.id.button4_2);
        Button button4_3 = findViewById(R.id.button4_3);
        Button button4_4 = findViewById(R.id.button4_4);
        Button button4_5 = findViewById(R.id.button4_5);
        Button button5_1 = findViewById(R.id.button5_1);
        Button button5_2 = findViewById(R.id.button5_2);
        Button button5_3 = findViewById(R.id.button5_3);
        Button button5_4 = findViewById(R.id.button5_4);
        Button button5_5 = findViewById(R.id.button5_5);

        button1_1.setText(randomItems[0][0]);
        button1_2.setText(randomItems[0][1]);
        button1_3.setText(randomItems[0][2]);
        button1_4.setText(randomItems[0][3]);
        button1_5.setText(randomItems[0][4]);
        button2_1.setText(randomItems[1][0]);
        button2_2.setText(randomItems[1][1]);
        button2_3.setText(randomItems[1][2]);
        button2_4.setText(randomItems[1][3]);
        button2_5.setText(randomItems[1][4]);
        button3_1.setText(randomItems[2][0]);
        button3_2.setText(randomItems[2][1]);
        button3_3.setText(randomItems[2][2]);
        button3_4.setText(randomItems[2][3]);
        button3_5.setText(randomItems[2][4]);
        button4_1.setText(randomItems[3][0]);
        button4_2.setText(randomItems[3][1]);
        button4_3.setText(randomItems[3][2]);
        button4_4.setText(randomItems[3][3]);
        button4_5.setText(randomItems[3][4]);
        button5_1.setText(randomItems[4][0]);
        button5_2.setText(randomItems[4][1]);
        button5_3.setText(randomItems[4][2]);
        button5_4.setText(randomItems[4][3]);
        button5_5.setText(randomItems[4][4]);


//button1_1.is
//        button1_1.setBackgroundColor(Color.GREEN);
        button1_1.setOnClickListener(new View.OnClickListener() {
//            int click = 1;
boolean notClicked = true;
            int count = 0;
            @Override
            public void onClick(View v) {
                if(notClicked) {
                    button1_1.setBackgroundColor(R.drawable.button_background);
//                    click = 2;
                    notClicked = false;
                    isClicked[0][0] = true;
//                    System.out.println(click);
                } else {
                    button1_1.setBackgroundColor(Color.TRANSPARENT);
//                    click = 1;
                    notClicked = true;
                    isClicked[0][0] = false;
                    count = 0;
//                    System.out.println(click);
                }

                for (int i = 0; i < isClicked.length; i++) {
                    if(isClicked[0][i]) {
//                        hasBingo = true;
                        count++;
                    } else {
                        count = 0;
                    }
                }

                if(count == 5) {
                    Toast.makeText(CityBingoCard.this, "BINGO!", Toast.LENGTH_LONG).show();
                    System.out.println("bingo!");
                }

            }
        });
        button1_2.setOnClickListener(new View.OnClickListener() {
            boolean notClicked = true;
            int count = 0;
            @Override
            public void onClick(View v) {
                if(notClicked) {
                    button1_2.setBackgroundColor(R.drawable.button_background);
//                    click = 2;
                    notClicked = false;
                    isClicked[0][1] = true;
//                    System.out.println(click);
                } else {
                    button1_2.setBackgroundColor(Color.TRANSPARENT);
//                    click = 1;
                    notClicked = true;
                    isClicked[0][1] = false;
                    count = 0;
//                    System.out.println(click);
                }

                for (int i = 0; i < isClicked.length; i++) {
                    if(isClicked[0][i]) {
//                        hasBingo = true;
                        count++;
                    } else {
                        count = 0;
                    }
                }

                if(count == 5) {
                    Toast.makeText(CityBingoCard.this, "BINGO!", Toast.LENGTH_LONG).show();
                    System.out.println("bingo!");
                }

            }
        });
        button1_3.setOnClickListener(new View.OnClickListener() {
            boolean notClicked = true;
            int count = 0;
            @Override
            public void onClick(View v) {
                if(notClicked) {
                    button1_3.setBackgroundColor(R.drawable.button_background);
//                    click = 2;
                    notClicked = false;
                    isClicked[0][2] = true;
//                    System.out.println(click);
                } else {
                    button1_3.setBackgroundColor(Color.TRANSPARENT);
//                    click = 1;
                    notClicked = true;
                    isClicked[0][2] = false;
                    count = 0;
//                    System.out.println(click);
                }

                for (int i = 0; i < isClicked.length; i++) {
                    if(isClicked[0][i]) {
//                        hasBingo = true;
                        count++;
                    } else {
                        count = 0;
                    }
                }

                if(count == 5) {
                    Toast.makeText(CityBingoCard.this, "BINGO!", Toast.LENGTH_LONG).show();
                    System.out.println("bingo!");
                }

            }
        });
        button1_4.setOnClickListener(new View.OnClickListener() {
            boolean notClicked = true;
            int count = 0;
            @Override
            public void onClick(View v) {
                if(notClicked) {
                    button1_4.setBackgroundColor(R.drawable.button_background);
//                    click = 2;
                    notClicked = false;
                    isClicked[0][3] = true;
//                    System.out.println(click);
                } else {
                    button1_4.setBackgroundColor(Color.TRANSPARENT);
//                    click = 1;
                    notClicked = true;
                    isClicked[0][3] = false;
                    count = 0;
//                    System.out.println(click);
                }

                for (int i = 0; i < isClicked.length; i++) {
                    if(isClicked[0][i]) {
//                        hasBingo = true;
                        count++;
                    } else {
                        count = 0;
                    }
                }

                if(count == 5) {
                    Toast.makeText(CityBingoCard.this, "BINGO!", Toast.LENGTH_LONG).show();
                    System.out.println("bingo!");
                }

            }
        });
        button1_5.setOnClickListener(new View.OnClickListener() {
            boolean notClicked = true;
            int count = 0;
            @Override
            public void onClick(View v) {
                if(notClicked) {
                    button1_5.setBackgroundColor(R.drawable.button_background);
//                    click = 2;
                    notClicked = false;
                    isClicked[0][4] = true;
//                    System.out.println(click);
                } else {
                    button1_5.setBackgroundColor(Color.TRANSPARENT);
//                    click = 1;
                    notClicked = true;
                    isClicked[0][4] = false;
                    count = 0;
//                    System.out.println(click);
                }

                for (int i = 0; i < isClicked.length; i++) {
                    if(isClicked[0][i]) {
//                        hasBingo = true;
                        count++;
                    } else {
                        count = 0;
                    }
                }

                if(count == 5) {
                    Toast.makeText(CityBingoCard.this, "BINGO!", Toast.LENGTH_LONG).show();
                    System.out.println("bingo!");
                }

            }
        });
        button2_1.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button2_1.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button2_1.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button2_2.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button2_2.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button2_2.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button2_3.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button2_3.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button2_3.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button2_4.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button2_4.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button2_4.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button2_5.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button2_5.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button2_5.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button3_1.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button3_1.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button3_1.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button3_2.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button3_2.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button3_2.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button3_3.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button3_3.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button3_3.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button3_4.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button3_4.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button3_4.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button3_5.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button3_5.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button3_5.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button4_1.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button4_1.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button4_1.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button4_2.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button4_2.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button4_2.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button4_3.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button4_3.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button4_3.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button4_4.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button4_4.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button4_4.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button4_5.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button4_5.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button4_5.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button5_1.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button5_1.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button5_1.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button5_2.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button5_2.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button5_2.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button5_3.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button5_3.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button5_3.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button5_4.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button5_4.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button5_4.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });
        button5_5.setOnClickListener(new View.OnClickListener() {
            int click = 1;
            @Override
            public void onClick(View v) {
                if(click == 1) {
                    button5_5.setBackgroundColor(R.drawable.button_background);
                    click = 2;
//                    System.out.println(click);
                } else if(click == 2) {
                    button5_5.setBackgroundColor(Color.TRANSPARENT);
                    click = 1;
//                    System.out.println(click);
                }

            }
        });

    }

}