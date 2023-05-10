package com.savannahyost.carbingo.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;

import com.savannahyost.carbingo.R;

public class MainActivity extends AppCompatActivity {
    private UIAnimations uiAnimations = new UIAnimations();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] carBingoTextID = {R.id.c, R.id.a, R.id.r, R.id.space, R.id.b, R.id.i, R.id.n, R.id.g, R.id.o, R.id.exclamation};

        TextView[] carBingoChar = new TextView[10];
        for (int i = 0; i < carBingoChar.length; i++) {
            carBingoChar[i] = findViewById(carBingoTextID[i]);
        }
        uiAnimations.gradientFadeIn(carBingoChar);

//        AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);

//        carBingo.startAnimation(fadeIn);
//        fadeIn.setDuration(3000);
//        fadeIn.setFillAfter(true);

//        fadeIn.setStartOffset(4000+fadeIn.getStartOffset());

        TextView testCarBingo = findViewById(R.id.carBingoTextTest);


        Button city = findViewById(R.id.cityCard);
        Button licensePlate = findViewById(R.id.licensePlateCard);

        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CityBingoGame.class);
                startActivity(intent);
            }
        });

        licensePlate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LicensePlatesBingoGame.class);
                startActivity(intent);
            }
        });


    }



}