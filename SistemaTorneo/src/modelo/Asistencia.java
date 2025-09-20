package modelo;

public class Asistencia {
Jugador jugador;
int Asistencias;
public Asistencia(Jugador jugador, int asistencias) {
	super();
	this.jugador = jugador;
	Asistencias = asistencias;
}
@Override
public String toString() {
	return "Asistencia [jugador=" + jugador + ", Asistencias=" + Asistencias + "]";
}
public Jugador getJugador() {
	return jugador;
}
public void setJugador(Jugador jugador) {
	this.jugador = jugador;
}
public int getAsistencias() {
	return Asistencias;
}
public void setAsistencias(int asistencias) {
	Asistencias = asistencias;
}
}
