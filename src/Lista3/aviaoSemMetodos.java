/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Xavier; Professora: Eliana; Influencia: Danieis (existem vários); ADS
 * 14 2018; Agora sem Metodos. Todos os direitos reservados ^-^
 */
public class aviaoSemMetodos {

    public static void main(String[] args) throws IOException {
        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));

        //        Iportação e formatação de datas:
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatar1 = new SimpleDateFormat("HH:mm:ss");
        String dataFormatada = formatar.format(data);
        String dataFormatada1 = formatar1.format(data);

        // x = Congonhas; 
        // z = Guarulhos;
        boolean[] x = {false, false, false, false, false};
        boolean[] z = {false, false, false, false, false};

        int contx1 = 0;
        int contz1 = 0;

        int escolha = 0;

        while (true) {
            int contx = 0;
            int contz = 0;

            String resposta = "";

            for (int i = 0; i < 4; i++) {
                if (x[i] == true) {
                    contx++;
                }
            }
            for (int i = 0; i < 4; i++) {
                if (z[i] == true) {
                    contz++;
                }
            }
            if ((contx == 4) && (contz == 4)) {
                System.out.println("\n\t\t\tVOOS LOTADOS!!\t\t");
                System.exit(0);
            }

            // Resetar variaveis.
            contx = 0;
            contz = 0;

            if (escolha == 0) {
                System.out.print("Escolha um voo (1 - Congonhas / 2 - Guarulhos / 3 - Cancelar): ");
                escolha = cs.nextInt();
            }

            switch (escolha) {
                case 1:
                    if (contx1 == 4) {
                        resposta = "\n\t\t\tVOO Lotado\n";
                        System.out.println(resposta);
                        System.out.print("Quer para Guarulhos? (Y - Sim / N - Não) ");
                        if (lt.readLine().toUpperCase().equals("Y")) {
                            escolha = 2;
                            break;
                        } else {
                            System.out.println("Obrigado por Usar nossos serviços.");
                            System.exit(0);
                        }
                    } else {
                        if (x[contx1] == true) {
                            resposta = "Lugar indisponivél";
                            System.out.println("");
                        } else {
                            x[contx1] = true;
                            resposta = "\n\t\t      CARTÃO DE EMBARQUE\t\t"
                                    + "\n\tVOO" + "\t|\t" + "DATA E HORARIO\t" + "\t|\t" + "ASSENTO\n"
                                    + "Conconhas" + "\t|\t" + dataFormatada + "\t\t|\t" + "C" + contx1
                                    + "\n\t\t" + "|\t" + dataFormatada1 + "\t\t|\t";
                        }
                        contx1++;
                        System.out.println(resposta);
                        System.out.println("");
                    }
                    break;
                case 2:
                    if (contz1 == 4) {
                        resposta = "\n\t\t\tVOO Lotado\n";
                        System.out.println(resposta);
                        System.out.print("Quer para Congonhas? (Y - Sim / N - Não) ");
                        if (lt.readLine().toUpperCase().equals("Y")) {
                            escolha = 1;
                            break;
                        } else {
                            System.out.println("Obrigado por Usar nossos serviços.");
                            System.exit(0);
                        }
                    } else {
                        if (z[contz1] == true) {
                            resposta = "Lugar indisponivél";
                        } else {
                            z[contz1] = true;
                            resposta = "\n\t\t      CARTÃO DE EMBARQUE\t\t"
                                    + "\n\tVOO" + "\t|\t" + "DATA E HORARIO\t" + "\t|\t" + "ASSENTO\n"
                                    + "Guarulhos" + "\t|\t" + dataFormatada + "\t\t|\t" + "G" + contz1
                                    + "\n\t\t" + "|\t" + dataFormatada1 + "\t\t|\t";
                        }
                        contz1++;
                        System.out.println(resposta);
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Volte sempre!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nVoo inexistente\n");
                    System.out.println("");
            }
            if (resposta.equals("\n\t\t\tVOO Lotado\n")) {
            } else {
                escolha = 0;
            }
        }
    }
}
