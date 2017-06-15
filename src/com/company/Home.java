package com.company;

/**
 * Created by rodneytressler on 6/15/17.
 */
public class Home {

    private Messages messages;
    private UserResponses responses;

    public void init() {
        messages = new Messages();
        responses = new UserResponses();
        greetUser();
        queryUser();
        gatherUserResponse();
    }

    private void gatherUserResponse() {
        responses.gatherUserHomeChoice();
    }

    private void queryUser() {
        messages.homeQuery();
    }

    private void greetUser() {
        messages.greetUser();
    }
}
