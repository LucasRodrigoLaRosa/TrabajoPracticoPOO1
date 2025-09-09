package Sistema;

import java.util.List;
import java.util.Date;

public class Torneo {
	private String nombre;
	private String temporada;
	private List<Equipo> equipo;
	private Date fechaInicio;
	private Date fechaFin;
	
	public Torneo(String nombre, String temporada, List<Equipo> equipo, Date fechaInicio, Date fechaFin) {
		this.nombre = nombre;
		this.temporada = temporada;
		this.equipo = equipo;
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

	public List<Equipo> getEquipo() {
		return equipo;
	}

	public void setEquipo(List<Equipo> equipo) {
		this.equipo = equipo;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

}
