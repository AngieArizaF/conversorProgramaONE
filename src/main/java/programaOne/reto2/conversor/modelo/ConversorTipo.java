package programaOne.reto2.conversor.modelo;

import java.util.ArrayList;

public enum ConversorTipo {
	MONEDA("Moneda"), 
	LONGITUD("Longitud"),
	AREA("Área"), 
	MASA("Masa");

	private final String nombreUnidad;
	ArrayList<Unidad> monedaLista, longitudLista, areaLista, masaLista;
	
	
	private ConversorTipo(String nombreUnidad) {
		this.nombreUnidad = nombreUnidad;
	}

	@Override
	public String toString() {
		return nombreUnidad;
	}
	
	public ArrayList<Unidad> getUnidadesLista(){
		ArrayList<Unidad> unidadesLista = new ArrayList<>();
		ConversorTipo unidad = ConversorTipo.this;
		switch (unidad) {
		case MONEDA:
			addMonedas();
			return unidadesLista = monedaLista;
		case LONGITUD:
			addLongitudes();
			return unidadesLista = longitudLista;
		case AREA:
			addAreas();
			return unidadesLista = areaLista;
		case MASA:
			addMasas();
			return unidadesLista = masaLista;		
		}
		return unidadesLista;
		
	}
	
	private void addMonedas() {
		monedaLista = new ArrayList<>();
		monedaLista.add(new Moneda("Peso Colombiano", "COP", 1.0));
		monedaLista.add(new Moneda("Dólares", "USD", 3989.25));
		monedaLista.add(new Moneda("Euros", "EUR", 4288.24));
		monedaLista.add(new Moneda("Libras Esterlinas", "GBP", 4991.36));
		monedaLista.add(new Moneda("Yen Japonés", "JPY", 27.22));
		monedaLista.add(new Moneda("Won sur-coreano", "KRW", 3.01));
	}

	private void addLongitudes() {
		longitudLista = new ArrayList<>();
		longitudLista.add(new Longitud("Milimetro", "mm", 0.001));
		longitudLista.add(new Longitud("Centimetro", "cm", 0.01));
		longitudLista.add(new Longitud("Decimetro", "dm", 0.1));
		longitudLista.add(new Longitud("Metro", "m", 1.0));
		longitudLista.add(new Longitud("Kilometro", "km", 1000.0));
		longitudLista.add(new Longitud("Pulgada", "in", 0.0254));
		longitudLista.add(new Longitud("Milla", "mi", 1609.34));
		longitudLista.add(new Longitud("Yarda", "yd", 0.91));
		longitudLista.add(new Longitud("Pie", "ft", 0.3));
	}

	private void addAreas() {
		areaLista = new ArrayList<>();
		areaLista.add(new Area("Metro Cuadrado", "<html>m<sup>2</sup></html>", 1.0));
        areaLista.add(new Area("Decimetro Cuadrado", "<html>dm<sup>2</sup></html>", 0.001));
        areaLista.add(new Area("Centimetro Cuadrado", "<html>cm<sup>2</sup></html>", 0.00001));
        areaLista.add(new Area("Milimetro Cuadrado", "<html>mm<sup>2</sup></html>", 0.0000001));
        areaLista.add(new Area("Kilometro Cuadrado", "<html>Km<sup>2</sup></html>", 1000000.0));
        areaLista.add(new Area("Yarda Cuadrada", "<html>yd<sup>2</sup></html>", 0.833333));
        areaLista.add(new Area("Pie Cuadrado", "<html>ft<sup>2</sup></html>", 0.09293));
        areaLista.add(new Area("Pulgada Cuadrada", "<html>in<sup>2</sup></html>", 0.000645));
	}

	private void addMasas() {
		masaLista = new ArrayList<>();
		masaLista.add(new Masa("Kilogramo","kg", 1.0));
        masaLista.add(new Masa("Miligramo", "mg", 0.000001));
        masaLista.add(new Masa("Gramo", "g", 0.001));
        masaLista.add(new Masa("Decagramo", "dg", 0.01));
        masaLista.add(new Masa("Hectogramo", "hg", 0.1));
        masaLista.add(new Masa("Kilonewton", "kN", 101.97));
        masaLista.add(new Masa("Tonelada", "t", 1000.0));
        masaLista.add(new Masa("Libra", "lb", 0.45));
        masaLista.add(new Masa("Onza", "oz", 0.03));
	}
	

}
