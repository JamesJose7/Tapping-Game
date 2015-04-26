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

    public void setButtons(Button[] buttons) {
        mButtons = buttons;
    }

}
