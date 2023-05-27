import java.util.*;
public class Bot {
    public static void main (String[] args){
        System.out.println("Welcome to ChatNOTAI");
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Nice to meet you, " + name + "!");
        System.out.println("What is your age?");
        input.nextLine();
        int age =input.nextInt();
        System.out.println( age + " is not too old.");
        System.out.println(" What is your number?");
        long number = input.nextLong();
        System.out.println(number + "is easy to remember.");
        System.out.println("Are you single?");
        boolean answer = input.nextBoolean();
        System.out.println("You said" + answer);
        System.out.println("What is your favorite quote?");
        input.nextLine();
        String quote = input.nextLine();
        System.out.println("Wow, this is a great quote: \" " + quote + "\"");




    }

}
