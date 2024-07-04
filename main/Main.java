package main;

import modelo.Financiamento;
import modelo.Casa;
import modelo.DescontoMaiorQueJurosException;
import modelo.Apartamento;
import modelo.Terreno;
import util.InterfaceUsuario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Financiamento> financiamentos = new ArrayList<>();
        InterfaceUsuario iu = new InterfaceUsuario();

        // pedindo dados para exemplo
        double valorImovel = iu.pedirValorImovel();
        int prazoFinanciamento = iu.pedirPrazoFinanciamento();
        double taxaJurosAnual = iu.pedirTaxaJuros();
        double areaConstruida = 150.0;
        double tamanhoTerreno = 200.0;

        //exemplo
        try {
            Casa casa = new Casa(valorImovel, prazoFinanciamento, taxaJurosAnual, areaConstruida, tamanhoTerreno);
            casa.aplicarDesconto(100.0); 
            financiamentos.add(casa);
        } catch (DescontoMaiorQueJurosException e) {
            System.out.println(e.getMessage());
        }

        // testando outros financiamentos
        financiamentos.add(new Casa(200000, 20, 5.0, 150, 200)); 
        financiamentos.add(new Apartamento(300000, 25, 6.0, 2, 10)); 
        financiamentos.add(new Apartamento(150000, 15, 4.5, 1, 5));
        financiamentos.add(new Terreno(250000, 30, 5.5, "residencial")); 

        // calculando totais
        double totalValorImoveis = 0;
        double totalValorFinanciamentos = 0;
        for (Financiamento financiamento : financiamentos) {
            totalValorImoveis += financiamento.getValorImovel();
            totalValorFinanciamentos += financiamento.calcularTotalPagamento();
        }

        // Mostrando resultados
        System.out.println("Total de todos os imóveis: R$ " + totalValorImoveis);
        System.out.println("Total de todos os financiamentos: R$ " + totalValorFinanciamentos);
    }
}
