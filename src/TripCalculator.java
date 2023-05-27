//This program calculates the estimated cost of the gas for the trip based on the input from the user.
import java.util.Scanner;

public class TripCalculator {
    public static void main (String[] args) {
        double distance, mpg, price, gasTotal, costTotal;
        System.out.println("This program will calculate the estimated cost of gas for your trip.");
        System.out.println("Please, enter the distance in miles that you are planning to travel: ");
        Scanner input = new Scanner (System.in);
        distance = input.nextDouble();
        System.out.println("Please, enter the average MPG of the car that you are planning to drive:");
        mpg = input.nextDouble();
        System.out.println("Please, enter the current gas price:");
        price = input.nextDouble();
        gasTotal= distance/mpg;
        costTotal=gasTotal*price;
        System.out.println("Estimated amount of gas for your trip is " + gasTotal + " gallons and estimated cost of gas is $" + costTotal +".");
        System.out.println("Have a safe trip!");
    }
}

