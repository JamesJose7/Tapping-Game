package com.example.agua.tappinggame;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;

import java.util.Random;

/**
 * Created by agua on 24/04/15.
 */
public class Grid {

    private Button[] mButtons;
    private String[] mColorPalette;

    public Button getRandomButton() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mButtons.length);
        int randomColor = randomGenerator.nextInt(mColorPalette.length);

        mButtons[randomNumber].setBackgroundColor(Color.parseColor(mColorPalette[randomColor]));
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


    public int getAmountOfDisplayedButtons() {
        int buttonsDisplayed = 0;
        for (int i = 0; i < mButtons.length; i++) {
            if (mButtons[i].getVisibility() == View.VISIBLE) {
                buttonsDisplayed++;
            }
        }

        return buttonsDisplayed;
    }

    public void setButtons(Button[] buttons) {
        mButtons = buttons;
    }

    public void setColorPalette(String[] colorPalette) {
        mColorPalette = colorPalette;
    }



}
