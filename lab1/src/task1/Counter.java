package task1;

public class Counter {
    private int x;
    private int y;
    Counter(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double count(){
        return (1 + Math.pow(Math.sin(x + y),2))/(2 + Math.abs(x - (2*x)/(1 + Math.pow(x*y,2)))) + x;
    }
}
