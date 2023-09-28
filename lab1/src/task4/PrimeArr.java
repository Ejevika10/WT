package task4;

public class PrimeArr {
    private int N;
    private int[] arr;
    PrimeArr(int N, int[] arr){
        this.N = N;
        this.arr = new int[N];
        this.arr = arr;
    }
    public String printPrimeIndex(){
        StringBuilder res = new StringBuilder();
        boolean hasPrime = false;
        for (int i = 0; i < N; i++){
                if (isPrime(arr[i])){
                    hasPrime = true;
                    res.append(i).append(" ");
                }

        }
        if(!hasPrime){
            res.append("There are no prime numbers here(");
        }
        return res.toString();
    }
    public static boolean isPrime(int num){
        if(num < 2)
            return false;
        else if (num > 3){
            for (int i = 2; i <= Math.sqrt(num);i++){
                if(num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
