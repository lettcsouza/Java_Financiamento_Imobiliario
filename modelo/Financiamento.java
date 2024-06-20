package modelo;

public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento; // em anos
    private double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double calcularPagamentoMensal() {
        double prazoMeses = prazoFinanciamento * 12;
        double taxaMensal = taxaJurosAnual / 12 / 100;
        double pagamentoMensal = (valorImovel / prazoMeses) * (1 + taxaMensal);
        return pagamentoMensal;
    }

    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * prazoFinanciamento * 12;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void mostrarDadosFinanciamento() {
        double pagamentoMensal = calcularPagamentoMensal();
        double totalPagamento = calcularTotalPagamento();
        System.out.printf("Valor do imóvel: R$ %.2f%n", valorImovel);
        System.out.printf("Valor do financiamento: R$ %.2f%n", totalPagamento);
        System.out.printf("Pagamento mensal: R$ %.2f%n", pagamentoMensal);
    }
}

