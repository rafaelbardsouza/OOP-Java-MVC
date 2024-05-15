package Controllers;

import java.util.Scanner;

import Models.Endereco;
import Models.Fornecedor;
import Models.MainModels;

public class FornecedorController {
	
    public static void addFornecedor(Scanner sc) {
        Endereco end = new Endereco();
        Fornecedor frn = new Fornecedor();
        System.out.println("--- Dados Fornecedor ---");
        System.out.print("Insira Nome: ");
        frn.setNome(sc.nextLine());
        System.out.print("Insira Descricao: ");
        frn.setDescricao(sc.nextLine());
        System.out.print("Insira Telefone: ");
        frn.setTelefone(sc.nextLine());
        System.out.print("Insira eMail: ");
        frn.seteMail(sc.nextLine());

        System.out.println("--- Dados Endereço ---");
        System.out.print("Insira Rua: ");
        end.setRua(sc.nextLine());
        System.out.print("Insira Número: ");
        end.setNumero(sc.nextLine());
        System.out.print("Insira Complemento: ");
        end.setComplemento(sc.nextLine());
        System.out.print("Insira Bairro: ");
        end.setBairro(sc.nextLine());
        System.out.print("Insira CEP: ");
        end.setCep(sc.nextLine());
        System.out.print("Insira Cidade: ");
        end.setCidade(sc.nextLine());
        System.out.print("Insira UF: ");
        end.setUf(sc.nextLine());
        frn.setEndereco(end);

        for (int i = 0; i < MainModels.fr.length; i++) {
            if (MainModels.fr[99] != null) {
                System.out.println("Limite Excedido!");
                break;
            } else if (MainModels.fr[i] == null) {
                MainModels.fr[i] = frn;
                System.out.println("Fornecedor Adicionado com Sucesso!");
                break;
            }
        }
    }

    public static void listFornecedor() {
        for (int i = 0; i < MainModels.fr.length; i++) {
            if (MainModels.fr[i] == null) {
                break;
            } else {
                System.out.println(i + " - " + MainModels.fr[i].getNome());
            }
        }
    }

    public static void selectFornecedor(Scanner sc) {
    	System.out.print("Selecione um Fornecedor: \n");
    	listFornecedor();
        int idx = sc.nextInt();
        sc.nextLine(); 
        if (idx >= 0 && idx < MainModels.fr.length && MainModels.fr[idx] != null) {
            MainModels.fr[idx].getFornecedor();
        } else {
            System.out.println("Fornecedor não encontrado.");
        }
    }

    public static void updateFornecedor(Scanner sc) {
        listFornecedor();
        System.out.print("Escolha fornecedor para Editar: \n");
        int idx = sc.nextInt();
        sc.nextLine();
        
        if (idx >= 0 && idx < MainModels.fr.length && MainModels.fr[idx] != null) {
            Endereco end = new Endereco();
            Fornecedor frn = new Fornecedor();
            System.out.println("--- Dados Fornecedor ---");
            System.out.print("Insira Nome: ");
            frn.setNome(sc.nextLine());
            System.out.print("Insira Descricao: ");
            frn.setDescricao(sc.nextLine());
            System.out.print("Insira Telefone: ");
            frn.setTelefone(sc.nextLine());
            System.out.print("Insira eMail: ");
            frn.seteMail(sc.nextLine());

            System.out.println("--- Dados Endereço ---");
            System.out.print("Insira Rua: ");
            end.setRua(sc.nextLine());
            System.out.print("Insira Número: ");
            end.setNumero(sc.nextLine());
            System.out.print("Insira Complemento: ");
            end.setComplemento(sc.nextLine());
            System.out.print("Insira Bairro: ");
            end.setBairro(sc.nextLine());
            System.out.print("Insira CEP: ");
            end.setCep(sc.nextLine());
            System.out.print("Insira Cidade: ");
            end.setCidade(sc.nextLine());
            System.out.print("Insira UF: ");
            end.setUf(sc.nextLine());
            frn.setEndereco(end);

            MainModels.fr[idx] = frn;
            System.out.println("Fornecedor editado com sucesso!");
        } else {
            System.out.println("Fornecedor não encontrado.");
        }
    }

    public static void deleteFornecedor(Scanner sc) {
        System.out.print("Selecione um fornecedor para Deletar: \n");
    	listFornecedor();
        int idx = sc.nextInt();
        sc.nextLine(); 
        if (idx >= 0 && idx < MainModels.fr.length && MainModels.fr[idx] != null) {
            MainModels.fr[idx] = null;
            System.out.println("Fornecedor deletado com sucesso!");
        } else {
            System.out.println("Fornecedor não encontrado.");
        }
    }
}
