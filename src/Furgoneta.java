
/**
 * Una furgoneta es un vehículo que añade la característica del volumen de carga
 * (valor de tipo double)
 * 
 * El coste de alquiler de una furgoneta no solo depende del nº de días de
 * alquiler
 * Tendrá un incremento que dependerá de su volumen de carga: hasta 5 m3
 * exclusive ( metros cúbicos) de volumen el incremento sobre el precio
 * final será de 10€, entre 5 y 10 (inclusive) el incremento sobre el precio
 * final será de 15€, si volumen > 10 el incremento sobre el precio final será de
 * 25€
 * 
 */
public class Furgoneta extends Vehiculo {
	private double volumen;

	public Furgoneta(String matricula, String marca, String modelo, double precioDia, double volumen) {
		super(matricula, marca, modelo, precioDia);
		// TODO Auto-generated constructor stub
		this.volumen = volumen;
	}
	
	public double getVolumen() {
		return volumen;
	}

	public double  calcularPrecioAlquiler(int dias) {
		double precio = super.calcularPrecioAlquiler(dias);
		if (volumen < 5) {
			precio += 10;
		} else if(volumen <= 10) {
			precio += 15;
		} else {
			precio += 25;
		}
		return precio;
	}

	@Override
	public String toString() {
		return super.toString()  + " | Volumen: " + this.getVolumen();
	}
	
	

}
