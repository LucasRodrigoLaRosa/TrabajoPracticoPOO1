package Sistema;

public class EstadisticasJugador {
	private static int contadorIds = 1;
	
	private int id;
	private int cantidadGoles;
	private int asistencias;
	private int minutos;
	private Jugador jugador;
	
	public EstadisticasJugador(int cantidadGoles, int asistencias, int minutos, Jugador jugador) {
		this.id = contadorIds++;
		this.cantidadGoles = cantidadGoles;
		this.asistencias = asistencias;
		this.minutos = minutos;
		this.jugador = jugador;
	}
	
	public int getId() {
		return id;
	}

	public int getCantidadGoles() {
		return cantidadGoles;
	}

	public void setCantidadGoles(int cantidadGoles) {
		this.cantidadGoles = cantidadGoles;
	}

	public int getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias; 
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

}
