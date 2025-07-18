package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $202");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");
        System.out.println();
        System.out.println("Income: $5405.0");        
 
        System.out.println("Staff expenses:");
        Scanner scanner= new Scanner(System.in);
        int staff =scanner.nextInt();
        System.out.println("Other expenses:");
        int other=scanner.nextInt();

        int expenses= staff + other;
        int income= 5405 - expenses;
        System.out.println("Net income: $" + income);
        scanner.close();
    }
}
