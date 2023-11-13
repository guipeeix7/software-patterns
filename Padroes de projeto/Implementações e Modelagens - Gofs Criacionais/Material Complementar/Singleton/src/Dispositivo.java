
public class Dispositivo {

	private static Dispositivo unicaInstanciaDeDispositivo;
	
	private Dispositivo() {
		// TODO Auto-generated constructor stub
	}
	

	 public static final Dispositivo getInstance() {
		 if (unicaInstanciaDeDispositivo == null){
			 unicaInstanciaDeDispositivo = new Dispositivo();
			 System.out.println("Como NÃO existia uma instância de Dispositivo, foi criada uma nova instância.");
			 System.out.println("Basta usar essa nova instância de Dispositivo para chamar o método imprimirMensagem(...) " +
			 		"passando a mensagem desejada.");
		 }
		 else{
			 System.out.println("Como JÁ existia uma instância de Dispositivo, foi retornada a instância existente.");
			 System.out.println("Basta usar essa instância de Dispositivo para chamar o método imprimirMensagem(...) " +
			 		"passando a mensagem desejada.");
		 }
	 
	 	return unicaInstanciaDeDispositivo;
	 }
	 
	 public void imprimirMensagem(String mensagem) {
		 System.out.println(mensagem);
	} 
}
