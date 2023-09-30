package programaOne.reto2.conversor.modelo;

public class Conversor {
	
	    	
	public static double convertir(double valor, Unidad from, Unidad to) {
		return (valor * (from.getRazonConversion() / to.getRazonConversion()));
	}

}