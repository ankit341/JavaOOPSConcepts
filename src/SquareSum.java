public class SquareSum {
    private int a;
    private int b;
    private int c;
    public double squareSum(double a, double b, double c){
        double sum = 0;
        sum = Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2);
        return sum;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public SquareSum(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
