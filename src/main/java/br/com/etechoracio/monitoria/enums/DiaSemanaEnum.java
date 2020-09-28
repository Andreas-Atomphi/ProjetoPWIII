package br.com.etechoracio.monitoria.enums;

public enum DiaSemanaEnum {
	SEGUNDA_FEIRA("Segunda"),
	TERCA_FEIRA("Terça"),
	QUARTA_FEIRA("Quarta"),
	QUINTA_FEIRA("Quinta"),
	SEXTA_FEIRA("Sexta");

	private String strings;
	
	private DiaSemanaEnum(String texto)
	{
		strings = texto + "-feira";
	}

	public String toString()
	{
		return strings;
	}

}
