/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class validaçãoCPF {

    static int[] cpf = new int[11];

    public static void main(String[] args) throws IOException {
        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));

        String cp;

        System.out.println("\tVálidação do CPF");
        System.out.print("Informe os números de seu CPF: ");

        cp = lt.readLine();

        for (int i = 0; i < 11; i++) {
            cpf[i] = Integer.parseInt(String.valueOf(cp.charAt(i)));
        }
        if (cpf[0] == cpf[1] && cpf[0] == cpf[2] && cpf[0] == cpf[3] && cpf[0] == cpf[4] && cpf[0] == cpf[5] && cpf[0] == cpf[6] && cpf[0] == cpf[7] && cpf[0] == cpf[8] && cpf[0] == cpf[9]) {
            System.out.println("Iválido.. MORRA");
            System.exit(0);
        }

        System.out.println("CPF digitado: ");
        for (int i = 0; i < 11; i++) {
            System.out.print(cpf[i] + " ");
        }

        if (multiplica(10)) {
            if (multiplica(11)) {
                System.out.println("CPF válido.. VIVA");
            } else {
                System.out.println("Iválido.. MORRA");
            }
        } else {
            System.out.println("Iválido.. MORRA");
        }
    }

    public static boolean multiplica(int h) {
        int soma = 0;
        int pos = 0;
        for (int j = h; j >= 2; j--) {
            soma += cpf[pos] * j;
            pos++;
        }

        return verifica(soma, (h - 1));
    }

    public static boolean verifica(int s, int posicao) {
        int div = s % 11;

        if (div < 2) {
            return cpf[posicao] == 0;
        } else {
            return 11 - div == cpf[posicao];
        }
    }
}
