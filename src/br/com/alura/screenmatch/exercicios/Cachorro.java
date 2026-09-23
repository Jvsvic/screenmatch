package br.com.alura.screenmatch.exercicios;

public class Cachorro extends Animal {
    private String nome;
    private String raca;


   public Cachorro(String nome, String raca) {
    super(nome,raca);
    this.nome = nome;
    this.raca = raca;
}
    


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getNome() {
        return nome;
    }
    public String getRaca() {
        return raca;
    }
    @Override
    public String toString() {
        return getNome() + " " + getRaca();
    }

}
