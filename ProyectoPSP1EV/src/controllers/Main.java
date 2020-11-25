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
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Formulario miFormulario = new Formulario();
		int numHilos = 0;
		int rangoInicial = 0;
		int rangoFinal = 0;
		int totalRegistros = 0;
		numHilos = miFormulario.nuevoFormularioHilos();
		Semaphore semaforo = new Semaphore(1);
		int numRegistros = miFormulario.nuevoFormularioRegistros();
		BBddControllers controladorBBDD = new BBddControllers();
		NumerosAleatorios numbers;
		int resto = numRegistros % numHilos;
		int cont = (numRegistros / numHilos) - 1;
		for (int i = 0; i < numHilos; i++) {

			/*
			 * Usamos un contador para que no repita rangos es decir en vez de ser 0-2 2-4
			 * sería 0-2 3-5
			 */
			rangoInicial = (numRegistros / numHilos) * (i);

			/*
			 * Repartirmos la carga de trabajo entre los hilos, si el cociente entre
			 * registros e hilos no es exacto, para los restos vuelven a ejecutarse
			 * empezando por el primer hilo hasta que el resto sea 0
			 */
			if (resto != 0) {
				rangoFinal = ((numRegistros / numHilos) * (i)) + cont + 1;
				resto--;
			} else {
				rangoFinal = ((numRegistros / numHilos) * (i)) + cont;
			}
			numbers = new NumerosAleatorios(rangoInicial, rangoFinal, numHilos, numRegistros, semaforo);
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
