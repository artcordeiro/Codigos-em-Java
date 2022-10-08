import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
public class validacaoVetorPrimo {

    static final int TOTALOBJETOSVETOR = 9;

    static boolean Primo(int numero) {
        if (numero > 1) {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
        } else {
        return false;
    }
        return true;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int vetor_primo[] = new int[TOTALOBJETOSVETOR];

        System.out.println("Digite 9 números : ");
        for (int i = 0; i < TOTALOBJETOSVETOR; i++){
            vetor_primo[i] = console.nextInt();
        }
        System.out.println("Os números primos são :");
        for (int i = 0; i < TOTALOBJETOSVETOR; i++){
            if (Primo(vetor_primo[i])){
                System.out.println(vetor_primo[i] + " na posição " + i);
            }
            }
        }

    }



