package controllers;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase que gestiona los controladores de la BBDD
 * @author jonatan.delafuente
 *
 */

public class BBddControllers {
	
	/**
	 * Método que lee una bbdd mySQL y devuelve un arrayList con los ID de todos los empleados
	 * @return arrayIds
	 */
	
	public ArrayList<Integer> leerBbddId() {
		
	ArrayList<Integer> arrayIds= new ArrayList<>(); 
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bbdd_psp_1","DAM2020_PSP","DAM2020_PSP");
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery("select ID from empleados");
			while (registro.next()) {
				int num = registro.getInt("ID");
				arrayIds.add(num);
			}
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arrayIds;
	}
}
