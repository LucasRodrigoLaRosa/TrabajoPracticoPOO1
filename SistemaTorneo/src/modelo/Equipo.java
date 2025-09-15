package modelo;

import java.util.ArrayList;
import java.util.List;



public class Equipo {
	private String nombre;
	private String codigo;
	private List<Jugador> jugadores;
	private String entrenador;
	
	public Equipo(String nombre, String codigo, String entrenador) {
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

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}// ESTO TAL VEZ HABRIA QUE SACARLO POR QUE NO SE VA A CARGAR UNA LISTA TOTALMENTE NUEVA CON JUGADORES TODO DE UNA (SE CARGA JUGADOR POR JUGADOR )

	public String getEntrenador() {
		return entrenador;
	}
	
	

	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}
	
	//------------------------METODOS DE LA LISTA ----------------------------------------
	
	//AGREGAR
	public boolean agregarJugadores(Jugador jugador)throws Exception {
		if(jugador==null) {throw new Exception ("ERROR: EL JUGADOR NO TIENE DATOS CARGADOS");}
		return jugadores.add(jugador);	
	}
	
	//REMOVER 
	
	public boolean removerJugador(long dni)throws Exception {
		
		
		int i=0;
		int jugador=-1;
		
		while(i<jugadores.size()) {
			
			if(jugadores.get(i).getDni()==dni) {
				
			jugador=i;	}
			
			i++;
		}
		
		if(jugador ==-1 )throw new Exception ("ERROR: EL JUGADOR BUSCADO NO EXISTE");
		
		jugadores.remove(jugador);
		
		return true;
		
		
	} 
	
	
}
