package test;

import product.BankBillet;
import concreteBuilder.ItauBankBilletBuilder;
import builder.BankBilletBuilder;
import director.BankBilletGenerator;

public class Client {

	/**
	 * Testando o Padrão Builder
	 */
	public static void main(String[] args) {

		BankBilletBuilder bankBilletBuilder = new ItauBankBilletBuilder();
		BankBilletGenerator bankBilletGenerator = new BankBilletGenerator(bankBilletBuilder); //itau
		BankBillet bankBillet = bankBilletGenerator.constructBankBillet();//retorna o boleto pronto
        System.out.println(bankBillet);

	}

}
