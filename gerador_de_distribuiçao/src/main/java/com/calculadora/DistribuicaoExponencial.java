package com.calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DistribuicaoExponencial extends Distribuicao {
    private double lambda;
    private Random random;
    private List<Double> valores;

    public List<Double> getValores() {
        return valores;
    }

    public DistribuicaoExponencial(double lambda) {
        if (lambda <= 0) {
            throw new IllegalArgumentException("Lambda tem que ser maior que 0");
        }
        this.lambda = lambda;
        this.random = new Random();
    }

    @Override
    public double gerarDesvioPadrao() {
        return Math.sqrt(gerarVariancia());
    }

    @Override
    public double gerarVariancia() {
        return 1 / (lambda * lambda);
        
    }

    @Override
    public double gerarMedia() {
        return 1 / lambda;
    }

    @Override
    public List<Double> gerarValores(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número de valores deve ser maior ou igual a 0.");
        }
        valores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double u = random.nextDouble();
            double valor = -Math.log(1 - u) / lambda;
            valores.add(valor);
        }
        return valores;
    }
}