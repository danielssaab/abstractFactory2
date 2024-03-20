package org.example;

public class Piano implements Instrumento{
	private String tipo;

	@Override
	public String tocar() {
		return "Som de piano";
	}
}
