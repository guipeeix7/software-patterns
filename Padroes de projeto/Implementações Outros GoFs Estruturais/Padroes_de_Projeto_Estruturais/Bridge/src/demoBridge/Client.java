package demoBridge;

import implementationOne.TXTFileGenerator;
import implementationTwo.PDFFileGenerator;
import implementor.FileGenerator;
import refinedAbstraction.Receipt;
import abstraction.Document;

public class Client {

	/**
	 * Autor: Milene
	 * A rela��o m�nima entre a Client e a Abstraction � o relacionamento de depend�ncia, conforme implementado nesse exemplo.
	 */
	public static void main(String[] args) {
		
		FileGenerator fileGenerator = new TXTFileGenerator("TXTGenerator");
		Document document = new Receipt("001", "txt", fileGenerator); 
		document.format(document);
		
		fileGenerator = new PDFFileGenerator("PDFGenerator");
		document = new Receipt("002", "pdf", fileGenerator);
		document.format(document);
	}
}
