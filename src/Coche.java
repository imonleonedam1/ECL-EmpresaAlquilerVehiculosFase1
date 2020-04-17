
/**
 * Un coche es un vehículo que añade un nº de plazas
 * 
 * El coste final de alquiler depende no solo del nº de días de alquiler 
 * sino también del nº de plazas. Si el nº de plazas es > 4 se añaden 5€ más por día
 */
public class Coche extends Vehiculo{
	private int plazas;

	public Coche(String matricula, String marca, String modelo, double precioDia, int plazas) {
		super(matricula, marca, modelo, precioDia);
		// TODO Auto-generated constructor stub
		this.plazas = plazas;
	}

	public int getPlazas() {
		return plazas;
	}
	public double calcularPrecioAlquiler(int dias) {
		double precio = super.calcularPrecioAlquiler(dias);
		if(plazas > 4) {
			precio += 5 * dias;
		}
		return precio;
	}

	@Override
	public String toString() {
		return super.toString() + " | Plazas: " + this.getPlazas();
	}
	
	
	
}
