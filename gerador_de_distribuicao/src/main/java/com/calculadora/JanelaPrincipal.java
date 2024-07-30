package com.calculadora;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.ui.RefineryUtilities;

public class JanelaPrincipal {
    public static JFrame CriarJanelaPrincipal(double[] valoresArray1, double[] valoresArray2, double[] valoresArray3, double[] valoresArray4) {
        GraficoDistribuicao grafico1 = new GraficoDistribuicao("Distribuição Normal", valoresArray1);
        GraficoDistribuicao grafico2 = new GraficoDistribuicao("Distribuição Uniforme", valoresArray2);
        GraficoDistribuicao grafico3 = new GraficoDistribuicao("Distribuição Exponencial", valoresArray3);
        GraficoDistribuicao grafico4 = new GraficoDistribuicao("Distribuição Poisson", valoresArray4);

        JPanel painel = new JPanel(new GridLayout(2, 2));
        painel.add(grafico1.getContentPane());
        painel.add(grafico2.getContentPane());
        painel.add(grafico3.getContentPane());
        painel.add(grafico4.getContentPane());

        JFrame janela = new JFrame("Distribuições Normais");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setContentPane(painel);
        janela.pack();
        RefineryUtilities.centerFrameOnScreen(janela);

        return janela;
    }
}