package PROJETO;

import java.util.Scanner;

public class LaçoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade,contx=0,conty=0;
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		
		while(idade!=-99)
		{
			if(idade<21)
			{
				contx++;
			}
			if(idade>50)
			{
				conty++;
			}
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();	
						
		}
		System.out.println("total de pessoas com menos de 21: "+contx+"\n total de pessoas com mais de 50 anos: "+conty);
		
		
	
		

	}

}
