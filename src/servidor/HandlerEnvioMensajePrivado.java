package servidor;

public class HandlerEnvioMensajePrivado extends Handler{

	@Override
	public void procesarPeticion(Peticion peticion) {
		//cada handler define cuando debe atender una peticion o 
		//pasarsela al siguiente elemento de la cadena de reponsabilidad
		
		if(peticion.getOperacion().contentEquals("envio-mensaje")) {
			System.out.println("peticion atendida por el handler de envio de mensaje privado");
		}else {
			sucesor.procesarPeticion(peticion);
		}
			
	}

	
}
