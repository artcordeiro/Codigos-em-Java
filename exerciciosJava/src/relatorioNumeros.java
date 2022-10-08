 import java.util.*;
    public class relatorioNumeros {


        static boolean ePar(int numero) {

            if (numero % 2 == 0)
                return true;
            else
                return false;
        }

        public static void main(String[] args) {

            int[] vetor = {2, 4, 5, 6, 3, 7};
            int somaNumeroPar = 0;
            int somaNumeroImpar = 0;
            int qtdeImpar = 0;

            int[] pares = new int[vetor.length];
            int[] impares = new int[vetor.length];


            for (int i = 0; i < vetor.length; i++) {
                if (ePar(vetor[i])) {
                    somaNumeroPar = vetor[i] + somaNumeroPar;
                    pares[i] = vetor[i];
                } else {
                    somaNumeroImpar += vetor[i];
                    qtdeImpar++;

                    impares[i] = vetor[i];
                }
            }
            System.out.println(Arrays.toString(pares));
            System.out.println(Arrays.toString(impares));

        }
    }
