package PROJETO;

import java.util.Scanner;

public class VERTO2 {

	public static void main(String[] args) 
	{
		
		
		int[] numeros = new int [6];
		int somapar=0,contimpar=0,x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++)
		{
			System.out.println("Digite um numero: ");
			numeros[x] = leia.nextInt();
			
			if(numeros[x] % 2 == 0)
			{
				
					somapar = somapar + numeros[x];		
			}
			
			else
			{
				 	contimpar++;		 	
			}
			
		} System.out.println("soma dos numeros pares é: "+somapar);
		
		for(x=0;x<6;x++)
		{
			if(numeros[x]% 2 == 0)
			{
				System.out.println("["+numeros[x]+"]");
			}
		} System.out.println("Quantidade de numeros impares digitados: "+contimpar++);
		for(x=0;x<6;x++)
		{
			if(numeros[x]% 2 == 1)
			{
				System.out.println("["+numeros[x]+"]");
			}
		}
				
		
	}

}


