package modelo;

public class EstadisticasJugador {
	private int cantidadGoles;
	private int asistencias;
	private int minutos;
	private Partido partido;
	private String id;

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

	public EstadisticasJugador(int cantidadGoles, int asistencias, int minutos, Partido partido,String nombre,long dni) {
		this.cantidadGoles = cantidadGoles;
		this.asistencias = asistencias;
		this.minutos = minutos;
		this.partido = partido;
		this.id=generarId(nombre,dni);
	}
	
	
	public String generarId(String nombre,long dni) {
		String unir=nombre+dni;
		return unir;
		
	}
	
	//--SOLO HAY GET DE ID POR QUE SE CREA INTERNAMENTE---------
	 public String getId() {
		return id;
	}

	//---------------------PUNTO 3(TRAER POR ID)------------------------
    public boolean traerEstadisticaPorId(String id) {
    	
    	if(this.id.equals(id)) {
    		
    		
    		return true;
    		
    		
    	}
    	return false;
    	
    	
    }

}
