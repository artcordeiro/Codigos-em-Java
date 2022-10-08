import java.util.*;
public class intercalarVetor {

    static final int TOTALVETOR = 10;
    static final int TOTALRESULTADO = 20;

    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        int vetor1[] = new int [TOTALVETOR];
        int vetor2[] = new int [TOTALVETOR];
        int vetor3[] = new int [TOTALRESULTADO];
        int j = 0;

        System.out.println("\tDigite para preenchermos os Vetor 1 !");

        for (int i=0; i<TOTALVETOR; i++){
            System.out.print("Nº :");
            vetor1[i] = console.nextInt();
        }
        System.out.println();
        System.out.println("\tDigite para preenchermos os Vetor 2 !");

        for (int i=0; i<TOTALVETOR; i++){
            System.out.print("Nº :");
            vetor2[i] = console.nextInt();
        }
        for (int i=0; i<TOTALVETOR; i++){
            vetor3[j] = vetor1[i];
            j++;
            vetor3[j] = vetor2[i];
            j++;
        }
        System.out.println("\t\tElementos do Vetor 3:");
        System.out.println();
        for (int i=0; i<TOTALRESULTADO; i++){
            System.out.println("\tElemento '"+vetor3[i] + "' na posição '" + (i+1) +"'");
        }
    }
}
