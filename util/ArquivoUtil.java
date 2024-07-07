package util;

import modelo.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ArquivoUtil {
    public static void salvarFinanciamentosTexto(List<Financiamento> financiamentos, String nomeArquivo) throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Financiamento financiamento : financiamentos){
                writer.write(financiamento.toString());
                writer.newLine();
            }
        }

    } public static List<Financiamento> carregarFinanciamentosTexto(String nomeArquivo) throws IOException{
        List<Financiamento> financiamentos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))){
            String linha;
            while ((linha = reader.readLine()) != null){
                String[] partes = linha.split(",");
                String tipo = partes[0].trim();
                double valorImovel = Double.parseDouble(partes[1].trim());
                int prazoFinanciamento = Integer.parseInt(partes[2].trim());
                double taxaJurosAnual = Double.parseDouble(partes[3].trim());

                switch (tipo){
                    case "Casa":
                        double areaConstruida = Double.parseDouble(partes[4].trim());
                        double tamanhoTerreno = Double.parseDouble(partes[5].trim());
                        financiamentos.add(new Casa(valorImovel, prazoFinanciamento, taxaJurosAnual, areaConstruida, tamanhoTerreno));
                        break;
                    case "Apartamento":
                        int vagasGaragem = Integer.parseInt(partes[4].trim());
                        int numeroAndar = Integer.parseInt(partes[5].trim());
                        financiamentos.add(new Apartamento(valorImovel, prazoFinanciamento, taxaJurosAnual, vagasGaragem, numeroAndar));
                        break;
                    case "Terreno":
                        String tipoZona = partes[4].trim();
                        financiamentos.add(new Terreno(valorImovel, prazoFinanciamento, taxaJurosAnual, tipoZona));
                        break;
                }
            }
        }
        return financiamentos;
    }   

    public static void salvarFinanciamentosBinario(List<Financiamento> financiamentos, String nomeArquivo) throws IOException{
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(financiamentos);
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Financiamento> carregarFinanciamentosBinario(String nomeArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            return (List<Financiamento>) ois.readObject();
        }
    }
}
