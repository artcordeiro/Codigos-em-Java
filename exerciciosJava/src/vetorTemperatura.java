import java.util.*;
public class vetorTemperatura {

    static final int TOTALMES = 12;

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] temperaturaMedia = new int[TOTALMES];
        int maiorT = 0;
        int menorT = 0;
        int n = 0; int n2 = 0;
        String[] mesAno = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};


        for(byte x = 0; x < temperaturaMedia.length; x++) {
            System.out.print("Digite a temperatura média " + mesAno[x] + ": ");
            temperaturaMedia[x] = leitor.nextInt();

            if (temperaturaMedia[x] > maiorT) {
                maiorT = temperaturaMedia[x];
                n = x;
            }
        }
        menorT = maiorT;

        for(byte x = 0; x < temperaturaMedia.length; x++) {
            if (menorT > temperaturaMedia[x]) {
                menorT = temperaturaMedia[x];
                n2 = x;
            }
        }
        System.out.println("Maior temperatura do Ano: " + maiorT + "ºC em " + mesAno[n]);
        System.out.println("Menor temperatura do Ano: " + menorT + "ºC em " + mesAno[n2]);
    }
}
