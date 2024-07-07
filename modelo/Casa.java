package modelo;


public class Casa extends Financiamento {
    @Override
    public String toString(){
        return "Casa," + getValorImovel() + ", " + getPrazoFinanciamento() + ", " + getTaxaJurosAnual() + ", " + areaConstruida + ", " + tamanhoTerreno;
    }

    private static final long serialVersionUID = 1L;
    private double areaConstruida;
    private double tamanhoTerreno;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double areaConstruida, double tamanhoTerreno) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public double getTamanhoTerreno() {
        return tamanhoTerreno;
    }

    @Override
    public double calcularPagamentoMensal() {
        double pagamentoMensal = (getValorImovel() / (getPrazoFinanciamento() * 12)) * (1 + (getTaxaJurosAnual() / 12));
        return pagamentoMensal + 80; // Valor do seguro obrigatório
    }

    public void aplicarDesconto(double desconto) throws DescontoMaiorQueJurosException {
        double pagamentoMensal = calcularPagamentoMensal();
        double jurosMensal = pagamentoMensal - (getValorImovel() / (getPrazoFinanciamento() * 12));
        if (desconto > jurosMensal) {
            throw new DescontoMaiorQueJurosException("O desconto não pode ser maior que o valor dos juros mensais.");
        }
        // Aplicar o desconto na lógica de cálculo conforme necessário
    }
}
