package Sistema;

import utils.Funciones;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Jugador extends Persona {
	private float altura;
	private int peso;
	private String posicion;
	private int dorsal;
	private List<EstadisticasJugador> estadisticas;
	
	public Jugador(float altura, int peso, String posicion, int dorsal, List<EstadisticasJugador> estadistica,
			String nombre, String apellido, long dni, LocalDate fechaDeNacimiento) {
		super(nombre, apellido, dni, fechaDeNacimiento);
		this.altura = altura;
		this.peso = peso;
		this.posicion = posicion;
		this.dorsal = dorsal;
		this.estadisticas = new ArrayList<EstadisticasJugador>();
	}
	
	public void setFechaDeNacimientoJugador(LocalDate fechaDeNacimiento) throws Exception {
		if(Funciones.calcularMayorDeEdad(fechaDeNacimiento)) throw new Exception("Error: El jugador debe ser mayor de edad");
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	public List<EstadisticasJugador> getEstadisticas() {
		return this.estadisticas;
	}

}
