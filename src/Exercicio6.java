import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        float num;
        String intervalo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = sc.nextFloat();
        
        if (num < 0 || num > 100)
            intervalo = "Fora de intervalo";
        else if (num <= 25)
            intervalo = "[0,25]";
        else if (num <= 50)
            intervalo = "(25,50]";
        else if (num <= 75)
            intervalo = "(50,75]";
        else
            intervalo = "(75,100]";

        System.out.println(intervalo);

        sc.close();
    }
}
