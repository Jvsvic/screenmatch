public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preço) {
        this.preco = preço;
    }

    public void aplicarDesconto(double percentual){
        double desconto = preco * (percentual / 100);
        preco = preco - desconto;
    }
    
}
