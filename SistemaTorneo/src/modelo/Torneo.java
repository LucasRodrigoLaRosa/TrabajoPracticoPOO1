package modelo;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;


public class Torneo {
	private String nombre;
	private String temporada;
	private List<Equipo> equipos;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String id;
	private List<Partido> partidos;
	
	public Torneo(String nombre, String temporada, LocalDate fechaInicio, LocalDate fechaFin) {
		this.nombre = nombre;
		this.temporada = temporada;
		this.equipos = new ArrayList<Equipo>();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.id=generarId(nombre,temporada,fechaInicio);
		this.partidos = new ArrayList<Partido>();
	}

	public String getId() {
		return id;
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
		return equipos;
	}

	public List<Partido> getPartidos() {
		return partidos;
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
		
		return  equipos.add(equi);
		
	}
	
	//REMOVER EQUIPO
    
	public boolean romeverEquipo(String codigo) throws Exception{
		
		
		
		int i=0;
		int removedorEquipo=-1;
		while(i<equipos.size()) {
		if(equipos.get(i).getCodigo().equals(codigo)) {
			
			removedorEquipo=i;
		
		}
		
		i++;
		}
		
	
	
	if(removedorEquipo==-1)throw new Exception("ERROR : CODIGO DE EQUIPO NO EXISTE ");
	equipos.remove(removedorEquipo);
	return true;
			}
	
	//GENERAR ID
	
	public String generarId(String nombre,String temporada,LocalDate fechaInicio) {
		String unir=nombre+temporada+fechaInicio;
		return unir;
		
	}
	
	
	
	
	//------------------------PUNTO 5 TRAER ENTRENADOR POR TACTICA---------------------------------------
	public List<Entrenador> traerPortactica(String estrategia) {
		List<Entrenador> listEntrenadores=new ArrayList<Entrenador>();
		
		for(Equipo equipo:equipos) {
			
		if(equipo.getEntrenador().getEstrategiaFavorita().equals(estrategia)) {
			
			listEntrenadores.add(equipo.getEntrenador());}
			
			
		}
		
		return listEntrenadores;
		
		
	}
	
	
	//---------------------PUNTO 3(TRAER POR ID)------------------------
	   public boolean traerEquipoPorId(String id) {
	    	
	    	if(this.id.equals(id)) {
	    		
	    		
	    		return true;
	    		
	    		
	    	}
	    	return false;
	    	
	    	
	    }
	
	// ---------------------PUNTO 4  (TRAER EQUIPOS GANADORES) ---------------------------------------
	   public List<Ganador> EquipoGanadorPorFecha(LocalDate fecha){
		   List<Ganador> listGanadores=new ArrayList<Ganador>();
		  
		 
		   for(Partido partido:partidos) {
			   
			 listGanadores.add(partido.retornarEquipoGanador(fecha));
			   
			  
			   
		   }
		  
		   return listGanadores;
		   
		   
	   } 
		   
     //--------------------------CALCULAR PUNTOS ---------
	   
	   
	   
	   
	   public int calcularPuntosGenerico(int valor1, int valor2) {
		   
		   int puntos =0;
		   if(valor1>valor2) {
			   
			   puntos=puntos+3;
			   
			   
		   }
		   
		   if (valor1<valor2) {
			   
			   puntos=puntos+0;
			   
		   }else {
			   
			   puntos=puntos+1;
			   
			   
		   }
		   
		   return puntos;
	   }
	   
	   
	   
	   
	   
	   
		   
	//-----------------------------SUMAR PUNTOS  HASTA LA FECHA ------------
	   
	   
	   public int sumarPuntos(LocalDate fecha,Equipo equipo) {
		   int puntos=0;
		 for(Partido partido:partidos) {
			   
			  if(partido.getFecha().isBefore(fecha)) {
				  
				  
				 if(partido.getEquipoLocal().equals(equipo)) {
					 
					 
				int golLocales=partido.getEquipoLocal().cantGolesTotales(partido.getFecha());
				int golVisitantes=partido.getEquipoVisitante().cantGolesTotales(partido.getFecha());
				
				
				
				puntos=calcularPuntosGenerico(golLocales,golVisitantes);
			
				  }
				  
				 if(partido.getEquipoVisitante().equals(equipo)) {
					 
					 
						int golLocales=partido.getEquipoLocal().cantGolesTotales(partido.getFecha());
						int golVisitantes=partido.getEquipoVisitante().cantGolesTotales(partido.getFecha());
						
						
						
						puntos=calcularPuntosGenerico(golVisitantes,golLocales);
						
						
					 }}}
			   
			return puntos;   
			   
		   }
		   
	   
	   
	   
	   
	   //    -------------------- PUNTO 11 (LISTA DE POSICIONES DEL TORNEO)-------------------- 
		 	public List<Posicion> listaDePosiciones(LocalDate fecha){
		 	Posicion pos=null;	
		 	List<Posicion> posicionesTorneo=new ArrayList<Posicion>();
		 	
		 	for(Equipo equipo :equipos) {
		 	int puntos=sumarPuntos(fecha,equipo);
		 	pos=new Posicion(equipo,puntos);
		    posicionesTorneo.add(pos);
		 	
		 	
		 	}
		 	
		 	posicionesTorneo.sort(Comparator.comparingInt(Posicion::getPuntaje).reversed());
		 	
		 	return posicionesTorneo;
		 	
		 	}
		 	
		 	
		 	
		// -----------------------PUNTO 12 (GOLES TOTALES POR JUGADOR)------------
		 	
		 	public int totalGolesEnTorneo(Jugador jugador) {
		 		
		 		
		 		int i=0;
		 		Jugador buscado=null;
		 		while(i<equipos.size() && buscado==null) {
		 		Equipo equip=equipos.get(i);
		 		
		 	    buscado=equip.buscarJugador(jugador.getDni());
		 		
		 		
		 	}
		 	return buscado.GolesTotales();	
		 	
		 	}
		 	
		 	
		 	
		//--------------------------PUNTO13 (TOTAL ASISTENCIAS )-------------------- 	
		 	
             public int totalAsistenciasEnTorneo(Jugador jugador) {
		 		
		 		
		 		int i=0;
		 		Jugador buscado=null;
		 		while(i<equipos.size() && buscado==null) {
		 		Equipo equip=equipos.get(i);
		 		
		 	    buscado=equip.buscarJugador(jugador.getDni());
		 		
		 		
		 	}
		 	return buscado.totalAsistencias();	
		 	
		 	}
		 	
	
		 	
		 	
		 	
}