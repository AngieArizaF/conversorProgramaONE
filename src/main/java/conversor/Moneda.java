package conversor;

public class Moneda {
	
	private String nombre;
	private double valorPesoColombia;

	
	public Moneda(String nombre, double valorPesoColombia) {
		super();
		this.nombre = nombre;
		this.valorPesoColombia = valorPesoColombia;
	}

	public double convertiraPesoColombia(double valorMoneda) {
		return this.valorPesoColombia*valorMoneda; 
	}
	
	public double convertiraMoneda(double valorPesoColombia) {
		return (1/this.valorPesoColombia)*(valorPesoColombia); 
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValorPesos() {
		return valorPesoColombia;
	}

	public void setValorPesos(double valorPesos) {
		this.valorPesoColombia = valorPesos;
	}
	
	
}
