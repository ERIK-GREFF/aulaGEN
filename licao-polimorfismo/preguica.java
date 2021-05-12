package pooJava;

public class preguica extends animal {
	
	
	
	public preguica(String nome, int idade)
	{
		super(nome,idade);
			
	}
	@Override
	public void som(String som)
	{
		som = "aaaaaa";
		
		System.out.println("som: " +som);
	}
	@Override
	public void acao(String subiu)
	{
		subiu = "subiu a arvore";
		
		System.out.println("A preguiça "+subiu);
	}
	public void imprima()
	{
		 System.out.println("\nnome da preguiça: " +getNome()+ "\nidade: " +getIdade());
	}
	

}
