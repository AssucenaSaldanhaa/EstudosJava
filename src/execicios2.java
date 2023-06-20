import java.util.Locale;
import java.util.Scanner;

public class execicios2 {

    public static void main(String[] args){
// area da circuferencia =  π . raio2
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R , A , p=3.14159;
        R= sc.nextDouble();
        A= p * (R * R);

        System.out.printf("A=%.4f%n", A);

    }
}
