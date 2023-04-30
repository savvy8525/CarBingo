package com.savannahyost.carbingo.UI;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.savannahyost.carbingo.R;

public class LicensePlatesBingoCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license_plates_bingo_card);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }


}