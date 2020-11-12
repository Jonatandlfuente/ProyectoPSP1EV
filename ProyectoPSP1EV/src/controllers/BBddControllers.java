package controllers;

import java.sql.Statement;
import java.util.Random;

import models.NumerosAleatorios;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase que gestiona las operaciones relacionadas con la BBDD
 * 
 * @author jonatan.delafuente
 *
 */

public class BBddControllers {

	/**
	 * Metodo que genera una cadena de caracteres al azar con tamaño 9
	 * 
	 * @return saltStr
	 */

	public String emailAleatoirio() {

		String saltChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 10) {
			int index = (int) (rnd.nextFloat() * saltChars.length());
			salt.append(saltChars.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}

	/**
	 * Método para insertar un registro en una BBDD mySQL
	 * 
	 * @param email
	 * @param aleatorio
	 */

	public void escribirBbdd(String email, int aleatorio) {

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_psp_1", "DAM2020_PSP",
					"DAM2020_PSP");
			Statement consulta = conexion.createStatement();
			consulta.executeUpdate("insert into empleados(EMAIL,INGRESOS) values('" + email + "'," + aleatorio + ")");
			System.out.println(Thread.currentThread().getName() + " email: " + email + " salario: " + aleatorio);
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método para borrar todos registros de una BBDD mySQL
	 */

	public void borrarBbdd() {

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_psp_1", "DAM2020_PSP",
					"DAM2020_PSP");
			Statement consulta = conexion.createStatement();
			int valor = consulta.executeUpdate("TRUNCATE TABLE empleados");
			System.out.println("Tabla borrada!!");
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
