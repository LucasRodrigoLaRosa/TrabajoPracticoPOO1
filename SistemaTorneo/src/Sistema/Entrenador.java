package Sistema;

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
}
