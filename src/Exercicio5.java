import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        int cd, qt;
        float vl_total;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um produto e quantidade: ");
        cd = sc.nextInt();
        qt = sc.nextInt();

        if(cd == 1) vl_total = (float) (qt * 4.0);
        else if(cd == 2) vl_total = (float) (qt * 4.5);
        else if(cd == 3) vl_total = (float) (qt * 5);
        else if(cd == 4) vl_total = (float) (qt * 2);
        else vl_total = (float) (qt * 1.5);

        System.out.printf("Total: R$ %.2f", vl_total);

        sc.close();
    }
}
