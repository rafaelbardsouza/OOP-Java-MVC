package Models;

public class Endereco {
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setEndereco(String rua, String numero, String complemento, String bairro, String cep, String cidade, String uf) {
        setRua(rua);
        setNumero(numero);
        setComplemento(complemento);
        setBairro(bairro);
        setCep(cep);
        setCidade(cidade);
        setUf(uf);
    }

    public void getEndereco() {
        System.out.println("Rua: " + getRua());
        System.out.println("Número: " + getNumero());
        System.out.println("Complemento: " + getComplemento());
        System.out.println("Bairro: " + getBairro());
        System.out.println("CEP: " + getCep());
        System.out.println("Cidade: " + getCidade());
        System.out.println("UF: " + getUf());
    }
}
