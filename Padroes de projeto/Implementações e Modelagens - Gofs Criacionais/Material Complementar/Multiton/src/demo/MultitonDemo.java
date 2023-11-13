package demo;

import multiton.Multiton;

public class MultitonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Multiton.getMultiton("FirstVehicle").otherOperation();
        Multiton.getMultiton("SecondVehicle").otherOperation();
        
        
        Multiton test1 = Multiton.getMultiton("FirstTest");
		System.out.println("Mensagem referente ao primeiro uso do multiton");
		
		Multiton test2 = Multiton.getMultiton("SecondTest");
		System.out.println("Mensagem referente ao segundo uso do multiton");
		
		if(test1.getMultiton("FirstTest") == test2.getMultiton("SecondTest")){
			System.out.println("Oops! Não funcionou!");
		}
		else{
			System.out.println("Funcionou!");
		}
			
	}
}

