package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import entity.Empleado;
import entity.TipoEmpleado;
import model.EmpleadoModel;
import model.TipoEmpleadoModel;
import util.ValidateUtil;

public class FrmRegistraEmpleado extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JPanel panelCentral;

	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtDNI;
	private JTextField txtEmail;
	private JTextField txtTelefono;
	private JTextField txtFechaNacimiento;
	private JTextField txtSueldo;

	private JComboBox<String> cboTipo;

	private JButton btnRegistrar;
	private JButton btnLimpiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmRegistraEmpleado frame = new FrmRegistraEmpleado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmRegistraEmpleado() {

		setTitle("Sistema de Gestión de Personal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 760, 700);
		setLocationRelativeTo(null);
		setResizable(false);

		// =========================================================
		// VENTANA PRINCIPAL
		// =========================================================

		contentPane = new JPanel();
		contentPane.setBackground(new Color(242, 245, 249));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// =========================================================
		// TITULO PRINCIPAL
		// =========================================================

		JLabel lblTitulo = new JLabel("REGISTRO DE EMPLEADO");

		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblTitulo.setForeground(new Color(32, 45, 60));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);

		lblTitulo.setBounds(40, 25, 680, 40);

		contentPane.add(lblTitulo);

		// =========================================================
		// SUBTITULO
		// =========================================================

		JLabel lblSubtitulo = new JLabel("Sistema de Gestión de Personal");

		lblSubtitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSubtitulo.setForeground(new Color(100, 110, 120));
		lblSubtitulo.setHorizontalAlignment(SwingConstants.CENTER);

		lblSubtitulo.setBounds(40, 65, 680, 25);

		contentPane.add(lblSubtitulo);

		// =========================================================
		// PANEL CENTRAL
		// =========================================================

		panelCentral = new JPanel();

		panelCentral.setBackground(Color.WHITE);

		panelCentral.setBorder(
				BorderFactory.createCompoundBorder(
						BorderFactory.createLineBorder(
								new Color(210, 215, 220),
								1
						),
						new EmptyBorder(10, 10, 10, 10)
				)
		);

		panelCentral.setBounds(50, 110, 660, 500);

		panelCentral.setLayout(null);

		contentPane.add(panelCentral);

		// =========================================================
		// NOMBRES
		// =========================================================

		JLabel lblNombres = new JLabel("Nombres");

		lblNombres.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombres.setForeground(new Color(45, 55, 65));

		lblNombres.setBounds(45, 35, 130, 20);

		panelCentral.add(lblNombres);

		txtNombres = new JTextField();

		txtNombres.setFont(new Font("Tahoma", Font.PLAIN, 12));

		txtNombres.setBounds(190, 32, 400, 28);

		txtNombres.setBorder(
				BorderFactory.createLineBorder(
						new Color(180, 190, 200)
				)
		);

		panelCentral.add(txtNombres);

		txtNombres.setColumns(10);

		// =========================================================
		// APELLIDOS
		// =========================================================

		JLabel lblApellidos = new JLabel("Apellidos");

		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblApellidos.setForeground(new Color(45, 55, 65));

		lblApellidos.setBounds(45, 82, 130, 20);

		panelCentral.add(lblApellidos);

		txtApellidos = new JTextField();

		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 12));

		txtApellidos.setBounds(190, 79, 400, 28);

		txtApellidos.setBorder(
				BorderFactory.createLineBorder(
						new Color(180, 190, 200)
				)
		);

		panelCentral.add(txtApellidos);

		txtApellidos.setColumns(10);

		// =========================================================
		// DNI
		// =========================================================

		JLabel lblDNI = new JLabel("DNI");

		lblDNI.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDNI.setForeground(new Color(45, 55, 65));

		lblDNI.setBounds(45, 129, 130, 20);

		panelCentral.add(lblDNI);

		txtDNI = new JTextField();

		txtDNI.setFont(new Font("Tahoma", Font.PLAIN, 12));

		txtDNI.setBounds(190, 126, 400, 28);

		txtDNI.setBorder(
				BorderFactory.createLineBorder(
						new Color(180, 190, 200)
				)
		);

		panelCentral.add(txtDNI);

		txtDNI.setColumns(10);

		// =========================================================
		// EMAIL
		// =========================================================

		JLabel lblEmail = new JLabel("Email");

		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setForeground(new Color(45, 55, 65));

		lblEmail.setBounds(45, 176, 130, 20);

		panelCentral.add(lblEmail);

		txtEmail = new JTextField();

		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));

		txtEmail.setBounds(190, 173, 400, 28);

		txtEmail.setBorder(
				BorderFactory.createLineBorder(
						new Color(180, 190, 200)
				)
		);

		panelCentral.add(txtEmail);

		txtEmail.setColumns(10);

		// =========================================================
		// TELEFONO
		// =========================================================

		JLabel lblTelefono = new JLabel("Teléfono");

		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelefono.setForeground(new Color(45, 55, 65));

		lblTelefono.setBounds(45, 223, 130, 20);

		panelCentral.add(lblTelefono);

		txtTelefono = new JTextField();

		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));

		txtTelefono.setBounds(190, 220, 400, 28);

		txtTelefono.setBorder(
				BorderFactory.createLineBorder(
						new Color(180, 190, 200)
				)
		);

		panelCentral.add(txtTelefono);

		txtTelefono.setColumns(10);

		// =========================================================
		// FECHA NACIMIENTO
		// =========================================================

		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");

		lblFechaNacimiento.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFechaNacimiento.setForeground(new Color(45, 55, 65));

		lblFechaNacimiento.setBounds(45, 270, 130, 20);

		panelCentral.add(lblFechaNacimiento);

		txtFechaNacimiento = new JTextField();

		txtFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 12));

		txtFechaNacimiento.setBounds(190, 267, 400, 28);

		txtFechaNacimiento.setBorder(
				BorderFactory.createLineBorder(
						new Color(180, 190, 200)
				)
		);

		panelCentral.add(txtFechaNacimiento);

		txtFechaNacimiento.setColumns(10);

		// =========================================================
		// SUELDO
		// =========================================================

		JLabel lblSueldo = new JLabel("Sueldo");

		lblSueldo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSueldo.setForeground(new Color(45, 55, 65));

		lblSueldo.setBounds(45, 317, 130, 20);

		panelCentral.add(lblSueldo);

		txtSueldo = new JTextField();

		txtSueldo.setFont(new Font("Tahoma", Font.PLAIN, 12));

		txtSueldo.setBounds(190, 314, 400, 28);

		txtSueldo.setBorder(
				BorderFactory.createLineBorder(
						new Color(180, 190, 200)
				)
		);

		panelCentral.add(txtSueldo);

		txtSueldo.setColumns(10);

		// =========================================================
		// TIPO DE EMPLEADO
		// =========================================================

		JLabel lblTipo = new JLabel("Tipo de Empleado");

		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTipo.setForeground(new Color(45, 55, 65));

		lblTipo.setBounds(45, 364, 130, 20);

		panelCentral.add(lblTipo);

		cboTipo = new JComboBox<String>();

		cboTipo.setFont(new Font("Tahoma", Font.PLAIN, 12));

		cboTipo.setBounds(190, 361, 400, 28);

		cboTipo.setBorder(
				BorderFactory.createLineBorder(
						new Color(180, 190, 200)
				)
		);

		panelCentral.add(cboTipo);

		// =========================================================
		// BOTON REGISTRAR
		// =========================================================

		btnRegistrar = new JButton("Registrar");

		btnRegistrar.setIcon(
				new ImageIcon("icons/001-agregar.png")
		);

		btnRegistrar.addActionListener(this);

		btnRegistrar.setFont(
				new Font("Tahoma", Font.BOLD, 12)
		);

		btnRegistrar.setBounds(175, 420, 135, 38);

		btnRegistrar.setBackground(new Color(225, 235, 245));
		btnRegistrar.setForeground(new Color(30, 45, 60));

		btnRegistrar.setFocusPainted(false);
		btnRegistrar.setBorder(
				BorderFactory.createLineBorder(
						new Color(170, 185, 200)
				)
		);

		panelCentral.add(btnRegistrar);

		// =========================================================
		// BOTON LIMPIAR
		// =========================================================

		btnLimpiar = new JButton("Limpiar");

		btnLimpiar.setIcon(
				new ImageIcon("icons/005-limpiar.png")
		);

		btnLimpiar.addActionListener(this);

		btnLimpiar.setFont(
				new Font("Tahoma", Font.BOLD, 12)
		);

		btnLimpiar.setBounds(350, 420, 135, 38);

		btnLimpiar.setBackground(new Color(245, 245, 245));
		btnLimpiar.setForeground(new Color(50, 50, 50));

		btnLimpiar.setFocusPainted(false);
		btnLimpiar.setBorder(
				BorderFactory.createLineBorder(
						new Color(190, 190, 190)
				)
		);

		panelCentral.add(btnLimpiar);

		// =========================================================
		// CARGAR COMBO
		// =========================================================

		cargarComboTipo();
	}

	// =============================================================
	// EVENTOS
	// =============================================================

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnRegistrar) {
			handleBtnRegistrarActionPerformed(e);
		}

		if (e.getSource() == btnLimpiar) {
			handleBtnLimpiarActionPerformed(e);
		}
	}

	// =============================================================
	// REGISTRAR EMPLEADO
	// =============================================================

	protected void handleBtnRegistrarActionPerformed(ActionEvent e) {

		// 1. Capturar los datos del formulario en variables locales

		String nombres = txtNombres.getText().trim();
		String apellidos = txtApellidos.getText().trim();
		String dni = txtDNI.getText().trim();
		String email = txtEmail.getText().trim();
		String telefono = txtTelefono.getText().trim();
		String fechaNacimiento = txtFechaNacimiento.getText().trim();
		String sueldo = txtSueldo.getText().trim();
		String tipoSeleccionado = cboTipo.getSelectedItem().toString();

		// 2. Validar que los datos sean correctos

		if (nombres.isEmpty()) {

			JOptionPane.showMessageDialog(
					this,
					"Debe ingresar los nombres."
			);

			return;
		}

		if (!nombres.matches(ValidateUtil.TEXTO_40)) {

			JOptionPane.showMessageDialog(
					this,
					"Los nombres son inválidos. Deben contener solo letras y espacios."
			);

			return;
		}

		if (apellidos.isEmpty()) {

			JOptionPane.showMessageDialog(
					this,
					"Debe ingresar los apellidos."
			);

			return;
		}

		if (!apellidos.matches(ValidateUtil.TEXTO_40)) {

			JOptionPane.showMessageDialog(
					this,
					"Los apellidos son inválidos. Deben contener solo letras y espacios."
			);

			return;
		}

		if (!dni.matches(ValidateUtil.DNI)) {

			JOptionPane.showMessageDialog(
					this,
					"El DNI es inválido. Debe contener exactamente 8 dígitos."
			);

			return;
		}

		if (!email.matches(ValidateUtil.EMAIL)) {

			JOptionPane.showMessageDialog(
					this,
					"El email es inválido. Debe tener un formato válido."
			);

			return;
		}

		if (!telefono.matches(ValidateUtil.ENTERO_MAS_UN_DIGITO)) {

			JOptionPane.showMessageDialog(
					this,
					"El teléfono debe contener solamente números."
			);

			return;
		}

		if (!fechaNacimiento.matches(ValidateUtil.DATE_YYYY_MM_DD)) {

			JOptionPane.showMessageDialog(
					this,
					"La fecha de nacimiento es inválida. Use el formato YYYY-MM-DD."
			);

			return;
		}

		if (!sueldo.matches(ValidateUtil.REAL_CON_O_SIN_DECIMALES)) {

			JOptionPane.showMessageDialog(
					this,
					"El sueldo debe ser un número válido."
			);

			return;
		}

		if (cboTipo.getSelectedIndex() == 0) {

			JOptionPane.showMessageDialog(
					this,
					"Debe seleccionar un tipo de empleado."
			);

			return;
		}

		try {

			// 3. Crear objeto TipoEmpleado

			TipoEmpleado objTipoEmpleado = new TipoEmpleado();

			objTipoEmpleado.setIdTipoEmpleado(
					Integer.parseInt(
							tipoSeleccionado.split(" - ")[0]
					)
			);

			// 4. Crear objeto Empleado

			Empleado objEmpleado = new Empleado();

			objEmpleado.setNombres(nombres);
			objEmpleado.setApellidos(apellidos);
			objEmpleado.setDni(dni);
			objEmpleado.setEmail(email);
			objEmpleado.setTelefono(telefono);

			objEmpleado.setFechaNacimiento(
					LocalDate.parse(fechaNacimiento)
			);

			objEmpleado.setSueldo(
					Double.parseDouble(sueldo)
			);

			objEmpleado.setTipoEmpleado(objTipoEmpleado);

			// 5. Crear objeto EmpleadoModel

			EmpleadoModel objEmpleadoModel = new EmpleadoModel();

			int insertados =
					objEmpleadoModel.insertaEmpleado(objEmpleado);

			// 6. Mostrar mensaje de confirmacion

			if (insertados > 0) {

				JOptionPane.showMessageDialog(
						this,
						"Empleado registrado correctamente"
				);

				handleBtnLimpiarActionPerformed(e);
			}

		} catch (Exception ex) {

			JOptionPane.showMessageDialog(
					this,
					"Error al registrar el empleado: "
							+ ex.getMessage()
			);

			ex.printStackTrace();
		}
	}

	// =============================================================
	// LIMPIAR
	// =============================================================

	protected void handleBtnLimpiarActionPerformed(ActionEvent e) {

		txtNombres.setText("");
		txtApellidos.setText("");
		txtDNI.setText("");
		txtEmail.setText("");
		txtTelefono.setText("");
		txtFechaNacimiento.setText("");
		txtSueldo.setText("");

		if (cboTipo.getItemCount() > 0) {
			cboTipo.setSelectedIndex(0);
		}
	}

	// =============================================================
	// CARGAR COMBO TIPO EMPLEADO
	// =============================================================

	public void cargarComboTipo() {

		TipoEmpleadoModel model = new TipoEmpleadoModel();

		List<TipoEmpleado> tipos =
				model.listarTipoEmpleado();

		cboTipo.addItem("[ Seleccione un tipo ]");

		for (TipoEmpleado tipo : tipos) {

			cboTipo.addItem(
					tipo.getIdTipoEmpleado()
					+ " - "
					+ tipo.getDescripcion()
			);
		}
	}
}