package excecoes;

@SuppressWarnings("serial")
public class IllegalArgumentException extends Exception {
	public IllegalArgumentException(String mensagem){
		super(mensagem);
	}
}
