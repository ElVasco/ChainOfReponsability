package servidor;

public class Peticion {
	
	private String operacion;
	@SuppressWarnings("unused")
	private String[] info;
	
	public Peticion(String operacion) {
		super();
		this.operacion = operacion;
	}
	
	public String getOperacion() {
		return operacion;
	}	

}
