package facade;

import component.Cpu;
import component.HardDrive;
import component.Memoria;

public class ComputadorFacade {
	
	private static final int SECTOR_SIZE = 1000;
	private static final int BOOT_SECTOR = 1;
	
	/*Um endere�o de mem�ria � um identificador 
	* �nico para um local de mem�ria no qual um processador 
	* ou algum outro dispositivo pode armazenar peda�os de dados.
	* Aqui, para fins de simula��o, est� sendo passado um inteiro.
	*/
	private static final int BOOT_ADDRESS = 100;
	
	private Cpu cpu = null;
	private Memoria memoria = null;
	private HardDrive hardDrive = null;

	public ComputadorFacade(Cpu cpu, Memoria memoria, HardDrive hardDrive) {
		this.cpu = cpu;
		this.memoria = memoria;
		this.hardDrive = hardDrive;
	}

	public void ligarComputador() {
		this.cpu.start();
		String hdBootInfo = hardDrive.read(BOOT_SECTOR, SECTOR_SIZE);
		this.memoria.load(BOOT_ADDRESS, hdBootInfo);
		this.cpu.execute();
		this.memoria.free(BOOT_ADDRESS, hdBootInfo);
	}

}
