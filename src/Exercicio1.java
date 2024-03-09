import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if (num < 0) System.out.println("NEGATIVO");
        else System.out.println("NAO NEGATIVO");

        sc.close();
    }
}
