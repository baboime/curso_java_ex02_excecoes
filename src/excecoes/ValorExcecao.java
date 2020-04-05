package excecoes;

public class ValorExcecao extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ValorExcecao(String msg) {
		super(msg);
	}
}
