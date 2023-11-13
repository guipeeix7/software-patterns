package colleague;

import mediator.Mediator;

public abstract class Colleague {
	
	 protected Mediator mediator;
	 
	 public Colleague(Mediator mediator) {
		 this.mediator = mediator;
	 }
	 
	 public void enviarMensagem(String mensagem) {
		 this.mediator.enviar(mensagem, this);
	 }
	 
	 public abstract void receberMensagem(String mensagem);

}
