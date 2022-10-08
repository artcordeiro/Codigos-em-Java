import java.util.*;

    public class vetorCorrecaoProva {

        static final int TOTAL_QUESTOES = 8;
        static final int TOTAL_ALUNOS = 10;
        static final int NOTA_MINIMA = 6;

        public static void main(String[] args) {

            Scanner console = new Scanner(System.in);

            String[] gabarito = new String[TOTAL_QUESTOES];
            String[] respostas = new String[TOTAL_QUESTOES];

            int[] numeroAluno = new int[TOTAL_ALUNOS];
            int[] pontosAluno = new int[TOTAL_ALUNOS];


            System.out.println("\tGabarito");

            for (int i = 0; i < TOTAL_QUESTOES; i++) {
                System.out.print("Digite a resposta da questão " + (i + 1) + ": ");
                gabarito[i] = console.nextLine();
            }

            System.out.println("Respostas dos Alunos");

            for (int i = 0; i < TOTAL_ALUNOS; i++) {
                int pontos = 0;
                System.out.print("Digite o número do " + (i + 1) + "º aluno: ");
                numeroAluno[i] = console.nextInt();

                for (int j = 0; j < respostas.length; j++) {

                    System.out.print("Digite a resposta da questão " + (j+1) + ": ");
                    respostas[j] = console.next();

                    if (respostas[j].compareTo(gabarito[j]) == 0)
                        pontos++;
                }
                pontosAluno[i] = pontos;
                System.out.println("A nota do aluno " + numeroAluno[i] + " foi " + pontos);

            }
        }
    }
