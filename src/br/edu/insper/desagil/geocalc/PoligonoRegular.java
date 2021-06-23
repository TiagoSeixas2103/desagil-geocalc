package br.edu.insper.desagil.geocalc;

public abstract class PoligonoRegular extends Poligono {
	public int lado;
	public int numeroLados;


	public PoligonoRegular(int lado, int numeroLados) {
		super();
		this.lado = lado;
		this.numeroLados = numeroLados;
	}

	public double perimetro() {
		return this.lado * this.numeroLados;
	}

	public abstract double area();

}
