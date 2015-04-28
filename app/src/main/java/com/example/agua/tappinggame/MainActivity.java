package com.example.agua.tappinggame;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends Activity {

    public Handler mHandler = new Handler();

    public Button mCenter;
    public Button mLeft1;
    public Button mLeft2;
    public Button mLeft3;
    public Button mRight1;
    public Button mRight2;
    public Button mRight3;
    public Button mTop1;
    public Button mTop2;
    public Button mTop3;
    public Button mBottom1;
    public Button mBottom2;
    public Button mBottom3;
    public Button mBottomLeft01;
    public Button mBottomLeft02;
    public Button mBottomLeft03;
    public Button mBottomLeft11;
    public Button mBottomLeft12;
    public Button mBottomLeft13;
    public Button mBottomLeft21;
    public Button mBottomLeft22;
    public Button mBottomLeft23;
    public Button mBottomRight01;
    public Button mBottomRight02;
    public Button mBottomRight03;
    public Button mBottomRight11;
    public Button mBottomRight12;
    public Button mBottomRight13;
    public Button mBottomRight21;
    public Button mBottomRight22;
    public Button mBottomRight23;
    public Button mTopLeft01;
    public Button mTopLeft02;
    public Button mTopLeft03;
    public Button mTopLeft11;
    public Button mTopLeft12;
    public Button mTopLeft13;
    public Button mTopLeft21;
    public Button mTopLeft22;
    public Button mTopLeft23;
    public Button mTopRight01;
    public Button mTopRight02;
    public Button mTopRight03;
    public Button mTopRight11;
    public Button mTopRight12;
    public Button mTopRight13;
    public Button mTopRight21;
    public Button mTopRight22;
    public Button mTopRight23;

    public Grid mGrid = new Grid();

    public TextView mScoreTextView;
    private int mScore = 0;
    private int mLives = 1;
    private int mTilesLifeTime = 3000;
    private int mTilesSpawnTime = 2000;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mScoreTextView = (TextView) findViewById(R.id.scoreTextView);

        mCenter = (Button) findViewById(R.id.cellCenter);
        mLeft1 = (Button) findViewById(R.id.cellLeft1);
        mLeft2 = (Button) findViewById(R.id.cellLeft2);
        mLeft3 = (Button) findViewById(R.id.cellLeft3);
        mRight1 = (Button) findViewById(R.id.cellRight1);
        mRight2 = (Button) findViewById(R.id.cellRight2);
        mRight3 = (Button) findViewById(R.id.cellRight3);
        mTop1 = (Button) findViewById(R.id.cellTop1);
        mTop2 = (Button) findViewById(R.id.cellTop2);
        mTop3 = (Button) findViewById(R.id.cellTop3);
        mBottom1 = (Button) findViewById(R.id.cellBottom1);
        mBottom2 = (Button) findViewById(R.id.cellBottom2);
        mBottom3 = (Button) findViewById(R.id.cellBottom3);
        mBottomLeft01 = (Button) findViewById(R.id.cellBottomLeft01);
        mBottomLeft02 = (Button) findViewById(R.id.cellBottomLeft02);
        mBottomLeft03 = (Button) findViewById(R.id.cellBottomLeft03);
        mBottomLeft11 = (Button) findViewById(R.id.cellBottomLeft11);
        mBottomLeft12 = (Button) findViewById(R.id.cellBottomLeft12);
        mBottomLeft13 = (Button) findViewById(R.id.cellBottomLeft13);
        mBottomLeft21 = (Button) findViewById(R.id.cellBottomLeft21);
        mBottomLeft22 = (Button) findViewById(R.id.cellBottomLeft22);
        mBottomLeft23 = (Button) findViewById(R.id.cellBottomLeft23);
        mBottomRight01 = (Button) findViewById(R.id.cellBottomRight01);
        mBottomRight02 = (Button) findViewById(R.id.cellBottomRight02);
        mBottomRight03 = (Button) findViewById(R.id.cellBottomRight03);
        mBottomRight11 = (Button) findViewById(R.id.cellBottomRight11);
        mBottomRight12 = (Button) findViewById(R.id.cellBottomRight12);
        mBottomRight13 = (Button) findViewById(R.id.cellBottomRight13);
        mBottomRight21 = (Button) findViewById(R.id.cellBottomRight21);
        mBottomRight22 = (Button) findViewById(R.id.cellBottomRight22);
        mBottomRight23 = (Button) findViewById(R.id.cellBottomRight23);
        mTopLeft01 = (Button) findViewById(R.id.cellTopLeft01);
        mTopLeft02 = (Button) findViewById(R.id.cellTopLeft02);
        mTopLeft03 = (Button) findViewById(R.id.cellTopLeft03);
        mTopLeft11 = (Button) findViewById(R.id.cellTopLeft11);
        mTopLeft12 = (Button) findViewById(R.id.cellTopLeft12);
        mTopLeft13 = (Button) findViewById(R.id.cellTopLeft13);
        mTopLeft21 = (Button) findViewById(R.id.cellTopLeft21);
        mTopLeft22 = (Button) findViewById(R.id.cellTopLeft22);
        mTopLeft23 = (Button) findViewById(R.id.cellTopLeft23);
        mTopRight01 = (Button) findViewById(R.id.cellTopRight01);
        mTopRight02 = (Button) findViewById(R.id.cellTopRight02);
        mTopRight03 = (Button) findViewById(R.id.cellTopRight03);
        mTopRight11 = (Button) findViewById(R.id.cellTopRight11);
        mTopRight12 = (Button) findViewById(R.id.cellTopRight12);
        mTopRight13 = (Button) findViewById(R.id.cellTopRight13);
        mTopRight21 = (Button) findViewById(R.id.cellTopRight21);
        mTopRight22 = (Button) findViewById(R.id.cellTopRight22);
        mTopRight23 = (Button) findViewById(R.id.cellTopRight23);

        Button[] buttons = {
                mCenter,
                mLeft1,
                mLeft2,
                mLeft3,
                mRight1,
                mRight2,
                mRight3,
                mTop1,
                mTop2,
                mTop3,
                mBottom1,
                mBottom2,
                mBottom3,
                mBottomLeft01,
                mBottomLeft02,
                mBottomLeft03,
                mBottomLeft11,
                mBottomLeft12,
                mBottomLeft13,
                mBottomLeft21,
                mBottomLeft22,
                mBottomLeft23,
                mBottomRight01,
                mBottomRight02,
                mBottomRight03,
                mBottomRight11,
                mBottomRight12,
                mBottomRight13,
                mBottomRight21,
                mBottomRight22,
                mBottomRight23,
                mTopLeft01,
                mTopLeft02,
                mTopLeft03,
                mTopLeft11,
                mTopLeft12,
                mTopLeft13,
                mTopLeft21,
                mTopLeft22,
                mTopLeft23,
                mTopRight01,
                mTopRight02,
                mTopRight03,
                mTopRight11,
                mTopRight12,
                mTopRight13,
                mTopRight21,
                mTopRight22,
                mTopRight23
        };


        String[] colorPalette = {"#D32F2F", "#FFEB3B"};


        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setVisibility(View.INVISIBLE);
        }


        mGrid.setColorPalette(colorPalette);
        mGrid.setButtons(buttons);

        displayTiles();
        updateScore();
    }

    //How many tiles are being displayed at once
    public void displayTiles() {

        callRandomTile();

        if (mScore > 5) {
            mHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    callRandomTile();
                }
            }, 100);
        }

        if (mScore > 12) {
            mHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    callRandomTile();
                }
            }, 200);
        }

        if (mScore > 22) {
            mHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    callRandomTile();
                }
            }, 300);
        }

        if (mScore == 15) {
            mTilesLifeTime = 2500;
            mTilesSpawnTime = 1500;
        } else if (mScore == 30) {
            mTilesLifeTime = 2200;
            mTilesSpawnTime = 1000;
        } else if (mScore == 40) {
            mTilesLifeTime = 2000;
            mTilesSpawnTime = 1000;
        }
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                displayTiles();
            }
        }, mTilesSpawnTime);
    }

    //Display a new Tile on the screen
    public void callRandomTile() {
        final Button button = mGrid.getRandomButton();

        button.setVisibility(View.VISIBLE);


        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (button.getVisibility() == View.VISIBLE) {
                    button.setVisibility(View.INVISIBLE);
                    updateLives();
                }
            }
        }, mTilesLifeTime);


    }

    //Increase and display new score
    public void updateScore() {
        mScore++;
        mScoreTextView.setText(mScore + "");
    }

    public void updateLives() {
        TextView livesTextView = (TextView) findViewById(R.id.livesTextView);
        mLives--;
        livesTextView.setText(mLives + "");
    }



    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.cellCenter:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellLeft1:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellLeft2:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellLeft3:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellRight1:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellRight2:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellRight3:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTop1:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTop2:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTop3:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottom1:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottom2:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottom3:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopRight01:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopRight02:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopRight03:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopRight11:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopRight12:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopRight13:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopRight21:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopRight22:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopRight23:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopLeft01:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopLeft02:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopLeft03:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopLeft11:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopLeft12:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopLeft13:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopLeft21:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopLeft22:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellTopLeft23:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomLeft01:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomLeft02:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomLeft03:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomLeft11:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomLeft12:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomLeft13:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomLeft21:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomLeft22:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomLeft23:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomRight01:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomRight02:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomRight03:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomRight11:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomRight12:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomRight13:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomRight21:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomRight22:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;

            case R.id.cellBottomRight23:
                //view.setBackgroundColor(Color.parseColor("#ffffff"));
                view.setVisibility(View.INVISIBLE);
                updateScore();
                break;


        }

    }


}
