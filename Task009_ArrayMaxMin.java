package class10.JavaProject_01242023;
/*
Maximum and minimum number in the array?
 */
public class Task009_ArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = {5, 15, 50, 900, 25, 2, 30, 700, 70, 90, 2100, 450, 500, 1};
        int min = arr[0];
        int minMin = arr[0];
        int secondLargest = 0;
        int max = 0;
        int maxMax = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                    if (max > maxMax) {
                        maxMax = max;
                    }
                    // secondLargest = max;
                    if (max < maxMax) {
                        secondLargest = max;
                    }
                }
                if (arr[i] < arr[j]) {
                    min = arr[i];
                    if (min < minMin) {
                        minMin = min;
                    }
                }
            }
        }
        System.out.println(maxMax);
        System.out.println(secondLargest);
        System.out.println(minMin);
    }
}

