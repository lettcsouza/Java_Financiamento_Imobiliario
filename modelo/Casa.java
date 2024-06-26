package modelo;

public class Casa extends Financiamento {
    private static final double VALOR_SEGURO = 80.0;
    private double areaConstruida;
    private double tamanhoTerreno;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double areaConstruida, double tamanhoTerreno) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }

    @Override
    public double calcularPagamentoMensal() {
        double pagamentoMensal = (super.getValorImovel() / (super.getPrazoFinanciamento() * 12)) * (1 + (super.getTaxaJurosAnual() / 12 / 100));
        return pagamentoMensal + VALOR_SEGURO;
    }

    @Override
    public void mostrarDadosFinanciamento() {
        double pagamentoMensal = calcularPagamentoMensal();
        double totalPagamento = calcularTotalPagamento();
        System.out.printf("Valor do imóvel (Casa): R$ %.2f%n", getValorImovel());
        System.out.printf("Valor do financiamento: R$ %.2f%n", totalPagamento);
        System.out.printf("Pagamento mensal (incluindo seguro): R$ %.2f%n", pagamentoMensal);
        System.out.printf("Área construída: %.2f m²%n", areaConstruida);
        System.out.printf("Tamanho do terreno: %.2f m²%n", tamanhoTerreno);
    }
}