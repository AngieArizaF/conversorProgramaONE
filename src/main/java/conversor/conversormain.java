package conversor;

public class conversormain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Moneda dolar = new Moneda("Dólares",3989.25);
		Moneda euro  = new Moneda("Euros",4288.24);
		Moneda libra = new Moneda("Libras Esterlinas",4991.36);
		Moneda yen 	 = new Moneda("Yen Japonés",27.22);
		Moneda won 	 = new Moneda("Won sur-coreano",3.01);
		
		
		System.out.println("Convertir dolar a peso");
		System.out.println(dolar.convertiraPesoColombia(25));
		System.out.println("Convertir peso a dolar");
		System.out.println(dolar.convertiraMoneda(2500));
		
		
		
		
	}

}
