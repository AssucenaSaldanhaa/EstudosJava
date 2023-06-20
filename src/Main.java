import javax.naming.ldap.SortResponseControl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String S1, S2, S3;
        //o nextline é usado para leitura da linha de maneira completa diferente quando usa-se apenas o next
        // Quando usa algo diferente do nextline precisa dá um nextline antes do line pedido
        S1= sc.nextLine();
        S2= sc.nextLine();
        S3= sc.nextLine();

        System.out.println("Hello world!");
        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);


    }
}