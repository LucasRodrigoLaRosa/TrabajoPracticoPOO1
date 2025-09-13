package utils;

import java.time.LocalDate;
import java.time.Period;


public class Funciones {
	
	public static boolean calcularMayorDeEdad(LocalDate fechaDeNacimiento) {
		boolean retorno =false;
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaDeNacimiento, fechaActual);
		int edad = periodo.getYears();
		if (edad>=18) {
			retorno = true;
		}
		
		return retorno;
	}
	
}
