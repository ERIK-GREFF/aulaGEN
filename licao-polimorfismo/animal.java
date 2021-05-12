package pooJava;

public abstract class animal {
	
	private String nome;
	private int idade;
	abstract public void som(String som);
	abstract public void acao(String corrida);
	
	
	public animal (String nome, int idade)
	{
		super();
		this.nome = nome;
		this.idade = idade;
		
			
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	


}
