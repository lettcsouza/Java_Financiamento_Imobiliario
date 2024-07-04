package util;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InterfaceUsuario {
    private Scanner sc;

    public InterfaceUsuario() {
        this.sc = new Scanner(System.in);
    }   

    public double pedirValorImovel() {
        double valorImovel = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("Digite o valor do imóvel: ");
                valorImovel = sc.nextDouble();
                if (valorImovel <= 0) {
                    throw new IllegalArgumentException("O valor do imóvel deve ser positivo.");
                }
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                sc.next(); // Limpa o scanner
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return valorImovel;
    }

    public int pedirPrazoFinanciamento() {
        int prazoFinanciamento = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("Digite o prazo de financiamento em ANOS: ");
                prazoFinanciamento = sc.nextInt();
                if (prazoFinanciamento <= 0) {
                    throw new IllegalArgumentException("O prazo do financiamento deve ser positivo.");
                }
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                sc.next(); // Limpa o scanner
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return prazoFinanciamento;
    }

    public double pedirTaxaJuros() {
        double taxaJurosAnual = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("Digite a taxa de Juros Anual (%): ");
                taxaJurosAnual = sc.nextDouble();
                if (taxaJurosAnual <= 0) {
                    throw new IllegalArgumentException("A taxa de juros deve ser positiva.");
                }
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                sc.next(); // Limpa o scanner
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return taxaJurosAnual;
    }
}
