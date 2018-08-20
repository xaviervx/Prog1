/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Xavier
 */
public class Lis3EX2 {
    public static void main(String[] args)throws IOException {
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Escreva uma frase: ");
        String fra = lt.readLine().toUpperCase().replace(" ", "");
        int tamanho = fra.length();
        
        String[] frase = new String[tamanho];
        String[] frase2 = new String[tamanho];
        int cont = 0;
        
        System.out.println("");
        
        for (int i = 0; i < tamanho; i++) {
            frase[i] = (""+(fra.charAt(i)));
            System.out.print(frase[i]);
            if ((tamanho - 1) == i) {
                System.out.println("");
            }
        }
        
        for (int i = (tamanho - 1); i >= 0; i--) {
            frase2[i] = (""+(fra.charAt(i)));
            System.out.print(frase2[i]);
            if (i == 0) {
                System.out.println("");
            }
        }
        
        System.out.println("");
        for (int i = 0; i < tamanho; i++) {
            if (frase[i].equals(frase2[i])) {
                cont++;
            }
        }
        if (cont == tamanho) {
            System.out.println("É um palindromo.");
        } else {
            System.out.println("Não é um palindromo.");
        }
    }
}
