package salamain;
public class funcionario extends pessoa {
	private String numerodetrabalho;
	public String getnumerodetrabalho() {
		return this.numerodetrabalho;
	}


public funcionario(String nome, String cpf, String endereco, String numerodetrabalho) {
	super(nome, cpf, endereco);
	this.numerodetrabalho=numerodetrabalho;
}
public String Ola() {
	return "Bom dia. ";
}

public String amigo() {
	return super.Oi();
}
}