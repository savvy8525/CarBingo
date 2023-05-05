package com.savannahyost.carbingo.UI;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

public class BingoDialog {

    public static void onBingo(Activity activity) {
        AlertDialog.Builder bingo = new AlertDialog.Builder(activity);
        bingo.setMessage("Congrats! You got a bingo!")
                .setTitle("Bingo!")
                .setPositiveButton("Replay?", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.out.println("replay");
                        activity.recreate();
                    }
                })
                .setNegativeButton("Main Menu", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.out.println("main menu");
                        Intent intent = new Intent(activity, MainActivity.class);
                        activity.startActivity(intent);
                    }
                });
        AlertDialog alertDialog = bingo.create();
        alertDialog.show();
    }

}
