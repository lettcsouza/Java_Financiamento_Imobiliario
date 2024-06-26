package modelo;

public class Terreno extends Financiamento {
    private static final double ACRESCIMO_PERCENTUAL = 0.02;
    private String tipoZona;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, String tipoZona) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tipoZona = tipoZona;
    }

    @Override
    public double calcularPagamentoMensal() {
        double pagamentoMensal = (super.getValorImovel() / (super.getPrazoFinanciamento() * 12)) * (1 + (super.getTaxaJurosAnual() / 12 / 100));
        return pagamentoMensal * (1 + ACRESCIMO_PERCENTUAL);
    }

    @Override
    public void mostrarDadosFinanciamento() {
        double pagamentoMensal = calcularPagamentoMensal();
        double totalPagamento = calcularTotalPagamento();
        System.out.printf("Valor do imóvel (Terreno): R$ %.2f%n", getValorImovel());
        System.out.printf("Valor do financiamento: R$ %.2f%n", totalPagamento);
        System.out.printf("Pagamento mensal (com acréscimo): R$ %.2f%n", pagamentoMensal);
        System.out.printf("Tipo de zona: %s%n", tipoZona);
    }
}