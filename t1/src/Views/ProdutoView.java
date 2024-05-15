package Views;

import java.util.Scanner;

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
                    Controllers.ProdutoController.addProduto(sc);
                    break;
                case 2:
                	Controllers.ProdutoController.selectProduto(sc);
                	break;
                case 3:
                	Controllers.ProdutoController.updateProduto(sc);
                	break;
                case 4:
                	Controllers.ProdutoController.deleteProduto(sc);
                	break;
                default:
                    System.out.println("Escolha inválida. Escolha novamente.");
            }
        } while (op != 0);
        sc.close();
    }   
}
