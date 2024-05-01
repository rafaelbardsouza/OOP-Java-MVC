package Views;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int op;
		
		do {
			System.out.println("--- 		Menu 		---");
			System.out.println("0 - Sair");
			System.out.println("1 - Fornecedor");
			System.out.println("2 - Produto");
			System.out.println("Escolha uma opção:");
			op = sc.nextInt();
			
			switch(op) {
			case 0:
				break;
			case 1:
				FornecedorView.main(args);
			case 2:
				ProdutoView.main(args);
			default:
				System.out.println("Escolha inválida. Escolha novamente.");
			}
		} while(op!=0);
		sc.close();
	}
}
