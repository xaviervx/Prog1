/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class Lis5EX3 {

    public static void main(String[] args) throws IOException {
        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));

        boolean[] primo = {true, true, true, true, true, true, true, true, true, true};
        int[] pri = new int[10];
        
        System.out.println("Número\t\tÉ primo?");
        for (int i = 0; i < 10; i++) {
            System.out.print((pri[i] = (int)(Math.random()* 500)+1) +"\t\t");
            for (int j = 2; j < pri[i]; j++) {
                if (pri[i] % j == 0) {
                    System.out.print(primo[i] = false);
                    break;
                }
                if (j == (pri[i] -1)) {
                    System.out.print(primo[i]);
                }
            }
            System.out.println("");
        }

    }

}
