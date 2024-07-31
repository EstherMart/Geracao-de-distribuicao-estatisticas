package com.calculadora;

import java.util.List;

public abstract class Distribuicao {
    public abstract double gerarMedia();
    public abstract double gerarVariancia();
    public abstract double gerarDesvioPadrao();
    public abstract List<Double> gerarValores(int n);
    protected abstract List<Double> getValores();
}