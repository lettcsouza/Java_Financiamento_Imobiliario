import java.util.Scanner;


public class InterfaceUsuario {
    private Scanner sc;

    public InterfaceUsuario() {
        this.sc = new Scanner(System.in);
    }   

    public double pedirValorImovel() {
        System.out.print("Digite o valor do imóvel: ");
        return sc.nextDouble();
    }

    public int pedirPrazoFinanciamento() {
        System.out.print("Digite o prazo de financiamento em ANOS: ");
        return sc.nextInt();
    }

    public double pedirTaxaJuros() {
        System.out.print("Digite a taxa de Juros Anual (%): ");
        return sc.nextDouble();
    }
}