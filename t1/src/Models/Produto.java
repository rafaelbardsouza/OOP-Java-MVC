package Models;

public class Produto {
	private String nome;
	private String descricao;
	public Fornecedor fornecedor;
	public Estoque estoque;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Estoque getEstoque() {
		return estoque;
	}
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	public void setProduto(String nome, String descricao, Fornecedor fornecedor, Estoque estoque) {
		setNome(nome);
		setDescricao(descricao);
		setFornecedor(fornecedor);
		setEstoque(estoque);
	}
	public void getProduto() {
		System.out.println("--- Produto ---");
		System.out.println("Nome "+ getNome());
		System.out.println("Descrição "+ getDescricao());
		
	}
}
