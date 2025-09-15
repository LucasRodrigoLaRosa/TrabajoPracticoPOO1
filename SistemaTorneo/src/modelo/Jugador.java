package modelo;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Jugador extends Persona {
	private float altura;
	private int peso;
	private String posicion;
	private int dorsal;
	private List<EstadisticasJugador> estadistica;
	
	public Jugador(float altura, int peso, String posicion, int dorsal, 
			String nombre, String apellido, long dni, LocalDate fechaDeNacimiento) {
		super(nombre, apellido, dni, fechaDeNacimiento);
		
		if(!super.calcularEdad(fechaDeNacimiento)) { throw new IllegalArgumentException ("ERROR:NO ES MAYOR DE EDAD");
		
}
		
		this.altura = altura;
		this.peso = peso;
		this.posicion = posicion;
		this.dorsal = dorsal;
		this.estadistica = new ArrayList<EstadisticasJugador>();
		
	}

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

	
	
	
	
	// ESTO SE DEBERIA SACAR
	/*public void setEstadistica(List<EstadisticasJugador> estadistica) {
		this.estadistica = estadistica;
	} */ 
	
	
	
	
	
	
	//------------------------METODOS DE LA LISTA ----------------------------------------
	
	
	//Agregar Estadistica 
		public boolean agregarEstadistica( EstadisticasJugador estadisticaJugador) {
			
			
			
			return estadistica.add(estadisticaJugador);
			
			
		}
	
	//Remover Estadistica
    public boolean removerEstadisticaPorPartido(int idPartido) throws Exception {
    	Partido recuperarPartido=null;
    	int estadisticaBorrada=-1;
    	int i=0;
    	while(i<estadistica.size()) {
    		
    		
    	recuperarPartido=estadistica.get(i).getPartido();
    	if (recuperarPartido.getId()==idPartido) {
    	estadisticaBorrada=i;
    		
    		
    		
    		
    	}
    	i++;
    	}
    	
    	if( estadisticaBorrada==-1) {throw new Exception ("ERROR: LA ESTADISTICA NO EXISTE ");}
    	estadistica.remove(estadisticaBorrada);
    	return true;
  }




}
