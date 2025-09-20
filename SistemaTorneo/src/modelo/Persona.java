package modelo;

import java.util.Date;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
	protected String nombre;
	protected String apellido;
	protected long dni;
	protected LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, String apellido, long dni, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate  fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public boolean calcularEdad(LocalDate FechaNacimiento) {
		LocalDate fechaActual =LocalDate.now();
		Period periodo=Period.between(FechaNacimiento, fechaActual);
		return periodo.getYears()>=18;
		
		
		
		
	}
	
	 //---------------------PUNTO 3(TRAER POR ID)------------------------
	   public boolean compararDni(long dni) {
	    	
	    	if(this.dni==dni) {
	    		
	    		
	    		return true;
	    		
	    		
	    	}
	    	return false;
	
}
	
	
}
