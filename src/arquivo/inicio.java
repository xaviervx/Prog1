/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class inicio {

    public static void main(String[] args) throws IOException {
        // Local a criar o arquivo
        File arquivo = new File("C:\\Users\\Xavier\\Desktop\\testeAquivos\\arquivoTeste.txt");

        // Veifica se o arquivo ja existe. Se ainda não existe cria ele.
        if (!arquivo.exists()) {
            arquivo.createNewFile();
            System.out.println("Seu Arquivo foi criado com sucesso");
        } else {
            System.out.println("Já existe");
        }
        File diretorio = new File("C:\\Users\\Xavier\\Desktop\\testeAquivos\\ARQ");
        diretorio.mkdir();

        // Listar Aqquivos no caminho especificado
        File listarAquivo = new File("C:\\Users\\Xavier\\Desktop\\testeAquivos");
        for (File arq : listarAquivo.listFiles()) {
            System.out.println(arq);
        }

        System.out.println("");
        escrever();

    }

    private static void escrever() throws IOException {
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));

        Scanner cs = new Scanner(System.in);
        File arquivo = new File("C:\\Users\\Xavier\\Desktop\\testeAquivos\\arquivoTeste.txt");
        FileWriter arq = new FileWriter(arquivo, true);
        BufferedWriter texto = new BufferedWriter(arq);

        for (int i = 0; i < 3; i++) {
            texto.write(lt.readLine());
            texto.newLine();
        }
        texto.close();

    }
}
