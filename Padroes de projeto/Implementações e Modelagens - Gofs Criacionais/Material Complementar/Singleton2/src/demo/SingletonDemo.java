package demo;

import singleton.Singleton;

public class SingletonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Singleton test1 = Singleton.getInstance();
		System.out.println("Mensagem referente ao primeiro uso do singleton");
		
		Singleton test2 = Singleton.getInstance();
		System.out.println("Mensagem referente ao segundo uso do singleton");
		if(test1.getInstance() == test2.getInstance()){
			System.out.println("Funcionou!");
		}
		else{
			System.out.println("Oops! Não funcionou!");
		}

	}

}
