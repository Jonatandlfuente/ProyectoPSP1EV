package views;

import java.util.Scanner;

/**
 * Clase que gestiona la interacción del usuario con el programa
 * 
 * @author jonatan.delafuente
 *
 */

public class Formulario {

	/**
	 * Método que pide al usuario el número de hilos que quiere utilizar en la
	 * ejecución del programa
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
				System.out.println("Introduce el número de hilos");
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
	 * Método que pide al usuario el número de registros que quiere insertar en la
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
			System.out.println("Introduce el número de registros");
			opcionS = teclado.nextLine();
			checkNumerico = isNumeric(opcionS);
		} while (checkNumerico != true);
		opcion = Integer.parseInt(opcionS);
		if (opcion == 0) {
			System.out.println("No se han añadido nuevos registros a la bbdd!!\n");
		}

		return opcion;

	}

	/**
	 * Método que comprueba si un string es un numéro
	 * 
	 * @param str
	 * @return false si no es numérico y true si lo es
	 */

	public static boolean isNumeric(final String str) {

		boolean comprobarNumero = false;
		if (str == null || str.length() == 0) {
			System.out.println("Introduce un número no otro tipo de caracter!\n");
			return false;
		}
		comprobarNumero = str.chars().allMatch(Character::isDigit);
		if (!comprobarNumero) {
			System.out.println("Introduce un número no otro tipo de caracter!\n");
		}
		return comprobarNumero;

	}
}
