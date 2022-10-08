import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Chamando Metodo Calculadora
        System.out.println("-- Calculadora --");
        Calculadora.soma(35,89);
        Calculadora.subtracao(12,34);
        Calculadora.multiplicacao(443,22);
        Calculadora.divisao(122,12);
        //Chamando metodo com escolha do usuário
        //System.out.println("Digite a operação que deseja realizar : \n + \n - \n * \n / "  );

        //Chamando Metodo Mensagem
        System.out.println(" -- Mensagem --");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(23);

        //Pegando valor do usuário
        System.out.printf("Digite a hora : ");
        int hora = leitor.nextInt();
        Mensagem.obterMensagem(hora);

        System.out.println("Digite o valor do emprestimo desejado : ");
        double valorEmprestimo = leitor.nextDouble();
        System.out.println("Digite em quantas parcelas deseja :");
        double quantidadeParcelas = leitor.nextDouble();


        Emprestimo.calcularEmprestimo(quantidadeParcelas,valorEmprestimo);




    }
}
