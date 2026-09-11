public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    double numAvaliacoes;

    void exibeDetalhes(){
        System.out.println("\nTitulo da musica: " + titulo + "\nArtista: " + artista + "\nAno de lançamento: " + anoLancamento + "\nAvaliações: "
         + mediaAvaliacoes() + "\nNúmero totais de avaliações: " + numAvaliacoes);
    }
    void avaliacoesMusic(double nota){
        avaliacao = avaliacao + nota;
        numAvaliacoes++;
    }
    double mediaAvaliacoes(){
        return avaliacao / numAvaliacoes;
    }
}
