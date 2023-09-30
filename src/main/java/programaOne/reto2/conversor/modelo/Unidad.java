package programaOne.reto2.conversor.modelo;

public class Unidad {

	private String nombre;
	private String abreviatura;
	private double razonConversion;
	
	
	public Unidad(String nombre, String abreviatura, double razonConversion) {
		super();
		this.nombre = nombre;
		this.abreviatura = abreviatura;
		this.razonConversion = razonConversion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getAbreviatura() {
		return abreviatura;
	}


	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}


	public double getRazonConversion() {
		return razonConversion;
	}


	public void setRazonConversion(double razonConversion) {
		this.razonConversion = razonConversion;
	}


	@Override
	public String toString() {
		return this.abreviatura;
	}
	
	
	
	
	
	
}
