package Views;
import java.util.Scanner;

public class FornecedorView {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.println("--- 		Fornecedor		 ---");
			System.out.println("0 - Sair");
			System.out.println("1 - Adicionar Fornecedor");
			System.out.println("2 - Consultar Fornecedor");
			System.out.println("3 - Alterar Fornecedor");
			System.out.println("4 - Deletar Fornecedor");
			op = sc.nextInt();
			switch(op) {
			case 0:
				Main.main(args);
			default:
				System.out.println("Escolha inválida. Escolha novamente.");
			}
		}while(op!=0);
		sc.close();
	}
}
