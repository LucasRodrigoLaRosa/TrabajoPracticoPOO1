package modelo;

import java.util.Date;

public class Partido {
	private int id;
	private Date fecha;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private String estadio;

	public Partido(int id, Date fecha, Equipo equipoLocal, Equipo equipoVisitante, String estadio) {
		this.fecha = fecha;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.estadio = estadio;
		this.id=id;
	}

	@Override
	public String toString() {
		return "Partido [id=" + id + ", fecha=" + fecha + ", equipoLocal=" + equipoLocal + ", equipoVisitante="
				+ equipoVisitante + ", estadio=" + estadio + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

}
