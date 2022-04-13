package application;

public class Saldo {
    private double saldoConta;

    public Saldo( double saldoConta){
        this.saldoConta = saldoConta;
    }

    public double reajuste(){
        double reajuste = this.saldoConta / (100);
        return reajuste;
    }

    public static void main(String[] args) {
        Saldo novo = new Saldo(8);
        System.out.println(novo.reajuste());
    }
}
