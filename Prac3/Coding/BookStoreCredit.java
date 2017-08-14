package Prac3.Coding;

/**
 * Created by jc259968 on 14/08/17.
 */
import java.util.Scanner;
public class BookStoreCredit {
    public static void main(String[] args) {
        String name;
        float grade;
        name =getName();
        grade =getGrade();
        displayMessage(name,grade);

    }
    public static String getName() {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        name = input.nextLine();
        return name;
    }
    public static float getGrade() {
        float grade;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter grade");
        grade = input.nextFloat();
        return grade;
    }

    public static void displayMessage(String name, float grade) {
        System.out.println("Hello, " + name + ", your grade is " + grade +" therefore you've earned $" + (grade*10)+ " credit.");

    }
}
