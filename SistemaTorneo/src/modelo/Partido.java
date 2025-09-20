package modelo;

import java.util.Date;
import java.time.LocalDate;

public class Partido {
	private int id;
	private LocalDate fecha;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private String estadio;

	public Partido(int id, LocalDate fecha, Equipo equipoLocal, Equipo equipoVisitante, String estadio) {
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
	
	//---------------------PUNTO 3(TRAER POR ID)------------------------
	   public boolean traerEquipoPorId(int id) {
	    	
	    	if(this.id==id) {
	    		
	    		
	    		return true;
	    		
	    		
	    	}
	    	return false;
	    	
	    	
	    }
	   
	   
	   
	   
	// ---------------------PUNTO 4  (TRAER EQUIPOS GANADORES) ---------------------------------------
	public Ganador retornarEquipoGanador(LocalDate fecha) {
		
	
		
		if(equipoLocal.cantGolesTotales(fecha)>equipoVisitante.cantGolesTotales(fecha)) {
			
		
			Ganador ganador=new Ganador(equipoLocal,fecha,equipoLocal.cantGolesTotales(fecha));
			return ganador;
		}
		
	if(equipoLocal.cantGolesTotales(fecha)<equipoVisitante.cantGolesTotales(fecha)) {
			
		Ganador ganador=new Ganador(equipoVisitante,fecha,equipoVisitante.cantGolesTotales(fecha));
		return ganador;
			
		}else {return null;
			
			
			          }// ---------------------------CONTROLAR ESE NULL--------------- 
		
	}
	
	
	
	
	
	
	
	

}
