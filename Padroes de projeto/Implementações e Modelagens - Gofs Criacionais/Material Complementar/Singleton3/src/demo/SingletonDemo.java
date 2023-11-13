package demo;

import singleton.Singleton;

public class SingletonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton test1 = Singleton.getInstance("SOU TEST1");
		System.out.println("Mensagem referente ao primeiro uso do singleton");
		
		Singleton test2 = Singleton.getInstance("SOU TEST2");
		System.out.println("Mensagem referente ao segundo uso do singleton");
		if(test1.getInstance("SOU TEST1") == test2.getInstance("SOU TEST2")){
			System.out.println("Funcionou!");
		}
		else{
			System.out.println("Oops! Não funcionou!");
		}

	}

}
