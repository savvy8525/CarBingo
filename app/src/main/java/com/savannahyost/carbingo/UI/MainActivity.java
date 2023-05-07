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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView carBingo = findViewById(R.id.carBingoText);

        AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);

        carBingo.startAnimation(fadeIn);
        fadeIn.setDuration(3000);
        fadeIn.setFillAfter(true);
        fadeIn.setStartOffset(4000+fadeIn.getStartOffset());

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