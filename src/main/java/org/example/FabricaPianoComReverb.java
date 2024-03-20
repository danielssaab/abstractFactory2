package org.example;

public class FabricaPianoComReverb implements FabricaTimbre{
	@Override
	public Instrumento criaInstrumento() {
		return new Piano();
	}

	@Override
	public Efeito criaEfeito() {
		return new Reverb();
	}
}
