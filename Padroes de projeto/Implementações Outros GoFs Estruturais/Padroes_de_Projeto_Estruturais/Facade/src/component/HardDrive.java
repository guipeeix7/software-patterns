package component;

public class HardDrive {
	
	public String read(int startPosition, int size) {
		System.out.println("Lendo dados do HD.");
		//Simulando o que foi lido
		return "dados";
	}
	public void write(int position, String info) {
		System.out.println("Escrevendo dados no HD.");
	}

}
