import java.util.*;
public class relatorioLoja {

    static final int TOTAL_OBJETOS = 10;

    static void imprimirRelatorio(int[] quantidades, double[] precos){
        double valorTotalVenda = 0.0;
        System.out.println("Item\tPreço\tQtde\tSubtotal");

        //Imprimir relatório de Vendas
        for (int i = 0; i < TOTAL_OBJETOS; i++){
            double subtotal = quantidades[i] * precos[i];
            valorTotalVenda = subtotal + valorTotalVenda;
            System.out.println((i + 1) + "\t R$ " + precos[i] + "\t" + quantidades[i] + "\t R$ " + subtotal);
            System.out.println();
        }
        double comissao = valorTotalVenda * 5 / 100;
        System.out.println("\t\t TOTAL: " + valorTotalVenda);
        System.out.println();
        System.out.println("Comissão do Vendedor: R$ " + comissao);
        System.out.println("Salário do Vendedor: R$ " + (comissao + 545.00));
    }



}
