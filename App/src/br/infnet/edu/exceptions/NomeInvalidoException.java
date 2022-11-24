package br.infnet.edu.exceptions;

public class NomeInvalidoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public NomeInvalidoException(String menssagem) {
		super(menssagem);
	}
}
