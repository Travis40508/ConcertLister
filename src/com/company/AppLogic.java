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

    public void addNewConcert(String concertName, int concertRating) {
        if (!(concertName.equals("done"))) {
            concerts.add(new Concerts(concertName, concertRating));
        }
    }

    public void retrieveConcerts() {
        for (Concerts item : concerts) {
            messages.showConcerts(item);
        }
    }

    public boolean choiceEntered(String concertChoice) {
        boolean containsSong = false;
        for(Concerts item: concerts) {
            if(item.getSongTitle().equals(concertChoice)) {
                containsSong = true;
            } else {
                containsSong = false;
            }
        }
        return containsSong;
    }

    public boolean checkValue(String concertChoice, int concertValue) {
        for(Concerts item: concerts) {
            if(item.getSongTitle().equals(concertChoice)) {
                if(concertValue <1 || concertValue > 5) {
                    return false;
                } else {
                    item.setSongRating(concertValue);
                    return true;
                }
            }
        }
        return false;
    }

    public void showConcertsWithRatings() {
        for(Concerts item: concerts) {
            if(item.getSongRating() != 0) {
                messages.showConcertsWithRatings(item.getSongTitle(), item.getSongRating());
            }
        }
    }

    public void endApplication() {
        messages.sayGoodbye();
        System.exit(0);
    }
}
