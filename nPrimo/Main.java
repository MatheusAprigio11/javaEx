import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> primos = new ArrayList<>();
        ArrayList<Integer> naoPrimos = new ArrayList<>();
        String decis = "S";
        while (decis.equals("S")) {
            primos.clear();
            naoPrimos.clear();
            System.out.println("entre com um numero> ");
            int num = sc.nextInt();
            while (num > 10000 || num < 1) {
                System.out.println("voce digitou um numero maior que dez mil, digite um numero menor.\n");
                System.out.println("entre com um numero> ");
                num = sc.nextInt();
            }
            naoPrimos.add(1);
            for (int i = 2; i <= num; i++) {
                boolean primo = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primo = false;
                    }
                }
                if (primo) {
                    primos.add(i);
                } else {
                    naoPrimos.add(i);
                }
            }
            System.out.println("1 primos");
            System.out.println("2 nao primos");
            int resp = sc.nextInt();
            if (resp == 1) {
                for (int numeros : primos) {
                    System.out.println(numeros);
                }
            } else {
                for (int numeros : naoPrimos) {
                    System.out.println(numeros);
                }
            }
            System.out.println("Deseja continuar: >> [S/N]");
            decis = sc.next().toUpperCase();
        }
    }
}
