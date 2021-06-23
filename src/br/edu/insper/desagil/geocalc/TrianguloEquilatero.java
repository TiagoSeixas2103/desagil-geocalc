package br.edu.insper.desagil.geocalc;

public class TrianguloEquilatero extends PoligonoRegular {

	public TrianguloEquilatero(int lado, int numeroLados) {
		super(lado, numeroLados);
	}

	@Override
	public double area() {
		double meio = this.lado / 2.0;

		double altura = Math.sqrt(this.lado * this.lado - meio * meio);

		return this.lado * altura / 2;
	}
}
