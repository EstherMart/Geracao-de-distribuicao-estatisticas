public class Main {
    public static void main(String[] args) {
        DistribuicaoNormal dist = new DistribuicaoNormal(0, 1);
        dist.gerarValores(20);
        System.out.println("Média: " + dist.gerarMedia());
        System.out.println("Variância: " + dist.gerarVariancia());
        System.out.println("Desvio Padrão: " + dist.gerarDesvioPadrao());
    }
}
