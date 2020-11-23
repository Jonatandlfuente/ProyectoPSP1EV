package controllers;

import java.sql.Statement;
import java.util.Properties;
import java.util.Random;

import javax.swing.JOptionPane;

import models.NumerosAleatorios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
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
	 * Conexión a la BBDD mySql
	 * 
	 * @return conexion
	 */

	// Conexión BBDD
	public Connection conexionBbdd() {

		Connection conexion = null;
		Properties propiedades = new Properties();
		InputStream entrada = null;
		try {
			entrada = new FileInputStream("datos.properties");
			propiedades.load(entrada);
			propiedades.getProperty("pass");
			conexion = DriverManager.getConnection(propiedades.getProperty("servidor"), propiedades.getProperty("user"),
					propiedades.getProperty("pass"));
		} catch (SQLException e) {
			System.out.println("Fallo en la conexión a la BBDD");
		} catch (FileNotFoundException e) {
			e.getLocalizedMessage();
		} catch (IOException e) {
			e.getLocalizedMessage();
		}
		return conexion;
	}

	/**
	 * Método para insertar un registro en la BBDD mySQL
	 * 
	 * @param email
	 * @param aleatorio
	 */

	public void escribirBbdd(String email, int aleatorio) {

		try {
			Connection conexion = conexionBbdd();
			if (conexion != null) {
				Statement consulta = conexion.createStatement();
				consulta.executeUpdate(
						"insert into empleados(EMAIL,INGRESOS) values('" + email + "'," + aleatorio + ")");
				System.out.println(Thread.currentThread().getName() + " email: " + email + " salario: " + aleatorio);
				conexion.close();
			}
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Método para borrar todos registros de la BBDD mySQL
	 */

	public void borrarBbdd() {

		try {
			Connection conexion = conexionBbdd();
			if (conexion != null) {
				Statement consulta = conexion.createStatement();
				int valor = consulta.executeUpdate("TRUNCATE TABLE empleados");
				System.out.println("Tabla borrada!!");
				conexion.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
