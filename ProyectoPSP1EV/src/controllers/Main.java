package controllers;

import java.util.concurrent.Semaphore;

import models.NumerosAleatorios;
import views.Formulario;

/**
 * Clase Main ejecutadora
 */

public class Main {
	
	/**
	 * Disparador de la aplicación
	 * @param args
	 */

	public static void main(String[] args) {
		Formulario miFormulario = new Formulario();
		int numHilos = 0;
		int rangoInicial = 0;
		int rangoFinal = 0;
		int totalRegistros = 0;
		numHilos = miFormulario.nuevoFormulario();
		Semaphore semaforo = new Semaphore(1);
		int numRegistros = miFormulario.nuevoFormularioAleatorios();
		BBddControllers controladorBBDD = new BBddControllers();
		NumerosAleatorios numbers;
		int cont = (numRegistros / numHilos) - 1;
		for (int i = 0; i < numHilos; i++) {
			/*Usamos un contador para que no repita rangos es decir en vez de ser 0-2 2-4
			 sería 0-2 3-5*/
			rangoInicial = (numRegistros / numHilos) * (i);
			rangoFinal = ((numRegistros / numHilos) * (i)) + cont;
			/*Para coger el tramo total de registros si la división numRegistros / numHilos
			no es exacta*/
			if (i == numHilos - 1) {
				rangoFinal = numRegistros - 1;
			}
			numbers = new NumerosAleatorios(rangoInicial, rangoFinal, numHilos, numRegistros, semaforo);
			System.out.println(numbers.getName());
			numbers.start();
			try {
				numbers.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// Descomentar para borrar la bbdd
		// controladorBBDD.borrarBbdd();
	}
}
