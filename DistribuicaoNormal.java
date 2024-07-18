import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DistribuicaoNormal extends Distribuicao {
    private double media;
    private double variancia;
    private double desvioPadrao;
    private List<Double> valores;

    Random random = new Random();

    public DistribuicaoNormal(double media, double variancia) {
        this.media = media;
        this.variancia = variancia;
        this.desvioPadrao = Math.sqrt(variancia);
    }

    public double gerarValor (){
        return (media + desvioPadrao * gerarBoxMuller());
    }

    @Override
    public List<Double> gerarValores(int n) {
        valores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            valores.add(gerarValor());
        }
        System.out.println(valores);
        return valores;
    }

    @Override
    public double gerarMedia() {
        double soma_valores = somar_valores(this.valores);
        return soma_valores / this.valores.size();
    }

    @Override
    public double gerarVariancia() {
        double media = gerarMedia();
        double soma_quadrados = somar_quadrados(this.valores, media);
        System.out.println(soma_quadrados);
        return soma_quadrados / this.valores.size();
    }

    @Override
    public double gerarDesvioPadrao() {
        return Math.sqrt(gerarVariancia());
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
            soma += Math.pow(valor-media, 2);
        }
        return soma;
    }

    


}
