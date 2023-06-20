import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class exercicios6 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A= Double.parseDouble(valoresDasFormas("digite o valor"));
        B= Double.parseDouble(valoresDasFormas("digite o segundo valor"));
        C=Double.parseDouble(valoresDasFormas("digite o terceiro valor"));


        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);





    }

    public static String valoresDasFormas(String mensagem){
        return JOptionPane.showInputDialog(null, mensagem);
    }
}
