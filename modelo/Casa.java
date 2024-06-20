package modelo;

public class Casa extends Financiamento{
    private static final double valorSeguro = 80.0;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    public double calcularPagamentoMensal(){
        double pagamentoMensal = super.calcularPagamentoMensal();
        return pagamentoMensal + valorSeguro;
    }

    public void mostrarDadosFinanciamento(){
        double pagamentoMensal = calcularPagamentoMensal();
        double totalPagamento = calcularTotalPagamento();

        System.out.printf("Valor do Imóvel (CASA): R$ %.2f%n", getValorImovel());
        System.out.printf("Valor do Financiamento: R$ %.2f%n", totalPagamento);
        System.out.printf("Pagamento Mensal (incluso seguro): R$ %.2f%n", pagamentoMensal);
        
    }
}