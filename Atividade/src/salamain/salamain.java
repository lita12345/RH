package salamain;

public class salamain {
	public static void main(String[] args) {
		
		
		pessoa p1= new pessoa("Maria", "002.009.007", "rua tamarindo");
		funcionario p2= new funcionario("Lucas", "003.998.447", "rua laranjeira", "778");
		gerente p3= new gerente("Lilian", "889.448.990", "rua cristovao", "118", "market");
		
		System.out.println(p1.Oi());
		System.out.println(p2.amigo()+ p2.Ola());
		System.out.println(p3.confus()+ p3.Ei());

		
	}
	
	
}
