import java.util.Scanner;

public class exercicios3 {
    public static void main(String[] args){
// Calculo da DIFERENCA = (A * B - C * D).
        Scanner sc = new Scanner(System.in);
        int A, B, C , D;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int diferenca = A * B - C * D;

        System.out.println("DIFERENCA = " + diferenca);

    }
}
