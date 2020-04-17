
/**
 * Representa a un vehículo en alquiler
 * De esta clase no se crearán instancias
 * 
 * De un vehículo se conoce su matrícula, marca, modelo y el precio a pagar por
 * día de alquiler
 * 
 * Para todo vehículo se puede calcular su coste de alquiler que depende del nº
 * de días que se alquile (llamaremos a esta operación calcularPrecioAlquiler() )
 * 
 * Dos vehículos pueden compararse por su matrícula (es su orden natural)
 * 
 * Dos vehículos son iguales si además de pertenecer a la misma clase tienen la
 * misma matrícula
 * 
 */
public abstract class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private double precioDia;

	/**
	 * Constructor
	 */
	public Vehiculo(String matricula, String marca, String modelo,
	        double precioDia) {
		this.matricula = matricula.toUpperCase();
		this.marca = marca.toUpperCase();
		this.modelo = modelo.toUpperCase();
		this.precioDia = precioDia;

	}

	public String getMatricula() {
		return matricula;
	}


	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public double getPrecioDia() {
		return precioDia;
	}
	
	public double calcularPrecioAlquiler(int dias) {
		return dias * getPrecioDia();
	}
	
	/**
	 * Redefinimos equals 
	 * @override
	 */
	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Vehiculo veh = (Vehiculo) obj;
		return this.matricula.equalsIgnoreCase(veh.getMatricula());
	}
	
	/**
	 * Redefinición de hashCode()
	 * 
	 */
	@Override
	public int hashCode() {
		return matricula.hashCode() * 13;
	}
	
	/**
	* implementaci�n del m�todo del interface Comparable
	*/
	public int compareTo(Vehiculo veh) {

		return this.matricula.compareToIgnoreCase(veh.getMatricula());
	}

	@Override
	public String toString() {
		return this.getClass() + "\n" + "Matricula: " + this.getMatricula() + " | Marca: " + 
				this.getMarca() + " | Modelo: " + this.getModelo() + "\nPrecio d�a alquiler: " + 
				this.getPrecioDia() + "�";
	}

}