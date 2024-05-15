package Views;

import java.util.Scanner;

public class FornecedorView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("--- Fornecedor ---");
            System.out.println("0 - Voltar");
            System.out.println("1 - Adicionar Fornecedor");
            System.out.println("2 - Consultar Fornecedor");
            System.out.println("3 - Alterar Fornecedor");
            System.out.println("4 - Deletar Fornecedor");
            op = sc.nextInt();
            sc.nextLine(); 
            switch (op) {
                case 0:
                	Main.main(args);
                	break;
                case 1:
                	Controllers.FornecedorController.addFornecedor(sc);
                    break;
                case 2:
                    Controllers.FornecedorController.selectFornecedor(sc);
                    break;
                case 3:
                    Controllers.FornecedorController.updateFornecedor(sc);
                    break;
                case 4:
                    Controllers.FornecedorController.deleteFornecedor(sc);
                    break;
                default:
                    System.out.println("Escolha inválida. Escolha novamente.");
            }
        } while (op != 0);
        sc.close();
    }
}
