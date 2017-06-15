package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodneytressler on 6/15/17.
 */
public class AppLogic {
    private List<Concerts> concerts = new ArrayList();
    private Messages messages;

    public AppLogic() {
        messages = new Messages();
    }

    /**
     * Adds new concert to the list based on input, as long as they're not finishing their entries
     */
    public void addNewConcert(String concertName, int concertRating) {
        if (!(concertName.equals("done"))) {
            concerts.add(new Concerts(concertName, concertRating));
        }
    }


    /**
     * Prints out concert entries - loop practice
     */
    public void retrieveConcerts() {
        for (Concerts item : concerts) {
            messages.showConcerts(item);
        }
    }

    /**
     * Makes sure that choices entered are validly within list - more loop practice
     */
    public boolean choiceEntered(String concertChoice) {
        boolean containsSong = false;
        for (Concerts item : concerts) {
            if (item.getSongTitle().equals(concertChoice)) {
                containsSong = true;
            } else {
                containsSong = false;
            }
        }
        return containsSong;
    }

    /**
     * Makes sure that rating is validly within 1-5 range. - more loop practice
     */
    public boolean checkValue(String concertChoice, int concertValue) {
        for (Concerts item : concerts) {
            if (item.getSongTitle().equals(concertChoice)) {
                if (concertValue < 1 || concertValue > 5) {
                    return false;
                } else {
                    item.setSongRating(concertValue);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Shows concerts with ratings next to it
     */
    public void showConcertsWithRatings() {
        for (Concerts item : concerts) {
            if (item.getSongRating() != 0) {
                messages.showConcertsWithRatings(item.getSongTitle(), item.getSongRating());
            }
        }
    }

    /**
     * Sends goodbye message and ends applicaiton
     */
    public void endApplication() {
        messages.sayGoodbye();
        System.exit(0);
    }
}
