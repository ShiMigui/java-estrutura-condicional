import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) throws Exception {
        float x, y;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as coordenadas: ");
        x = sc.nextFloat();
        y = sc.nextFloat();

        if (x == y && x == 0)
            System.out.println("Origem");
        else if (x == 0)
            System.out.println("Eixo Y");
        else if (y == 0)
            System.out.println("Eixo X");
        else if(x < 0 && y < 0) System.out.println("Q3");
        else if(x < 0 && y > 0) System.out.println("Q2");
        else if(x > 0 && y > 0) System.out.println("Q1");
        else System.out.println("Q4");

        sc.close();
    }
}
