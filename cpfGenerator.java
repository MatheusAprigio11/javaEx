import java.util.ArrayList;
import java.util.Scanner;

public class cpfGenerator {
    public static void main(String[] args) {
        ArrayList<String> cpfList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int i;

        String primeiros;

        System.out.println("Insira os 9 primeiros digitos do CPF>> ");
        primeiros = sc.next();
        String semPonto = primeiros.replace(".", "");
        semPonto = semPonto.replace("-", "");

        String[] sla = semPonto.split("");
        for (i = 0; i < 9; i++){
            cpfList.add(sla[i]);
            
            System.out.println(cpfList);
        }
    }
}

