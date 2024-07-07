package modelo;

public class Apartamento extends Financiamento {
    private static final long serialVersionUID = 1L;
    private int vagasGaragem;
    private int numeroAndar;

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, int vagasGaragem, int numeroAndar) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.vagasGaragem = vagasGaragem;
        this.numeroAndar = numeroAndar;
    }

    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public int getNumeroAndar() {
        return numeroAndar;
    }

    @Override
    public double calcularPagamentoMensal() {
        double taxaMensal = getTaxaJurosAnual() / 12 / 100;
        int meses = getPrazoFinanciamento() * 12;
        double valorImovel = getValorImovel();
        
        return (valorImovel * Math.pow(1 + taxaMensal, meses) * taxaMensal) / (Math.pow(1 + taxaMensal, meses) - 1);

    }

    @Override
    public String toString() {
        return "Apartamento, " + getValorImovel() + ", " + getPrazoFinanciamento() + ", " + getTaxaJurosAnual() + ", " + vagasGaragem + ", " + numeroAndar;
    }
}
