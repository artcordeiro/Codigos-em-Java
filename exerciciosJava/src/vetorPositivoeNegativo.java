import java.util.*;
public class vetorPositivoeNegativo {

    static final int TOTAL_OBJETOS = 8;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int positivos[] = new int[TOTAL_OBJETOS];
        int negativos[] = new int[TOTAL_OBJETOS];
        int numero[] = new int[TOTAL_OBJETOS];

        System.out.println("\tPreencha o vetor ");

        for (int i = 0; i < TOTAL_OBJETOS; i++) {
            System.out.print("Nº:");
            numero[i] = console.nextInt();
            if (numero[i] > 0) {
                positivos[i] = numero[i];
            } else {
                negativos[i] = numero[i];
            }
        }

        System.out.println("Números positivos :");
        System.out.println();


        for (int x = 0; x < TOTAL_OBJETOS; x++) {
            if (positivos[x] > 0) {
                System.out.println("\t\t "+positivos[x]);
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Números negativos :");
        System.out.println();


        for (int x = 0; x < TOTAL_OBJETOS; x++) {
            if(negativos[x] != 0) {
                System.out.println("\t\t "+negativos[x]);
            }
        }



    }
}
