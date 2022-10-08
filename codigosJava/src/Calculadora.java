

public class Calculadora {

  /*  public static void operacaoCalculadora(String operacao){

        switch (operacao){
            case    '+':
                Calculadora.soma();
                break;

            case    '-':
                Calculadora.subtracao();
                break;

            case    '*':
                Calculadora.multiplicacao();
                break;

            case    '/':
                Calculadora.divisao();
                break;

            default:
                System.out.println("Operação inválida!");
                break;

        }

    }
*/
    public static void soma(double numero1, double numero2){

        double resultado = (numero1 + numero2);
        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é igual a : " + resultado);
    }

    public static void subtracao(double numero1, double numero2){

        double resultado = (numero1 - numero2);
        System.out.println("A subtração de " + numero1 + " menos " + numero2 + " é igual a : " + resultado );
    }

    public static void multiplicacao(double numero1, double numero2){
        double resultado = (numero1 * numero2);
        System.out.println("A multiplicação de "+ numero1 + " vezes " + numero2 + " é igual a : " + resultado);
    }

    public static void divisao(double numero1, double numero2){
        double resultado = (numero1 / numero2);
        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é igual a : " + resultado);
    }

}
