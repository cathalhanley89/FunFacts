package co.cathalhanley.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColourWheel {
    private String[] mColours = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"
    };

    public int getColour() {
        return Color.parseColor(mColours[getRandomNumber()]);
    }

    private int getRandomNumber() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(mColours.length);
    }

}
