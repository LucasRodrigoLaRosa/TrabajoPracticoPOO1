package Sistema;

import java.time.LocalDate;

public class Ganador {
	private LocalDate fecha;
	private Equipo equipoGanador;
	private int cantGoles;

	public Ganador(LocalDate fecha, Equipo equipoGanador, int cantGoles) {
		this.fecha = fecha;
		this.equipoGanador = equipoGanador;
		this.cantGoles = cantGoles;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public Equipo getEquipoGanador() {
		return equipoGanador;
	}

	public int getCantGoles() {
		return cantGoles;
	}

	@Override
	public String toString() {
		return "Fecha: " + fecha + ", Equipo: " + equipoGanador.getNombre() + ", Goles: " + cantGoles;
	}
}
