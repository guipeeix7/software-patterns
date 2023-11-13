package mediator;

import java.util.ArrayList;

import colleague.AndroidColleague;
import colleague.Colleague;
import colleague.IOSColleague;
import colleague.SymbianColleague;

public class MensagemMediator implements Mediator{
	
	protected ArrayList<Colleague> contatos;
	 
    public MensagemMediator() {
        this.contatos = new ArrayList<Colleague>();
    }
 
    public void adicionarColleague(Colleague colleague) {
        this.contatos.add(colleague);
    }
 
    @Override
    public void enviar(String mensagem, Colleague colleague) {
        for (Colleague contato : contatos) {
            if (contato != colleague) {
                definirProtocolo(contato);
                contato.receberMensagem(mensagem);
            }
        }
    }
 
    private void definirProtocolo(Colleague contato) {
        if (contato instanceof IOSColleague) {
            System.out.println("Protocolo iOS");
        } else if (contato instanceof AndroidColleague) {
            System.out.println("Protocolo Android");
        } else if (contato instanceof SymbianColleague) {
            System.out.println("Protocolo Symbian");
        }
    }

}
