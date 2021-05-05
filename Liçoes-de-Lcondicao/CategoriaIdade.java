package PROJETO;

import java.util.Scanner;

public class CategoriaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("você pertence ao grupo infatil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("você pertence ao grupo juvenil");
		}
		else if(idade>=18)
		{
			System.out.println("você pertence ao grupo dos adultos");
		}
		else
		{
			System.out.println("Você ainda é um baby.");
		}
	}

}
