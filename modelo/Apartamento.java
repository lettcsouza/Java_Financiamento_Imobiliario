package modelo;

public class Apartamento extends Financiamento {
    private int numVagasGaragem;
    private int numAndar;

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, int numVagasGaragem, int numAndar) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.numVagasGaragem = numVagasGaragem;
        this.numAndar = numAndar;
    }

    @Override
    public double calcularPagamentoMensal() {
        double taxaMensal = getTaxaJurosAnual() / 12 / 100;
        double prazoMeses = getPrazoFinanciamento() * 12;
        double fator = Math.pow(1 + taxaMensal, prazoMeses);
        return (getValorImovel() * fator) / (fator - 1);
    }

    @Override
    public void mostrarDadosFinanciamento() {
        double pagamentoMensal = calcularPagamentoMensal();
        double totalPagamento = calcularTotalPagamento();
        System.out.printf("Valor do imóvel (Apartamento): R$ %.2f%n", getValorImovel());
        System.out.printf("Valor do financiamento: R$ %.2f%n", totalPagamento);
        System.out.printf("Pagamento mensal (sistema PRICE): R$ %.2f%n", pagamentoMensal);
        System.out.printf("Número de vagas na garagem: %d%n", numVagasGaragem);
        System.out.printf("Número do andar: %d%n", numAndar);
    }
}