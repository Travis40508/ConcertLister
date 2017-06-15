package com.company;

/**
 * Created by rodneytressler on 6/15/17.
 */
public class Concerts {
    private String songTitle;
    private int songRating;

    /**
     * Concerts object for storing rating and title.
     */
    public Concerts(String songTitle, int songRating) {
        this.songTitle = songTitle;
        this.songRating = songRating;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public int getSongRating() {
        return songRating;
    }

    public void setSongRating(int songRating) {
        this.songRating = songRating;
    }
}
