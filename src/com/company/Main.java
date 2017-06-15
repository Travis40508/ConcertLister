package com.company;

public class Main {

    public static void main(String[] args) {
        /**Starts app in another class so we can break out of static context. */
        Home home = new Home();
        home.init();
    }
}
