package Sistema;

import java.util.List;
import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private String codigo;
	private List<Jugador> jugadores;
	private Entrenador entrenador;

	public Equipo(String nombre, String codigo, Entrenador entrenador) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.jugadores = new ArrayList<Jugador>();
		this.entrenador = entrenador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}
	
	public void agregarJugador(Jugador jugador) {
		this.jugadores.add(jugador);
	}
	
	public Jugador obtenerJugadorPorDni(long dni) {
		for (Jugador j : jugadores) {
	        if (j.getDni() == dni) {
	            return j;
	        }
	    }
		return null;
	}
	
}
