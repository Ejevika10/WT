package task7;

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

        for (int i = 0; i < n; i++){
            System.out.printf(" %.2f ",arr[i]);
        }
        sort(arr,n);
        System.out.println();
        for (int i = 0; i < n; i++){
            System.out.printf(" %.2f ",arr[i]);
        }
    }
    public static void sort(double[] arr, int n){
        int index = 0;
        while (index < n - 1){
            if(arr[index] > arr[index + 1]){
                double tmp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = tmp;
                index--;
                index = index == -1 ? 0 : index;
            }
            else{
                index++;
            }
        }
    }
}
