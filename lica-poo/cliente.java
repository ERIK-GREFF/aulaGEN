package pooJava;

public class cliente {
	
	private String nomeCliente;
	private String email;
	private String idade;
	private String estado;
	
	public cliente (String nomeCliente, String idade, String estado,String email )
	
	{
		this.nomeCliente = nomeCliente;
		this.email = email;
		this.idade = idade;
		this.estado = estado; 				
	}
	
	public void imprimirInf()
	{
		System.out.println("\t\t ***informações do funcionario***"+"\n nome: " +nomeCliente+"\n idade: "+idade+"\n estado: "+estado+"\n email: "+email);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
		
}