package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = in.nextDouble();
        System.out.println("Input b: ");
        double b = in.nextDouble();
        System.out.println("Input h: ");
        double h = in.nextDouble();

        while(a <= b){
            System.out.println(String.format("%.3f | %.5f",a,func(a)));
            a += h;
        }
    }
    public static double func(double a){
        return Math.tan(a);
    }
}
