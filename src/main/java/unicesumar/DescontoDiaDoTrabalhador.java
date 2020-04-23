package unicesumar;

public abstract class DescontoDiaDoTrabalhador implements Desconto {
	public double desconto(double valor) {
		return valor * 0.9;
	}
}
