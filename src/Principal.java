
    import java.util.ArrayList;

    //import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
    import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
    import br.com.alura.screenmatch.modelos.Filme;
    import br.com.alura.screenmatch.modelos.Serie;
    import br.com.alura.screenmatch.modelos.Episodio;

    public class Principal {
        public static void main(String[] args) {

            var filmeDoPaulo = new Filme();
            filmeDoPaulo.setNome("Dogville");
            filmeDoPaulo.setAnoDeLancamento(2003);
            filmeDoPaulo.setDuracaoEmMinutos(200);
            filmeDoPaulo.Avalia(10);

            Filme meuFilme = new Filme();
            meuFilme.setNome("Teste");
            meuFilme.setIncluidoNoPlano(true);
            meuFilme.setAnoDeLancamento(2022);
            meuFilme.setDuracaoEmMinutos(180);
            meuFilme.Avalia(2);
            meuFilme.Avalia(10);
            meuFilme.Avalia(5);

            Filme outroFilme = new Filme();
            outroFilme.setNome("Avatar");
            outroFilme.setIncluidoNoPlano(true);
            outroFilme.setAnoDeLancamento(2022);
            outroFilme.setDuracaoEmMinutos(1800);
            System.out.println(meuFilme.getDuracaoEmMinutos());
            System.out.println(outroFilme.getDuracaoEmMinutos());

            //CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

            //calculadora.inclui(meuFilme);
            //calculadora.inclui(outroFilme);
            //System.out.println(calculadora.getTempoTotal());
            
            
            meuFilme.setNome("O poderoso chefão");
            meuFilme.setAnoDeLancamento(1970);
            meuFilme.setDuracaoEmMinutos(180);
            meuFilme.setIncluidoNoPlano(true);
            
            meuFilme.Avalia(1);
            meuFilme.Avalia(2);
            meuFilme.Avalia(2);
            meuFilme.exibeFichaTecnica();
            //--------------------------------------------------------
            ArrayList<Filme> listaDeFilmes = new ArrayList<>();
            listaDeFilmes.add(filmeDoPaulo);
            listaDeFilmes.add(outroFilme);
            listaDeFilmes.add(meuFilme);
            System.out.println("Tamanho da lista: " + listaDeFilmes.size());
            System.out.println("Primeiro filme: " + listaDeFilmes.get(0).toString());
            System.out.println(listaDeFilmes);

            //-------------------------------------------------

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
            
            /*ContaBancaria continha = new ContaBancaria();
            continha.titular = "João Vitor";
            continha.setNumeroConta(1659871);
            continha.setSaldo(2500.00);
            continha.exibeFichaConta();

            IdadePessoa menor = new IdadePessoa();
            menor.setNome("Juca");
            menor.setIdade(17);
            System.out.println("Nome: " + menor.getNome() + "\nIdade: " + menor.getIdade());
            menor.verificarIdade();
            
            Produto produto = new Produto();
            produto.setNome("Candida");
            produto.setPreco(20);
            produto.aplicarDesconto(10);
            System.out.println(produto.getPreco());

            Livro arte = new Livro();
            arte.setTitulo("Qualquer pessoa");
            arte.setAutor("Qualquer nome: ");
            arte.exibeLivro();*/

            Serie lost = new Serie();
            lost.setNome("Lost");
            lost.setAnoDeLancamento(2000);
            lost.setTemporadas(10);
            lost.setEpisodiosPorTemporada(10); 
            lost.setMinutosPorEpisodio(50);
            System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());
        
            //calculadora.inclui(lost);
            //System.out.println(calculadora.getTempoTotal());

            FiltroRecomendacao filtro = new FiltroRecomendacao();
            filtro.filtra(meuFilme);

            Episodio episodio = new Episodio();
            episodio.setNumero(1);
            episodio.setSerie(lost);
            episodio.setTotalVisualizacoes(300);
            filtro.filtra(episodio);
            
            //ConversorMoeda moeda = new ConversorMoeda();
            //System.out.println(moeda.converterDolarParaReal(10));

            //CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular(5.0, 3.0);
            //System.out.println(sala.calcularArea());
            //System.out.println(sala.calcularPerimetro());
            
        
        //TabuadaMultiplicacao tabuadaum = new TabuadaMultiplicacao();
        //tabuadaum.mostrarTabuada(7);
        /*Pessoa pessoa1 = new Pessoa();
        pessoa1.setNomew("João");
        pessoa1.setIdadew(25);
        

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNomew("Felipe");
        pessoa2.setIdadew(15);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNomew("Carla");
        pessoa3.setIdadew(20);
        

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println(listaDePessoas.size() + listaDePessoas.toString());*/


        }
    }
