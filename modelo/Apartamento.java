package modelo;

public class Apartamento extends Financiamento {
    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    public double calcularPagamentoMensal(){
        double taxaMensal = getTaxaJurosAnual() / 12 / 100;
        double prazoMeses = getPrazoFinanciamento() * 12;
        double fator = Math.pow(1 + taxaMensal, prazoMeses);
        return (getValorImovel() * fator) / (fator - 1);
    }

    public void mostrarDadosFinanciamento(){
        double pagamentoMensal = calcularPagamentoMensal();
        double totalPagamento = calcularTotalPagamento();
        System.out.printf("Valor do imóvel (Apartamento): R$ %.2f%n", getValorImovel());
        System.out.printf("Valor do financiamento: R$ %.2f%n", totalPagamento);
        System.out.printf("Pagamento mensal (sistema PRICE): R$ %.2f%n", pagamentoMensal);
    }
}
