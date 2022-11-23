package br.infnet.edu.exceptions;

public class EmailIvalidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public EmailIvalidoException(String menssagem) {
		super(menssagem);
	}
	
}
