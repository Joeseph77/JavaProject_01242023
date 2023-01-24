package class10.JavaProject_01242023;
/*
Maximum and minimum number in the array?
 */
public class ArrayMaxMin_Task9__aa {
    public static void main(String[] args) {
        int[] array = {5, 15, 50, 900, 25, 2, 30, 700, 70, 90, 2100, 450, 500, 1};
        int maxIndex = -1;
        int secondMax = array[0];
        int max = array[0];
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) {
                max = array[index];
                maxIndex = index;
            }
            if (array[index] < min) {
                min = array[index];
            }
        }
        for (int index = 0; index < array.length; index++) {
            if (index == maxIndex) {
                continue;
            }
            if (array[index] > secondMax) {
                secondMax = array[index];
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
        System.out.println(maxIndex);
        System.out.println("Second max number is " + secondMax);
    }
}

