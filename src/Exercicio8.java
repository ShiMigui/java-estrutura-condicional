import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        float vl_salario, vl_imposto = 0f;

        Scanner sc = new Scanner(System.in);

        System.out.print("Salário: R$ ");
        vl_salario = sc.nextFloat();

        if (vl_salario < 2000)
            System.out.println("Isento");
        else {
            if (vl_salario <= 3000) vl_imposto = (vl_salario - 2000) * 0.08f;
            else if (vl_salario <= 4500) vl_imposto = 80 + (vl_salario - 3000) * 0.18f;
            else vl_imposto = 360 + (vl_salario - 4500) * 0.28f;

            System.out.printf("R$ %.2f", vl_imposto);
        }
        sc.close();
    }
}
