package Models;

public class Fornecedor {
    private String nome;
    private String descricao;
    private String telefone;
    private String eMail;
    private Endereco endereco;

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setFornecedor(String nome, String descricao, String telefone, String eMail, Endereco endereco) {
        setNome(nome);
        setDescricao(descricao);
        setTelefone(telefone);
        seteMail(eMail);
        setEndereco(endereco);
    }

    public void getFornecedor() {
        System.out.println("--- Fornecedor ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + geteMail());
        System.out.println("--- Endereço ---");
        if (endereco != null) {
            endereco.getEndereco();
        }
    }
}
