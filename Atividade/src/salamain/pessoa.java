package salamain;

public class pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome= nome;
	}
	public String getcpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf= cpf;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
	
	
	public pessoa(String nome, String cpf, String endereco) {
		this.nome=nome;
		this.cpf=cpf;
		this.endereco=endereco;
		
	}
	
   public String Oi() {
	   return this.nome+ ":Eae blz. ";
   }

}
