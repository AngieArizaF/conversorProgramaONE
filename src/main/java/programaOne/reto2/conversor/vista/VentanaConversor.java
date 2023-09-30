package programaOne.reto2.conversor.vista;

import javax.swing.*;
import java.awt.Font;

import programaOne.reto2.conversor.controlador.ConversorController;
import programaOne.reto2.conversor.modelo.ConversorTipo;
import programaOne.reto2.conversor.modelo.Unidad;


public class VentanaConversor extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel panel = new JPanel();
	private JLabel lblConversor, lblUnidad1, lblUnidad2;
	private JTextField txtUnidad1, txtUnidad2;
	private JComboBox<ConversorTipo> cmbConversor;
	private JComboBox<Unidad> cmbUnidad1, cmbUnidad2;
	
	
	public VentanaConversor() {
		this.setSize(350, 300);
		this.setTitle("Conversor - Programa ONE");
		this.setLocationRelativeTo(null); // centrar en pantalla
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		panel = new JPanel();
		this.getContentPane().add(panel);
		panel.setLayout(null);	
		
	}
	
		
	public void initView() {
		lblConversor = new JLabel();
		lblUnidad1 = new JLabel();
		lblUnidad2 = new JLabel();
		txtUnidad1 = new JTextField();
		txtUnidad2 = new JTextField();
		cmbConversor = new JComboBox<>(ConversorTipo.values());
		cmbUnidad1 = new JComboBox<>(ConversorTipo.MONEDA.getUnidadesLista().toArray(new Unidad[0]));
		cmbUnidad2 = new JComboBox<>( ConversorTipo.MONEDA.getUnidadesLista().toArray(new Unidad[0]));



		lblPersonalización();
		txtPerosnalización();
		cmbPersonalizacion();
		
		ejecutarAcciones();
	}


	private void lblPersonalización() {
		lblConversor.setBounds(60, 20, 89, 30);
		lblConversor.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 16));
		lblConversor.setText("Conversor");
		panel.add(lblConversor);
		
		lblUnidad1.setBounds(40, 81, 180, 30);
		lblUnidad1.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 14));
		lblUnidad1.setText(((Unidad) cmbUnidad1.getSelectedItem()).getNombre());
		panel.add(lblUnidad1);
		
		lblUnidad2.setBounds(40, 166, 180, 30);
		lblUnidad2.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 14));
		lblUnidad2.setText(((Unidad) cmbUnidad2.getSelectedItem()).getNombre());
		panel.add(lblUnidad2);
	}

	private void txtPerosnalización() {
		txtUnidad1.setBounds(40, 111, 180, 30);
		txtUnidad1.setFont(new Font("DejaVu Math TeX Gyre", Font.PLAIN, 14));
		txtUnidad1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(txtUnidad1);
		
		txtUnidad2.setBounds(40, 195, 180, 30);
		txtUnidad2.setFont(new Font("DejaVu Math TeX Gyre", Font.PLAIN, 14));
		txtUnidad2.setHorizontalAlignment(SwingConstants.RIGHT);
		//txtUnidad2.setEnabled(false); // No se puede escribir
		panel.add(txtUnidad2);
	}

	private void cmbPersonalizacion() {
		cmbConversor.setBounds(167, 20, 100, 30);
		cmbConversor.setFont(new Font("DejaVu Math TeX Gyre", Font.PLAIN, 14));
		panel.add(cmbConversor);
		
		cmbUnidad1.setBounds(230, 111, 60, 30);
		cmbUnidad1.setFont(new Font("DejaVu Math TeX Gyre", Font.PLAIN, 14));
		panel.add(cmbUnidad1);
		
		cmbUnidad2.setBounds(230, 195, 60, 30);
		cmbUnidad2.setFont(new Font("DejaVu Math TeX Gyre", Font.PLAIN, 14));
		panel.add(cmbUnidad2);
	}


	private void ejecutarAcciones() {
		
		ConversorController controller = new ConversorController(this);

		controller.escucharEventos();
	}
	
	
	
	public JPanel getPanel() {
		return panel;
	}


	public JLabel getLblConversor() {
		return lblConversor;
	}


	public JLabel getLblUnidad1() {
		return lblUnidad1;
	}


	public JLabel getLblUnidad2() {
		return lblUnidad2;
	}


	public JTextField getTxtUnidad1() {
		return txtUnidad1;
	}


	public JTextField getTxtUnidad2() {
		return txtUnidad2;
	}


	public JComboBox<ConversorTipo> getCmbConversor() {
		return cmbConversor;
	}


	public JComboBox<Unidad> getCmbUnidad1() {
		return cmbUnidad1;
	}


	public JComboBox<Unidad> getCmbUnidad2() {
		return cmbUnidad2;
	}
	
	
	
	
	
}
