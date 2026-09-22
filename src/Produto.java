public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        return "\nNome: " + getNome() + "\n Preço: " + getPreco() + "\n Quantidade: " + getQuantidade();
    }
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
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void aplicarDesconto(double percentual){
        double desconto = preco * (percentual / 100);
        preco = preco - desconto;
    }
    
}
