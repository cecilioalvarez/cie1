package es.curso6;

public class Maleta {
	
	private String modelo;
	private double peso;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Maleta(String modelo, double peso) {
		super();
		this.modelo = modelo;
		this.peso = peso;
	}
	
	

}
