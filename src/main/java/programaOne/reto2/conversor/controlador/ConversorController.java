package programaOne.reto2.conversor.controlador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import programaOne.reto2.conversor.modelo.Conversor;
import programaOne.reto2.conversor.modelo.ConversorTipo;
import programaOne.reto2.conversor.modelo.Unidad;
import programaOne.reto2.conversor.vista.VentanaConversor;


public class ConversorController implements ItemListener,  DocumentListener{

	private VentanaConversor ventanaConversor;

	public ConversorController(VentanaConversor ventanaConversor) {
		this.ventanaConversor = ventanaConversor;
	}

	public void escucharEventos() {
		ventanaConversor.getCmbConversor().addItemListener(this);
		ventanaConversor.getCmbUnidad1().addItemListener(this);
		ventanaConversor.getCmbUnidad2().addItemListener(this);
		ventanaConversor.getTxtUnidad1().getDocument().addDocumentListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		boolean selectedItem = e.getStateChange() == ItemEvent.SELECTED;
		boolean selectedCmbConversor = e.getSource() == ventanaConversor.getCmbConversor();
		boolean selectedCmbUnidad1 = e.getSource() == ventanaConversor.getCmbUnidad1();
		boolean selectedCmbUnidad2 = e.getSource() == ventanaConversor.getCmbUnidad2();

		if (selectedItem && selectedCmbConversor) {

			ComboBoxModel<Unidad> unidades1, unidades2;
			ConversorTipo tipo = (ConversorTipo) ventanaConversor.getCmbConversor().getSelectedItem();
			unidades1 = new DefaultComboBoxModel<>(tipo.getUnidadesLista().toArray(new Unidad[0]));
			unidades2 = new DefaultComboBoxModel<>(tipo.getUnidadesLista().toArray(new Unidad[0]));
			ventanaConversor.getCmbUnidad1().setModel(unidades1);
			ventanaConversor.getCmbUnidad2().setModel(unidades2);
			ventanaConversor.getLblUnidad1().setText(((Unidad) ventanaConversor.getCmbUnidad1().getSelectedItem()).getNombre());
			ventanaConversor.getLblUnidad2().setText(((Unidad) ventanaConversor.getCmbUnidad2().getSelectedItem()).getNombre());
		}
		
		if (selectedItem && selectedCmbUnidad1) {

			ventanaConversor.getLblUnidad1().setText(((Unidad) ventanaConversor.getCmbUnidad1().getSelectedItem()).getNombre());
		}
		
		if (selectedItem && selectedCmbUnidad2) {

			ventanaConversor.getLblUnidad2().setText(((Unidad) ventanaConversor.getCmbUnidad2().getSelectedItem()).getNombre());
		}
	}
	
	 private void addTextToArea() {
         ventanaConversor.getTxtUnidad2().setText("");
         //char[] separatedText = ventanaConversor.getTxtUnidad1().getText().toCharArray();
         String text = ventanaConversor.getTxtUnidad1().getText();
         try {
			double value = Double.parseDouble(text);
			double value2 = Conversor.convertir(value, (Unidad)ventanaConversor.getCmbUnidad1().getSelectedItem(), (Unidad)ventanaConversor.getCmbUnidad2().getSelectedItem());
			ventanaConversor.getTxtUnidad2().setText(String.valueOf(value2));
		} catch (NumberFormatException e) {
			System.out.println("exception");
		}
     }

	@Override
	public void changedUpdate(DocumentEvent arg0) {
		addTextToArea();
		
	}

	@Override
	public void insertUpdate(DocumentEvent arg0) {
		addTextToArea();
		
	}

	@Override
	public void removeUpdate(DocumentEvent arg0) {
		addTextToArea();
		
	}

}
