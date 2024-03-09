import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        int hr_inicial, hr_final, qt_horas;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as horas: ");
        hr_inicial = sc.nextInt();
        hr_final = sc.nextInt();

        if (hr_inicial < hr_final) qt_horas = hr_final - hr_inicial;
        else qt_horas = 24 - hr_inicial + hr_final;

        System.out.println("O JOGO DUROU " + qt_horas + " HORA(S)");

        sc.close();
    }
}
