package class10.JavaProject_01242023;

import java.util.Scanner;

/*
2)Using Scanner create an array of countries. When an array is created,
retrieve all values from it and while retrieving those values print capital for each country. (use 2 different loops).
 */
public class CuntriesCapitals_Task2 {
    public static void main(String[] args) {
        String[] countris = new String[4];
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 4 countries");
        for (int i = 0; i < countris.length; i++) {
            countris[i] = scan.next();
        }
        // USA(Washington DC), Italy(Rome), France(Paris), England(London),
        String[] capitals = {"Washington DC", "Rome", "Paris", "London"};
        for (int i = 0; i < countris.length; i++) {
            System.out.println(capitals[i] + " is the capital of " + countris[i]);
        }
    }
}
