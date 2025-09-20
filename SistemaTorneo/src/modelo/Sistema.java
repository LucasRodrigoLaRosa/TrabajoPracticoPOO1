package modelo;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;





public class Sistema {
	
	private List<Torneo> torneo;

	@Override
	public String toString() {
		return "Sistema [torneo=" + torneo + "]";
	}

	public List<Torneo> getTorneo() {
		return torneo;
	}

	public Sistema(List<Torneo> torneo) {
		
		this.torneo = torneo;
	}

	/*public void setTorneo(List<Torneo> torneo) {
		this.torneo = torneo;
	}*/
	
	
	
	public void agregarTorneo (Torneo tor) {
		
		this.torneo.add(tor);
		
		
	}
	
	
	
	//-----------------------METODOS-------------------------------
	
	//TRAER LISTA DE JUGADORES  ENTRE DOS FECHAS 
	public List<Jugador> listaJugadoresPorFechaNac(Torneo tor,LocalDate fechaUno,LocalDate fechaDos){
		List<Jugador> listjugadores=new ArrayList<Jugador>();
		for(Equipo equipo:tor.getEquipo()) {
			
			for(Jugador jugador:equipo.getJugadores()) {
				
				if(jugador.JugadorEstaEntreFechas(fechaUno, fechaDos)) {
					
					listjugadores.add(jugador);
					
					
				}
				
				
			}
			
			
			
		}
		return listjugadores;//VALIDAR SI LA LISA DE JUGADORES VUELVE VACIA
	
	}
	
	
	
	
	//-------------------------PUNTO 7 TRAER EQUIPOS ANTES DE UNA FECHA -------------------
	public List<Equipo> traerEquipoAntesFecha(Torneo tor,LocalDate fecha){
		
		
		List<Equipo> listEquipo=new ArrayList<Equipo>();
		for(Equipo equipo : tor.getEquipo()) {
			
			if(equipo.getFechaDeFundacion().isBefore(fecha)) {
				
				listEquipo.add(equipo);
				
				
			}
			
			
			
		}
		return listEquipo;//VALIDAR SI LA LISA DE EQUIPOS VUELVE VACIA
		
		
		
		
	}
	
	//CALULAR MAYOR ALTURA PROMEDIO DE LOS EQUIPOS DE UN TORNEO PUNTO 9
	public Equipo alturaPromedioGeneral (Torneo tor) {
		float alturaprom =0 ;
		Equipo equipoMayorAltura=null;
		for(Equipo equipo: tor.getEquipo()) {
			if(alturaprom<equipo.retornarAlturaPromedio()) {
			alturaprom=equipo.retornarAlturaPromedio();
				 equipoMayorAltura=equipo;	
			}
			
		}
		
			
		return 	equipoMayorAltura;
		}
	
	
	
	
	public void puntosTotales(Torneo tor,LocalDate fecha) {
		
		
		
		
		
	}
	
	
	
	// ---------------------PUNTO 4  (TRAER EQUIPOS GANADORES) ---------------------------------------
		public void listaEquiposGanadores(Torneo tor,LocalDate fecha){
			
			
			System.out.println(tor.EquipoGanadorPorFecha(fecha));
			
			
		}
	

		// ----------------------PUNTO 5 (TRAER ENTRENADORES POR TACTICA)-----------
		
		
public void listaEquiposGanadores(Torneo tor,String estrategia){
			
			
			System.out.println(tor.traerPortactica(estrategia));
			
			
		}


//-------------------------PUNTO 14  LISTA ENTERA DE LOS GOLEADORES DEL TORNEO  ORDENADOS------------------	 	
	
	
	public List<Goleador> listadeGoleadores(Torneo tor){
		List<Goleador> listGoleadores=new ArrayList<Goleador>();
		for(Equipo equipo:tor.getEquipo()) {
			for(Jugador jugador:equipo.getJugadores()) {
				
				int goles=tor.totalGolesEnTorneo(jugador);
				Goleador auxGoleador=new Goleador(jugador,goles);
				listGoleadores.add(auxGoleador);
			}
			
			
			
		}
		listGoleadores.sort(Comparator.comparingInt(Goleador::getGoles).reversed());
		return listGoleadores;
	}
			
			
//-------------------------PUNTO 15  LISTA ENTERA DE LOS ASISTIDORES DEL TORNEO  ORDENADOS------------------		
	public List<Asistencia> listadeAsistidores(Torneo tor){
		List<Asistencia> listAsistidores=new ArrayList<Asistencia>();
		for(Equipo equipo:tor.getEquipo()) {
			for(Jugador jugador:equipo.getJugadores()) {
				
				int asistencias=tor.totalAsistenciasEnTorneo(jugador);
				Asistencia auxAsist=new Asistencia(jugador,asistencias);
				listAsistidores.add(auxAsist);
			}
			
			
			
		}
		listAsistidores.sort(Comparator.comparingInt(Asistencia::getAsistencias).reversed());
		return listAsistidores;
	}
		
		
		
	





}
