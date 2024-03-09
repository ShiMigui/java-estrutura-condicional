import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        int A, B;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite dois números: ");
        A = sc.nextInt();
        B = sc.nextInt();

        if(A % B == 0 || B % A == 0) System.out.println("Sao Multiplos");
        else System.out.println("Nao sao Multiplos");

        sc.close();
    }
}
