import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class exercicios5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        cod1 = Integer.parseInt(pegarValor("digite o còdigo 1"));
        qte1 = Integer.parseInt(pegarValor("digite a quantidade 1"));
        preco1 = Double.parseDouble(pegarValor("digite o preco 1"));

        cod2 = Integer.parseInt(pegarValor("digite o còdigo 2"));
        qte2 = Integer.parseInt(pegarValor("digite a quantidade 2"));
        preco2 = Double.parseDouble(pegarValor("digite o preco 2"));

        total = preco1 * qte1 + preco2 * qte2;

        mostrarMensagem("VALOR A PAGAR: R$ " + total);
    }

    public static void mostrarMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static String pegarValor(String mensagem){
        return JOptionPane.showInputDialog(null, mensagem);
    }


}
