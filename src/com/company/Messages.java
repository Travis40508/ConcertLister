package com.company;

/**
 * Created by rodneytressler on 6/15/17.
 */
public class Messages {


    /**
     * Messages are self-explanatory
     */

    public void greetUser() {
        System.out.println("Welcome to your very own Concert Lister! Please enter your favorite \n" +
                "concerts 1 at a time. When you are finished entering concerts, type 'done' to return to home");
    }

    public void homeQuery() {
        System.out.println("1. Enter Concerts \n" +
                "2. Rank Concerts \n" +
                "3. View Concerts and ratings \n" +
                "4. Quit Application");
    }

    public void invalidResponse() {
        System.out.println("Invalid response. Please Try again");
    }

    public void enterConcert() {
        System.out.println("Please enter a concert you've been to and press 'enter' \n" +
                "type 'done' when you're finished.");
    }

    public void rateConcert() {
        System.out.println("Which concert would you like to rate?");
    }

    public void showConcerts(Concerts concert) {
        System.out.println(concert.getSongTitle());
    }

    public void ratingQuery() {
        System.out.println("On a scale of 1-5, which rating would you give this concert?");
    }

    public void continueResponse() {
        System.out.println("Do you wish to continue?");
    }

    public void showConcertsWithRatings(String songTitle, int songRating) {
        System.out.println(songTitle + " - " + songRating + "\n");
    }

    public void sayGoodbye() {
        System.out.println("Goodbye!");
    }
}
