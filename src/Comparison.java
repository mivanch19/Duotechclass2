public class Comparison {
    public static void main (String[] args){
        boolean a = 'a'!= 65;
        System.out.println(a);
        int radius =2000;
        if (radius>=0){
            System.out.println("The area is " + (Math.pow(radius,2) *Math.PI));
        }
        if (radius>1000){
            System.out.println("The value is too big.");
        }
        System.out.println("The end of the program.");
    }
}
