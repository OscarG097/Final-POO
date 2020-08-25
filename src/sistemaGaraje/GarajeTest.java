package sistemaGaraje;

import vehiculos.Coche;
import vehiculos.Moto;
//import vehiculos.Vehiculo;

public class GarajeTest {

	public static void main(String[] args) {
		
		//Garaje - Se especifican los lugares disponibles y el precio de cambio de rueda 
		Garaje garaje = new Garaje(15, 1.0);
		
		//Vehiculos - Automoviles (tipo - marca - kilometraje - modelo - puertas - ruedas)
		Coche coche1 = new Coche("Auto", "Ford", 12544.5, "Focus", 3, 4);
		garaje.capacidad.add(coche1);
		Coche coche2 = new Coche("Auto", "Chevrolet", 6524.25, "Onix", 5, 4);
		garaje.capacidad.add(coche2);
		Coche coche3 = new Coche("Auto", "Tesla", 5545.1, "Roadster" ,5, 4);
		garaje.capacidad.add(coche3);
		Coche coche4 = new Coche("Auto", "Citroen", 200.2, "C4",3, 4);
		garaje.capacidad.add(coche4);
		Coche coche5 = new Coche("Auto", "Peugeot", 3254.25, "308",3, 4);
		garaje.capacidad.add(coche5);
		Coche coche6 = new Coche("Auto", "Peugeot", 15252.5, "208",5, 4);
		garaje.capacidad.add(coche6);
	
		//Vehiculos - Motos (tipo - marca - kilometraje - modelo - cilindrada - ruedas)
		Moto moto1 = new Moto("Moto", "Honda", 458.36, "Titan", 250, 2); 
		garaje.capacidad.add(moto1);
		Moto moto2 = new Moto("Moto", "Motomel", 125.65, "s2",150, 2); 
		garaje.capacidad.add(moto2);
		Moto moto3 = new Moto("Moto", "Leropard", 5645.6, "Y700",250, 2); 
		garaje.capacidad.add(moto3);
		
		
		//Vehiculo a retirar
		garaje.marcarEgreso(moto1);
		garaje.marcarEgreso(moto3);
		garaje.marcarEgreso(moto2);
		garaje.imprimeEgreso();
	
		//Informacion del garaje
		garaje.vehiculosIngresados();
		garaje.infGaraje();
		
		//TotalRuedas
		garaje.totalRuedas();
		//Promedio de kilometraje
		garaje.kmMedio();
	}

}
