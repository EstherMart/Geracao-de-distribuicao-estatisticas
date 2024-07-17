import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DistibuicaoNormal extends Distribuicao {
    private double media;
    private double variancia;
    private double desvioPadrao;

    Random random = new Random();

    public DistibuicaoNormal(double media, double variancia) {
        this.media = media;
        this.variancia = variancia;
        this.desvioPadrao = Math.sqrt(variancia);
    }

    public double gerarValor (){
        return (media + desvioPadrao * gerarBoxMuller());
    }

    @Override
    public List<Double> gerarValores(int n) {
        List<Double> valores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            valores.add(gerarValor());
        }
        return valores;
    }
    //implementar
    @Override
    public double gerarMedia() {
        return media;
    }
    //implementar
    @Override
    public double gerarVariancia() {
        return variancia;
    }
    //implementar
    @Override
    public double gerarDesvioPadrao() {
        return desvioPadrao;
    }

    public double gerarBoxMuller() {
        double u1 = random.nextDouble();
        double u2 = random.nextDouble();
        return Math.sqrt(-2 * Math.log(u1)) * Math.cos(2 * Math.PI * u2);
    }

    


}
