package modelo;

import java.util.Date;
import java.util.List;
import java.time.LocalDate;

public class Entrenador extends Persona {
	private String estrategiaFavorita;

	public Entrenador(String estrategiaFavorita, String nombrePersona, String apellidoPersona, long dniPersona,
			LocalDate fechaDeNacimientoPersona) {
		super(nombrePersona, apellidoPersona, dniPersona, fechaDeNacimientoPersona);
		this.estrategiaFavorita = estrategiaFavorita;
	}

	public String getEstrategiaFavorita() {
		return estrategiaFavorita;
	}

	public void setEstrategiaFavorita(String estrategiaFavorita) {
		this.estrategiaFavorita = estrategiaFavorita;
	}
	
	
	
	public boolean traerPortactica(String estrategia) {
	
	if(estrategiaFavorita.equals(estrategia)) {
		
		
		return true;
		
	}else {return false;}
	
	
	   }
}