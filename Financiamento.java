public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double calcularParcelaMensal() {
        double prazoMeses = prazoFinanciamento * 12;
        double taxaJurosMensal = taxaJurosAnual / 12 / 100;
        double pagamentoMensal = (valorImovel / prazoMeses) * (1 + taxaJurosMensal);
        return pagamentoMensal;
    }

    public double calcularPagamentoTotal() {
        return calcularParcelaMensal() * prazoFinanciamento * 12;
    }

    //getters & setters 

    public double getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(double valorImovel) {
        this.valorImovel = valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public void setPrazoFinanciamento(int prazoFinanciamento) {
        this.prazoFinanciamento = prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }
} 
