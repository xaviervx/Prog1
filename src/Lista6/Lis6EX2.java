/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista6;

import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class Lis6EX2 {

    double salario = 1200;

    public static void main(String[] args) {
        Lis6EX2 q = new Lis6EX2();

        Scanner cs = new Scanner(System.in);

        System.out.print("Aumentar Salario? (1 - Sim / 2 - Não) ");
        if (cs.nextInt() == 1) {
            System.out.print("Salario: ");
            q.exibeSalario();
            q.aumentaSalario();
        } else {
            System.out.print("Salario final: ");
            q.exibeSalario();
        }
    }

    public void exibeSalario() {
        System.out.println(salario);
    }

    public void aumentaSalario() {
        salario *= 1.1;
        System.out.print("Novo Salario: ");
        exibeSalario();
    }
}
