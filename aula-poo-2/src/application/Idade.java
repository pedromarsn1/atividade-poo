package application;

import javax.swing.*;

public class Idade {
    private int anos;
    private int meses;
    private int dias;

    public Idade(int anos, int meses, int dias){
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public int quantosDias(){
        int multiplicaAnos = (this.anos * 365);
        int multiplicaMeses = (this.meses * 30);


        return multiplicaAnos + multiplicaMeses + this.dias;
    }

    public static void main(String[] args) {
        Idade paulo = new Idade(3,2,15);

        JOptionPane.showMessageDialog(null, paulo.quantosDias());
    }
}
