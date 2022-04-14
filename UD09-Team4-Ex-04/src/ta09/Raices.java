package ta09;

public class Raices implements Raicable{

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
		return ((Math.pow(this.b, 2)) - (4 * this.a * this.c));
	}

	public boolean tieneRaices() {
		if (getDiscriminante() > 0) {
			return true;
		} else {
			return false;
		}
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

			System.out.println("Tenemos dos posibles soluciones: ");
			System.out.println("Solucion 1: " + ((-this.b + Math.sqrt(getDiscriminante())) / (2 * this.a)));
			System.out.println("Solucion 2: " + ((-this.b - Math.sqrt(getDiscriminante())) / (2 * this.a)));

		} else if (tieneRaiz()) {

			System.out.println("Solucion: " + ((-this.b + Math.sqrt(getDiscriminante())) / (2 * this.a)));
			System.out.println("Tenemos una unica solucion!");

		} else {

			System.out.println("No existe solucion");

		}

	}

	public void ObtenerRaices() {

		if (tieneRaices()) {

			double x1 = ((-this.b) + Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a);

			double x2 = ((-this.b) - Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a);

			System.out.println("Solucion de las dos raices: " + x1 + " y " + x2);

		}
	}

	public void ObtenerRaiz() {

		double x = 0;

		if (tieneRaiz()) {

			x = ((-this.b) + Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a);

			System.out.println("Solucion de la raiz: " + x);

		}
	}

}
