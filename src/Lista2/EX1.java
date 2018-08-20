package Lista2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class EX1 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        int[] num = new int[15];

        System.out.println("Digitar números "
                + "/n1 - sim / 2 - não");
        int b = cs.nextInt();
        if (b == 1) {
            for (int i = 0; i < 15; i++) {
                System.out.print("Escreva o " + (i + 1) + "º: ");
                num[i] = cs.nextInt();
            }
        } else {
            for (int i = 0; i < 15; i++) {
                num[i] = (int) (Math.random() * 100);
            }
        }

        int a = 0;
        for (int i = 0; i < 15; i++) {
            a += num[i];
        }

        System.out.println(Arrays.toString(num));
        System.out.println("");
        System.out.println("Média dos valores digitados: " + (a / 15));
    }
}
