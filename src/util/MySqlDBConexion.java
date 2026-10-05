package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Permite crear una conexion a la BD
 * Se debe tener:
 * 1) Driver JDBC
 * 2) IP del Servidor
 * 3) puerto
 * 4) Nombre de la BD
 * 5) Usuario
 * 6) Password
 */
public class MySqlDBConexion {

	// Accede a las clases del mysqlconnector
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// Metodo para crear conexiones
	public static Connection getConexion() {

		Connection salida = null;

		try {

			salida = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/evaluacion_t2?serverTimezone=America/Lima",
					"root",
					"mysql");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return salida;
	}
}