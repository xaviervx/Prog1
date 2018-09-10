/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Xavier
 */
public class arquivosTestes {

    public static void main(String[] args) throws IOException {
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));
        File fl = new File("x.txt");
        if (!fl.exists()) {
            fl.createNewFile();
        }

        try (FileWriter fw = new FileWriter(fl)) {
            
            fw.write("Teste");
            fw.append("teste2");
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.flush();
                bw.newLine();
                bw.write(lt.readLine());
            }
        }

        FileReader fr = new FileReader(fl);
        BufferedReader bf = new BufferedReader(fr);
        System.out.println(bf.readLine());
        System.out.println(bf.readLine());
    }
}
