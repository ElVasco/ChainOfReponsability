package servidor;

//Clase que define como deben ser de los elementos 
//de la cadena de reponsabilidad
public abstract class Handler {

	protected Handler sucesor;
	
	public abstract void procesarPeticion(Peticion peticion);

	public Handler getSucesor() {
		return sucesor;
	}

	public void setSucesor(Handler sucesor) {
		this.sucesor = sucesor;
	}
	
	
}
