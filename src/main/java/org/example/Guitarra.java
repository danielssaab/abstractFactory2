package org.example;

public class Guitarra implements Instrumento{
	private String modelo;
	private String ano;

	@Override
	public String tocar() {
		return "Som de Guitarra";
	}
}
