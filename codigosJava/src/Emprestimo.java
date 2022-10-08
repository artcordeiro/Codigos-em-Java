import java.util.function.DoubleToIntFunction;

public class Emprestimo {

    public static void calcularEmprestimo
            (double quantidadeParcelas, double valorEmprestimo){


        double taxaMensal = 0.70;
        double valorTotal = valorEmprestimo * (quantidadeParcelas*taxaMensal);
        double valorParcela = valorTotal/quantidadeParcelas;

        System.out.println("O valor do empréstimo ficará em " + " R$ " + valorTotal + ", com "+ quantidadeParcelas + " parcelas de : " + " R$ " + valorParcela);


    }
}





/*

 QuantidadeParcela, Valor, Taxa, ValorCTaxa, ValorParcelas

 JUROS = TAXA MENSAL * VALOR
 PARCELAS = VALOR + JUROS / parcelasEmprestimo




*/