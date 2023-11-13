package demoFacade;

import component.Cpu;
import component.HardDrive;
import component.Memoria;

import facade.ComputadorFacade;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		Cpu cpu = new Cpu();
		Memoria memoria = new Memoria();
		HardDrive hardDrive = new HardDrive();
		ComputadorFacade computador = new ComputadorFacade(cpu, memoria, hardDrive);
		computador.ligarComputador();
	}
}
