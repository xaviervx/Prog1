/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista7;

import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class Lis7EX3 {

    Scanner cs = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Quantas provas foram ralizadas? ");
        int escolha = cs.nextInt();
        if (escolha == 2) {
            System.out.println("\nIncira as notas:");
            duas(cs.nextDouble(), cs.nextDouble());
        }
        if (escolha == 3) {
            System.out.println("\nIncira as notas:");
            tres(cs.nextDouble(), cs.nextDouble(), cs.nextDouble());
        }
        if (escolha == 4) {
            System.out.println("\nIncira as notas:");
            quatro(cs.nextDouble(), cs.nextDouble(), cs.nextDouble(), cs.nextDouble());
        }
    }

    private static void duas(double a, double b) {
        System.out.println("Média: " + (a + b) / 2);
    }

    private static void tres(double a, double b, double c) {
        System.out.println("Média: " + (a + b + c) / 3);
    }

    private static void quatro(double a, double b, double c, double d) {
        System.out.println("Média: " + (a + b + c + d) / 4);
    }

}
