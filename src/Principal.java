public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.Avalia(8);
        meuFilme.Avalia(5);
        meuFilme.Avalia(10);
        meuFilme.exibeFichaTecnica();
//        System.out.println(meuFilme.somaAvaliacoes);
//        System.out.println(meuFilme.totalDeAvaliacoes);
//        System.out.println(meuFilme.pegaMedia());

        //------------------------------------------------
        //Desafio Simples
        Filme desafio = new Filme();
        desafio.nome = "A fuga das galinhas";
        desafio.anoDeLancamento = 2022;
        desafio.duracaoEmMinutos = 150;
        desafio.incluidoNoPlano = true;

        desafio.Avalia(1);
        desafio.Avalia(10);
        desafio.Avalia(8);
        desafio.Avalia(6);

        desafio.exibeFichaTecnica();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.olaMundo();

        Calculadora calc = new Calculadora();
        calc.numero = 2;
        System.out.println("O dobro do número " + calc.numero + " é " + calc.dobroNumero());

//        System.out.println(desafio.somaAvaliacoes);
//        System.out.println(desafio.totalDeAvaliacoes);
//        System.out.println(desafio.pegaMedia());


    }
}
