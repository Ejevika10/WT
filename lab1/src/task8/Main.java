package task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++){
            b[i] = in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);

        List<Integer> res = findRes(a,b,n,m);
        System.out.println(res);

    }
    public static List<Integer> findRes(int[] a, int[] b, int n, int m){
        List<Integer> res = new ArrayList<>();
        int curA = 0;
        int curB = 0;

        while (curA < n && curB < m){
            if(a[curA] <= b[curB]){
                curA++;
            }
            else {
                res.add(curA);
                curB++;
            }
        }
        while (curB < m){
            res.add(curA);
            curB++;
        }

        return res;
    }
}
