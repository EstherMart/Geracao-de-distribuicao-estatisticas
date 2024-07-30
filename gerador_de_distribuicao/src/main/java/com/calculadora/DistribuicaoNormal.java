package com.calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DistribuicaoNormal extends Distribuicao {
    private double media;
    private double variancia;
    private double desvioPadrao;
    private List<Double> valores;
    private double mediaAmostral;
    private double desvioPadraoAmostral;

    Random random = new Random();

    public List<Double> getValores() {
        return valores;
    }
    
    public DistribuicaoNormal(double mediaAmostral, double varianciaAmostral) {
        if (varianciaAmostral < 0) {
            throw new IllegalArgumentException("Variância amostral não pode ser negativa");
        }
        this.mediaAmostral = mediaAmostral;
        desvioPadraoAmostral = Math.sqrt(varianciaAmostral);
    }

    public double gerarValor() {
        return (mediaAmostral + desvioPadraoAmostral * gerarBoxMuller());
    }

    @Override
    public List<Double> gerarValores(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("O número de valores a serem gerados deve maior que 0");
        }
        valores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            valores.add(gerarValor());
        }
        return valores;
    }

    @Override
    public double gerarMedia() {
        if (valores == null || valores.isEmpty()) {
            throw new IllegalStateException("A lista de valores está vazia");
        }
        if (somar_valores(valores) == 0) {
            throw new IllegalStateException("A soma dos valores é zero");
        }
        double soma_valores = somar_valores(valores);
        media = soma_valores / valores.size();
        return media;
    }

    @Override
    public double gerarVariancia() {
        if (valores == null || valores.isEmpty()) {
            throw new IllegalStateException("A lista de valores está vazia");
        }
        media = gerarMedia();
        double soma_quadrados = somar_quadrados(valores, media);
        variancia = soma_quadrados / (valores.size() - 1);
        return variancia;
    }

    @Override
    public double gerarDesvioPadrao() {
        if (valores == null || valores.isEmpty()) {
            throw new IllegalStateException("A lista de valores está vazia");
        }
        desvioPadrao = Math.sqrt(gerarVariancia());
        if (variancia == 0) {
            throw new IllegalStateException("A variância é zero, não é possível calcular o desvio padrão");
        }
        return desvioPadrao;
    }

    public double gerarBoxMuller() {
        double u1 = random.nextDouble();
        double u2 = random.nextDouble();
        return Math.sqrt(-2 * Math.log(u1)) * Math.cos(2 * Math.PI * u2);
    }

    private double somar_valores(List<Double> valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma;
    }

    private double somar_quadrados(List<Double> valores, double media) {
        double soma = 0;
        for (double valor : valores) {
            soma += Math.pow(valor - media, 2);
        }
        return soma;
    }
}
