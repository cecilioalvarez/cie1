package es.curso4;

public class CalculadoraMala1 {

	private double numero1;
	private double numero2;

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public CalculadoraMala1(double numero1, double numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public double sumar() {

		return numero1 + numero2;
	}

	public double restar() {

		return numero1 - numero2;
	}

}
