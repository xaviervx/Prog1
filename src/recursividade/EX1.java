/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class EX1 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Numero");
        int num = cs.nextInt();
        System.out.println("Fatorial: " + calculaFatorial(num));

    }

    private static int calculaFatorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * calculaFatorial(num - 1);
        }
    }
}
