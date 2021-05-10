package pooJava;

public class contaBancaria {
	
	private String nome;
	private String numeroConta;
	private String saldoConta;

	public contaBancaria (String nome, String numeroConta,String saldoConta)
	{
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
	}
	public void imprima()
	{
		System.out.println("\nNome: "+nome+"\nNumero da conta: "+numeroConta+"\nSaldo: "+saldoConta);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(String saldoConta) {
		this.saldoConta = saldoConta;
	}
	
}	

