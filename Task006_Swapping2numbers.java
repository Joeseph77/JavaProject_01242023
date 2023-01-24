package class10.JavaProject_01242023;
/*
6)Write a program to swap 2 numbers without a temporary variable?
 */
public class Task006_Swapping2numbers {
    public static void main(String[] args) {
        /*int num1=5;
        int num2=15;
        int [] arr = {num1,num2};
        arr[0]=num2;
        arr[1]=num1;
       num1=arr[0];
       num2=arr[1];
        System.out.println(num1);
        System.out.println(num2);*/
        int num1=5;
        int num2=15;
        System.out.println("num1 before ="+num1+" num2 before "+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("num1 after ="+num1+" num2 after "+num2);

    }
}
