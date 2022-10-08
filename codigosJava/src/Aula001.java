import java.util.*;

public class Aula001 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int v1, v2;

        System.out.println("Digite um numero :");
        v1 = leitor.nextInt();
        System.out.println("Digite outro numero :");
        v2 = leitor.nextInt();

        System.out.println("O Resultado da soma dos numeros : " + (v1+v2));
        System.out.println("O Resultado da subtracao dos numeros : "+ (v1-v2));
        System.out.println("O Resultado da divisao dos numeros : "+ (v1/v2));
        System.out.println("O Resultado da multiplicacao dos numeros : "+ (v1*v2));

    }
}
