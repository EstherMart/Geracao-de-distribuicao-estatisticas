public class Main {

    public static void main(String[] args) {

        DistribuicaoNormal distribuicaoNormal = new DistribuicaoNormal(0, 1);

        Estatisticas<DistribuicaoNormal> estatisticasNormal = new Estatisticas<>(distribuicaoNormal);

        System.out.println("Distribuição Normal:");
        estatisticasNormal.imprimirValoresGerados(5);
        estatisticasNormal.imprimirMedia();
        estatisticasNormal.imprimirVariancia();

        DistribuicaoUniforme distribuicaoUniforme = new DistribuicaoUniforme(0, 1);
        Estatisticas<DistribuicaoUniforme> estatisticasUniforme = new Estatisticas<>(distribuicaoUniforme);

        System.out.println("\nDistribuição Uniforme:");
        estatisticasUniforme.imprimirValoresGerados(5);
        estatisticasUniforme.imprimirMedia();
        estatisticasUniforme.imprimirVariancia();

        /*System.out.println("\nDistribuição Exponencial:");
        estatisticasExponencial.imprimirValoresGerados(5);
        estatisticasExponencial.imprimirMedia();
        estatisticasExponencial.imprimirVariancia();

        System.out.println("\nDistribuição Poisson:");
        estatisticasPoisson.imprimirValoresGerados(5);
        estatisticasPoisson.imprimirMedia();
        estatisticasPoisson.imprimirVariancia();*/


    }
}

