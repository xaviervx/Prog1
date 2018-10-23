package Bug;

import java.io.IOException;
import java.util.Scanner;

public class Numero {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int entrada = 0;
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        for (int i = 0; i < 10; i++) {
            entrada = scanner.nextInt();
            if (entrada % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            if (entrada > 0) {
                positivo++;
            } else if (entrada < 0) {
                negativo++;
            }

        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}
