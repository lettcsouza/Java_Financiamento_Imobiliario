package modelo;

public abstract class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
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

    public abstract double calcularPagamentoMensal();

    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * prazoFinanciamento * 12;
    }

    public void mostrarDados() {
        System.out.println("Valor do Imóvel: R$ " + valorImovel);
        System.out.println("Prazo do Financiamento: " + prazoFinanciamento + " anos");
        System.out.println("Taxa de Juros Anual: " + taxaJurosAnual + "%");
        System.out.println("Valor Total do Financiamento: R$ " + calcularTotalPagamento());
    }
}
