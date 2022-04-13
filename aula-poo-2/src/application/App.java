package application;

import javax.swing.*;

public class App{
    public static void main(String[] args) {
    Calculadora cal1 = new Calculadora(8,9,7);
    Calculadora cal2 = new Calculadora(4,5,6);

    double media1 = cal1.media();
    double media2 = cal2.media();
    double soma = cal1.media() + cal2.media();

        System.out.println("Média do primeiro bloco: " + media1 );
        System.out.println("Média do segundo bloco: " + media2);
        System.out.println("Soma total das médias: " + soma);

        JOptionPane.showMessageDialog(null,"Soma total das médias: " + soma );
    }

}
