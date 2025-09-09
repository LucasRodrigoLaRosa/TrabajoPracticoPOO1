package Sistema;

public class EstadisticasJugador {
	private int cantidadGoles;
	private int asistencias;
	private int minutos;
	private Partido partido;

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

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public EstadisticasJugador(int cantidadGoles, int asistencias, int minutos, Partido partido) {
		this.cantidadGoles = cantidadGoles;
		this.asistencias = asistencias;
		this.minutos = minutos;
		this.partido = partido;
	}

}
