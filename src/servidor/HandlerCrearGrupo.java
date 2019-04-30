package servidor;

public class HandlerCrearGrupo extends Handler{

	@Override
	public void procesarPeticion(Peticion peticion) {
		//cada handler define cuando debe atender una peticion o 
		//pasarsela al siguiente elemento de la cadena de reponsabilidad
		
		if(peticion.getOperacion().contentEquals("crear-grupo")) {
			System.out.println("peticion atendida por el handler de crear  grupo de contactos");
		}else {
			sucesor.procesarPeticion(peticion);
		}
			
	}

	
}
