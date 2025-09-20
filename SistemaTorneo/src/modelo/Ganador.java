package modelo;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Ganador {
Equipo equipo;
LocalDate fecha;
int cantGoles;
int empate;



public Equipo getEquipo() {
	return equipo;
}
public void setEquipo(Equipo equipo) {
	this.equipo = equipo;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public int getCantGoles() {
	return cantGoles;
}
public void setCantGoles(int cantGoles) {
	this.cantGoles = cantGoles;
}
public Ganador(Equipo equipo, LocalDate fecha, int cantGoles) {

	this.equipo = equipo;
	this.fecha = fecha;
	this.cantGoles = cantGoles;
}
@Override
public String toString() {
	return "Ganador [equipo=" + equipo + ", fecha=" + fecha + ", cantGoles=" + cantGoles + "]";
}}
