import java.util.*;
public class BookEx {
    public static void main(String [] args){
        int number1 = (int) (System.currentTimeMillis()%10);
        int number2 = (int) (System.currentTimeMillis()/7%10);
        Scanner input = new Scanner (System.in);
        System.out.println("What is "+ number1 + " + " + number2 + " ?");
        int number = input.nextInt();
        System.out.println(number1 + "+ " + number2 + "= " + number + " is " +(number1 + number2 ==number));
        int Integer = 24;
        char String  = 'I';
        System.out.print(Integer);
        System.out.print(String);
        Math.pow(5,2);
    }
}
