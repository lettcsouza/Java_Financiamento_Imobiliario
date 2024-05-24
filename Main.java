public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        
        double valorImovel = interfaceUsuario.pedirValorImovel();
        int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
        double taxaJurosAnual = interfaceUsuario.pedirTaxaJuros();

        Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);

        double pagamentoMensal = financiamento.calcularParcelaMensal();
        double totalPagamento = financiamento.calcularPagamentoTotal();

        System.out.printf("O valor do pagamento mensal é: R$ %.2f%n", pagamentoMensal);
        System.out.printf("O valor do pagamento ao final do financiamento é: R$ %.2f%n", totalPagamento);

    }
}