package PROJETO;

import java.util.Scanner;

public class MaiorNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero: ");
		num1 = leia.nextInt();
		System.out.println("digite o segundo numero: ");
		num2 = leia.nextInt();
		System.out.println("digite o terceiro numero: ");
		num3 = leia.nextInt();
		
		if (num1>num2 && num1>num3)
		{
			System.out.println("O maior numero é: " +num1);
		}
		else if (num2>num1 && num2>num3)
		{
			System.out.println("O maior numero é: " +num2);
		}
		else
		{
			System.out.println("O maior numero é: " +num3);
		}
	}

}
