/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Xavier
 */
public class Exercicio1 {

    static int numeroEspaços = 0;
    static int numeroVogais = 0;
    static int numeroLetras = 0;
    static int numeroConsoantes = 0;

    public static void main(String[] args) throws IOException {

        File arq1 = new File("C:\\Users\\Xavier\\Desktop\\testeAquivos\\ARQ\\Behind.txt");

        if (!arq1.exists()) {
            arq1.createNewFile();
        }
        FileReader arqlt = new FileReader(arq1);
        BufferedReader ler = new BufferedReader(arqlt);

        while (ler.ready()) {
            String linha = ler.readLine();
            for (int i = 0; i < linha.length(); i++) {

                if (String.valueOf(linha.charAt(i)).equals(" ")) {
                    numeroEspaços++;
                } else {
                    cosoantesVogais(String.valueOf(linha.charAt(i)));
                }
            }
            String linhaSemEspaco = linha.replace(" ", "");
            numeroLetras += linhaSemEspaco.length();
        }

        File arqcopy = new File("C:\\Users\\Xavier\\Desktop\\testeAquivos\\ARQ\\BehindCopy.txt");
        if (!arqcopy.exists()) {
            arqcopy.createNewFile();
        }
        FileWriter informacoes = new FileWriter(arqcopy);
        try (BufferedWriter escreverInfo = new BufferedWriter(informacoes)) {
            escreverInfo.write("Número de Letras:\t" + numeroLetras);
            escreverInfo.newLine();

            escreverInfo.write("Número de Consoantes:\t" + numeroConsoantes);
            escreverInfo.newLine();

            escreverInfo.write("Número de Vogais:\t" + numeroVogais);
            escreverInfo.newLine();

            escreverInfo.write("Número de Espaços:\t" + numeroEspaços);
        }
        System.out.println("Arquivo Atualizado");
    }

    private static void cosoantesVogais(String letra) {
        boolean vogal = true;

        String consoantesConhecidas = "BCDFGHJKLMNPQRSTVWXYZ";

        for (int i = 0; i < consoantesConhecidas.length(); i++) {
            if ((String.valueOf(consoantesConhecidas.charAt(i))).equals(letra.toUpperCase())) {
                numeroConsoantes++;
                vogal = false;
                break;
            }
        }
        if (vogal) {
            numeroVogais++;
        }
    }
}
