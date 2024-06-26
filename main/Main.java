package main;

import modelo.Financiamento;
import modelo.Casa;
import modelo.Apartamento;
import modelo.Terreno;
import util.InterfaceUsuario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Financiamento> financiamentos = new ArrayList<>();
        InterfaceUsuario iu = new InterfaceUsuario();

        // Pedindo dados do usuário para um financiamento
        System.out.println("Cadastro de Casa:");
        double valorImovel = iu.pedirValorImovel();
        int prazoFinanciamento = iu.pedirPrazoFinanciamento();
        double taxaJurosAnual = iu.pedirTaxaJuros();
        double areaConstruida = iu.pedirAreaConstruida();
        double tamanhoTerreno = iu.pedirTamanhoTerreno();
        financiamentos.add(new Casa(valorImovel, prazoFinanciamento, taxaJurosAnual, areaConstruida, tamanhoTerreno));

        // Adicionando financiamentos de exemplo
        financiamentos.add(new Casa(200000, 20, 5.0, 150, 200)); // 20 anos, 5% de juros, 150m² área construída, 200m² terreno
        financiamentos.add(new Apartamento(300000, 25, 6.0, 2, 10)); // 25 anos, 6% de juros, 2 vagas, 10º andar
        financiamentos.add(new Apartamento(150000, 15, 4.5, 1, 5)); // 15 anos, 4.5% de juros, 1 vaga, 5º andar
        financiamentos.add(new Terreno(250000, 30, 5.5, "residencial")); // 30 anos, 5.5% de juros, zona residencial

        double totalValorImoveis = 0;
        double totalValorFinanciamentos = 0;

        // Calculando os totais
        for (Financiamento financiamento : financiamentos) {
            double valorImovelInd = financiamento.getValorImovel();
            double valorFinanciamento = financiamento.calcularTotalPagamento();

            totalValorImoveis += valorImovelInd;
            totalValorFinanciamentos += valorFinanciamento;

            financiamento.mostrarDadosFinanciamento();
        }

        System.out.printf("Total de todos os imóveis: R$ %.2f%n", totalValorImoveis);
        System.out.printf("Total de todos os financiamentos: R$ %.2f%n", totalValorFinanciamentos);
    }
}
