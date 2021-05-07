package PROJETO;

import java.util.Scanner;

public class laçoDoWhile {

	public static void main(String[] args) {
		
		int num,soma=0;
		Scanner leia = new Scanner(System.in);
		
		
		
		do {
			System.out.println("Digite um numero do teclado: ");
			num = leia.nextInt();
			
			soma=soma+num;
							
		}while(num!=0);
		
		
		System.out.println("A soma dos numeros digitados são: "+soma);

	}

}
