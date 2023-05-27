public class NestedIf {
    public static void main (String[] agrs){
        int num = 50;
        if (num % 2 ==0){
            System.out.println("Even");
            if(num>0){
                System.out.println("Positive");
            }else{
                System.out.println("Negative");
            }

        } else{
            System.out.println("Odd");
    }
}}
