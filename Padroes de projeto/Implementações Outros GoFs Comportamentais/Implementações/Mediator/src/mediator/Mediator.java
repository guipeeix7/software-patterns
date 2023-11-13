package mediator;

import colleague.Colleague;

public interface Mediator {
	
	public void enviar(String mensagem, Colleague colleague);

}
