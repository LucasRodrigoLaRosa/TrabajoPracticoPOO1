package Sistema;

import java.time.LocalDate;

public abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected long dni;
	protected LocalDate fechaDeNacimiento;
	
	protected Persona(String nombre, String apellido, long dni, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellido() {
		return apellido;
	}

	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}

	protected long getDni() {
		return dni;
	}

	protected void setDni(long dni) {
		this.dni = dni;
	}

	protected LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	protected void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

}
