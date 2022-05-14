package aula_reposicao;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int soma;

        System.out.println("Digite um número");
        num1 = input.nextInt();
        System.out.println("Digite outro número");
        num2 = input.nextInt();

        soma = num1 + num2;
        System.out.println("A soma dos dois números é igual a:" + soma);
    }
}
