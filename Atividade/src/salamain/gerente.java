package salamain;
public class gerente extends funcionario{
	private String marketing;
	public String getmarketing() {
		return this.marketing;
	}

	public gerente(String nome, String cpf, String endereco, String numerodetrabalho, String marketing) {
		super(nome, cpf, endereco, numerodetrabalho);
		this.marketing=marketing;
}
	public String Ei() {
		return "Cade o relatorio?";
}
	public String confus() {
		return super.amigo()+ super.Ola();
	}
}
