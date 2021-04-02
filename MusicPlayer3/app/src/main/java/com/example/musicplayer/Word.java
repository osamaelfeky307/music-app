package com.example.musicplayer;

public class Word {
    private String mSing;

    private String mSingers;

    /**
     * Create a new Quran object.
     *
     * @param name is the word
     * @param singeres is the word

     */
    public Word(String name , String singeres) {
        mSing = name;
        mSingers = singeres;
    }


    /**
     * Get the song of the word.
     */
    public String getmSing() {
        return mSing;
    }

    /**
     * Get the default translation of the word.
     */
    public String getmSingeres() {
        return mSingers;
    }
}
