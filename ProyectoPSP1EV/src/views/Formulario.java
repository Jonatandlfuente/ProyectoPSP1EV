package views;

import java.util.Scanner;

/**
 * Clase que gestiona la interacción del usuario con el programa
 * @author jonatan.delafuente
 *
 */

public class Formulario {
	
	/**
	 * Método que pide al usuario el número de hilos que quiere utilizar en la ejecución del programa
	 * @return opcion
	 */
	
	public int nuevoFormulario() {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		System.out.println("Introduce el número de hilos");
		opcion = teclado.nextInt();
		return opcion;
	}
	
	/**
	 * Método que pide al usuario el número de registros que quiere insertar en la BBDD mySQL
	 * @return opcion
	 */

	public int nuevoFormularioAleatorios() {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		System.out.println("Introduce el número de registros");
		opcion = teclado.nextInt();
		return opcion;
	}
}
