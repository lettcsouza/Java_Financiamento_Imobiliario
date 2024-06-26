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

    public double pedirAreaConstruida() {
        double areaConstruida = -1;
        do {
            System.out.print("Digite a área construída em m² (valor positivo): ");
            areaConstruida = sc.nextDouble();
            if (areaConstruida <= 0) {
                System.out.println("Área construída inválida. Por favor, digite um valor positivo.");
            }
        } while (areaConstruida <= 0);
        return areaConstruida;
    }

    public double pedirTamanhoTerreno() {
        double tamanhoTerreno = -1;
        do {
            System.out.print("Digite o tamanho do terreno em m² (valor positivo): ");
            tamanhoTerreno = sc.nextDouble();
            if (tamanhoTerreno <= 0) {
                System.out.println("Tamanho do terreno inválido. Por favor, digite um valor positivo.");
            }
        } while (tamanhoTerreno <= 0);
        return tamanhoTerreno;
    }

    public int pedirNumVagasGaragem() {
        int numVagasGaragem = -1;
        do {
            System.out.print("Digite o número de vagas na garagem (valor positivo): ");
            numVagasGaragem = sc.nextInt();
            if (numVagasGaragem <= 0) {
                System.out.println("Número de vagas inválido. Por favor, digite um valor positivo.");
            }
        } while (numVagasGaragem <= 0);
        return numVagasGaragem;
    }

    public int pedirNumAndar() {
        int numAndar = -1;
        do {
            System.out.print("Digite o número do andar (valor positivo): ");
            numAndar = sc.nextInt();
            if (numAndar <= 0) {
                System.out.println("Número do andar inválido. Por favor, digite um valor positivo.");
            }
        } while (numAndar <= 0);
        return numAndar;
    }

    public String pedirTipoZona() {
        String tipoZona = "";
        do {
            System.out.print("Digite o tipo de zona (residencial ou comercial): ");
            tipoZona = sc.next();
            if (!tipoZona.equalsIgnoreCase("residencial") && !tipoZona.equalsIgnoreCase("comercial")) {
                System.out.println("Tipo de zona inválido. Por favor, digite 'residencial' ou 'comercial'.");
            }
        } while (!tipoZona.equalsIgnoreCase("residencial") && !tipoZona.equalsIgnoreCase("comercial"));
        return tipoZona;
    }
}
