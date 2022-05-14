package banco;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int soma;

        Calculadora cal1 = new Calculadora();

        System.out.println("Digite um número");
        num1 = input.nextInt();
        System.out.println("Digite outro número");
        num2 = input.nextInt();

        double divisao = cal1.divisao(num1,num2);
        soma = cal1.soma(num1,num2);
        int subtracao = cal1.subtrai(num1,num2);
        String compara = cal1.compara(num1,num2);
        String isPar = cal1.isPar(num1);
        String isPar2 = cal1.isPar(num2);
        int multiplica = cal1.multiplica(num1,num2);


        System.out.println("A soma dos dois números é igual a:" + soma);
        System.out.println("A divisão é igual a: " + divisao);
        System.out.println("A multiplicação é igual a: " + multiplica);
        System.out.println("A subtração é igual a: " + subtracao);
        System.out.println("num1 é par?  " + isPar);
        System.out.println("num2 é par? " + isPar2);
        System.out.println("num1 é igual a num2: " + compara);

    }
}
