public class ProdutoPerecivel extends Produto {
    public String dataDeValidade;

    @Override
    public String toString() {
        return "\nNome: " + getNome()
             + "\nPreço: " + getPreco()
             + "\nQuantidade: " + getQuantidade()
             + "\nData de validade: " + dataDeValidade;
    }
    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataDeValidade){
        super(nome, preco, quantidade);
        this.dataDeValidade = dataDeValidade;
    };
}
