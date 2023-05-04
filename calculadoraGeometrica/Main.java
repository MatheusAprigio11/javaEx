package exercicioCalculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("---------------------------");
            System.out.println("| CALCULADORA GEOMETRICA |");
            System.out.println("---------------------------");
            System.out.println("| Selecione a opção ");
            System.out.println("[1] Figuras Planas;");
            System.out.println("[2] Figuras Espacias;");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("[1] - Triangulo Equilatero ");
                    System.out.println("[2] - Quadrado ");
                    System.out.println("[3] - Retangulo ");
                    System.out.println("[4] - Circulo ");
                    System.out.println("[5] - Hexagono ");




                case 2:
                    System.out.println("[1] - Cubo ");
                    System.out.println("[2] - Paralelepipedo ");
                    System.out.println("[3] - Esfera ");
                    System.out.println("[4] - Piramide de Base quadrada ");
                    System.out.println("[5] - Cilindro ");
                    System.out.println("[6] - Cone ");



                //while ()
            }
        }
    }
}
