/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista4_alternativa;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class Lis4alEX1 {

    public static void main(String[] args) throws IOException {
        Lis4alEX1 v = new Lis4alEX1();
        v.tudo();
    }

    public void tudo() throws IOException {

        Scanner cs = new Scanner(System.in);

        System.out.println("==================================================================="
                + "=============================================================================\n");

        System.out.print("Informações da matriz A:\nNúmero de Linhas: ");
        int numeroLinhas_a = cs.nextInt();
        System.out.print("Número de Colunas: ");
        int numeroColunas_a = cs.nextInt();

        System.out.print("\nInformações matriz B:\nNúmero de Linhas: ");
        int numeroLinhas_b = cs.nextInt();
        System.out.print("Número de Colunas: ");
        int numeroColunas_b = cs.nextInt();
        System.out.println("\n==================================================================="
                + "=============================================================================\n");

        if ((numeroColunas_a + numeroColunas_b) > 17) {
            System.out.println("Informe uma quantidade de colunas para 'a' e 'b' que"
                    + "\nquando somadas seja menor que 18.\n");
                    tudo();
        }
        int[][] a = new int[numeroLinhas_a][numeroColunas_a];
        int[][] b = new int[numeroLinhas_b][numeroColunas_b];

        int maior = (Math.max(Math.max(numeroLinhas_a, numeroColunas_a), Math.max(numeroLinhas_b, numeroColunas_b)));
        int maiorL = Math.max(numeroLinhas_a, numeroLinhas_b);
        int maiorC = Math.max(numeroLinhas_b, numeroColunas_b);

        String[][] c = new String[maiorL][1 + numeroColunas_a + numeroColunas_b];

        for (int i = 0; i < numeroLinhas_a; i++) {
            for (int j = 0; j < numeroColunas_a; j++) {
                a[i][j] = (int) (Math.random() * 51);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("\n==================================================================="
                + "=============================================================================\n");

        for (int i = 0; i < numeroLinhas_b; i++) {
            for (int j = 0; j < numeroColunas_b; j++) {
                b[i][j] = (int) (Math.random() * 51);
                System.out.print(b[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("\n==================================================================="
                + "=============================================================================\n");
        // *Cometario a fazer
        for (int i = 0; i < numeroLinhas_a; i++) {
            for (int j = 0; j < numeroColunas_a; j++) {
                c[i][j] = "" + a[i][j];
            }
        }
        // Erro cometido: a variavel "l" não estava sendo setada ao final do seu "for"
        // e a variavel "j" estava começando e terminando no lugar errado.
        //        for (int i = 0; i < numeroLinhas_b; i++) {
        //            for (int j = numeroColunas_a + 1; j < numeroColunas_a + numeroColunas_b; j++) {
        //                c[i][j] = "" + b[k][l];
        //                l++;
        //            }
        //            k++;
        //        }

        int k = 0;
        int l = 0;
        for (int i = 0; i < numeroLinhas_b; i++) {
            for (int j = numeroColunas_a + 1; j < (1 + (numeroColunas_a + numeroColunas_b)); j++) {
                c[i][j] = "" + b[k][l];
                l++;
            }
            k++;
            l = 0;
        }

        for (int i = 0; i < (maiorL); i++) {
            for (int j = 0; j < (1 + (numeroColunas_a + numeroColunas_b)); j++) {
                if (j == (numeroColunas_a)) {
                    c[i][j] = "|";
                }
                if (c[i][j] == null) {
                    c[i][j] = " ";
                }
                System.out.print(c[i][j] + "\t");
            }
            System.out.println("");

            // Criar novo metodo que efetue a multiplicação das Matrizes.
        }
        teste(a, b, numeroLinhas_a, numeroColunas_b, numeroLinhas_b, numeroColunas_b);   
    }

    private String[][] teste(int[][] a, int[][] b, int l_a, int c_a, int l_b, int c_b) {
        String[][] h = new String[l_a][c_b];
        int[][] bNovo = new int[c_a][l_b];
        int linhas = 0;
        int colunas = 0;
        
        System.out.println(b.length);
        for (int i = 0; i < c_a; i++) {
            for (int j = 0; j < l_a; j++) {
                System.out.print(b[l_a][c_a] +"\t");
            }
            System.out.println("");
        }
       return h;
    }

}
