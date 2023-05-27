package fev0224;

import java.util.Random;
import java.util.Scanner;

public class fevGame {
    public static void main(String[] args) {


       // int rNumber = (int) (Math.random()*101);

        Random rNum = new Random();
        int rNumber1 = rNum.nextInt(101);

        System.out.println("P number");

        Scanner input = new Scanner(System.in);
        int other = input.nextInt();

        while (rNumber1!=other){
            if (rNumber1>other){ System.out.println("it is too low");}
            else { System.out.println("it is too high");}

            other = input.nextInt();

                } System.out.println("Congrats, it is  ");
            }
        }


