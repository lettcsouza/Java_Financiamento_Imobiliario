package main;

import modelo.Financiamento;
import modelo.Apartamento;
import modelo.Terreno;
import modelo.Casa;
import util.InterfaceUsuario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        InterfaceUsuario ui = new InterfaceUsuario();

        //pedindo dados ao usuário
        double valorImovel = ui.pedirValorImovel();
        int prazoFinanciamento = ui.pedirPrazoFinanciamento();
        double taxaJurosAnual = ui.pedirTaxaJuros();

        //testando com exemplos
        financiamentos.add(new Casa(valorImovel, prazoFinanciamento, taxaJurosAnual)); //usuário
        financiamentos.add(new Casa(200000, 20, 5.0)); 
        financiamentos.add(new Apartamento(300000, 25, 6.0)); 
        financiamentos.add(new Apartamento(150000, 15, 4.5)); 
        financiamentos.add(new Terreno(250000, 30, 5.5)); 


        double totalValorImoveis = 0;
        double totalValorFinanciamentos = 0;

        //calculando os totais
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

