package class10.JavaProject_01242023;
/*
4) Create a 2D array or integer type where you will store odd and even numbers.
Develop a program which will identify/print the even numbers only.
 */
public class Array2DEvenAndOdd_Task4 {
    public static void main(String[] args) {
        int[][] num = {{2, 4, 6, 8}, {5, 10, 15, 20}};
        for (int[] x : num) {
            for (int i : x) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }

            }
        }

    }
}

