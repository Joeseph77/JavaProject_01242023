package class10.JavaProject_01242023;
/*
3) Create a 2D array of integer values. Print the sum of all numbers.
 */
public class Array2DSum_Task3 {
    public static void main(String[] args) {
        int[][] num = {{2, 4, 6, 8}, {5, 10, 15}};
        int sum=0;
        for (int[] x:num) {
            for (int i:x) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}

