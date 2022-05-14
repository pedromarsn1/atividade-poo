package banco;

public class Calculadora {

    public int soma(int a, int b){
        return a + b;
    }

    public int subtrai(int a, int b){
        return a - b;
    }

    public int multiplica(int a, int b){
        return a * b;
    }

    public double divisao(int a, int b){
        if(a==0 || b==0){
            System.out.println("Não é possível fazer a divisão");
            return 0.0;
        }
        return a / b;
    }

    public String isPar(int x){
        if(x%2 == 0){
            return "O numero: "+ x + " é par";
        }
        return "O numero: " + x + " não é par";
    }

    public String compara(int x, int y){
        if(x == y){
            return "Os números são iguais";
        }
        return "Os números são diferentes";
    }

}
