public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluido no plano atual? " + incluidoNoPlano);
        System.out.println("Soma das avaliações finais: " + somaAvaliacoes);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
        System.out.println();

    }

    void Avalia(double nota){
        somaAvaliacoes = somaAvaliacoes + nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
      return somaAvaliacoes / totalDeAvaliacoes;
    }

}
