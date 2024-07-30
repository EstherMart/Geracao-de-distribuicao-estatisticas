package com.calculadora;
import java.util.List;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        DistribuicaoNormal distribuicaoNormal = new DistribuicaoNormal(0, 1);
        DistribuicaoUniforme distribuicaoUniforme = new DistribuicaoUniforme(0, 1);
        DistribuicaoExponencial distribuicaoExponencial = new DistribuicaoExponencial(1);
        DistribuicaoPoisson distribuicaoPoisson = new DistribuicaoPoisson(2);

        Estatisticas<DistribuicaoNormal> estatisticasNormal = new Estatisticas<>(distribuicaoNormal);
        Estatisticas<DistribuicaoUniforme> estatisticasUniforme = new Estatisticas<>(distribuicaoUniforme);
        Estatisticas<DistribuicaoExponencial> estatisticasExponencial = new Estatisticas<>(distribuicaoExponencial);
        Estatisticas<DistribuicaoPoisson> estatisticasPoisson = new Estatisticas<>(distribuicaoPoisson);

        System.out.println("Distribuição Normal:");
        estatisticasNormal.imprimirValoresGerados(5);
        estatisticasNormal.imprimirMedia();
        estatisticasNormal.imprimirVariancia();
        // estatisticasNormal.imprimirDesvioPadrao(); // Adicionado devido especificação do projeto

        System.out.println("\nDistribuição Uniforme:");
        estatisticasUniforme.imprimirValoresGerados(5);
        estatisticasUniforme.imprimirMedia();
        estatisticasUniforme.imprimirVariancia();
        // estatisticasUniforme.imprimirDesvioPadrao(); // Adicionado devido especificação do projeto

        System.out.println("\nDistribuição Exponencial:");
        estatisticasExponencial.imprimirValoresGerados(5);
        estatisticasExponencial.imprimirMedia();
        estatisticasExponencial.imprimirVariancia();
        // estatisticasExponencial.imprimirDesvioPadrao(); // Adicionado devido especificação do projeto

        System.out.println("\nDistribuição Poisson:");
        estatisticasPoisson.imprimirValoresGerados(5);
        estatisticasPoisson.imprimirMedia();
        estatisticasPoisson.imprimirVariancia();
        // estatisticasPoisson.imprimirDesvioPadrao(); // Adicionado devido especificação do projeto

        List<Double> valores1 = estatisticasNormal.getValores();
        List<Double> valores2 = estatisticasNormal.getValores();
        List<Double> valores3 = estatisticasNormal.getValores();
        List<Double> valores4 = estatisticasNormal.getValores();

        double[] valoresVetor1 = valores1.stream().mapToDouble(Double::doubleValue).toArray();
        double[] valoresVetor2 = valores2.stream().mapToDouble(Double::doubleValue).toArray();
        double[] valoresVetor3 = valores3.stream().mapToDouble(Double::doubleValue).toArray();
        double[] valoresVetor4 = valores4.stream().mapToDouble(Double::doubleValue).toArray();

        JFrame janelaPrincipal = JanelaPrincipal.CriarJanelaPrincipal(valoresVetor1, valoresVetor2, valoresVetor3, valoresVetor4);
        janelaPrincipal.setVisible(true);
    }
}
