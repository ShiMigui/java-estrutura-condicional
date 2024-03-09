import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if(num % 2 == 0) System.out.println("PAR");
        else System.out.println("IMPAR");

        sc.close();
    }
}
