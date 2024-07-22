import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DistribuicaoExponencial extends Distribuicao {
   private double media;
    private double variancia;
    private double desvioPadrao;
    private List<Double> valores;
    private double mediaAmostral;
    private double desvioPadraoAmostral;
  private double lambda;

    Random random = new Random();

    public DistribuicaoNormal(double mediaAmostral, double varianciaAmostral) {
        this.mediaAmostral = mediaAmostral;
        desvioPadraoAmostral = Math.sqrt(varianciaAmostral);
    }

    public double gerarValor (){
        return (mediaAmostral + desvioPadraoAmostral * gerarBoxMuller());
    }
