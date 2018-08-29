/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
class Vezes {

    public void Vezes() throws IOException {
        Lis3EX1 m = new Lis3EX1();

        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));

        int[] v = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "º número: ");
            System.out.println(v[i] = (int)(Math.random() * 11));
            System.out.println("");
        }

        System.out.print("Vetor criado: ");

        for (int i = 0; i < 10; i++) {
            System.out.print(" " + v[i] + " ");
        }

        System.out.println("");
        System.out.println("Escolha um número, e sera exibido quantas vezes tal algarismo aparece no vetor.");
        int n = cs.nextInt();
        int cont = 0;

        for (int i = 0; i < 10; i++) {
            if (n == v[i]) {
                cont++;
            }
        }

        System.out.println("O número " + n + " aparece " + cont + " vezes no vetor.");
        System.out.println("Sair? ");
        String leituraDaLinha = lt.readLine();
        if (String.valueOf(leituraDaLinha.toUpperCase().charAt(0)).equals("Y")
                || String.valueOf(leituraDaLinha.toUpperCase().charAt(0)).equals("S")) {
            System.exit(0);
        } else {
            Vezes();
        }
    }
}
