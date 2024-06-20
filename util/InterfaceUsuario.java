package util;

import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner sc;

    public InterfaceUsuario() {
        this.sc = new Scanner(System.in);
    }

    public double pedirValorImovel() {
        double valorImovel = -1;
        do {
            System.out.print("Digite o valor do imóvel (valor positivo): ");
            valorImovel = sc.nextDouble();
            if (valorImovel <= 0) {
                System.out.println("Valor inválido. Por favor, digite um valor positivo.");
            }
        } while (valorImovel <= 0);
        return valorImovel;
    }

    public int pedirPrazoFinanciamento() {
        int prazoFinanciamento = -1;
        do {
            System.out.print("Digite o prazo de financiamento em ANOS (valor positivo): ");
            prazoFinanciamento = sc.nextInt();
            if (prazoFinanciamento <= 0) {
                System.out.println("Prazo inválido. Por favor, digite um valor positivo.");
            }
        } while (prazoFinanciamento <= 0);
        return prazoFinanciamento;
    }

    public double pedirTaxaJuros() {
        double taxaJurosAnual = -1;
        do {
            System.out.print("Digite a taxa de Juros Anual (%) (valor positivo): ");
            taxaJurosAnual = sc.nextDouble();
            if (taxaJurosAnual <= 0) {
                System.out.println("Taxa de juros inválida. Por favor, digite um valor positivo.");
            }
        } while (taxaJurosAnual <= 0);
        return taxaJurosAnual;
    }
}
