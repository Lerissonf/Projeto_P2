package excecoes;

@SuppressWarnings("serial")
public class MyFileNotFoundException extends Exception {
	public MyFileNotFoundException(String mensagem){
		super(mensagem);
	}
}
