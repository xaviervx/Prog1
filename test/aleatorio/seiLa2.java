/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Xavier
 */
public class seiLa2 {

    public static void main(String args[]) {
        String[] companies = {"Yahoo", "Vodafone", "Samsung"};

// sorting java array in ascending order
        System.out.println("Exemplo de Ordenção Crescente em Java");
        System.out.println("Array de String Desordenada: ");
        printNumbers(companies);
        Arrays.sort(companies);
        System.out.println("Array de String Ordenada em Ordem Crescente: ");
        printNumbers(companies);

// sorting java array in descending order
        System.out.println("Exemplo de Ordenção Decrescente em Java ");
        System.out.println("Array de String Desordenada: ");
        printNumbers(companies);
        Arrays.sort(companies, Collections.reverseOrder());
        System.out.println("Array de String Ordenada em Ordem Decrescente: ");
        printNumbers(companies);

        System.out.println("Classificando parte do Array em Java:");
        int[] numbers = {1, 3, 2, 5, 4};
        Arrays.sort(numbers);
        System.out.println("Sub Array Classificado em Java: ");
        for (int num : numbers) {
            System.out.println(num);
        }

    }

    public static void printNumbers(String[] companies) {
        for (String company : companies) {
            System.out.println(company);
        }
    }
}
