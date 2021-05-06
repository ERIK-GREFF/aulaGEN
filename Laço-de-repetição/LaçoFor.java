package PROJETO;

import java.util.Scanner;

public class LaçoFor {

	public static void main(String[] args) {
		
		int num,x,contimpar=0,contpar=0;
		Scanner leia = new Scanner(System.in);
		
		
		for(x=1;x<=10;x++)
		{
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			
			if(num%2==0)
			{
				System.out.println("\n PAR: "+num);
				contpar++;
			}
			else
			{
				System.out.println("\n impar: "+num);
				contimpar++;
			}
				System.out.println("\nA quantidade de numero par é: "+contpar);
				System.out.println("\nA quantidade de numero impar é: "+contimpar);
		}
		
	}

}


