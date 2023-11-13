package refinedAbstraction;

import implementor.FileGenerator;
import abstraction.Document;

public class Receipt extends Document{
	
	public Receipt(String code, String fileType, FileGenerator fileGenerator){
		super(code, fileType, fileGenerator);
	}

	@Override
	public void format(Document document) {
		if(super.fileType == "txt" | super.fileType == "pdf"){
			fileGenerator.format(this);
		}
		else{
			System.out.println("Não é possível gerar o recibo no tipo de arquivo especificado.");
		}
	}
		
}
