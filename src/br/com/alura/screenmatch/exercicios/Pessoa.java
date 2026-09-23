package br.com.alura.screenmatch.exercicios;
public class Pessoa {
    private String nomew;
    private int idadew;

    @Override
    public String toString() {
        return "\nNome: " + this.nomew + "\nIdade: " + this.idadew;
    }

    public void olaMundo(){
        System.out.println("Olá Mundo!");
    }
    public int getIdadew() {
        return idadew;
    }
    public String getNomew() {
        return nomew;
    }
    public void setIdadew(int idadew) {
        this.idadew = idadew;
    }
    public void setNomew(String nomew) {
        this.nomew = nomew;
    }
}
