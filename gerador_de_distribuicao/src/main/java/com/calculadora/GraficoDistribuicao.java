package com.calculadora;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.statistics.HistogramDataset;

public class GraficoDistribuicao extends javax.swing.JFrame {
    
    public GraficoDistribuicao(String titulo, double[] valores) {
        super(titulo);
        JFreeChart grafico = criarGrafico(criarConjuntoDados(valores));
        ChartPanel painelGrafico = new ChartPanel(grafico);
        painelGrafico.setPreferredSize(new java.awt.Dimension(800, 600));
        setContentPane(painelGrafico);
    }

    private HistogramDataset criarConjuntoDados(double[] valores) {
        HistogramDataset conjuntoDados = new HistogramDataset();
        conjuntoDados.addSeries("Normal Distribution", valores, 50);
        return conjuntoDados;
    }

    private JFreeChart criarGrafico(HistogramDataset conjuntoDados) {
        JFreeChart grafico = ChartFactory.createHistogram(
                "Distribuição Normal",
                "Valor",
                "Frequência",
                conjuntoDados,
                PlotOrientation.VERTICAL,
                false,
                true,
                false
        );

        XYPlot plot = (XYPlot) grafico.getPlot();
        XYLineAndShapeRenderer renderizador = new XYLineAndShapeRenderer();
        plot.setRenderer(renderizador);
        return grafico;
    }
}
