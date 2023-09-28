package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Input next element of array: ");
            arr[i] = in.nextInt();
        }

        System.out.printf("\nResult is %d",res(n,arr));
    }

    public static int res(int n, int[] arr){
        if (n > 0) {
            int[] lengthArr = new int[n];
            lengthArr[0] = 1;

            for (int i = 1; i < n; i++) {
                int max = getMax(i, lengthArr, arr);
                lengthArr[i] = Math.max(max, 1);
            }

        /*for (int i = 0; i < n; i++){
            System.out.printf("%.2f ",arr[i]);
        }*/

            int maxLength = getMaxLength(lengthArr);
            return n - maxLength;
        }
        else return 0;
    }
    public static int getMax(int index, int[] lengthArr,int[] arr){
        int maxRes = 0;
        for(int i = 0; i < index; i++){
            if(arr[index] >= arr[i] && lengthArr[i] + 1 > maxRes)
            {
                maxRes = lengthArr[i] + 1;
            }
        }
        return maxRes;
    }
    public static int getMaxLength(int[] lengthArr){
        int maxLength = 0;
        for (int i = 0; i < lengthArr.length; i++){
            if(lengthArr[i] >= maxLength){
                maxLength = lengthArr[i];
            }
        }
        return maxLength;
    }
}

