package modelo;

public class Terreno extends Financiamento{
    private static final double taxaJurosTerreno = 0.02;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    public double calcularPagamentoMensal(){
        double pagamentoMensal = super.calcularPagamentoMensal();
        return pagamentoMensal * (1 + taxaJurosTerreno);
    }

    public void mostrarDadosFinanciamento(){
        double pagamentoMensal = calcularPagamentoMensal();
        double totalPagamento = calcularTotalPagamento();
        System.out.printf("Valor do imóvel (Terreno): R$ %.2f%n", getValorImovel());
        System.out.printf("Valor do financiamento: R$ %.2f%n", totalPagamento);
        System.out.printf("Pagamento mensal (com acréscimo): R$ %.2f%n", pagamentoMensal);
    }

}  

