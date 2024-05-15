package Controllers;

import java.util.Scanner;

import Models.Estoque;
import Models.MainModels;
import Models.Produto;

public class ProdutoController {
	
	public static void addProduto(Scanner sc) {
        Produto pdt = new Produto();
        Estoque stq = new Estoque();
        
        System.out.println("--- Dados Produto ---");
        System.out.print("Insira nome do Produto: ");
        pdt.setNome(sc.nextLine());
        System.out.print("Insira descrição do Produto: ");
        pdt.setDescricao(sc.nextLine());
        
        System.out.println("Escolha um Fornecedor:");
        Controllers.FornecedorController.listFornecedor();
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
    
	public static void listProduto() {
    	for(int i=0;i<MainModels.pr.length;i++) {
    		if(MainModels.pr[i] == null) {
    			break;
    		}else {
    			System.out.println(i + " - " + MainModels.pr[i].getNome());
    		}
    	}
    }
    
    public static void selectProduto(Scanner sc) {
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
    
    public static void updateProduto(Scanner sc) {
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
             Controllers.FornecedorController.listFornecedor();
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
    
    public static void deleteProduto(Scanner sc) {
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
