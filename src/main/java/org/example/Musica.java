package org.example;

public class Musica {
	private Instrumento instrumento;
	private Efeito efeito;

	public Musica(FabricaTimbre fabrica) {
		this.instrumento = fabrica.criaInstrumento();
		this.efeito = fabrica.criaEfeito();
	}

	public String tocar(){
		return efeito.aplicar() +"\n"+ instrumento.tocar();
	}
}
