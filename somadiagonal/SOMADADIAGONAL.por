programa
{	
	funcao inicio()
	{
		inteiro mat[3][3],l,c,soma=0,somaD=0
		para (l=0;l<3;l++)
		{
			para (c=0;c<3;c++)
			{
				escreva("Digite numeros... ")
				leia(mat[l][c])	
				soma=soma+mat[l][c]	
				se(l==c) 
				{ 
					somaD = somaD + mat[l][c] 								
				}
			}
		}
				
		para (l=0;l<3;l++)
		{						
			para (c=0;c<3;c++)
			{
				escreva("[",mat[l][c],"]")				
			}
				escreva("\n")																																				
		}
				escreva("soma: ",soma)
				escreva("\n soma da diagonal: ",somaD) 
		
			}		
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 255; 
 * @PONTOS-DE-PARADA = 5, 24, 10, 26, 11, 12, 28, 29, 15;
 * @SIMBOLOS-INSPECIONADOS = {mat, 5, 10, 3}-{l, 5, 20, 1}-{c, 5, 22, 1}-{soma, 5, 24, 4}-{somaD, 5, 31, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */