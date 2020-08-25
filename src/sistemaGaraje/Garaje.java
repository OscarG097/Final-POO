package sistemaGaraje;
import java.util.*;
import vehiculos.Vehiculo;

public class Garaje {	
	private int capacidadDia;
	private double precioRuedas;
	
	public Garaje(int capacidadDia, double precioRuedas) {
		this.capacidadDia = capacidadDia;
		this.precioRuedas = precioRuedas;
	}
			
	public double getPrecioRueda(double cantRuedas) {
		return precioRuedas;
	}
	
	public int getCapacidadDia() {
		return capacidadDia;
	}
	
	
	// ingrsos/egresos Garaje
		ArrayList <Vehiculo> capacidad = new ArrayList<Vehiculo>();
		ArrayList <Vehiculo> egreso = new ArrayList<Vehiculo>();
		
	// Total de vehiculos recibidos
	public void vehiculosIngresados() {
		System.out.println("\nCantidad de vehiculos en el garaje: " + capacidad.size());
	}
					
	public void infGaraje() {
		//calcula la capacidad disponible
		int capDisponible = capacidadDia - capacidad.size();
			
		//Esta variable toma el numero real de capacidad del garaje
		int num = capacidadDia - 1;
		if (capacidad.size() <= num){
			System.out.println("\nLos vehiculos en el garaje actualmente son: ");
			for (int i=0; i < capacidad.size(); i++) {
				System.out.println(capacidad.get(i));
				}
				System.out.println("\nHay espacio disponible en el garaje. Hay " + capDisponible + " lugares disponibles.\n");		
		}else {
			System.out.println("\nNo hay lugar en el garaje.");			
			for (int i=0; i <= num; i++) {
			System.out.println(capacidad.get(i));

		}			
	}
}
		//Cálculo de precio total de cambio de ruedas	
		public void totalRuedas(){
		int cantRuedas = 0;
		double total;
		
		for(Vehiculo var: capacidad) {
			cantRuedas += var.getRuedas();
		}
		total = cantRuedas * precioRuedas;
		System.out.println("\nEl precio por el cambio de ruedas total es de: $" + total);
		}
		
		//Promedio kilometraje total
		public void kmMedio() {			
			double km = 0;			
			for (Vehiculo var : capacidad) {
				km += var.getKm();
			}			
			km = km / capacidad.size();			
			System.out.println("\nEl kilometraje medio es de: " + km + "\n");
		}
		/*
		 * Necesita la informacion del vehiculo
		 * Se usa para marcar la salida 
		 */
		public void marcarEgreso(Vehiculo vehiculoEgreso) {
			
			// Egreso de vehiculo del garaje
			egreso.add(vehiculoEgreso);
			// Remueve vehiculo del garaje
			capacidad.remove(vehiculoEgreso);
			}
		
		
		//Imprime los egresos de los vehiculos
		public void imprimeEgreso() {
		
		System.out.println("Vehiculos Retirados:");
		for (int i=0; i < egreso.size(); i++) {
			System.out.println(egreso.get(i));
		}
		
		/* Salida de vehiculo dependiendo de un numero o ID*/
		/*public void marcarEgreso2(int numero) {
			Vehiculo numVehiculo = capacidad.get(numero);
			
			//registrar el egreso
			egreso.add(numVehiculo);
			//remover el vehiculo
			capacidad.remove(numVehiculo);
			
			System.out.println("EGRESO");
			System.out.println(egreso);
			System.out.println(capacidad);
		}*/
			
			
		}
	}

