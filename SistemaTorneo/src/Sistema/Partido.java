package Sistema;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Partido {

	private LocalDate fecha;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private String estadio;
	private List<EstadisticasJugador> estadisticas;

	public Partido(LocalDate fecha, Equipo equipoLocal, Equipo equipoVisitante, String estadio) {
		this.fecha = fecha;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.estadio = estadio;
		this.estadisticas = new ArrayList<EstadisticasJugador>();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
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
	
	public List<EstadisticasJugador> getEstadisticas(){
		return estadisticas;
	}
	
	public void agregarEstadistica(EstadisticasJugador est) {
		estadisticas.add(est);
	}
	
	public Ganador obtenerGanador() {
		Ganador ganador = null;
		int golesEquipoLocal = 0;
		int golesEquipoVisitante = 0;
		
		for(EstadisticasJugador e: estadisticas) {
			long dniJugador = e.getJugador().getDni();
			
			Jugador jugadorEquipoLocal = equipoLocal.obtenerJugadorPorDni(dniJugador);
			Jugador jugadorEquipoVisitante = equipoVisitante.obtenerJugadorPorDni(dniJugador);
			
			if(jugadorEquipoLocal != null && e.getCantidadGoles() > 0) {
				golesEquipoLocal = golesEquipoLocal + e.getCantidadGoles();
			}
			
			if(jugadorEquipoVisitante != null && e.getCantidadGoles() > 0) {
				golesEquipoVisitante = golesEquipoVisitante + e.getCantidadGoles();
			}
		}
		
		if(golesEquipoLocal > golesEquipoVisitante) {
			ganador = new Ganador(fecha, equipoLocal, golesEquipoLocal);
		}
		
		if(golesEquipoVisitante > golesEquipoLocal) {
			ganador = new Ganador(fecha, equipoVisitante, golesEquipoVisitante);
		}
		
		return ganador;
	}
}
