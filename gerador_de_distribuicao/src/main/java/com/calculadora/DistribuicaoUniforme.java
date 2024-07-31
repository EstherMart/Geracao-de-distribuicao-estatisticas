package com.calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DistribuicaoUniforme extends Distribuicao {
    private double minimo;
    private double maximo;
    private List<Double> valores;

    Random random = new Random();

    public List<Double> getValores() {
        return valores;
    }

    public DistribuicaoUniforme(double minimo, double maximo) {
        if (minimo >= maximo) {
            throw new IllegalArgumentException("O valor mínimo tem que ser menor que o valor máximo");
        }
        this.minimo = minimo;
        this.maximo = maximo;
    }

    @Override
    public List<Double> gerarValores(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número de valores deve ser maior que 0");
        }
        valores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            valores.add(gerarValor());
        }
        return valores;
    }

    @Override
    public double gerarMedia() {
        return (minimo + maximo) / 2;
    }

    @Override
    public double gerarVariancia() {
        return Math.pow(maximo - minimo, 2) / 12;
    }

    @Override
    public double gerarDesvioPadrao() {
        return Math.sqrt(gerarVariancia());
    }

    public double gerarValor() {
        return minimo + (maximo - minimo) * random.nextDouble();
    }
}
