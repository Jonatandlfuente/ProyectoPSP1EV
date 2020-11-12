package views;

import java.util.Scanner;

/**
 * Clase que gestiona la interacci�n del usuario con el programa
 * @author jonatan.delafuente
 *
 */

public class Formulario {
	
	/**
	 * M�todo que pide al usuario el n�mero de hilos que quiere utilizar en la ejecuci�n del programa
	 * @return opcion
	 */
	
	public int nuevoFormulario() {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		System.out.println("Introduce el n�mero de hilos");
		opcion = teclado.nextInt();
		return opcion;
	}
	
	/**
	 * M�todo que pide al usuario el n�mero de registros que quiere insertar en la BBDD mySQL
	 * @return opcion
	 */

	public int nuevoFormularioAleatorios() {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		System.out.println("Introduce el n�mero de registros");
		opcion = teclado.nextInt();
		return opcion;
	}
}
