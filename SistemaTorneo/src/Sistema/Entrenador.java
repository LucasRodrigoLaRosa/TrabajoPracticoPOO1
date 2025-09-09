package Sistema;

import java.util.Date;

public class Entrenador extends Persona {
	private String estrategiaFavorita;

	public Entrenador(String estrategiaFavorita, String nombrePersona, String apellidoPersona, long dniPersona,
			Date fechaDeNacimientoPersona) {
		super(nombrePersona, apellidoPersona, dniPersona, fechaDeNacimientoPersona);
		this.estrategiaFavorita = estrategiaFavorita;
	}

	public String getEstrategiaFavorita() {
		return estrategiaFavorita;
	}

	public void setEstrategiaFavorita(String estrategiaFavorita) {
		this.estrategiaFavorita = estrategiaFavorita;
	}
}
