public class Main {

    public static void main(String[] args) {

        DistribuicaoNormal distribuicaoNormal = new DistribuicaoNormal(0, 1);

        Estatisticas<DistribuicaoNormal> estatisticasNormal = new Estatisticas<>(distribuicaoNormal);

        System.out.println("Distribuição Normal:");
        estatisticasNormal.imprimirValoresGerados(100);
        estatisticasNormal.imprimirMedia();
        estatisticasNormal.imprimirVariancia();
    

    }
}

