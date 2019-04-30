package servidor;

public class Main {

	public static void main(String[] args) {
		//formar la cadena de responsabilidad
		HandlerEnvioMensajePrivado handlerEnvioMensajePrivado = new HandlerEnvioMensajePrivado();
		HandlerBorrarMensaje handlerBorrarMensaje = new HandlerBorrarMensaje();
		HandlerCrearGrupo handlerCrearGrupo = new HandlerCrearGrupo();
		
		handlerEnvioMensajePrivado.setSucesor(handlerBorrarMensaje);
		handlerBorrarMensaje.setSucesor(handlerCrearGrupo);
		//el handler de crear grupo podria tener un handler que devolviera un error
		//fin formar cadena de responsabilidad
		
		Peticion peticion = new Peticion("crear-grupo");
		handlerEnvioMensajePrivado.procesarPeticion(peticion);
	}

}
