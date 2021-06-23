package br.edu.insper.desagil.geocalc;

public class HexagonoRegular extends PoligonoRegular {

	public HexagonoRegular(int lado, int numeroLados) {
		super(lado, numeroLados);
	}

	@Override
	public double area() {
		double meio = this.lado / 2.0;

		double altura = Math.sqrt(this.lado * this.lado - meio * meio);

		return numeroLados * this.lado * altura / 2;
	}
}
