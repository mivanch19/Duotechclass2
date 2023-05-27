import java.sql.SQLOutput;
import java.util.Scanner;

public class VariableType {
    public static void main (String [] args) {
        double radius, area;
       System.out.println("This program calculates the area of the circle based on the given radius.");
        System.out.println("Please, enter the radius");
       Scanner input = new Scanner (System.in);
        radius = input.nextDouble();
       area = 3.14*radius*radius;
       System.out.println("The area of the circle of the radius " + radius + " is " + area);
    }
}
