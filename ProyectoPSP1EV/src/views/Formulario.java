package views;

import java.util.Scanner;

/**
 * Clase que gestiona la interacci�n del usuario con el programa
 * 
 * @author jonatan.delafuente
 *
 */

public class Formulario {

	/**
	 * M�todo que pide al usuario el n�mero de hilos que quiere utilizar en la
	 * ejecuci�n del programa
	 * 
	 * @return opcion
	 */

	public int nuevoFormulario() {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		String opcionS = "";
		boolean checkNumerico = false;
		while (opcion == 0) {
			do {
				System.out.println("Introduce el n�mero de hilos");
				opcionS = teclado.nextLine();
				checkNumerico = isNumeric(opcionS);
			} while (checkNumerico != true);
			opcion = Integer.parseInt(opcionS);
			if (opcion == 0) {
				System.out.println("Introduce al menos un hilo para ejecutar el programa!!\n");
			}
		}
		return opcion;
	}

	/**
	 * M�todo que pide al usuario el n�mero de registros que quiere insertar en la
	 * BBDD mySQL
	 * 
	 * @return opcion
	 */

	public int nuevoFormularioAleatorios() {

		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		String opcionS = "";
		boolean checkNumerico = false;
		do {
			System.out.println("Introduce el n�mero de registros");
			opcionS = teclado.nextLine();
			checkNumerico = isNumeric(opcionS);
		} while (checkNumerico != true);
		opcion = Integer.parseInt(opcionS);
		if (opcion == 0) {
			System.out.println("No se han a�adido nuevos registros a la bbdd!!\n");
		}

		return opcion;

	}

	/**
	 * M�todo que comprueba si un string es un num�ro
	 * 
	 * @param str
	 * @return false si no es num�rico y true si lo es
	 */

	public static boolean isNumeric(final String str) {

		boolean comprobarNumero = false;
		if (str == null || str.length() == 0) {
			System.out.println("Introduce un n�mero no otro tipo de caracter!\n");
			return false;
		}
		comprobarNumero = str.chars().allMatch(Character::isDigit);
		if (!comprobarNumero) {
			System.out.println("Introduce un n�mero no otro tipo de caracter!\n");
		}
		return comprobarNumero;

	}
}
