package component;

public class Cpu {
	
	public void start() {
		System.out.println("Processo de inicialização.");
	}
	public void execute() {
		System.out.println("Executando algo no processador.");
	}
	public void load() {
		System.out.println("Carregando registrador.");
	}
	public void free() {
		System.out.println("Liberando registradores.");
	}

}
