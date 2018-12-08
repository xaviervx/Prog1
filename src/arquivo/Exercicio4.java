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
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class Exercicio4 {

    public static void main(String[] args) throws IOException {
        File arquivo = new File("C:\\Users\\Xavier\\Desktop\\testeAquivos\\Exercicio4.txt");
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));
        Scanner cs = new Scanner(System.in);

        if (!arquivo.exists()) {
            arquivo.createNewFile();
            System.out.println("Aquivo criado");
        }
        System.out.print("Informe o número de linas do texto a ser escrito: ");
        int linhas = cs.nextInt();
        System.out.println("");
        System.out.println("Escreva a menssagem a ser criptogarfada...");
        FileWriter escrever = new FileWriter(arquivo);
        try (BufferedWriter edita = new BufferedWriter(escrever)) {
            for (int i = 0; i < linhas; i++) {
                edita.write(lt.readLine());
                edita.newLine();
            }
        }
        
        System.out.print("Chave de encriptação: ");
        int ch = cs.nextInt();

        String al = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";

        File arquivoV2 = new File("C:\\Users\\Xavier\\Desktop\\testeAquivos\\Exercicio4V2.txt");
        if (!arquivo.exists()) {
            arquivo.createNewFile();
            System.out.println("");
            System.out.println("Aquivo criptografado criado");
        }

        FileWriter escreverV2 = new FileWriter(arquivoV2);
        try (BufferedWriter editaV2 = new BufferedWriter(escreverV2)) {
            FileReader ler = new FileReader(arquivo);
            BufferedReader edit = new BufferedReader(ler);
            
            String linha;
            String linhaCrip = "";
            while (edit.ready()) {
                linha = edit.readLine().replace(" ", "").replace("é", "e").replace("ç", "c")
                        .replace("ó", "o").replace("ã", "a").replace("á", "a").replace("ú", "u")
                        .replace("í", "i").replace(",", "").replace(".", "").replace(";", "")
                        .replace("?", "").replace("!", "").replace("'", "").replace("-", "")
                        .replace(":", "").replace("_", "").replace("=", "").replace("+", "").toUpperCase();
                
                for (int i = 0; i < linha.length(); i++) {
                    for (int j = 0; j < 25; j++) {
                        if (String.valueOf(linha.charAt(i)).equals(String.valueOf(al.charAt(j)))) {
                            linhaCrip += String.valueOf(al.charAt((j + ch)));
                            break;
                        }
                    }
                }
                
                editaV2.write(linhaCrip);
                editaV2.newLine();
                linhaCrip = "";
                
            }
        }
    }
}
