package pooJava;

public class cavalo extends animal{

	
	public cavalo(String nome, int idade)
	{
		super(nome,idade);
		
	}
	@Override
	public void som(String relinchar)
	{
		relinchar = "hinn in in";
		System.out.println("som: "+relinchar);
	}
	@Override
	public void acao(String correu)
	
	{	
		correu= "20";
		System.out.println("O cavalo correu em uma velocidade de: "+correu+"KM/H");
	}

	public void Imprima()
	{
		System.out.println("\nnome do cavalo é: " +getNome()+ "\nidade: " +getIdade());
	
	}
	
	

}
