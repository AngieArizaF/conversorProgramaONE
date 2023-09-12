package conversor;

public class conversor {

	
	
	public double convertir(double valor, Unidad from, Unidad to){
     
        return (valor * (from.getRazonConversion() / to.getRazonConversion()));
	}
	
}
