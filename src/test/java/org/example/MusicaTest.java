package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class MusicaTest {

	@Test
	public void deveTocarGuitarraComDistorcao() {
		FabricaTimbre guitarra = new FabricaGuitarraDistorcida();
		Musica musica = new Musica(guitarra);
		Assertions.assertEquals("Aplicado som com distorcao\nSom de Guitarra", musica.tocar());
	}
}