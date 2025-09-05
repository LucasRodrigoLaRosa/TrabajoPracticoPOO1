package Sistema;

public class Entrenador extends Persona  {
private String estrategiaFavorita;

public Entrenador(String estrategiaFavorita) {
	super();
	this.estrategiaFavorita = estrategiaFavorita;
}

public String getEstrategiaFavorita() {
	return estrategiaFavorita;
}

public void setEstrategiaFavorita(String estrategiaFavorita) {
	this.estrategiaFavorita = estrategiaFavorita;
}
}
