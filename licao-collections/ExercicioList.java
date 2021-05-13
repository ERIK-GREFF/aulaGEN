package pooJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioList{

	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner (System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n\t\t Menu de opções");
			System.out.println("\n(1) adicionar produto");
			System.out.println("\n(2) remover produto");
			System.out.println("\n(3) atualizar lista de produtos");
			System.out.println("\n(4) mostrar produto no estoque");
			System.out.println("\n(5) finalizar programa ");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();
			
			switch(op)
			{
			
			case 1:
				leia.nextLine();
				
				System.out.println("Digite o nome do produto que deseja adicionar ao estoque: ");
				
				String produto = leia.nextLine();
				
				estoque.add(produto);
				
				break;
			
			case 2:
				
				leia.nextLine();
				
				System.out.println("Digite o nome do produto que deseja remover do estoque: ");
				
				String produto1 = leia.nextLine();
				
				if(estoque.contains(produto1))
				{
					estoque.remove(produto1);
				}
				else
				{
					System.out.println("Produto inexistente!");
				}
				break;
			
			case 3:
				leia.nextLine();
				
				System.out.println("\nDigite o produto que quer atualizar: ");
				
				String verifica = leia.nextLine();
				
				System.out.println("\nDigite o nome do produto que entrará no lugar de" +verifica);
				
				String novo = leia.nextLine();
				
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existe no meu estoque!!!");					
				}
				break;
			
			case 4:
				System.out.println("\nMostrando os produtos do estoque...");
				System.out.println(estoque);
				
				break;
				
				default:
					System.out.println("\nPrograma finalizado!");
			}
			
		}while(op!=5);
	}
}
