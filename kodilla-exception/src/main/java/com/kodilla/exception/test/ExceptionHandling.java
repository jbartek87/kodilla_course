package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try{
            secondChallenge.probablyWillThrowException(3.0, 2.0);
        } catch(Exception e){
            System.out.println("We got an exception!");
        }
    }
}
