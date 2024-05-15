package Views;

import java.util.Scanner;
import Models.Produto;
import Models.Fornecedor;
import Models.Estoque;
import Models.MainModels;
import Views.FornecedorView;

public class ProdutoView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("---         Produto         ---");
            System.out.println("0 - Voltar");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Consultar Produto");
            System.out.println("3 - Alterar Produto");
            System.out.println("4 - Deletar Produto");

            op = sc.nextInt();
            sc.nextLine();
            switch(op) {
                case 0:
                    Main.main(args);
                    break;
                case 1:
                    addProduto(sc);
                    break;
                case 2:
                	selectProduto(sc);
                	break;
                case 3:
                	updateProduto(sc);
                	break;
                case 4:
                	deleteProduto(sc);
                	break;
                default:
                    System.out.println("Escolha inválida. Escolha novamente.");
            }
        } while (op != 0);
        sc.close();
    }

    private static void addProduto(Scanner sc) {
        Produto pdt = new Produto();
        Estoque stq = new Estoque();
        
        System.out.println("--- Dados Produto ---");
        System.out.print("Insira nome do Produto: ");
        pdt.setNome(sc.nextLine());
        System.out.print("Insira descrição do Produto: ");
        pdt.setDescricao(sc.nextLine());
        
        System.out.println("Escolha um Fornecedor:");
        FornecedorView.listFornecedor();
        pdt.setFornecedor(MainModels.fr[sc.nextInt()]);
        sc.nextLine(); 
        
        System.out.println("--- Dados Estoque ---");
        System.out.println("* Esses são os dados iniciais de estoque. Para editá-los futuramente, vá para a tela de Estoque.");
        System.out.print("Insira quantidade: ");
        stq.setQuantidade(sc.nextInt());
        System.out.print("Insira preço: ");
        stq.setPreco(sc.nextDouble());
        sc.nextLine(); 
        
        stq.setProduto(pdt);
        pdt.setEstoque(stq);
        
        for(int i=0;i<MainModels.pr.length;i++) {
        	if(MainModels.pr[99]!=null) {
        		System.out.println("Limite excedido!");
				break;
        	}else if(MainModels.pr[i] == null) {
				MainModels.pr[i] = pdt;
				System.out.println("Produto Adicionado com Sucesso!");
				break;
			}
        }
    }
    
    private static void listProduto() {
    	for(int i=0;i<MainModels.pr.length;i++) {
    		if(MainModels.pr[i] == null) {
    			break;
    		}else {
    			System.out.println(i + " - " + MainModels.pr[i].getNome());
    		}
    	}
    }
    
    private static void selectProduto(Scanner sc) {
    	System.out.println("Selecione um Produto: \n");
    	listProduto();
    	int idx = sc.nextInt();
    	sc.nextLine();
    	if (idx >= 0 && idx < MainModels.pr.length && MainModels.pr[idx] != null) {
            MainModels.pr[idx].getProduto();
            System.out.println("Fornecedor: "+MainModels.pr[idx].fornecedor.getNome());
            MainModels.pr[idx].estoque.getEstoque();
        } else {
            System.out.println("Fornecedor não encontrado.");
        }
    }
    
    private static void updateProduto(Scanner sc) {
    	listProduto();
    	System.out.print("Escolha produto para Editar: \n");
        int idx = sc.nextInt();
        sc.nextLine();
        if(idx >=0 && idx < MainModels.pr.length && MainModels.pr[idx] != null) {
        	 Produto pdt = new Produto();
             Estoque stq = new Estoque();
             
             System.out.println("--- Dados Produto ---");
             System.out.print("Insira nome do Produto: ");
             pdt.setNome(sc.nextLine());
             System.out.print("Insira descrição do Produto: ");
             pdt.setDescricao(sc.nextLine());
             
             System.out.println("Escolha um Fornecedor:");
             FornecedorView.listFornecedor();
             pdt.setFornecedor(MainModels.fr[sc.nextInt()]);
             sc.nextLine(); 
             
             System.out.println("--- Dados Estoque ---");
             System.out.println("* Esses são os dados iniciais de estoque. Para editá-los futuramente, vá para a tela de Estoque.");
             System.out.print("Insira quantidade: ");
             stq.setQuantidade(sc.nextInt());
             System.out.print("Insira preço: ");
             stq.setPreco(sc.nextDouble());
             sc.nextLine(); 
             stq.setProduto(pdt);
             pdt.setEstoque(stq);
             
             MainModels.pr[idx] = pdt;
             System.out.println("Produto editado com sucesso!");
        }else {
        	System.out.println("Produto  não encontrado.");
        }
    }
    
    private static void deleteProduto(Scanner sc) {
    	System.out.println("Selecione um produto para Deletar: \n");
    	listProduto();
    	int idx = sc.nextInt();
    	sc.nextLine();
    	if(idx >=0 && idx < MainModels.pr.length && MainModels.pr[idx] != null) {
    		MainModels.pr[idx] = null;
    		System.out.println("Produto deletado com sucesso!");
    	}else {
    		System.out.println("Produto não Encontrado.");
    	}
    }
}
