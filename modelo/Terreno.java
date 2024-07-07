package modelo;

public class Terreno extends Financiamento {
    private static final long serialVersionUID = 1L;
    private String tipoZona;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, String tipoZona) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tipoZona = tipoZona;
    }

    public String getTipoZona() {
        return tipoZona;
    }

    @Override
    public double calcularPagamentoMensal() {
        double pagamentoMensal = (getValorImovel() / (getPrazoFinanciamento() * 12)) * (1 + (getTaxaJurosAnual() / 12));
        return pagamentoMensal * 1.02; // Acréscimo de 2%
    }

    @Override
    public String toString() {
        return "Terreno, " + getValorImovel() + ", " + getPrazoFinanciamento() + ", " + getTaxaJurosAnual() + ", " + tipoZona;
    }
}
