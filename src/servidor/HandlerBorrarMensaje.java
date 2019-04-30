package servidor;

public class HandlerBorrarMensaje extends Handler{

	@Override
	public void procesarPeticion(Peticion peticion) {
		//cada handler define cuando debe atender una peticion o 
		//pasarsela al siguiente elemento de la cadena de reponsabilidad
		
		if(peticion.getOperacion().contentEquals("borrar-mensaje")) {
			System.out.println("peticion atendida por el handler de borrar  mensaje");
		}else {
			sucesor.procesarPeticion(peticion);
		}
			
	}

	
}
