package com.example.agua.tappinggame;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    private Button mCenter;
    private Button mLeft1;
    private Button mLeft2;
    private Button mLeft3;
    private Button mRight1;
    private Button mRight2;
    private Button mRight3;
    private Button mTop1;
    private Button mTop2;
    private Button mTop3;
    private Button mBottom1;
    private Button mBottom2;
    private Button mBottom3;
    private Button mBottomLeft01;
    private Button mBottomLeft02;
    private Button mBottomLeft03;
    private Button mBottomLeft11;
    private Button mBottomLeft12;
    private Button mBottomLeft13;
    private Button mBottomLeft21;
    private Button mBottomLeft22;
    private Button mBottomLeft23;
    private Button mBottomRight01;
    private Button mBottomRight02;
    private Button mBottomRight03;
    private Button mBottomRight11;
    private Button mBottomRight12;
    private Button mBottomRight13;
    private Button mBottomRight21;
    private Button mBottomRight22;
    private Button mBottomRight23;
    private Button mTopLeft01;
    private Button mTopLeft02;
    private Button mTopLeft03;
    private Button mTopLeft11;
    private Button mTopLeft12;
    private Button mTopLeft13;
    private Button mTopLeft21;
    private Button mTopLeft22;
    private Button mTopLeft23;
    private Button mTopRight01;
    private Button mTopRight02;
    private Button mTopRight03;
    private Button mTopRight11;
    private Button mTopRight12;
    private Button mTopRight13;
    private Button mTopRight21;
    private Button mTopRight22;
    private Button mTopRight23;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.cellCenter:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellLeft1:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellLeft2:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellLeft3:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellRight1:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellRight2:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellRight3:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTop1:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTop2:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTop3:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottom1:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottom2:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottom3:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopRight01:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopRight02:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopRight03:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopRight11:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopRight12:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopRight13:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopRight21:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopRight22:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopRight23:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopLeft01:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopLeft02:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopLeft03:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopLeft11:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopLeft12:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopLeft13:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopLeft21:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopLeft22:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellTopLeft23:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomLeft01:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomLeft02:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomLeft03:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomLeft11:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomLeft12:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomLeft13:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomLeft21:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomLeft22:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomLeft23:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomRight01:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomRight02:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomRight03:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomRight11:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomRight12:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomRight13:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomRight21:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomRight22:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;

            case R.id.cellBottomRight23:
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                break;


        }

    }


}
