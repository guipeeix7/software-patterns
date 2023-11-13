
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Dispositivo primeiroDispositivo = Dispositivo.getInstance();
		primeiroDispositivo.imprimirMensagem("Mensagem referente ao primeiro dispositivo");
		
		Dispositivo segundoDispositivo = Dispositivo.getInstance();
		segundoDispositivo.imprimirMensagem("Mensagem referente ao segundo dispositivo");
		
	}
}
