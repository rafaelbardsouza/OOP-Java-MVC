package Models;

public class MainModels {
	public static Fornecedor[] fr = new Fornecedor[100];
	public static Produto[] pr = new Produto[100];
	
	static {
        Endereco endereco1 = new Endereco();
        endereco1.setEndereco("Rua da Esperança", "500", "Loja 2", "Centro", "01010-010", "São Paulo", "SP");
        fr[0] = new Fornecedor();
        fr[0].setFornecedor("Mercadinho São Paulo", "Fornecedor de produtos alimentícios e bebidas", "+55-11-1234-5678", "contato@mercadinhosp.com.br", endereco1);

        Endereco endereco2 = new Endereco();
        endereco2.setEndereco("Avenida das Nações Unidas", "3000", "10º Andar", "Barra da Tijuca", "22775-040", "Rio de Janeiro", "RJ");
        fr[1] = new Fornecedor();
        fr[1].setFornecedor("TecnoBrasil", "Fornecedor de eletrônicos e tecnologia", "+55-21-8765-4321", "suporte@tecnobrasil.com.br", endereco2);

        Endereco endereco3 = new Endereco();
        endereco3.setEndereco("Mannerheimintie", "15", "2nd Floor", "Kamppi", "00100", "Helsinki", "Uusimaa");
        fr[2] = new Fornecedor();
        fr[2].setFornecedor("Nordic Supplies", "Fornecedor de equipamentos industriais", "+358-9-123-4567", "info@nordicsupplies.fi", endereco3);

        Endereco endereco4 = new Endereco();
        endereco4.setEndereco("Esplanadi", "8", "1st Floor", "Kaartinkaupunki", "00130", "Helsinki", "Uusimaa");
        fr[3] = new Fornecedor();
        fr[3].setFornecedor("Finnish Organic Goods", "Fornecedor de produtos orgânicos", "+358-40-987-6543", "contact@finnishorganic.fi", endereco4);

        Endereco endereco5 = new Endereco();
        endereco5.setEndereco("Korkeavuorenkatu", "10", "5th Floor", "Ullanlinna", "00130", "Helsinki", "Uusimaa");
        fr[4] = new Fornecedor();
        fr[4].setFornecedor("Arctic Solutions", "Fornecedor de soluções de TI", "+358-50-123-7890", "support@arcticsolutions.fi", endereco5);

        pr[0] = new Produto();
        pr[0].setProduto("Café Gourmet", "Café 100% arábica, torrado e moído", fr[0], new Estoque());
        pr[0].getEstoque().setEstoque(200, 25.90, pr[0]);

        pr[1] = new Produto();
        pr[1].setProduto("Televisor 4K", "Smart TV 4K UHD com 55 polegadas", fr[1], new Estoque());
        pr[1].getEstoque().setEstoque(50, 2999.99, pr[1]);

        pr[2] = new Produto();
        pr[2].setProduto("Ferramenta Multiuso", "Ferramenta multiuso para trabalhos industriais", fr[2], new Estoque());
        pr[2].getEstoque().setEstoque(75, 149.99, pr[2]);

        pr[3] = new Produto();
        pr[3].setProduto("Suco Orgânico", "Suco de frutas orgânicas, sem adição de açúcar", fr[3], new Estoque());
        pr[3].getEstoque().setEstoque(300, 4.99, pr[3]);

        pr[4] = new Produto();
        pr[4].setProduto("Software de Gestão", "Software para gestão empresarial", fr[4], new Estoque());
        pr[4].getEstoque().setEstoque(100, 1999.99, pr[4]);
    } 
	//Exemplos criados por IA.
}
