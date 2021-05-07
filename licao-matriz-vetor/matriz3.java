package PROJETO;

import java.util.Scanner;

public class matriz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] num = new int [3][3];
		int cont=0,linha,coluna;
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			
			for(coluna=0;coluna<3;coluna++) {
				
				System.out.println("Entre com um numero: ");
				num[linha] [coluna] = leia.nextInt();
				
				if(num[linha][coluna]>10){
					
					cont++;				
				}
													
			}
			
		}		System.out.println("A quantidade de numeros maiores que 10 são:"+ cont++);

	}

}
