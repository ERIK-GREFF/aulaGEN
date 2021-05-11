package pooJava;

public class preguica extends animal {
	private String sobeArvore;
	private String som;
	
	public preguica(String nome, int idade, String sobeArvore, String som)
	{
		super(nome,idade);
		this.sobeArvore = sobeArvore;
		this.som = som;
	}
	public void Imprima()
	{
		System.out.println("\n nome do bicho " +getNome()+ "\n idade: " +getIdade()+ "\n sobe em arvore : " +sobeArvore+ "\n Som: "+som);
	}
	public String getSobeArvore() {
		return sobeArvore;
	}
	public void setSobeArvore(String sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	

}
