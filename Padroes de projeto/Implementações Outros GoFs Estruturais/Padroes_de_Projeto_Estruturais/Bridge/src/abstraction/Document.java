package abstraction;

import implementor.FileGenerator;

public abstract class Document {
	
	private String code;
	protected String fileType;
	
	//Optei por um relacionamento de associação e não por uma relação de TODO-PARTE.
	//Portanto, trata-se de uma adaptação do padrão Bridge. Ok?
	protected FileGenerator fileGenerator;
	
	public Document(String code, String fileType, FileGenerator fileGenerator){
		this.code = code;
		this.fileType = fileType;
		this.fileGenerator = fileGenerator;
	}
	
	public abstract void format(Document document);

}
