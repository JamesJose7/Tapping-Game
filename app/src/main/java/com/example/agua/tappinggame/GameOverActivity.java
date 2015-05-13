package com.example.agua.tappinggame;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class GameOverActivity extends Activity {

    private int mPreviousScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        Button resetButton = (Button) findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameOverActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //Get intent extras
        Intent intent = getIntent();
        mPreviousScore  = intent.getIntExtra("previousScore", 0);

        TextView previousScoreTextView = (TextView) findViewById(R.id.scoreGameOver);
        previousScoreTextView.setText(mPreviousScore + "");

    }



}
