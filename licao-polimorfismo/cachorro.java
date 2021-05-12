package pooJava;

public class cachorro extends animal {

	 
	 
	 public cachorro (String nome, int idade)
	 {
		 super(nome,idade);

		
	 }
	 @Override
	 public void som(String latir)
	 {
		 latir = "auau";
		 
		 System.out.println("som: "+latir);
	 }
	 @Override
	 public void acao(String correr)
	 {
		 correr = "10";
		 System.out.println("O cachorro correu em uma velocidade de:"+correr+"KM/H");
	 }
	 
	 public void Imprima()
	 {
		 System.out.println("\nnome do cachorro é: " +getNome()+ "\nidade: " +getIdade());
	 }

	 	
}
