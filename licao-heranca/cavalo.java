package pooJava;

public class cavalo extends animal{
	private int velocidadeCorrida;
	private String som;
	
	public cavalo(String nome, int idade , int velocidadeCorrida ,String som)
	{
		super(nome,idade);
		this.velocidadeCorrida = velocidadeCorrida;
		this.som = som;
	}
	public void Imprima()
	{
		System.out.println("\n nome do " +getNome()+ "\n idade: " +getIdade()+ "\n velocidade de corrida: " +velocidadeCorrida+ "\n Som: "+som);
	}
	public int getVelocidadeCorrida() {
		return velocidadeCorrida;
	}
	public void setVelocidadeCorrida(int velocidadeCorrida) {
		this.velocidadeCorrida = velocidadeCorrida;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	
	

}
