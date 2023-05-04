import java.util.InputMismatchException;
import java.util.Scanner;

public class trains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxRange = 0;
        int positionA;
        int positionB;
        int spdA;
        int spdB;

        while (true) {
            System.out.println("Input the first position in KM of the train A>> ");
            positionA = sc.nextInt();
            try{
                if (positionA > 10000) {
                    continue;
                    }
                }catch (InputMismatchException e) {
                System.out.println("The number must to be bigger or equal than zero and less than 10000.");
            }

            System.out.println("Input the speed of the train A>> ");
            spdA = sc.nextInt();
            try{
                if ( > ) {
                    continue;
                }
            }catch (InputMismatchException e) {
                System.out.println("...");
            }

            System.out.println("Now input the first position in KM of the train B>> ");
            positionB = sc.nextInt();
                try{
                    if (positionB > 10000) {
                        continue;
                    }
                }catch (InputMismatchException e) {
                    System.out.println("The number must to be bigger or equal than zero and less than 10000.");
                }
            System.out.println("Input the speed of the train B>> ");
            spdB = sc.nextInt();


        }
    }
}
