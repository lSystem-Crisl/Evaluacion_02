package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entity.Empleado;

public class EmpleadoModel {

	public int insertaEmpleado(Empleado empleado) {
		int insertados = 0;
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			// 1. Crear conexion
			conn = util.MySqlDBConexion.getConexion();

			// 2. Crear sentencia SQL
			String sql = "INSERT INTO empleado(nombres, apellidos, dni, email, telefono, fechaNacimiento, sueldo, idTipoEmpleado) VALUES(?,?,?,?,?,?,?,?)";

			ps = conn.prepareStatement(sql);

			ps.setString(1, empleado.getNombres());
			ps.setString(2, empleado.getApellidos());
			ps.setString(3, empleado.getDni());
			ps.setString(4, empleado.getEmail());
			ps.setString(5, empleado.getTelefono());
			ps.setDate(6, java.sql.Date.valueOf(empleado.getFechaNacimiento()));
			ps.setDouble(7, empleado.getSueldo());
			ps.setInt(8, empleado.getTipoEmpleado().getIdTipoEmpleado());

			System.out.println("SQL: " + ps.toString());

			// 3. Ejecutar sentencia SQL
			insertados = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (ps != null)
					ps.close();

				if (conn != null)
					conn.close();

			} catch (Exception e) {
			}
		}

		return insertados;
	}
}