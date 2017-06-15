package com.company;

import java.util.List;
import java.util.Scanner;

/**
 * Created by rodneytressler on 6/15/17.
 */
public class UserResponses {

    private Scanner scanner;
    private AppLogic appLogic;
    private Messages messages;
    private boolean isValidHomeResponse = false;
    private boolean isValidRatingResponse = false;
    private List<Concerts> concertsList;

    public UserResponses() {
        scanner = new Scanner(System.in);
        appLogic = new AppLogic();
        messages = new Messages();
    }

    /**
     * Allows for user response and behaves accordingly.
     */

    public void gatherUserHomeChoice() {
        while (!isValidHomeResponse) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    gatherUserConcertInput();
                    isValidHomeResponse = true;
                    break;
                case 2:
                    rateConcertInput();
                    isValidHomeResponse = true;
                    break;
                case 3:
                    appLogic.showConcertsWithRatings();
                    messages.homeQuery();
                    isValidHomeResponse = false;
                    break;
                case 4:
                    appLogic.endApplication();
                default:
                    messages.invalidResponse();
                    isValidHomeResponse = false;
            }
        }
    }


    /**
     * Allows user to continually add concerts.
     */

    public void gatherUserConcertInput() {
        String response = "";
        while (!(response.toLowerCase().equals("done"))) {
            messages.enterConcert();
            response = scanner.next().toLowerCase();
            appLogic.addNewConcert(response, 0);
        }
        messages.homeQuery();
        gatherUserHomeChoice();
    }


    /**
     * Allows user to rate concert, making sure they add a valid name to check, enter a valid score,
     * and enter a valid response related to continuing. 3 loops embedded within one-another.
     */

    private void rateConcertInput() {
        String continueResponse = "";
        boolean validResponse = false;
        boolean validRating = false;
        String concertChoice = "";
        int concertValue = 0;
        while (!continueResponse.toLowerCase().startsWith("n")) {
            messages.rateConcert();
            appLogic.retrieveConcerts();
            concertChoice = scanner.next().toLowerCase();
            validResponse = appLogic.choiceEntered(concertChoice);
            if (!validResponse) {
                messages.invalidResponse();
            } else {
                while (!validRating) {
                    messages.ratingQuery();
                    concertValue = scanner.nextInt();
                    validRating = appLogic.checkValue(concertChoice, concertValue);
                }
            }
            messages.continueResponse();
            validRating = false;
            continueResponse = scanner.next();
        }
        messages.homeQuery();
        gatherUserHomeChoice();

    }
}
