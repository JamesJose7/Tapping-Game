package com.example.agua.tappinggame;

import android.view.View;
import android.widget.Button;

import java.util.Random;

/**
 * Created by agua on 24/04/15.
 */
public class Grid {

    private Button[] mButtons;

    public Button getRandomButton() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mButtons.length);

        return mButtons[randomNumber];
    }

    public boolean areButtonsVisible() {
        boolean visible = false;
        for (int i = 0; i < mButtons.length; i++) {
            if (mButtons[i].getVisibility() == View.VISIBLE) {
                visible = true;
            }
        }

        return visible;
    }

    public void setButtons(Button[] buttons) {
        mButtons = buttons;
    }



}
