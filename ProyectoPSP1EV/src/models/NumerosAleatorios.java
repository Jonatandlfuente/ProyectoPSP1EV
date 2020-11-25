package models;

import java.util.Random;
import java.util.concurrent.Semaphore;
import controllers.BBddControllers;

/**
 * Clase NumerosAleatorios
 * 
 * @author jonatan.delafuente
 *
 */

public class NumerosAleatorios extends Thread {

	private int rangoFinal;
	private int rangoInicial;
	private int numHilos;
	private int numRegistros;
	private Semaphore semaforo;

	/**
	 * Constructor de la Clase NumerosAleatorios
	 * 
	 * @param rangoInicial
	 * @param rangoFinal
	 * @param numHilos
	 * @param numRegistros
	 * @param semaforo
	 */

	public NumerosAleatorios(int rangoInicial, int rangoFinal, int numHilos, int numRegistros, Semaphore semaforo) {
		this.rangoFinal = rangoFinal;
		this.rangoInicial = rangoInicial;
		this.numHilos = numHilos;
		this.numRegistros = numRegistros;
		this.semaforo = semaforo;
	}

	/**
	 * Lógica del hilo, genera un número y un email aleatorio y los inserta en una
	 * BBDD mySQL
	 */

	@Override
	public void run() {
		BBddControllers controladorBBDD = new BBddControllers();
		int aleatorio;
		String email;
		for (int i = rangoInicial; i <= rangoFinal; i++) {
			Random r = new Random();
			aleatorio = r.nextInt(991) + 10;
			email = controladorBBDD.emailAleatoirio() + "@gmail.com";
			controladorBBDD.escribirBbddEmailSalario(email, aleatorio);
		}
	}
}
