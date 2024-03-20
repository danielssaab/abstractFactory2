package org.example;

public class FabricaGuitarraDistorcida implements FabricaTimbre{
	@Override
	public Instrumento criaInstrumento() {
		return new Guitarra();
	}

	@Override
	public Efeito criaEfeito() {
		return new Distortion();
	}
}
