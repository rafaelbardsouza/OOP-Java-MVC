package Views;

import java.util.Scanner;
import Models.Endereco;
import Models.Fornecedor;
import Models.MainModels;

public class FornecedorView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("--- Fornecedor ---");
            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar Fornecedor");
            System.out.println("2 - Consultar Fornecedor");
            System.out.println("3 - Alterar Fornecedor");
            System.out.println("4 - Deletar Fornecedor");
            op = sc.nextInt();
            sc.nextLine(); // Consume newline character
            switch (op) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    addFornecedor(sc);
                    break;
                case 2:
                    selectFornecedor(sc);
                    break;
                case 3:
                    updateFornecedor(sc);
                    break;
                case 4:
                    deleteFornecedor(sc);
                    break;
                default:
                    System.out.println("Escolha inválida. Escolha novamente.");
            }
        } while (op != 0);
        sc.close();
    }

    private static void addFornecedor(Scanner sc) {
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

    private static void listFornecedor() {
        for (int i = 0; i < MainModels.fr.length; i++) {
            if (MainModels.fr[i] == null) {
                break;
            } else {
                System.out.println(i + " - " + MainModels.fr[i].getNome());
            }
        }
    }

    private static void selectFornecedor(Scanner sc) {
        listFornecedor();
        System.out.print("Selecione um Fornecedor: ");
        int idx = sc.nextInt();
        sc.nextLine(); // Consume newline character
        if (idx >= 0 && idx < MainModels.fr.length && MainModels.fr[idx] != null) {
            MainModels.fr[idx].getFornecedor();
        } else {
            System.out.println("Fornecedor não encontrado.");
        }
    }

    private static void updateFornecedor(Scanner sc) {
        listFornecedor();
        System.out.print("Escolha fornecedor para Editar: ");
        int idx = sc.nextInt();
        sc.nextLine(); // Consume newline character
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

    private static void deleteFornecedor(Scanner sc) {
        listFornecedor();
        System.out.print("Selecione um fornecedor para Deletar: ");
        int idx = sc.nextInt();
        sc.nextLine(); // Consume newline character
        if (idx >= 0 && idx < MainModels.fr.length && MainModels.fr[idx] != null) {
            MainModels.fr[idx] = null;
            System.out.println("Fornecedor deletado com sucesso!");
        } else {
            System.out.println("Fornecedor não encontrado.");
        }
    }
}
