import java.util.*;
    public class vetorMaiorQue5 {

        static final int TOTALVETOR = 10;

        public static void main(String[] args) {

            Scanner console = new Scanner(System.in);

            int vetor[] = new int[TOTALVETOR];

            System.out.println("\tDigite para preenchermos o vetor ");

            for (int i = 0; i < TOTALVETOR; i++) {
                System.out.print("Nº :");
                vetor[i] = console.nextInt();
            }


            for (int i = 0; i < TOTALVETOR; i++) {
                if (vetor[i] > 5) {
                    System.out.println("Número : "+vetor[i]+" posição :"+i);
                } else {
                    System.out.println("Não existe nenhum número nesta condição !");
                }
            }
        }
    }
