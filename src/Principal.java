import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.Avalia(8);
        meuFilme.Avalia(5);
        meuFilme.Avalia(10);
        meuFilme.exibeFichaTecnica();



        // System.out.println(meuFilme.somaAvaliacoes);
        // System.out.println(meuFilme.totalDeAvaliacoes);
        // System.out.println(meuFilme.pegaMedia());

        // ------------------------------------------------
        // Desafio Simples
        /*
         * Filme desafio = new Filme();
         * desafio.nome = "A fuga das galinhas";
         * desafio.anoDeLancamento = 2022;
         * desafio.duracaoEmMinutos = 150;
         * desafio.incluidoNoPlano = true;
         * 
         * desafio.Avalia(1);
         * desafio.Avalia(10);
         * desafio.Avalia(8);
         * desafio.Avalia(6);
         * 
         * desafio.exibeFichaTecnica();
         * 
         * Pessoa pessoa1 = new Pessoa();
         * pessoa1.olaMundo();
         * 
         * Calculadora calc = new Calculadora();
         * calc.numero = 2;
         * System.out.println("O dobro do número " + calc.numero + " é " +
         * calc.dobroNumero());
         * 
         * Musica musica1 = new Musica();
         * musica1.titulo = "Starboy";
         * musica1.anoLancamento = 2022;
         * musica1.artista = "The Weeknd";
         * musica1.avaliacoesMusic(2.0);
         * musica1.avaliacoesMusic(3.5);
         * musica1.avaliacoesMusic(10);
         * musica1.exibeDetalhes();
         * 
         * Carro corola = new Carro();
         * corola.modelo = "Corolla";
         * corola.ano = 2025;
         * corola.cor = "Prata";
         * corola.qualCarro();
         * System.out.println(corola.idadeCarro());
         * 
         * 
         * Aluno joao = new Aluno();
         * joao.nome = "João Vitor";
         * joao.idade = 25;
         * joao.exibeAluno();//*
         * 
         * System.out.println(desafio.somaAvaliacoes);
         * System.out.println(desafio.totalDeAvaliacoes);
         * System.out.println(desafio.pegaMedia());
         */

    }
}
