package pooJava;

public class cachorro extends animal {
	 private int velocidadeCorrida;
	 private String som;
	 
	 public cachorro (String nome, int idade, int velocidadeCorrida,String som)
	 {
		 super(nome,idade);
		 this.velocidadeCorrida = velocidadeCorrida;
		 this.som = som;
	 }
	 public void Imprima()
	 {
		 System.out.println("\n nome do " +getNome()+ "\n idade: " +getIdade()+ "\n som:  " +som+"\n velocidade de corrida: " +velocidadeCorrida);
	 }
	public int getVelocidadeCorrida() {
		return velocidadeCorrida;
	}
	public void setVelocidadeCorrida(int velocidadeCorrida) {
		this.velocidadeCorrida = velocidadeCorrida;
	}
	 	
}
