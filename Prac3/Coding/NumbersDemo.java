package Prac3.Coding;

/**
 * Created by jc259968 on 14/08/17.
 */
public class NumbersDemo {
    public static void main(String[] args) {
        int a = 10, b = 15;
        displayTwiceTheNumber(a, b);
        displayNumberPlusFive(a, b);
        displayNumberSquared(a, b);


    }

    public static void displayTwiceTheNumber(int a, int b) {
        System.out.println("Twice the number of " + a + " and " + b + " is a=" + ( a*2 ) + "  and b=" + ( b*2 ));

    }

    public static void displayNumberPlusFive(int a, int b) {
        System.out.println("Numbers Plus 5 is " + a + " and " + b + " is a=" + ( a+5 ) + "  and b=" + ( b+5 ));

    }

    public static void displayNumberSquared(int a, int b) {
        System.out.println("Number Squared " + a + " and " + b + " is a^2=" + ( a*a ) + "  and b^2=" + ( b*b ));

    }

}

