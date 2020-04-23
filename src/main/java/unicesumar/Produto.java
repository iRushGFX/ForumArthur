package unicesumar;

public class Produto {
	private String nome;
	private double valor;
	private Desconto promocao;
	
	public String getNome() {
		return nome;
	}
	
	public Desconto getPromocao() {
		return promocao;
	}
	
	public double getValor() {
		return valor;
	}
}
