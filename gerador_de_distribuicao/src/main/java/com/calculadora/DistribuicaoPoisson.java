package com.calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DistribuicaoPoisson extends Distribuicao {
    
    private double lambda;
    private Random random = new Random();

    public List<Double> getValores() {
        return null;
    }

    // Construtor com validação para lambda
    public DistribuicaoPoisson(double lambda) {
        if (lambda <= 0) {
            throw new IllegalArgumentException("O valor de lambda deve ser diferente de 0.");
        }
        this.lambda = lambda;
    }

    public double getLambda() {
        return lambda;
    }

    @Override
    public double gerarMedia() {
        return lambda;
    }

    @Override
    public double gerarVariancia() {
        return lambda;
    }

    @Override
    public double gerarDesvioPadrao() {
        return Math.sqrt(lambda);
    }

    @Override
    public List<Double> gerarValores(int n) {
        List<Double> valores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            valores.add((double) gerarPoisson(lambda));
        }
        return valores;
    }

    private int gerarPoisson(double lambda) {
        double L = Math.exp(-lambda);
        int k = 0;
        double p = 1.0;
        do {
            k++;
            p *= random.nextDouble();
        } while (p > L);
        return k - 1;
    }
    
}
