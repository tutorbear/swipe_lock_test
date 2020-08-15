package com.example.swipelocktest;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.appintro.AppIntro;


public class MainActivity extends AppIntro {

    SlideOne slideOne;
    SlideTwo slideTwo;
    SlideThree slideThree;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        slideOne = new SlideOne();
        slideTwo = new SlideTwo();
        slideThree = new SlideThree();


        addSlide(slideOne);
        addSlide(slideTwo);
        addSlide(slideThree);
        //I wish to lock FORWARD SWIPING for SLIDE 2

        setWizardMode(true);

        setIndicatorColor(Color.BLACK, Color.BLACK);
        setNextArrowColor(Color.BLACK);



        //Thankyou!

    }

    @Override
    protected void onSlideChanged(Fragment oldFragment, Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);

        if (newFragment == slideTwo){
//            setNextPageSwipeLock(true);// Doesn't work

            // setSwipeLock(true); //This disables both forwards and backwards swiping on slide 2
            //I only wish that the user cannot swipe forwards or goToNextSlide using
            //The next button, but I want the user to be able to go back by swiping back
            //or using the back button


            //Now if i implement slidePolicy, this happens
            //The user cannot swipe forwards or backwards, or go to next slide using the next
            //Button. I want the user to be able to SWIPE BACKWARDS but not FORWARDS
            //I cannot swipe backwards

         }

    }
}