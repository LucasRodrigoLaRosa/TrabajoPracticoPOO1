package Sistema;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Torneo {
	private String nombre;
	private String temporada;
	private List<Partido> partidos;
	private List<Equipo> equipos;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
	public Torneo(String nombre, String temporada, LocalDate fechaInicio, LocalDate fechaFin) {
		this.nombre = nombre;
		this.temporada = temporada;
		this.partidos = new ArrayList<Partido>();
		this.equipos = new ArrayList<Equipo>();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}
	
	public List<Equipo> getEquipos(){
		return equipos;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public void agregarEquipo(Equipo equipo) {
		equipos.add(equipo);
	}
	
	public void agregarPartido(Partido partido) {
		partidos.add(partido); 
	}
	
	public List<Ganador> obtenerGanadoresEnFecha(LocalDate fecha){
		List<Ganador> ganadores = new ArrayList<Ganador>();
		
		for(Partido partido: partidos) {
			if(partido.getFecha().isEqual(fecha)) {
				ganadores.add(partido.obtenerGanador());
			}
		}
		
		return ganadores;
	}
	
	public void mostrarGanadores(List<Ganador> ganadores) {
		for(Ganador ganador: ganadores) {
			System.out.println(ganador.toString());
		}
	}

}
