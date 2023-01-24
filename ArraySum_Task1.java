package class10.JavaProject_01242023;
import java.util.Scanner;
/*
1)Using Scanner create an array of integer values. After the array is created,
calculate the sum of all stored elements in that array.
 */
public class ArraySum_Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Please enter 5 numbers for the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }
}
