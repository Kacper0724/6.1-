package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int sumAdd = calculator.add(5, 55);

        if(sumAdd == 60) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Add test error!");
        }

        int sumSubstract = calculator.substract(55, 5);

        if(sumSubstract == 50) {
            System.out.println("Substract test OK");
        } else {
            System.out.println("Substract test error!");
        }
    }
}
