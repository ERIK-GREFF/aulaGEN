package pooJava;

public class ProtudoEletronico {
	
	private String processador;
	private String placaMae;
	private String placaDeVideo;
	private String memoriaRam;
	private String valor;
	
	public ProtudoEletronico (String processador, String placaMae, String placaDeVideo, String memoriaRam,String valor)
	{
		this.processador = processador;
		this.placaMae = placaMae;
		this.placaDeVideo = placaDeVideo;
		this.memoriaRam = memoriaRam;
		this.valor = valor;
	}
	public void imprimir()
	{
		System.out.println("\n Processador: "+processador+"\n Placa Mâe: "+placaMae+"\n Placa de vídeo:  "+placaDeVideo+"\n Memoria Ram: "+memoriaRam+"\n Valor: "+valor);
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getPlacaMae() {
		return placaMae;
	}

	public void setPlacaMae(String placaMae) {
		this.placaMae = placaMae;
	}

	public String getPlacaDeVideo() {
		return placaDeVideo;
	}

	public void setPlacaDeVideo(String placaDeVideo) {
		this.placaDeVideo = placaDeVideo;
	}

	public String getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(String memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
		
}
