public class Main {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Please enter the amount: (e.g. 23.89) ");

        double amount = sc.nextDouble();
        int totalCents = (int) (amount * 100);
        int dollars = totalCents / 100;
        System.out.println(dollars + " dollars");
        int quarters = totalCents % 100 / 25;
        System.out.println(quarters + " quarters");
        int dimes = totalCents % 25 / 10;
        System.out.println(dimes + " dimes");
        int nickels = totalCents % 10 / 5;
        System.out.println(nickels + " nickels");
        int pennies = totalCents % 5;
        System.out.println(pennies + " pennies");

        // DON'T CHANGE THE ABOVE CODE.
        // Code to get user input has been written for you. Use the "amount" variable initialized above.


    }
}