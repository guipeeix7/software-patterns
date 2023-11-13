package client;

import colleague.AndroidColleague;
import colleague.IOSColleague;
import colleague.SymbianColleague;
import mediator.MensagemMediator;

public class MediatorDemo {

	/**
	 * Reference: https://brizeno.wordpress.com/category/padroes-de-projeto/mediator/ 
	 * Modified by Milene.
	 */
	public static void main(String[] args) {
		MensagemMediator mediador = new MensagemMediator();
		 
	    AndroidColleague android = new AndroidColleague(mediador);
	    IOSColleague ios = new IOSColleague(mediador);
	    SymbianColleague symbian = new SymbianColleague(mediador);
	 
	    mediador.adicionarColleague(android);
	    mediador.adicionarColleague(ios);
	    mediador.adicionarColleague(symbian);
	     
	    symbian.enviarMensagem("Oi, eu sou um Symbian!");
	    System.out.println("=========");
	    android.enviarMensagem("Oi, eu sou um Android!");
	    System.out.println("=========");
	    ios.enviarMensagem("Oi, eu sou um iOs!");

	}
}
