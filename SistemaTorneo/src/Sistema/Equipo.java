package Sistema;
import Sistema.Jugador;
import java.util.List;
import java.util.ArrayList;

public class Equipo {
private String nombre;
private String codigo;
private List<Jugador> jugadores;
private String entrenador;
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
}
public String getEntrenador() {
	return entrenador;
}
public void setEntrenador(String entrenador) {
	this.entrenador = entrenador;
}
public Equipo(String nombre, String codigo, List<Jugador> jugadores, String entrenador) {
	super();
	this.nombre = nombre;
	this.codigo = codigo;
	this.jugadores = jugadores;
	this.entrenador = entrenador;
} 
}
