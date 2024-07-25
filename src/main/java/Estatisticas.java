public class Estatisticas<T extends Distribuicao> {
    private T tipoDeDistribuicao;

    public Estatisticas(T tipoDeDistribuicao) {
        this.tipoDeDistribuicao = tipoDeDistribuicao;
    }

    public void imprimirValoresGerados(int n) {
        System.out.println(tipoDeDistribuicao.gerarValores(n));
    }

    public void imprimirMedia() {
        System.out.println(tipoDeDistribuicao.gerarMedia());
    }

    public void imprimirVariancia() {
        System.out.println(tipoDeDistribuicao.gerarVariancia());
    }

    public void imprimirDesvioPadrao() {
        System.out.println(tipoDeDistribuicao.gerarDesvioPadrao());
    }
}



