package test;

import java.time.LocalDate;
import java.util.List;

import Sistema.Torneo;
import Sistema.Entrenador;
import Sistema.Equipo;
import Sistema.EstadisticasJugador;
import Sistema.Ganador;
import Sistema.Jugador;
import Sistema.Partido;

public class Test {

	public static void main(String[] args) {
		
		Torneo torneo = new Torneo("Copa Libertadores", "Primavera", LocalDate.of(2025, 6, 30), LocalDate.of(2025, 12, 30));
		
		Entrenador entrenador1 = new Entrenador("Guillermo", "Barros Schelotto", 32696034, LocalDate.of(1980, 8, 10), "4-3-3");
		Entrenador entrenador2 = new Entrenador("Gustavo", "Costas", 12324580, LocalDate.of(1950, 6, 22), "5-3-2");
		Entrenador entrenador3 = new Entrenador("Abel", "Ferreira", 35053470, LocalDate.of(1985, 5, 5), "4-3-3");
		Entrenador entrenador4 = new Entrenador("Marcelo", "Gallardo", 36943345, LocalDate.of(1986, 2, 10), "4-2-2");
		
		Jugador jugador1 = new Jugador(1.80f, 80, "Delantero", 9, "Adrian", "Martinez", 37634503, LocalDate.of(1985, 3, 6));
		Jugador jugador2 = new Jugador(1.70f, 75, "Delantero", 10, "Maher", "Carrizo", 44453948, LocalDate.of(2003, 11, 20));
		Jugador jugador3 = new Jugador(1.85f, 78, "Defensor", 2, "Lucas", "Martinez Quarta", 35853948, LocalDate.of(2003, 11, 1));
		Jugador jugador4 = new Jugador(1.83f, 79, "Defensor", 2, "Gustavo", "Gomez", 32854886, LocalDate.of(1993, 3, 4));
		Jugador jugador5 = new Jugador(1.83f, 79, "Delantero", 10, "Vitor", "Roque", 34854886, LocalDate.of(1997, 9, 10));
				
		EstadisticasJugador ej1 = new EstadisticasJugador(0, 0, 75, jugador1);
		EstadisticasJugador ej2 = new EstadisticasJugador(1, 0, 90, jugador2);
		EstadisticasJugador ej3 = new EstadisticasJugador(1, 0, 90, jugador3);
		EstadisticasJugador ej4 = new EstadisticasJugador(1, 0, 90, jugador4);
		EstadisticasJugador ej5 = new EstadisticasJugador(1, 0, 90, jugador5);
		
		Equipo equipo1 = new Equipo("Velez Sarsfield", "001", entrenador1);
		equipo1.agregarJugador(jugador1);
		
		Equipo equipo2 = new Equipo("Racing Club", "002", entrenador2);
		equipo2.agregarJugador(jugador2);
		
		Equipo equipo3 = new Equipo("River Plate", "004", entrenador4);
		equipo3.agregarJugador(jugador3);
		
		Equipo equipo4 = new Equipo("Palmeiras", "003", entrenador3);		
		equipo4.agregarJugador(jugador4);
		equipo4.agregarJugador(jugador5);
	
		Partido partido1 = new Partido(LocalDate.of(2025, 7, 1), equipo1, equipo2, "Jose Amalfitani");
		partido1.agregarEstadistica(ej1);
		partido1.agregarEstadistica(ej2);
		
		Partido partido2 = new Partido(LocalDate.of(2025, 7, 1), equipo3, equipo4, "Antonio V. Liberti");
		partido2.agregarEstadistica(ej3);
		partido2.agregarEstadistica(ej4);
		partido2.agregarEstadistica(ej5);
		
		
		torneo.agregarEquipo(equipo1);
		torneo.agregarEquipo(equipo2);
		torneo.agregarEquipo(equipo3);
		torneo.agregarEquipo(equipo4);
		
		torneo.agregarPartido(partido1);
		torneo.agregarPartido(partido2);
		
		List<Ganador> ganadoresEnFecha = torneo.obtenerGanadoresEnFecha(LocalDate.of(2025, 7, 1));
		
		torneo.mostrarGanadores(ganadoresEnFecha);

	}

}
