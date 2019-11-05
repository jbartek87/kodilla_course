package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }

        Calculator calculator = new Calculator();
        if(calculator.add() == 15){
            System.out.println("Test OK");
        } else {
            System.out.println("ERROR !");
        }
        if(calculator.substract() == 5) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }
    }
}
