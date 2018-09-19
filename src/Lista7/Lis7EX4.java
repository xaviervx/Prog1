/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class Lis7EX4 {

    public static void main(String[] args) {
        Random ran = new Random();
        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));

        int[] m = new int[5];
        int soma = 0;

        criarMedias(m, soma);
        System.out.println("");
        quantidadeReprovados(m);
        maiorMedia(m);

    }

    public static void criarMedias(int[] m, int s) {
        for (int i = 0; i < 5; i++) {
            s += m[i] = (int) (Math.random() * 11);
            System.out.println("Média do aluno " + i + ": " + m[i]);
        }
        System.out.println("Media das notas medias: " + (s / 5));
    }

    private static void quantidadeReprovados(int[] m) {
        int cont = 0;
        for (int i = 0; i < 5; i++) {
            if (m[i] < 7) {
                cont++;
            }
        }
        System.out.println("Um total de " + cont + " alunos reprovados");
    }

    private static void maiorMedia(int[] m) {
        int maior = m[0];
        for (int i = 1; i < 5; i++) {
            maior = Math.max(maior, m[i]);
        }
        System.out.println("Maior media: " + maior);
    }

}
