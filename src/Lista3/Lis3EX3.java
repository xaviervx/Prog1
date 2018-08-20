/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class Lis3EX3 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));

        int[] v1 = new int[10];
        int[] fatorial = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Número: ");
            v1[i] = cs.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int a = v1[i];
            if ((a == 0) || (a == 1)) {
                fatorial[i] = 1;
            } else {
                for (int j = 0; j < i; j++) {
                    if (j == 0) {
                        fatorial[i] = a * (a - 1);
                        a -= 2;
                    } else {
                        fatorial[i] *= a;
                        a--;
                    }
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(fatorial[i] + " ");
            if (i == 9) {
                System.out.println("");
            }
        }
    }
}
