package vehiculos;

//Objeto 
public class Vehiculo {
	
	// Atributos
	private String tipoVehiculo;
	private String marca;
	private double km;
	private String modelo;
	private int ruedas;
	
	
	// Constructor
	public Vehiculo(String tipoVehiculo, String marca, double km, String modelo, int ruedas) {
		this.tipoVehiculo = tipoVehiculo;
		this.marca = marca;
		this.km = km;
		this.modelo = modelo;
		this.ruedas = ruedas;
	}

	
	// Getters
	public String getTipo() {
		return tipoVehiculo;
	}
	public String getMarca() {
		return marca;
	}
	public double getKm() {
		return km;
	}
	public String getModelo() {
		return modelo;
	}
	public int getRuedas() {
		return ruedas;
	}
	
	
}
