
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        financiamentos.add(new Financiamento(200000, 20, 5.0)); 
        financiamentos.add(new Financiamento(300000, 25, 6.0)); 
        financiamentos.add(new Financiamento(150000, 15, 4.5)); 
        financiamentos.add(new Financiamento(250000, 30, 5.5));

        double totalValorImoveis = 0;
        double totalValorFinanciamentos = 0;

        for (Financiamento financiamento : financiamentos) {
            double valorImovel = financiamento.getValorImovel();
            double valorFinanciamento = financiamento.calcularPagamentoTotal();

            totalValorImoveis += valorImovel;
            totalValorFinanciamentos += valorFinanciamento;

            System.out.printf("Financiamento - valor do imóvel: R$ %.2f, valor do financiamento: R$ %.2f%n", valorImovel, valorFinanciamento);
        }

        System.out.printf("Total de todos os imóveis: R$ %.2f%n", totalValorImoveis);
        System.out.printf("Total de todos os financiamentos: R$ %.2f%n", totalValorFinanciamentos);
    }
}
