package ta09;

public class Raices {

	private double a;
	private double b;
	private double c;

	public Raices() {
		this(0.0, 0.0, 0.0);
	}

	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getDiscriminante() {
		return (Math.pow(this.b, 2)) - 4 * this.a * this.c;
	}

	public boolean tieneRaices() {
		if (getDiscriminante() >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public void obtenerRaices() {

	}

	public boolean tieneRaiz() {

		if (getDiscriminante() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public void calcular() {

		if (tieneRaices()) {

			System.out.println("Tenemos dos posibles soluciones!");
			System.out.println("Soluci�n 1: " + ((-this.b + Math.sqrt(getDiscriminante())) / 2 * this.a));
			System.out.println("Soluci�n 2: " + ((-this.b - Math.sqrt(getDiscriminante())) / 2 * this.a));

		} else if (tieneRaiz()) {

			System.out.println("Soluci�n: " + ((-this.b + Math.sqrt(getDiscriminante())) / 2 * this.a));
			System.out.println("Tenemos una �nica soluci�n!");

		} else {

			System.out.println("No existe soluci�n");

		}

	}

}
