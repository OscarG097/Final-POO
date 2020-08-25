package vehiculos;

public class Coche extends Vehiculo{
	
	// Atributos
	private int puertas;
	
	// Constructor
	public Coche(String tipo, String marca, double km, String modelo, int puertas, int ruedas) {
		super(tipo, marca, km, modelo, ruedas); // identifica que ya estan inicializados las variables de la clase padre (herencia)
		this.puertas = puertas;
	}

	// Getters
	public int getnPuertas() {
		return puertas;
	}

	@Override
	public String toString() {
		return "Tipo de vehículo: " + getTipo() +
				", Marca: " + getMarca() +
				", Kilometraje: " + getKm() +
				", Modelo: " + getModelo() +
				", Puertas: " + puertas +
				", Ruedas: " + getRuedas();
	}
	
	
	
}
