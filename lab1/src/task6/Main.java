package task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = in.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++){
            System.out.println("Input next element of array: ");
            arr[i] = in.nextDouble();
        }
        double[][] resArr = res(arr,n);

        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(String.format("%.2f ",resArr[i][j]));
            }
            System.out.println();
        }
    }
    public static double[][] res(double[] arr, int n){
        double[][] resArr = new double[n][n];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                resArr[i][j] = arr[(i + j) % n];
            }
        }
        return resArr;
    }
}
