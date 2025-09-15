package modelo;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Torneo {
	private String nombre;
	private String temporada;
	private List<Equipo> equipo;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
	public Torneo(String nombre, String temporada, LocalDate fechaInicio, LocalDate fechaFin) {
		this.nombre = nombre;
		this.temporada = temporada;
		this.equipo = new ArrayList<Equipo>();
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
	
	
	//------------------------METODOS DE LA LISTA ----------------------------------------
	
	// AGREGAR EQUIPO
	public boolean agregarEquipo(Equipo equi) {
		
		return  equipo.add(equi);
		
	}
	
	//REMOVER EQUIPO
    
	public boolean romeverEquipo(String codigo) throws Exception{
		
		
		
		int i=0;
		int removedorEquipo=-1;
		while(i<equipo.size()) {
		if(equipo.get(i).getCodigo().equals(codigo)) {
			
			removedorEquipo=i;
		
		}
		
		i++;
		}
		
	
	
	if(removedorEquipo==-1)throw new Exception("ERROR : CODIGO DE EQUIPO NO EXISTE ");
	equipo.remove(removedorEquipo);
	return true;
			}
}
