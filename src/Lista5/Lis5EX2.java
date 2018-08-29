/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista5;

import java.io.IOException;

/**
 *
 * @author Xavier
 */
public class Lis5EX2 {

    public static void main(String[] args) throws IOException {
        int[] vetor = new int[12];
        for (int i = 0; i < 12; i++) {
            System.out.print((vetor[i] = (int) (Math.random() * 13)) + " ");
        }
        System.out.println("\n");
        int ale = (int) (Math.random() * 12);
        int ale1 = (int) (Math.random() * 12);
        while (ale == ale1) {
            ale1 = (int) (Math.random() * 12);
        }
        int valorAleatorio = vetor[ale];
        int valorAleatorio1 = vetor[ale1];
        System.out.println("Soma das posições: " + ale + "(" + vetor[ale] + ")" + " e " + ale1
                + "(" + vetor[ale1] + ")" + " = " + (valorAleatorio + valorAleatorio1));
    }
}
