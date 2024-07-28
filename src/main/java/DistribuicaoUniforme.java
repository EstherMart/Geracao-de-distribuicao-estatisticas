import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DistribuicaoUniforme extends Distribuicao {
    private double minimo;
    private double maximo;
    private List<Double> valores;

    Random random = new Random();

    public DistribuicaoUniforme(double minimo, double maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

    @Override
    public List<Double> gerarValores(int n) {
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