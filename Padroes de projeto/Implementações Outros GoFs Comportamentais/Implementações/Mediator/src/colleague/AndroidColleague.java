package colleague;

import mediator.Mediator;

public class AndroidColleague extends Colleague{
	
	 public AndroidColleague(Mediator mediator) {
	        super(mediator);
	    }
	 
	    @Override
	    public void receberMensagem(String mensagem) {
	        System.out.println("Android recebeu: " + mensagem);
	    }

}
