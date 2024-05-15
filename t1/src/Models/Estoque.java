package Models;

public class Estoque {
	private int quantidade;
	private double preco;
	private Produto produto;
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public void setEstoque(int quantidade, double preco, Produto produto) {
		setQuantidade(quantidade);
		setPreco(preco);
		setProduto(produto);
	}
	public void getEstoque() {
		System.out.println("--- Estoque ---");
		System.out.println("Quantidade: "+getQuantidade());
		System.out.println("Preço: "+getPreco());
	}
}
