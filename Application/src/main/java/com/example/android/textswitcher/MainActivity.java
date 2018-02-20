/*
 * Copyright 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.textswitcher;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;


public class MainActivity extends Activity {
    private TextSwitcher mSwitcher;
    private int mCounter = 0;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_main);

        mSwitcher = findViewById(R.id.switcher);

        mSwitcher.setFactory(mFactory);

        Animation in = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in);
        Animation out = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_out);
        mSwitcher.setInAnimation(in);
        mSwitcher.setOutAnimation(out);

        Button nextButton = findViewById(R.id.button);
        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mCounter++;

                if (mCounter == 1) {
                    imageView = (ImageView) findViewById(R.id.imageView);
                    imageView.setImageResource(R.drawable.cap);
                    mSwitcher.setText("Captain America");
                } else if (mCounter == 2) {
                    imageView = (ImageView) findViewById(R.id.imageView);
                    imageView.setImageResource(R.drawable.tony);
                    mSwitcher.setText("Iron Man");
                } else if (mCounter == 3) {
                    imageView = (ImageView) findViewById(R.id.imageView);
                    imageView.setImageResource(R.drawable.bp);
                    mSwitcher.setText("Black Panther");
                } else if (mCounter == 4) {
                    imageView = (ImageView) findViewById(R.id.imageView);
                    imageView.setImageResource(R.drawable.th);
                    mSwitcher.setText("Thor");
                } else if (mCounter == 5) {
                    imageView = (ImageView) findViewById(R.id.imageView);
                    imageView.setImageResource(R.drawable.hulk);
                    mSwitcher.setText("Hulk");
                } else if (mCounter == 6) {
                    imageView = (ImageView) findViewById(R.id.imageView);
                    imageView.setImageResource(R.drawable.sp);
                    mSwitcher.setText("Spiderman");
                } else if (mCounter == 7) {
                    imageView = (ImageView) findViewById(R.id.imageView);
                    imageView.setImageResource(R.drawable.ant);
                    mSwitcher.setText("Ant Man");
                }

                else  {
                    mCounter = 7;
                }

            }
        } );


        Button nextButton2 = findViewById(R.id.button2);
        nextButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mCounter--;

                if (mCounter==1){
                    imageView = (ImageView) findViewById(R.id.imageView);
                    imageView.setImageResource(R.drawable.cap);
                    mSwitcher.setText("Captain America");
                }
                else if (mCounter==2){
                    imageView = (ImageView) findViewById(R.id.imageView);
                    imageView.setImageResource(R.drawable.tony);
                    mSwitcher.setText("Iron Man");
                }

                else if (mCounter==3){
                    imageView = (ImageView) findViewById(R.id.imageView);
                    imageView.setImageResource(R.drawable.bp);
                    mSwitcher.setText("Black Panther");
                }

                else if (mCounter==4){
                    imageView = (ImageView) findViewById(R.id.imageView);
                    imageView.setImageResource(R.drawable.th);
                    mSwitcher.setText("Thor");
                }

                else if (mCounter==5){
                    imageView = (ImageView) findViewById(R.id.imageView);
                    imageView.setImageResource(R.drawable.hulk);
                    mSwitcher.setText("Hulk");
                }

                else if (mCounter==6){
                    imageView = (ImageView) findViewById(R.id.imageView);
                    imageView.setImageResource(R.drawable.sp);
                    mSwitcher.setText("Spiderman");
                }

                else if (mCounter==7){
                    imageView = (ImageView) findViewById(R.id.imageView);
                    imageView.setImageResource(R.drawable.ant);
                    mSwitcher.setText("Ant Man");
                }

                else  {
                    mCounter = 0;
                }
            }
        });

    }


    private ViewFactory mFactory = new ViewFactory() {

        @Override
        public View makeView() {

            // Create a new TextView
            TextView t = new TextView(MainActivity.this);
            t.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL);
            t.setTextAppearance(MainActivity.this, android.R.style.TextAppearance_Large);
            return t;
        }
    };

}
