
public class Dispositivo {

	private static Dispositivo unicaInstanciaDeDispositivo;
	
	private Dispositivo() {
		// TODO Auto-generated constructor stub
	}
	

	 public static final Dispositivo getInstance() {
		 if (unicaInstanciaDeDispositivo == null){
			 unicaInstanciaDeDispositivo = new Dispositivo();
			 System.out.println("Como N�O existia uma inst�ncia de Dispositivo, foi criada uma nova inst�ncia.");
			 System.out.println("Basta usar essa nova inst�ncia de Dispositivo para chamar o m�todo imprimirMensagem(...) " +
			 		"passando a mensagem desejada.");
		 }
		 else{
			 System.out.println("Como J� existia uma inst�ncia de Dispositivo, foi retornada a inst�ncia existente.");
			 System.out.println("Basta usar essa inst�ncia de Dispositivo para chamar o m�todo imprimirMensagem(...) " +
			 		"passando a mensagem desejada.");
		 }
	 
	 	return unicaInstanciaDeDispositivo;
	 }
	 
	 public void imprimirMensagem(String mensagem) {
		 System.out.println(mensagem);
	} 
}
