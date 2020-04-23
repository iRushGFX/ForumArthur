package unicesumar;

public abstract class DescontoDiaDosPais implements Desconto {
	public double desconto(double valor) {
        return valor * 0.8;
    }
}
