/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Xavier
 */
public class Exercicio3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader arquivo = new FileReader("C:\\Users\\Xavier\\Desktop\\testeAquivos\\ARQ\\ex3.txt");
        BufferedReader arquivo1 = new BufferedReader(arquivo);

        int vendasLoja1 = 0;
        int vendasLoja2 = 0;
        int vendasLoja3 = 0;
        int vendasLoja4 = 0;

        double vendasLoja1vendidos = 0;
        double vendasLoja2vendidos = 0;
        double vendasLoja3vendidos = 0;
        double vendasLoja4vendidos = 0;

        while (arquivo1.ready()) {
            String linha = arquivo1.readLine();
            String linhaP2 = "";

            if (String.valueOf(linha.charAt(0)).equals("1")) {
                vendasLoja1++;
                for (int i = acharVirgula(linha); i < linha.length(); i++) {
                    linhaP2 += String.valueOf(linha.charAt(i));
                }

                vendasLoja1vendidos += valorVendido(linhaP2);
            }

            if (String.valueOf(linha.charAt(0)).equals("2")) {
                vendasLoja2++;
                for (int i = acharVirgula(linha); i < linha.length(); i++) {
                    linhaP2 += String.valueOf(linha.charAt(i));
                }

                vendasLoja2vendidos = valorVendido(linhaP2);
            }

            if (String.valueOf(linha.charAt(0)).equals("3")) {
                vendasLoja3++;
                for (int i = acharVirgula(linha); i < linha.length(); i++) {
                    linhaP2 += String.valueOf(linha.charAt(i));
                }

                vendasLoja3vendidos += valorVendido(linhaP2);
            }

            if (String.valueOf(linha.charAt(0)).equals("4")) {
                vendasLoja4++;
                for (int i = acharVirgula(linha); i < linha.length(); i++) {
                    linhaP2 += String.valueOf(linha.charAt(i));
                }

                vendasLoja4vendidos += valorVendido(linhaP2);
            }
        }
        String resultado1 = String.format("%.2f", vendasLoja1vendidos);

        System.out.println("Loja 1 fez " + vendasLoja1 + " venda(s), totalizando R$ " + arredondar(vendasLoja1vendidos));
        System.out.println("Loja 2 fez " + vendasLoja2 + " venda(s), totalizando R$ " + arredondar(vendasLoja2vendidos));
        System.out.println("Loja 3 fez " + vendasLoja3 + " venda(s), totalizando R$ " + arredondar(vendasLoja3vendidos));
        System.out.println("Loja 4 fez " + vendasLoja4 + " venda(s), totalizando R$ " + arredondar(vendasLoja4vendidos));
    }

    public static int acharVirgula(String linha) {
        int valorRetorno = 2;
        for (int i = 0; i < linha.length(); i++) {
            if (String.valueOf(linha.charAt(0)).equals(",")) {
                valorRetorno = i;
            }
        }
        return valorRetorno;
    }

    public static double valorVendido(String linhaP2) {
        double vendido = Double.parseDouble(linhaP2);
        return vendido;
    }

    public static String arredondar(double resultado) {
        String resultado1 = String.format("%.2f", resultado);
        return resultado1;
    }
}
