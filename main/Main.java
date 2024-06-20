package main;

import modelo.Financiamento;
import util.InterfaceUsuario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        // Adicionando financiamentos
        financiamentos.add(new Financiamento(interfaceUsuario.pedirValorImovel(), interfaceUsuario.pedirPrazoFinanciamento(), interfaceUsuario.pedirTaxaJuros()));
        financiamentos.add(new Financiamento(interfaceUsuario.pedirValorImovel(), interfaceUsuario.pedirPrazoFinanciamento(), interfaceUsuario.pedirTaxaJuros()));
        financiamentos.add(new Financiamento(interfaceUsuario.pedirValorImovel(), interfaceUsuario.pedirPrazoFinanciamento(), interfaceUsuario.pedirTaxaJuros()));
        financiamentos.add(new Financiamento(interfaceUsuario.pedirValorImovel(), interfaceUsuario.pedirPrazoFinanciamento(), interfaceUsuario.pedirTaxaJuros()));

        double totalValorImoveis = 0;
        double totalValorFinanciamentos = 0;

        // Calculando os totais
        for (Financiamento financiamento : financiamentos) {
            double valorImovel = financiamento.getValorImovel();
            double valorFinanciamento = financiamento.calcularTotalPagamento();

            totalValorImoveis += valorImovel;
            totalValorFinanciamentos += valorFinanciamento;

            financiamento.mostrarDadosFinanciamento();
        }

        System.out.printf("Total de todos os imóveis: R$ %.2f%n", totalValorImoveis);
        System.out.printf("Total de todos os financiamentos: R$ %.2f%n", totalValorFinanciamentos);
    }
}
