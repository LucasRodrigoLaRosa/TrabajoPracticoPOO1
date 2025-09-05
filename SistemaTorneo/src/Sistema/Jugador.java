package Sistema;
import Sistema.EstadisticasJugador;
import java.util.List;
import java.util.ArrayList;
import Sistema.Persona;

public class Jugador extends Persona {
private float altura;
private int peso;
private String posicion;
private int dorsal;
private List<EstadisticasJugador> estadistica;
public float getAltura() {
	return altura;
}
public void setAltura(float altura) {
	this.altura = altura;
}
public int getPeso() {
	return peso;
}
public void setPeso(int peso) {
	this.peso = peso;
}
public String getPosicion() {
	return posicion;
}
public void setPosicion(String posicion) {
	this.posicion = posicion;
}
public int getDorsal() {
	return dorsal;
}
public void setDorsal(int dorsal) {
	this.dorsal = dorsal;
}
public List<EstadisticasJugador> getEstadistica() {
	return estadistica;
}
public void setEstadistica(List<EstadisticasJugador> estadistica) {
	this.estadistica = estadistica;
}
public Jugador(float altura, int peso, String posicion, int dorsal, List<EstadisticasJugador> estadistica) {
	super();
	this.altura = altura;
	this.peso = peso;
	this.posicion = posicion;
	this.dorsal = dorsal;
	this.estadistica = estadistica;
}
}
