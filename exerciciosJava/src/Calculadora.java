import java.util.*;
public class Calculadora {

    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("A soma do número " + numero1 + " + " + numero2 + " é igual a : " + resultado);
    }
    public static void  subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("A subtração do número " + numero1 + " - " + numero2 + " é igual a  " +  resultado);
    }
    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("A multiplicação do número " + numero1 + " * " + numero2 + " é igual a " + resultado );
    }
    public static void divisao(double numero1, double numero2){
        double resultado = numero1/numero2;
        System.out.println("A divisão do número " + numero1 + " / " + numero2 + " é igual a : " + resultado);
    }

}
