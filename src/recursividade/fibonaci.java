/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class fibonaci {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Numero");
        int pos = cs.nextInt();
        for (int i = 0; i < pos; i++) {
            System.out.println(fibonacci(i));
        }
    }

    private static int fibonacci(int num) {
        if (num < 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num -2);
    }
    
}
