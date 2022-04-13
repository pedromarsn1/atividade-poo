package application;

public class Calculadora {
    private int a;
    private int b;
    private int c;

    public Calculadora(int a, int b, int c) {
        this.a = a;
        this.b= b;
        this.c= c;
    }

    public double media(){
        int result = this.a + this.b + this.c;
        result = result/3;
        return result;
    }

    public double soma(double x, double y){
        return x + y;
    }
}
