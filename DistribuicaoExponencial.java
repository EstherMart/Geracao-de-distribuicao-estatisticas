import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DistribuicaoExponencial extends Distribuicao {
    private double lambda;
    private Random random;

    public DistribuicaoExponencial(double lambda) {
        if (lambda <= 0) {
            throw new IllegalArgumentException("Lambda tem que ser maior que 0");
        }
        this.lambda = lambda;
        this.random = new Random();
    }

    @Override
    public double gerarMedia() {
        return 1 / lambda;
    }

    @Override
    public double gerarVariancia() {
        return 1 / (lambda * lambda);
    }

    @Override
    public double gerarDesvioPadrao() {
        return Math.sqrt(gerarVariancia());
    }

    @Override
    public List<Double> gerarValores(int n) {
        List<Double> valores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double u = random.nextDouble();
            double valor = -Math.log(1 - u) / lambda;
            valores.add(valor);
        }
        return valores;
    }
}
