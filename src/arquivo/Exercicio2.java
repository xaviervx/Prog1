/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

/**
 *
 * @author Xavier
 */
public class Exercicio2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File entrada = new File("C:\\Users\\Xavier\\Desktop\\testeAquivos\\ARQ\\Behind.txt");
        FileReader leitura = new FileReader(entrada);
        BufferedReader lt = new BufferedReader(leitura);

        int linhas = 0;
        int palavras = 0;

        while (lt.ready()) {
            linhas++;
            palavras++;

            String linha = lt.readLine();

            for (int i = 0; i < linha.length(); i++) {
                if ((String.valueOf(linha.charAt(i))).equals(" ")) {
                    if (i > 0 && !((String.valueOf(linha.charAt(i - 1))).equals(" "))) {
                        palavras++;
                    }
                }
            }
        }
        System.out.println("Linhas:\t\t" + linhas);
        System.out.println("Palavras:\t" + palavras);
    }
}
