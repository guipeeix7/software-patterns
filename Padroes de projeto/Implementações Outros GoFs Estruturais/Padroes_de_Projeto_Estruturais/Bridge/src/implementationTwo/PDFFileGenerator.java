package implementationTwo;

import implementor.FileGenerator;
import abstraction.Document;

public class PDFFileGenerator implements FileGenerator {
	
	private String generatorName;
	
	public PDFFileGenerator(String name){
		this.generatorName = name;
	}
	
	public String getGeneratorName() {
		return generatorName;
	}

	public void setGeneratorName(String generatorName) {
		this.generatorName = generatorName;
	}

	@Override
	public void format(Document document) {
		System.out.println("Formatando o documento enviado usando como base os recursos de um editor de PDF.");
	}
}
