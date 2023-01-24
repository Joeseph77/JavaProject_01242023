package class10.JavaProject_01242023;
/*
8)Write a Java Program to print the first 10 numbers of Fibonacci series.
 */
public class Task008_FibonacciSeries {
    public static void main(String[] args) {
       int x=0;
       int y=1;
       int r=0;
      /* int r=x+y;
        System.out.println(r);
       x=y;y=r;
       r=x+y;
        System.out.println(r);
        x=y;y=r;
        r=x+y;
        System.out.println(r);
        x=y;y=r;
        r=x+y;
        System.out.println(r);*/
        System.out.print(x+" ");
        for (int i=0; i<11; i++) {
            x=y;y=r;
            r=x+y;
            System.out.print(r+" ");
        }
    }
}
