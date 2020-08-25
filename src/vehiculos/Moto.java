package vehiculos;

public class Moto extends Vehiculo {
	
	//Atributos
	private int cilindrada;
	
	
	//Constructor
	public Moto(String tipo, String marca, double km, String modelo, int cilindrada, int ruedas) {
		super(tipo, marca, km, modelo, ruedas); // identifica que ya estan inicializados las variables de la clase padre (herencia)
		this.cilindrada = cilindrada;
	}
	
	//Getter del atributo cilindrada
	public int getCilindrada() {
		return cilindrada;
	}

	
	@Override
	public String toString() {
		return "Tipo de vehículo: " + getTipo() +
				", Marca: " + getMarca() +
				", Kilometraje: " + getKm() +
				", Modelo: " + getModelo() +
				", Cilindrada: " + cilindrada +
				", Ruedas: " + getRuedas();
	}
		
}
