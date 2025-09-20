package modelo;

public class Goleador {
Jugador jugador;
int goles;
public Goleador(Jugador jugador, int goles) {
	super();
	this.jugador = jugador;
	this.goles = goles;
}
@Override
public String toString() {
	return "Goleador [jugador=" + jugador + ", goles=" + goles + "]";
}
public Jugador getJugador() {
	return jugador;
}
public void setJugador(Jugador jugador) {
	this.jugador = jugador;
}
public int getGoles() {
	return goles;
}
public void setGoles(int goles) {
	this.goles = goles;
}
}
