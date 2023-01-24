package class10.JavaProject_01242023;

/*
Create a 2D array of integers. Develop a program which will calculate
 the sum of  even and odd numbers for that array.
 */
public class Task005_Array2DSumOfEvenAndOdd {
    public static void main(String[] args) {
        int[][] num = {{2, 4, 6, 8, 5}, {5, 10, 15, 20}};
        int oddSum = 0;
        int evenSum = 0;
        for (int[] x : num) {
            for (int i : x) {
                if (i % 2 == 0) {
                    evenSum += i;
                } else {
                    oddSum += i;
                }
            }
        }
        System.out.println("Sum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers = " + oddSum);
    }
}

